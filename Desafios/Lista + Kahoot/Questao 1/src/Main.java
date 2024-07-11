
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner lerEntrada = new Scanner(System.in);
        System.out.print("\nDigite 2 valores, eles serão usados para realizar a soma, subtração, multiplicação e divisão. \n");

        System.out.print("Insira o primeiro número: ");
        float valor1 = lerEntrada.nextFloat();

        System.out.print("Insira o segundo número: ");
        float valor2 = lerEntrada.nextFloat();

        System.out.print("\nCerto, agora vamos realizar o calculo da raiz quadrada e potencia ao quadrado: \n");

        System.out.print("Insira um número para calcular a raiz quadrada: ");
        float valor3 = lerEntrada.nextFloat();

        System.out.print("Insira um número para calcular a potência ao quadrado: ");
        float valor4 = lerEntrada.nextFloat();

        CalculadoraCompleta calculadora = new CalculadoraCompleta();

        System.out.println("\nSoma: " + calculadora.soma(valor1, valor2));
        System.out.println("Subtração: " + calculadora.subtracao(valor1, valor2));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(valor1, valor2));
        System.out.println("Divisao: " + calculadora.divisao(valor1, valor2));
        System.out.println("Raiz Quadrada: " + calculadora.raizQuadrada(valor3));
        System.out.println("Potencia ao quadrado: " + calculadora.potencia2(valor4));
    }
}