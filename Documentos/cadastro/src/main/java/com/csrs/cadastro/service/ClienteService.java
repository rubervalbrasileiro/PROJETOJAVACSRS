
package com.csrs.cadastro.service;

import com.csrs.cadastro.model.Cliente;
import com.csrs.cadastro.repository.ClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }
    
    public Cliente buscarPorId(int id) {
        return clienteRepository.findById(id).orElse(null);
    }
    
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
    
    public void excluir(int id) {
        clienteRepository.deleteById(id);
    }
}
