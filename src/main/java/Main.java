public class Main {
    public static void main(String[] args) {
        Banco banco = Banco.getInstance();

        Cliente cliente = new Cliente("Bruno");
        Conta cc = new ContaCorrente(cliente);
        banco.setContaList(cc);

        Conta poupanca = new ContaPoupanca(cliente);
        banco.setContaList(poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.depositar(100.02);
        cc.transferir(100.00, poupanca);

        Cliente cliente1 = new Cliente("Maria S.");
        Conta cc2 = new ContaCorrente(cliente1);
        banco.setContaList(cc2);
        cc2.depositar(255.33);

        banco.imprimirContas();
    }
}
