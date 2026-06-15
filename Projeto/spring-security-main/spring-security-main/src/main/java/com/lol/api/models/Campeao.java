package com.lol.api.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_campeoes")
@Data
public class Campeao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false, length = 100)
    private String nome;

    private String funcao;  // Top, Jungle, Mid, ADC, Support
    private String elo;     // Iron, Bronze, Silver, Gold, Platinum, Diamond, Master, GrandMaster, Challenger

    public Campeao() {} // Construtor vazio obrigatório
}