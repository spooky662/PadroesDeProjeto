package main;

public class DescontoVip implements DescontoStrategy {
	public double calcularDesconto(double valor) {
        return valor * 0.8;
    }
}
