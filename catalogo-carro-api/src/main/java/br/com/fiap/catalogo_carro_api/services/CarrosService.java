package br.com.fiap.catalogo_carro_api.services;

import br.com.fiap.catalogo_carro_api.datasource.Repositorie.CarrosMockRepository;
import br.com.fiap.catalogo_carro_api.domainModel.Carros;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class CarrosService {


    //TODO: criar os metodos para potencia, economia e carros tipo elétrico

    @Autowired
    private CarrosMockRepository repository;

    public List<Carros> getAll(){
        return this.repository.getAll();
    }

    public Carros save(Carros carros){
        return this.repository.save(carros);
    }

    public void delete(Carros carros){
        this.repository.delete(carros);
    }

    public Carros update(Carros carros){
        return this.repository.save(carros);
    }

    public void deleteById(Long id){
        this.repository.deletaById(id);

    }


}
