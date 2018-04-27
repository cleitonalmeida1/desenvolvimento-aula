package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.ItemPedido;
import br.com.ufms.compras.entity.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
