package com.lol.api.services;

import com.lol.api.models.Campeao;
import com.lol.api.models.CampeaoDTO;
import com.lol.api.repositories.CampeaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampeaoService {

    @Autowired
    private CampeaoRepository repository;

    public List<CampeaoDTO> listarTodos() {
        return repository.findAll().stream()
                .map(c -> new CampeaoDTO(c.getNome(), c.getFuncao(), c.getElo()))
                .toList();
    }

    public Campeao criar(Campeao campeao) {
        if (campeao.getNome() == null || campeao.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do campeão é obrigatório!");
        }
        return repository.save(campeao);
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}