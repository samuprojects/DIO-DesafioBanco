public class Banco {

    private final String nomeBanco;
    private static int quantidadeContas = 0;


    public Banco(String nome) {
        this.nomeBanco = nome;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void getQuantidadeContas() {
        System.out.println("Contas criadas: " + quantidadeContas);
    }

    public static void incrementarContasCriadas() {
        quantidadeContas++;
    }

}