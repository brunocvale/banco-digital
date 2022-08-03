public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");
        Conta cc = new ContaCorrente(bruno);
        Conta poupanca = new ContaPoupanca(bruno);
        cc.depositar(1253.10);
        cc.transferir(730.50, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}