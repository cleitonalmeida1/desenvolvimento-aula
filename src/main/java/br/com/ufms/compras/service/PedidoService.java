package br.com.ufms.compras.service;

import br.com.ufms.compras.entity.Pedido;
import br.com.ufms.compras.exception.ObjectNotFoundException;
import br.com.ufms.compras.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscarPedidoPorId(Long id) {
        Pedido pedido = pedidoRepository.findOne(id);

        if (pedido == null) {
            throw new ObjectNotFoundException("Objeto não encontrado, Id: " + id
                    + " Classe: " + Pedido.class.getName());
        }

        return pedido;
    }
}
