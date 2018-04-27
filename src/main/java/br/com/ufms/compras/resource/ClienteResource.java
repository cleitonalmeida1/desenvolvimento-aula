package br.com.ufms.compras.resource;

import br.com.ufms.compras.entity.Cliente;
import br.com.ufms.compras.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> buscarClientePorId(@PathVariable("id") Long id) {
        Cliente cliente = clienteService.buscarClientePorId(id);
        return ResponseEntity.ok().body(cliente);
    }
}
