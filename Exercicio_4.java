import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);

        double[][] paineis = new double[3][5];
        double soma = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                System.out.println("Digite a eficiência do painel [" + i + "][" + j + "]:");
                paineis[i][j] = usuario.nextDouble();

                soma = soma + paineis[i][j];
            }
        }

        double media = soma / 15;

        System.out.println("Média de eficiência: " + media);
        System.out.println("Painéis abaixo da média:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {

                if (paineis[i][j] < media) {
                    System.out.println("Painel [" + i + "][" + j + "]");
                }
            }
        }

        usuario.close();
    }
}