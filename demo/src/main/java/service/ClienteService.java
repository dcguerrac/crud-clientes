package service;

import model.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente get(long numDoc);
    public List<Cliente> getAll();
    public Cliente save(Cliente cliente);

}
