package br.com.fiap.catalogo_carro_api.datasource.Repositorie;

import br.com.fiap.catalogo_carro_api.domainModel.Carros;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class CarrosMockRepository {

    //TODO: Arrumar os metodos para carros elétricos e demais... E arrumar os carros

    private final List<Carros> dataset = new ArrayList<>();

    public CarrosMockRepository(){
        this.dataset.add(new Carros(1L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(2L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(3L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(4L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(5L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(6L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(7L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(8L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(9L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(10L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(11L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(12L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(13L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(14L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(15L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(16L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(17L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(18L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(19L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
        this.dataset.add(new Carros(20L,"fiorino", "fiat", 2005, 3000, 10, "Ebulição",5000.00));
    }

    public List<Carros> getAll(){
        return this.dataset.subList(0, this.dataset.size());
    }

    public Carros save(Carros carros){
        this.dataset.sort((o1, o2) -> o1.getId().compareTo(o2.getId()));
        Long lastId = this.dataset.get(this.dataset.size()-1).getId();
        carros.setId(lastId + 1);
        this.dataset.add(carros);
        return carros;
    }

    public void deletaById(Long id){
        this.dataset.removeIf(
                carros -> carros.getId().equals(id));
    }

    public void delete(Carros amCarros){
        this.dataset.removeIf(
                carro ->
                        carro.getId().equals(amCarros.getId()));
    }

    public Carros getById(Long id){
        for(Carros carros : this.getAll()){
            if(carros.getId().equals(id)){
                return carros;
            }
        }
        return null;
    }

    public Carros findByPotencia(Carros carros){
        for(Carros carro : this.getAll()){
            if(carro.getPotencia() ==  carros.getPotencia()){
                return carro;
            }
        }
        return null;
    }

    public Carros findByEconomia(Carros carros){
        for(Carros carro : this.getAll()){
            if(carro.getEconomia() ==  carros.getEconomia()){
                return carro;
            }
        }
        return null;
    }

    public Carros findByEletricos(String tipo){
        for(Carros carro : this.getAll()){
            if(carro.getTipo().equals(tipo)){
                return carro;
            }
        }
        return null;
    }
}
