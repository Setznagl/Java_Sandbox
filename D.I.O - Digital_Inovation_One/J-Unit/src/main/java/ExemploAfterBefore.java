import java.util.logging.Logger;

public class ExemploAfterBefore {

    class BancoDeDados{
        private static final Logger lg = Logger.getLogger(BancoDeDados.class.getName());

        public static void iniciarConexao(){
            lg.info("Iniciou conexão (from: BancoDeDados)!");
        }

        public static void encerrarConexao(){
            lg.info("Finalizou conexão! (from: BancoDeDados)");
        }

        public static void inserirDados(ExemploBasico.Pessoa pessoaParametro){
            lg.info("Inserindo no banco de dados! (from: BancoDeDados)");
        }

        public static void removerDados(ExemploBasico.Pessoa pessoaParametro){
            lg.info("Removendo do banco de dados! (from: BancoDeDados)");
        }
    }

}
