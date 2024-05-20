public class Principal {

    public static void main(String[] args) {
        Triangulo t1 = new TrianguloEquilatero(10);
        Triangulo t2 = new TrianguloIsoceles(10,12);
        Triangulo t3 = new TrianguloEscaleno(9,10,11);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}