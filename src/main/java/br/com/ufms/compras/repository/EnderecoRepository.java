package br.com.ufms.compras.repository;

import br.com.ufms.compras.entity.Cliente;
import br.com.ufms.compras.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
