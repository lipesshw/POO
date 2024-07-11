public class DataTeste  {
    public static void main(String[] args) {
        Data minhaData = new Data(18, 5, 2024);

        System.out.println("Primeira data: ");
        minhaData.exibeData();

        minhaData.setDia(20);
        minhaData.setMes(6);
        minhaData.setAno(2025);

        System.out.println("Data após as alteracoes: ");
        minhaData.exibeData();
    }
}