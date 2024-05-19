public class CalculadoraCompleta extends Calculadora {
    @Override
    public float soma(float a, float b) {
        return (a + b);
    }

    @Override
    public float subtracao(float a, float b) {
        return (a - b);
    }

    @Override
    public float multiplicacao(float a, float b) {
        return (a * b);
    }

    @Override
    public float divisao(float a, float b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por 0 não é aceita, tente novamente.");
        }
        return (a / b);
    }

    public float raizQuadrada(float a) {
        if (a < 0) {
            throw new ArithmeticException("num e possível calcular a raiz quadrada de um número negativo, tente novamente.");
        }
        return (float) Math.sqrt(a);
    }

    public float potencia2(float a) {
        return (float)Math.pow(a, 2);
    }
}
