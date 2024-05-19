import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        EntradaDeCinema ingresso = new EntradaDeCinema(LocalDate.of(2024, 5, 19), LocalTime.of(14, 30), "Sala 7", 65);
        LocalDate dataNascimento1 = LocalDate.of(2015, 5, 19);
        LocalDate dataNascimento2 = LocalDate.of(2008, 5, 19);
        LocalDate dataNascimento3 = LocalDate.of(2003, 5, 19);
        LocalDate dataNascimento4 = LocalDate.of(1999, 5, 19);

        System.out.println(ingresso);

        float valorComDesconto1 = ingresso.calculaDesconto(dataNascimento1);
        float valorComDesconto2 = ingresso.calculaDesconto(dataNascimento2, 12345);
        float valorComDesconto3 = ingresso.calculaDesconto(dataNascimento3, 12345);
        float valorComDesconto4 = ingresso.calculaDesconto(dataNascimento4, 12345);

        float valorFinal1 = ingresso.calculaDescontoHorario(valorComDesconto1);
        float valorFinal2 = ingresso.calculaDescontoHorario(valorComDesconto2);
        float valorFinal3 = ingresso.calculaDescontoHorario(valorComDesconto3);
        float valorFinal4 = ingresso.calculaDescontoHorario(valorComDesconto4);

        System.out.println("\nValor final para menor de 12 anos: " + valorFinal1);
        System.out.println("Valor final para estudante de 12 a 15 anos: " + valorFinal2);
        System.out.println("Valor final para estudante de 16 a 20 anos: " + valorFinal3);
        System.out.println("Valor final para estudante acima de 20 anos: " + valorFinal4);
    }
}