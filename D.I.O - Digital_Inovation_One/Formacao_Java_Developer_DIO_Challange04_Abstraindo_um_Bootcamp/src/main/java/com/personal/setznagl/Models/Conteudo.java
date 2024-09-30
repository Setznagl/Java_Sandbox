package com.personal.setznagl.Models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString @EqualsAndHashCode

public abstract class Conteudo {
    protected String titulo;
    protected String descricao;
    protected static final Double XP_Padrao = 10d;

    public abstract Double calcularXP();
}
