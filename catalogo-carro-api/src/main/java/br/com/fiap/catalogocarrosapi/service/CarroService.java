package br.com.fiap.catalogocarrosapi.service;

import br.com.fiap.catalogocarrosapi.model.Carro;
import br.com.fiap.catalogocarrosapi.model.TipoVeiculo;
import br.com.fiap.catalogocarrosapi.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> top10Potencia(){
        return carroRepository.findTop10ByOrderByPotenciaDesc();
    }

    public List<Carro> top10Economia(){
        return carroRepository.findTop10ByOrderByEconomiaDesc();
    }

    public List<Carro> carrosEletricos(){
        return carroRepository.findByTipo(TipoVeiculo.ELETRICO);
    }

    public Optional<Carro> getById(Long id){
        return carroRepository.findById(id);
    }

    public Carro salvar(Carro carro){
        return carroRepository.save(carro);
    }

    public void deletar(Long id){
        carroRepository.deleteById(id);
    }

    public Carro atualizar(Long id, Carro carroAtualizado){
        Carro carro = carroRepository.findById(id).orElseThrow();
        carro.setMarca(carroAtualizado.getMarca());
        carro.setModelo(carroAtualizado.getModelo());
        carro.setAno(carroAtualizado.getAno());
        carro.setPotencia(carroAtualizado.getPotencia());
        carro.setEconomia(carroAtualizado.getEconomia());
        carro.setTipo(carroAtualizado.getTipo());
        carro.setPreco(carroAtualizado.getPreco());
        return carroRepository.save(carro);
    }
}
