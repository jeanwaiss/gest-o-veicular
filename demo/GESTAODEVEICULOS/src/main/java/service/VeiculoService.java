package com.concessionaria.service;

import com.concessionaria.model.Veiculo;
import com.concessionaria.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;

    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    public Optional<Veiculo> findById(Long id) {
        return repository.findById(id);
    }

    public Veiculo save(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Veiculo> findByMarca(String marca) {
        return repository.findByMarca(marca);
    }

    public List<Veiculo> findByAno(Integer ano) {
        return repository.findByAno(ano);
    }

    public List<Veiculo> findByStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<Veiculo> findByPrecoMaximo(Double precoMax) {
        return repository.findByPrecoLessThanEqual(precoMax);
    }
}