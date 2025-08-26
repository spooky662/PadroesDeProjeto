package main;

public class Teste {
	public static void main(String[] args) {
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        
        DescontoStrategy descontoVip = new DescontoVip();
        DescontoStrategy descontoNormal = new DescontoNormal();
        DescontoStrategy descontoPadrao = new DescontoPadrao();

        double valor = 100.0;

        System.out.println("VIP: " + calculadora.calcular(descontoVip, valor));       // 80.0
        System.out.println("Normal: " + calculadora.calcular(descontoNormal, valor)); // 90.0
        System.out.println("Outro: " + calculadora.calcular(descontoPadrao, valor));  // 100.0
    }
}
