package List;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Pessoa> suspeitos= new ArrayList<Pessoa>(){{
            add(new Pessoa("Carlos" , false , false, false , true , true));
            add(new Pessoa("Juan" , false , false, true , true , true));
            add(new Pessoa("Jose" , true , false, true , false , true));
            add(new Pessoa("Maria" , true , false, false , true , true));
            add(new Pessoa("Pedro" , false , true, true , false , false));
            add(new Pessoa("Ana" , true , true, true , true , true));
            add(new Pessoa("Bartolomeu" , false , false, false , false , false));
        }};
        System.out.println("1 - 'Telefonou para a vítima?'\n" + "2 - 'Esteve no local?'\n" + "3 - Mora perto da vítima?\n"
        + "4 -Devia para a vítima?\n" + "5 - Já trabalhou com a vítima?\n");

        Collections.sort(suspeitos , new comparatorMaiorSuspeito(){});System.out.println(suspeitos + "\n");
        System.out.println("O menos suspeito é: " +Collections.min(suspeitos , new comparatorMaiorSuspeito(){}));
        System.out.println("O mais suspeito é: "+ Collections.max(suspeitos, new comparatorMaiorSuspeito(){}));
    }
}

@Getter @Setter class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private boolean r1;
    private boolean r2;
    private boolean r3;
    private boolean r4;
    private boolean r5;
        Pessoa(String nome, boolean r1, boolean r2, boolean r3, boolean r4, boolean r5) {
            this.nome = nome;
            this.r1 = r1;
            this.r2 = r2;
            this.r3 = r3;
            this.r4 = r4;
            this.r5 = r5;
        }

    @Override
    public int compareTo(Pessoa o) {
        return o.getNome().compareToIgnoreCase(this.nome);
    }

    @Override
    public String toString() {
        return '[' + nome + ", r1=" + r1 + ", r2=" + r2 + ", r3=" + r3 + ", r4=" + r4 + ", r5=" + r5 + ']';
    }
}

class comparatorMaiorSuspeito implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        int grauSuspeitoO1 = 0;
        int grauSuspeitoO2 = 0;
        if(o1.isR1()) grauSuspeitoO1++; if (o2.isR1()) grauSuspeitoO2++;
        if(o1.isR2()) grauSuspeitoO1++; if (o2.isR2()) grauSuspeitoO2++;
        if(o1.isR3()) grauSuspeitoO1++; if (o2.isR3()) grauSuspeitoO2++;
        if(o1.isR4()) grauSuspeitoO1++; if (o2.isR4()) grauSuspeitoO2++;
        if(o1.isR5()) grauSuspeitoO1++; if (o2.isR5()) grauSuspeitoO2++;

        if (grauSuspeitoO1 > grauSuspeitoO2) {
            return 1;
        }else if (grauSuspeitoO1 < grauSuspeitoO2){
            return -1;
        }else return 0;
    }
};