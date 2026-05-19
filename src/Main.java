import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos gostaria de adicionar");
        int conteAluno = scanner.nextInt();
        scanner.nextLine();

        System.out.println("quatas provas eles tiveram");
        int conteProvas = scanner.nextInt();
        scanner.nextLine();

        Aluno [] alunos = new Aluno [conteAluno];

        for (int i = 0; i < conteAluno; i ++){
            System.out.println("Digite o nome do aluno: " + (i + 1));
            String nome = scanner.nextLine();

            double[] notas = new double[conteProvas];
            double soma = 0;

            for (int j = 0; j < conteProvas; j++) {
                while (true) {
                    System.out.println("Digite a nota da prova " + (j + 1) + ": ");
                    notas[j] = scanner.nextDouble();

                    if (notas[j] >= 0 && notas[j] <= 10) {
                        soma += notas[j];
                        break; // sai do while se a nota for válida
                    } else {
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                    }
                }
            }
            scanner.nextLine();

            try {
                alunos[i] = new Aluno(nome, notas, soma);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

    }
}