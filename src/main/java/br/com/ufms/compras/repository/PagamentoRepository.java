package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.Pagamento;
import br.com.ufms.compras.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
