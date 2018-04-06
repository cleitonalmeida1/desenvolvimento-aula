package br.com.ufms.compras;

import br.com.ufms.compras.entity.Categoria;
import br.com.ufms.compras.repository.CategoriaRepository;
import javafx.beans.binding.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheType;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ComprasApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ComprasApplication.class, args);
    }

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String... strings) throws Exception {
        List<Categoria> categorias = new ArrayList<>();
        Categoria categoria1 = new Categoria();
        categoria1.setId(1L);
        categoria1.setNome("Informática");
        Categoria categoria2 = new Categoria();
        categoria2.setId(2L);
        categoria2.setNome("Escritório");

        categorias.add(categoria1);
        categorias.add(categoria2);

        categoriaRepository.save(categorias);
    }
}
