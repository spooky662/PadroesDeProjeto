public abstract class Conta {
    private Cliente titular;
    private double saldo;
    private int numero;

    public Conta(Cliente titular, double saldo, int numero) {
        this.titular = titular;
        this.saldo = saldo;
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public String exibirConta() {
        return "Conta Nº " + numero + 
               "\nTitular: " + (titular != null ? titular.toString() : "Nenhum") +
               "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
}
