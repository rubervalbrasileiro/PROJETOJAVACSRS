
package com.csrs.cadastro.controller;

import com.csrs.cadastro.model.Cliente;
import com.csrs.cadastro.service.ClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping("/cadastro")
    public String  exibirFormulario(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "cadastro";
    }
    
    @PostMapping("/grava")
    public String processarFormulario(@ModelAttribute Cliente cliente, Model model) {
        clienteService.salvar(cliente);
        model.addAttribute("cliente", cliente);
        
        return "redirect:/cliente/cadastro";
    }
    
     @GetMapping("/lista")
    public String listarClientes(Model model) {
        List<Cliente> clientes = clienteService.listarTodos();
        model.addAttribute("clientes", clientes);
        return "lista";
    }
    
    @GetMapping ("/alterar/{id}")
    public String alterarCliente(@PathVariable int id, Model model) {
        Cliente cliente = clienteService.buscarPorId(id);
        if(cliente != null) {
        model.addAttribute("cliente", cliente);
        return "cadastro";            
        }
        return "redirect:/cliente/lista";
    }
    
    @PostMapping("/cliente/atualizar{id}")
    public String atualizarCliente(@PathVariable int id, @ModelAttribute Cliente cliente) {
        cliente.setId(id);
        clienteService.salvar(cliente); // Atualiza no banco
        return "redirect:/cliente/lista"; // Redireciona para a lista de clientes
    }
    
    @GetMapping ("/excluir/{id}")
    public String excluirCliente(@PathVariable int id) {
        clienteService.excluir(id);
        return "redirect:/cliente/lista";
    }
    
}
