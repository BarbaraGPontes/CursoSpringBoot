package io.github.dougllasfps.Service;

import io.github.dougllasfps.Repository.ClientesRepository;
import io.github.dougllasfps.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private ClientesRepository repository;
    @Autowired
    //injetando a instancia de repository via construtor
     public ClientesService(ClientesRepository repository){
         this.repository = repository;
     }
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){
        //aplica validacoes
    }
}
