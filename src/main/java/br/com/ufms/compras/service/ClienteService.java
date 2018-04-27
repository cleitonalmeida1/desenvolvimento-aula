package br.com.ufms.compras.service;

import br.com.ufms.compras.entity.Cliente;
import br.com.ufms.compras.exception.ObjectNotFoundException;
import br.com.ufms.compras.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscarClientePorId(Long id) {
        Cliente cliente = clienteRepository.findOne(id);

        if (cliente == null) {
            throw new ObjectNotFoundException("Objeto não encontrado, Id: " + id
                    + " Classe: " + Cliente.class.getName());
        }

        return cliente;
    }
}
