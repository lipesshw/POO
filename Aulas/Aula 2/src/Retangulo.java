public class Retangulo {

    int baseRetangulo;
    int alturaRetangulo;

    public Retangulo() {

    }

    public Retangulo(int alturaRetangulo, int baseRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
        this.baseRetangulo = baseRetangulo;
    }

    public void setBaseRetangulo(int baseRetangulo){
        this.baseRetangulo = baseRetangulo;
    }

    public void setAlturaRetangulo(int alturaRetangulo){
        this.alturaRetangulo = alturaRetangulo;
    }

    public int getBaseRetangulo(){
        return this.baseRetangulo;
    }

    public int getAlturaRetangulo(){
        return this.alturaRetangulo;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "baseRetangulo = " + baseRetangulo + ", alturaRetangulo = " + alturaRetangulo + '}';
    }

    int calculaArea(){
        return baseRetangulo * alturaRetangulo;
    }
}