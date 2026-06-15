package com.lol.api.repositories;

import com.lol.api.models.Campeao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampeaoRepository extends JpaRepository<Campeao, String> {
    List<Campeao> findByNomeContainingIgnoreCase(String nome);
}