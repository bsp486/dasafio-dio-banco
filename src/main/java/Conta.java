public abstract class Conta implements IConta {
    private static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoesComum() {
        System.out.println("-------------------------");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %04d", this.agencia));
        System.out.println(String.format("Numero: %07d", this.numero));
        System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
        System.out.println("-------------------------");
        System.out.println("");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return String.format("Conta = {Agencia: %04d, Numero: %07d, Saldo: R$ %.2f, Titular: %s}", agencia, numero, saldo, cliente.getNome() );
    }
}
