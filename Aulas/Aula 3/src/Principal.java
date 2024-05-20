public class Principal {

    public static void main(String[] args) {
        Circunferencia c1 = new Circunferencia(5);
        Circunferencia c2 = new Circunferencia();

        System.out.println("Area: " + c1.areaCirc());
        System.out.println("Area: " + c2.areaCirc());


        c1.setRaioCirc(4);
        c2.setRaioCirc(2);

        System.out.println("Area: " + c1.areaCirc());
        System.out.println("Area: " + c2.areaCirc());


        System.out.println("Raio c1: " + c1.getRaioCirc());
        System.out.println("Raio c2: " + c2.getRaioCirc());
    }
}