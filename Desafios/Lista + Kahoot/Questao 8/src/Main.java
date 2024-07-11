public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("Brasil", "Brasília", 8515767.049);
        Pais argentina = new Pais("Argentina", "Buenos Aires", 2780400);
        Pais paraguai = new Pais("Paraguai", "Assunção", 406752);
        Pais uruguai = new Pais("Uruguai", "Montevidéu", 176215);

        brasil.adicionarFronteira(argentina);
        brasil.adicionarFronteira(paraguai);
        brasil.adicionarFronteira(uruguai);

        argentina.adicionarFronteira(paraguai);
        argentina.adicionarFronteira(uruguai);

        System.out.println("países que fazem fronteira com o Brasil:");
        for (Pais fronteira : brasil.getFronteiras()) {
            System.out.println(fronteira.getNome());
        }

        System.out.println("\npaíses que são vizinhos comuns entre Brasil e Argentina:");
        for (Pais vizinho : brasil.vizinhosComuns(argentina)) {
            System.out.println(vizinho.getNome());
        }
    }
}