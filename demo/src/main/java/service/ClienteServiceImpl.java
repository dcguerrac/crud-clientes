package service;

import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ClienteRepository;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    public ClienteRepository clienteRepository;
    @Override
    public Cliente get(long numDoc) {
        return clienteRepository.findById(numDoc).get();
    }

    @Override
    public List<Cliente> getAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
