
public class Triangulo {

    private int baseTriangulo;
    private int alturaTriangulo;

    public Triangulo() {

    }

    public Triangulo(int baseTriangulo, int alturaTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = alturaTriangulo;
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public int getAlturaTriangulo() {
        return alturaTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public void setAlturaTriangulo(int alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public double areaTriangulo(){
        return (baseTriangulo*alturaTriangulo)/2;
    }
}