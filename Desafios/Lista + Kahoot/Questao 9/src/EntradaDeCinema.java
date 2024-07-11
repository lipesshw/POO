import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class EntradaDeCinema {
    private LocalDate dataFilme;
    private LocalTime horario;
    private String sala;
    private float valor;

    public EntradaDeCinema(LocalDate dataFilme, LocalTime horario, String sala, float valor) {
        this.dataFilme = dataFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }

    public float calculaDesconto(LocalDate dataNascimento) {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        if (idade < 12) {
            return (float) (valor * 0.5);
        }
        return valor;
    }

    public float calculaDesconto(LocalDate dataNascimento, int numeroCarteiraEstudante) {
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        if (idade >= 12 && idade <= 15) {
            return (float) (valor * 0.6);
        } else if (idade >= 16 && idade <= 20) {
            return (float) (valor * 0.7);
        } else if (idade > 20) {
            return (float) (valor * 0.8);
        }
        return valor;
    }

    public float calculaDescontoHorario(float valorComDesconto) {
        if (horario.isBefore(LocalTime.of(16, 0))) {
            return (float) (valorComDesconto * 0.9);
        }
        return valorComDesconto;
    }

    @Override
    public String toString() {
        return "\nEntradaDeCinema {" + "\ndataFilme: " + dataFilme +"\nHorario: " + horario +"\nSala: '" + sala + '\'' +"\nValor: " + valor + "\n}";
    }
   }