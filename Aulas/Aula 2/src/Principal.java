public class Principal {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(10, 5);

        Retangulo r2 = new Retangulo();

        System.out.println("Area: " + r2.calculaArea());

        r2.setAlturaRetangulo(20);
        r2.setBaseRetangulo(10);

        System.out.println("Area: " + r1.calculaArea());

        System.out.println("Area: " + r2.calculaArea());
        System.out.println("Lado r1: " + r1.getAlturaRetangulo());

        System.out.println(r1);
    }

}