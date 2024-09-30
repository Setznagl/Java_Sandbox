package com.personal.setznagl.Models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Getter @Setter @ToString

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
        public Dev(String nome){
            this.nome = nome;
        }

    public void inscreverBootcamp(Bootcamp bootcampParametro) {
            this.conteudosInscritos.addAll(bootcampParametro.getConteudos());
            bootcampParametro.getInscritos().add(this);
    };

    public void progredir(){
        Optional<Conteudo> conteudoAtual = this.conteudosInscritos.stream().findFirst();
        if(conteudoAtual.isPresent()){
            this.conteudosConcluidos.add(conteudoAtual.get());
            this.conteudosInscritos.remove(conteudoAtual.get());
        }else {
            System.out.println("Você não possui nenhum conteúdo pendente!");
        }
    };

    public double calcularXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP).sum();
    };
}
