public class Principal {

    public static void main(String[] args) {
        //Quadrado
        Quadrado q1 = new Quadrado(5);

        System.out.println(q1);

        q1.setLado(6);

        System.out.println("Lado do triangulo: " + q1.getLado());
    }
}