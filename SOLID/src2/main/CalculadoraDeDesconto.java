package main;

public class CalculadoraDeDesconto {
    public double calcular(DescontoStrategy strategy, double valor) {
        return strategy.calcularDesconto(valor);
    }
}