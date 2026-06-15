package com.lol.api.controllers;

import com.lol.api.models.Campeao;
import com.lol.api.models.CampeaoDTO;
import com.lol.api.services.CampeaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campeoes")
public class CampeaoController {

    @Autowired
    private CampeaoService service;

    @GetMapping
    public List<CampeaoDTO> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Campeao criar(@RequestBody Campeao campeao) {
        return service.criar(campeao);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }
}