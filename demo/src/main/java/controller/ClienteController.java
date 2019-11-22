package controller;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    public ClienteService clienteService;

    @GetMapping
    public List<Cliente> get() {
        return clienteService.getAll();
    }

    @GetMapping("/{numDoc}")
    public Cliente getAll(@PathVariable(value = "numDoc") long numDoc) {
        return clienteService.get(numDoc);
    }

}
