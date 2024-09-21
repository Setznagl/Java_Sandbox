package com.personal.setznagl.OO.Abstract_vs_Interface;

public interface SerVivoInterface {
    /**
     * O atributo da interface pode ser acessado pelas instancias da classe concreta, mas obrigatoriamente
     * ele deve ser público e no caso do método abaixo obrigatoriamente deve possuir "default" para que seja possível
     * escrever a lógica do método na interface.
     */
    public int valorTeste = 535;
    public default int getValorTeste(){
        return valorTeste;
    }
    /** Não possui braços com lógica, a menos que o campo "default" seja usado para fornecer
        uma implementação padrão que pode ser sobrescrita*/
    public String respirar();


    /** O modificador "default" implementa uma implementação genérica padrão,
     * de modo que todas as classes herdeiras não são obrigadas a reescrever a
     * menos que queiram um comportamento diferente.*/
    public default String ver(AnimalAbstract animalAbstractParametro) {
        StringBuilder s = new StringBuilder();
        s.append("O animal ").append(animalAbstractParametro.getNome()).append(" está utilizando seus fotoreceptores para ver");
        return s.toString();
    }

}
