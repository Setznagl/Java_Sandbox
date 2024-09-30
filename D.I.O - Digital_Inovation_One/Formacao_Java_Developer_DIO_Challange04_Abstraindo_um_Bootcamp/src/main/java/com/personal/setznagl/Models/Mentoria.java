package com.personal.setznagl.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter @Setter

public class Mentoria extends Conteudo{
    LocalDate data;
        public Mentoria(String titulo, String descricao, LocalDate data) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.data = data;
        }

    @Override
    public Double calcularXP() {
        return XP_Padrao + 20d;
    }

    @Override
    public String toString() {
            return "Mentoria[ " + " titulo " + titulo + " descricao " + descricao +  data + ']';
    }
}
