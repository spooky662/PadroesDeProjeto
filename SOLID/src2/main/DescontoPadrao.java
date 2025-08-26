package main;

public class DescontoPadrao implements DescontoStrategy {
	public double calcularDesconto(double valor) {
        return valor;
    }
}
