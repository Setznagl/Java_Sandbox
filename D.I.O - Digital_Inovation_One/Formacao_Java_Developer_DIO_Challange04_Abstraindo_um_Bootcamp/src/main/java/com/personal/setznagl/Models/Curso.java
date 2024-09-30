package com.personal.setznagl.Models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter

public class Curso extends Conteudo{
    int cargaHoraria;
        public Curso(String titulo, String descricao, int cargaHoraria) {
            this.titulo = titulo;
            this.descricao = descricao;
            this.cargaHoraria = cargaHoraria;
        }

    @Override
    public Double calcularXP() {
        return XP_Padrao * this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso[ " + " titulo " + titulo + " descricao=" + descricao + cargaHoraria + "hrs" + ']';
    }
}
