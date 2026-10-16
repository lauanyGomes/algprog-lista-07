public class Exercicio_5 {

    public static void main(String[] args) {

        int[][] entregas = {
            {10, 15, 20, 25},
            {12, 18, 22, 30},
            {14, 16, 24, 28},
            {11, 17, 21, 26}
        };

        int somaBordas = 0;

        System.out.println("Matriz de tempos de entrega:");

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print(entregas[i][j] + "\t");

                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    somaBordas = somaBordas + entregas[i][j];
                }
            }

            System.out.println();
        }

        System.out.println("Soma dos tempos das bordas: " + somaBordas + " minutos");
    }
}