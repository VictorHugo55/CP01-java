package br.com.fiap.catalogocarrosapi.controller;

import br.com.fiap.catalogocarrosapi.model.Carro;
import br.com.fiap.catalogocarrosapi.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroService carroService;

    @GetMapping("/potencia")
    public List<Carro> topPotencia(){
        return carroService.top10Potencia();
    }

    @GetMapping("/economia")
    public List<Carro> topEconomia(){
        return carroService.top10Economia();
    }

    @GetMapping("/eletricos")
    public List<Carro> carrosEletricos(){
        return carroService.carrosEletricos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getById(@PathVariable Long id){
        return carroService.getById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Carro salvar(@RequestBody Carro carro){
        return carroService.salvar(carro);
    }

    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Long id, @RequestBody Carro carroAtualizado){
        return carroService.atualizar(id, carroAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        carroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
