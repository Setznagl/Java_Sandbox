package Map;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        Map<String , Double> populacaoEstados = new TreeMap<>(){{
            put("PE" , 9616.621);
            put("AL" , 3351.543);
            put("CE" , 9187.103);
            put("RN" , 3534.265);
        }};
        populacaoEstados.put("RN" , 3534.165);
        if(!(populacaoEstados.containsKey("PB"))){
            populacaoEstados.put("PB" , 4039.277);
        }
        for(Map.Entry<String , Double> entry : populacaoEstados.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map<String , Double> populacaoEstadosOrdemInicio = new LinkedHashMap<>(populacaoEstados);
        System.out.println(populacaoEstadosOrdemInicio);

        System.out.println(Collections.min(populacaoEstados.values()));
        System.out.println(Collections.max(populacaoEstados.values()));

        Iterator<Map.Entry<String , Double>> iterator = populacaoEstados.entrySet().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double valor = iterator.next().getValue();
            soma += valor;
        }System.out.println("A soma de população é de: " + soma);
        System.out.println("A média de população é de: " + (soma/populacaoEstadosOrdemInicio.size()));


        Iterator<Map.Entry<String , Double>> iteratorRemove = populacaoEstadosOrdemInicio.entrySet().iterator();
        while(iteratorRemove.hasNext()){
            if(iteratorRemove.next().getValue() < 4000.000){
                iteratorRemove.remove();
            }
        }System.out.println(populacaoEstadosOrdemInicio);
    }
}
