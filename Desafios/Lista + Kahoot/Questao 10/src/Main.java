public class Main {
    public static void main(String[] args) {

        Notas notas = new Notas(7.5f, 8.0f, 6.5f, 7.0f, 5.5f, 6.0f);
        System.out.println("\nTrabalhos: ");
        System.out.println("Trabalho 1: " + notas.getTrabalho1());
        System.out.println("Trabalho 2: " + notas.getTrabalho2());
        System.out.println("Trabalho 3: " + notas.getTrabalho3());
        System.out.println("Trabalho 4: " + notas.getTrabalho4());
        System.out.println("\nProvas: ");
        System.out.println("Prova 1: " + notas.getProva1());
        System.out.println("Prova 2: " + notas.getProva2());

        float mediaFinal = notas.calcularMediaFinal();
        System.out.println("\nMédia Final: " + mediaFinal);

        if (notas.foiAprovado()) {
            System.out.println("Aluno está aprovado.");
        } else {
            System.out.println("Aluno não está aprovado.");
        }
    }
}