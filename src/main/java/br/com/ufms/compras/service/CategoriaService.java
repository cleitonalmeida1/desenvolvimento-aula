package br.com.ufms.compras.service;

import br.com.ufms.compras.entity.Categoria;
import br.com.ufms.compras.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepository.findOne(id);
    }
}
