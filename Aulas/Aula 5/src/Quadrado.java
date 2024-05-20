
public class Quadrado extends Retangulo {

    Quadrado() {
    }

    Quadrado(int lado) {
        super(lado, lado);
    }

    public void setLado(int lado) {
        super.setAlturaRetangulo(lado);
        super.setBaseRetangulo(lado);
    }

    public int getLado() {
        return super.getAlturaRetangulo();
    }

    @Override
    public String toString() {
        return super.toString() + " Tipo: Quadrado";
    }
}