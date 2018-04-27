package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.Endereco;
import br.com.ufms.compras.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
