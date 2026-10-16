public class Exercicio_3 {

    public static void main(String[] args) {

        double[][] temperaturas = {
            {25.0, 28.0, 30.0, 27.0},
            {29.0, 32.0, 31.0, 28.0},
            {26.0, 35.0, 33.0, 29.0},
            {27.0, 30.0, 28.0, 34.0}
        };

        double maior = temperaturas[0][0];
        int linhaMaior = 0;
        int colunaMaior = 0;

        double somaDiagonal = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                if (temperaturas[i][j] > maior) {
                    maior = temperaturas[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }

            somaDiagonal = somaDiagonal + temperaturas[i][i];
        }

        double mediaDiagonal = somaDiagonal / 4;

        System.out.println("Maior temperatura: " + maior + " ºC");
        System.out.println("Posição: [" + linhaMaior + "][" + colunaMaior + "]");
        System.out.println("Média da diagonal principal: " + mediaDiagonal + " ºC");
    }
}