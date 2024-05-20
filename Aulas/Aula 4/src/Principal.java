public class Principal {

    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(4,5);
        Triangulo t2 = new Triangulo(10,4);


        System.out.println("Area t1: " + t1.areaTriangulo());


        System.out.println("O objeto T2 possui altura = " + t2.getAlturaTriangulo() + " e base = " + t2.getBaseTriangulo());

        t2.setAlturaTriangulo(6);
        t2.setBaseTriangulo(2);
        System.out.println("O objeto T2 possui altura = " + t2.getAlturaTriangulo() + " e base = " + t2.getBaseTriangulo());


        System.out.println("Area t2: " + t2.areaTriangulo());

    }
}