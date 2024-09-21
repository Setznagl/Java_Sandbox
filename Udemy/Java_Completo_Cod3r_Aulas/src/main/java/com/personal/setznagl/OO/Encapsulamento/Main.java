package com.personal.setznagl.OO.Encapsulamento;

import com.personal.setznagl.OO.Encapsulamento.Alta_Gestao.Socio;
import com.personal.setznagl.OO.Encapsulamento.Gestao.Gestor;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio();
        Gestor gestor1 = new Gestor();
        socio1.setGestorSubalterno(gestor1);

        /**
         * Problema, sócio não tem acesso ao atributo 'problemasPessoaisGestor' diretamente, mas
         * pode acessar via @Getter, uma vez que o gestor é um atributo do sócio
         */
//        System.out.println(gestor1.getProblemasPessoaisGestor());
//        System.out.println(socio1.getGestorSubalterno().problemasPessoaisGestor);
//        System.out.println(socio1.getGestorSubalterno().getProblemasPessoaisGestor());
    }
}
