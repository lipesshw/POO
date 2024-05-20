public class Principal {

    public static void main(String[] args) {
        //Cilindro
        Cilindro c1 = new Cilindro(new Circunferencia(2), 5);

        System.out.println("Objeto Circulo: "+c1.getCirculo() + ", Altura: " + c1.getAltura());
        System.out.println(c1);
        Circunferencia circulo = new Circunferencia(5);

        c1.setCirculo(circulo);
        c1.setAltura(2);

        System.out.println("Objeto Circulo: "+c1.getCirculo() + ", Altura: " + c1.getAltura());
        System.out.println(c1);
    }
}