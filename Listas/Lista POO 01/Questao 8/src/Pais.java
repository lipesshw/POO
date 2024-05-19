import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nome;
    private String capital;
    private double dimensaoKm2;
    private List<Pais> fronteiras;

    public Pais(String nome, String capital, double dimensaoKm2) {
        this.nome = nome;
        this.capital = capital;
        this.dimensaoKm2 = dimensaoKm2;
        this.fronteiras = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    public double getDimensaoKm2() {
        return dimensaoKm2;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.getNome()) && this.capital.equals(outro.getCapital());
    }

    public void adicionarFronteira(Pais pais) {
        if (!this.equals(pais)) {
            fronteiras.add(pais);
            pais.fronteiras.add(this);
        }
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public List<Pais> vizinhosComuns(Pais outro) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais vizinho : this.fronteiras) {
            if (outro.fronteiras.contains(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }
}