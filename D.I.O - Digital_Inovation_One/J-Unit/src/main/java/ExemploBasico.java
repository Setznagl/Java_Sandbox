import lombok.Getter;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ExemploBasico {

    @Getter
    static class Pessoa{
        private String nome;
        private LocalDate dataNascimento;

        public Pessoa(String nome, LocalDate dataNascimento) {
            this.nome = nome;
            this.dataNascimento = dataNascimento;
        }

        public int getIdadeCustom(){
            return (int) ChronoUnit.YEARS.between(this.dataNascimento , LocalDate.now());
        }
    }

}


