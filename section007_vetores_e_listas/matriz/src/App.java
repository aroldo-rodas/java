import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int linha, coluna, numeroPosicao;

        System.out.print("Informe a quantida de linha e coluna [][]: ");
        linha = sc.nextInt();
        coluna = sc.nextInt();

        matriz = new int[linha][coluna];

        //Preenche matriz
        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.printf("Informe o elemento [%d][%d]: ", (i + 1), (j + 1));
                matriz[i][j] = sc.nextInt();
            }
        }

        //Diagonal principal
        System.out.print("\nDiagonal principal: ");
        if(linha == coluna) {
            for(int i = 0; i < linha; i++) {
                System.out.print(matriz[i][i] + " ");
            }
        }
        else {
            System.out.println("Não é de mesma ordem!");
        }

        //Posição das repetições
        System.out.print("\n\nInforme um número: ");
        numeroPosicao = sc.nextInt();

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                if(matriz[i][j] == numeroPosicao) {
                    System.out.println("\nPosição: [" + i + "," + j + "]");

                    //Esquerda
                    if((j - 1) >= 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1 ]);
                    }

                    //Direita
                    if(j + 1 <= (coluna -1)) {
                        System.out.println("Direita: " + matriz[i][j + 1 ]);
                    }

                    //Acima
                    if((i - 1) >= 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }

                    //Abaixo
                    if((i + 1) <= linha) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
