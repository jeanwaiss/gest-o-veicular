package com.concessionaria.repository;

import com.concessionaria.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findByMarca(String marca);
    List<Veiculo> findByAno(Integer ano);
    List<Veiculo> findByStatus(String status);
    List<Veiculo> findByPrecoLessThanEqual(Double precoMax);
}