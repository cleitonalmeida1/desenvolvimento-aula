package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.Cidade;
import br.com.ufms.compras.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
