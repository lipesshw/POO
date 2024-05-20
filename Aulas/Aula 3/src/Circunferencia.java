public class Circunferencia {
    public double raioCirc;

    public Circunferencia() {

    }

    public Circunferencia(double raioCirc) {
        this.raioCirc = raioCirc;
    }

    public double getRaioCirc() {
        return raioCirc;
    }

    public void setRaioCirc(double raioCirc) {
        this.raioCirc = raioCirc;
    }

    @Override
    public String toString() {
        return "Circ{" + "raioCirc = " + raioCirc + '}';
    }

    public double areaCirc(){
        return  (Math.pow(raioCirc, 2) * Math.PI);
    }
}