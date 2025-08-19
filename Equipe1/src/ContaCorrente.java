public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(Cliente titular, double saldo, int numero, double limite) {
        super(titular, saldo, numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String exibirConta() {
        return super.exibirConta() +
               "\nTipo: Conta Corrente" +
               "\nLimite: R$ " + String.format("%.2f", limite);
    }
}
