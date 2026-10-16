public class Exercicio1 {

    public static void main(String[] args) {

        double[][] emissoes = {
            {10.5, 12.0, 11.5, 13.0},
            {8.0, 9.5, 10.0, 7.5},
            {15.0, 14.0, 16.5, 18.0},
            {6.0, 7.0, 8.5, 9.0}
        };

        double total;
        double maiorTrimestre = 0;
        int trimestre = 0;

        // Soma das emissões de cada filial
        for (int i = 0; i < 4; i++) {

            total = 0;

            for (int j = 0; j < 4; j++) {
                total = total + emissoes[i][j];
            }

            System.out.println("Total da filial " + (i + 1) + ": " + total);
        }

        // Soma das emissões de cada trimestre
        for (int j = 0; j < 4; j++) {

            total = 0;

            for (int i = 0; i < 4; i++) {
                total = total + emissoes[i][j];
            }

            System.out.println("Total do trimestre " + (j + 1) + ": " + total);

            if (j == 0 || total > maiorTrimestre) {
                maiorTrimestre = total;
                trimestre = j + 1;
            }
        }

        System.out.println("Trimestre com maior emissão: " + trimestre);
        System.out.println("Maior emissão total: " + maiorTrimestre);
    }
}