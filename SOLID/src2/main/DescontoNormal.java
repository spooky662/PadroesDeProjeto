package main;

public class DescontoNormal implements DescontoStrategy {
	public double calcularDesconto(double valor) {
        return valor * 0.9;
    }
}
