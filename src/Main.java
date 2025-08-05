public class Main {
    public static void main(String[] args) {
        Cliente Danielle = new Cliente("Danielle", "Rua do código, 500", "11 999999999");
        Conta cc = new ContaCorrente(Danielle);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(Danielle);

        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
