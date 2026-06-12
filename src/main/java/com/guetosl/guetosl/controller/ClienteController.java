package com.guetosl.guetosl.controller;

import com.guetosl.guetosl.model.Cliente;
import com.guetosl.guetosl.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listartodos(){
        return clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable int id) {
        return clienteRepository.findById(id).orElse(null);

    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable int id) {
        clienteRepository.deleteById(id);
    }
}