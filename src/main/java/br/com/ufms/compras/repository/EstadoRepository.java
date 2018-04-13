package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.Cidade;
import br.com.ufms.compras.entity.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
