public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("SuperBank");

        Cliente clienteTeste1 = new Cliente();
        clienteTeste1.setNome("Pedro");

        Conta cc = new ContaCorrente(clienteTeste1);
        Conta poupanca = new ContaPoupanca(clienteTeste1);

        cc.depositar(200);
        cc.transferir(150, poupanca);
        cc.sacar(200);

        System.out.println("=====" + banco.getNomeBanco() + "=====");

        banco.getQuantidadeContas();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
