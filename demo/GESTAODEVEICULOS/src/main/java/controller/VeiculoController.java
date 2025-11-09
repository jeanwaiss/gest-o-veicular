package com.concessionaria.controller;

import com.concessionaria.model.Veiculo;
import com.concessionaria.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
@CrossOrigin(origins = "*")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    // GET - Listar todos os veículos
    @GetMapping
    public List<Veiculo> listarTodos() {
        return service.findAll();
    }

    // GET - Buscar veículo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        Optional<Veiculo> veiculo = service.findById(id);
        return veiculo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    // POST - Criar novo veículo
    @PostMapping
    public Veiculo criarVeiculo(@RequestBody Veiculo veiculo) {
        return service.save(veiculo);
    }

    // PUT - Atualizar veículo existente
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        veiculo.setId(id);
        return ResponseEntity.ok(service.save(veiculo));
    }

    // DELETE - Excluir veículo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirVeiculo(@PathVariable Long id) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // FILTROS

    @GetMapping("/filtro/marca/{marca}")
    public List<Veiculo> filtrarPorMarca(@PathVariable String marca) {
        return service.findByMarca(marca);
    }

    @GetMapping("/filtro/ano/{ano}")
    public List<Veiculo> filtrarPorAno(@PathVariable Integer ano) {
        return service.findByAno(ano);
    }

    @GetMapping("/filtro/status/{status}")
    public List<Veiculo> filtrarPorStatus(@PathVariable String status) {
        return service.findByStatus(status);
    }

    @GetMapping("/filtro/preco/{precoMax}")
    public List<Veiculo> filtrarPorPrecoMaximo(@PathVariable Double precoMax) {
        return service.findByPrecoMaximo(precoMax);
    }
}