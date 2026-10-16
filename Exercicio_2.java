public class Exercicio_2 {

    public static void main(String[] args) {

        int[][] conteudos = {
            {0, 1, 0, 2, 1},
            {1, 0, 2, 0, 0},
            {2, 1, 1, 0, 2},
            {0, 0, 1, 2, 1},
            {1, 2, 0, 0, 1}
        };

        int seguros = 0;
        int suspeitos = 0;
        int nocivos = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if (conteudos[i][j] == 0) {
                    seguros++;
                } else if (conteudos[i][j] == 1) {
                    suspeitos++;
                } else if (conteudos[i][j] == 2) {
                    nocivos++;
                    conteudos[i][j] = -1;
                }
            }
        }

        System.out.println("Conteúdos seguros: " + seguros);
        System.out.println("Conteúdos suspeitos: " + suspeitos);
        System.out.println("Conteúdos nocivos: " + nocivos);

        System.out.println("Matriz atualizada:");

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(conteudos[i][j] + " ");
            }

            System.out.println();
        }
    }
}