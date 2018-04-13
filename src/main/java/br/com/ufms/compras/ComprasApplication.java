package br.com.ufms.compras;

import br.com.ufms.compras.entity.Categoria;
import br.com.ufms.compras.entity.Cidade;
import br.com.ufms.compras.entity.Estado;
import br.com.ufms.compras.entity.Produto;
import br.com.ufms.compras.repository.CategoriaRepository;
import br.com.ufms.compras.repository.CidadeRepository;
import br.com.ufms.compras.repository.EstadoRepository;
import br.com.ufms.compras.repository.ProdutoRepository;
import javafx.beans.binding.BooleanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.CacheType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class ComprasApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ComprasApplication.class, args);
    }

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private EstadoRepository estadoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Override
    public void run(String... strings) throws Exception {
        Categoria cat1 = new Categoria(null, "Informática");
        Categoria cat2 = new Categoria(null, "escritório");

        Produto p1 = new Produto(null, "Computador", 2000.00);
        Produto p2 = new Produto(null, "Impressora", 800.00);
        Produto p3 = new Produto(null, "Mouse", 80.00);

        cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
        cat2.getProdutos().addAll(Arrays.asList(p2));

        categoriaRepository.save(Arrays.asList(cat1, cat2));

        p1.getCategorias().addAll(Arrays.asList(cat1));
        p2.getCategorias().addAll(Arrays.asList(cat2));
        p3.getCategorias().addAll(Arrays.asList(cat1));

        produtoRepository.save(Arrays.asList(p1, p2, p3));

        Estado est1 = new Estado(null, "Minas Gerais");
        Estado est2 = new Estado(null, "São Paulo");

        Cidade c1 = new Cidade(null, "Uberlândia");
        Cidade c2 = new Cidade(null, "São Paulo");
        Cidade c3 = new Cidade(null, "Campinas");

        est1.getCidades().addAll(Arrays.asList(c1));
        est2.getCidades().addAll(Arrays.asList(c2, c3));

        c1.setEstado(est1);
        c2.setEstado(est2);
        c3.setEstado(est2);

        estadoRepository.save(Arrays.asList(est1, est2));
        cidadeRepository.save(Arrays.asList(c1, c2, c3));

    }
}
