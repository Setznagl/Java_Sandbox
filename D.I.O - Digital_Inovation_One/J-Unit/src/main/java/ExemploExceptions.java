public class ExemploExceptions {
    static class TransferenciaEntreContas{

        public void transfere(Conta contaOrigem , Conta contaDestino , int valor){
            if(valor <= 0){throw new IllegalArgumentException("Valor invalido");}
        }

    }
}

class Conta extends ExemploExceptions.TransferenciaEntreContas {
    Conta(){
        //Será comparado somente o endereço de memória para simplificar
    }
}