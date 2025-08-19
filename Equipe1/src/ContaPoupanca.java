public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente titular, double saldo, int numero) {
        super(titular, saldo, numero);
    }

    @Override
    public String exibirConta() {
        return super.exibirConta() +
               "\nTipo: Conta Poupança";
    }
}
