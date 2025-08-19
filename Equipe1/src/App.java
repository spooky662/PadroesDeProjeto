public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ana Oliveira", "111.222.333-44");
        Cliente cliente2 = new Cliente("José Carlos", "123.456.789-00");

        ContaCorrente conta = new ContaCorrente(cliente, 1000.0, 1010, 500.0);
        ContaPoupanca conta2 = new ContaPoupanca(cliente2, 700.0, 1011);

        System.out.println("=== Estado Inicial da Conta ===");
        System.out.println(conta.exibirConta());
        
        conta.depositar(200);
        System.out.println("\nApós depositar R$ 200,00:");
        System.out.println(conta.exibirConta());
        
        if (conta.sacar(500)) {
            System.out.println("\nApós sacar R$ 500,00:");
        } else {
            System.out.println("\nSaque de R$ 500,00 não foi autorizado!");
        }
        System.out.println(conta.exibirConta());
        
        if (conta.sacar(800)) {
            System.out.println("\nApós sacar R$ 800,00:");
        } else {
            System.out.println("\nSaque de R$ 800,00 não foi autorizado!");
        }
        System.out.println(conta.exibirConta());

        System.out.println("\nExemplo de conta poupança: ");
        System.out.println(conta2.exibirConta());
    }
}