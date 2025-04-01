package br.com.fiap.catalogocarrosapi.repository;

import br.com.fiap.catalogocarrosapi.model.Carro;
import br.com.fiap.catalogocarrosapi.model.TipoVeiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
    List<Carro> findTop10ByOrderByPotenciaDesc();
    List<Carro> findTop10ByOrderByEconomiaDesc();
    List<Carro> findByTipo(TipoVeiculo tipo);
}
