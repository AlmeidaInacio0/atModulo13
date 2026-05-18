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
            System.out.println("DFigite o nome do aluno: " + (i + 1));
            String nome = scanner.nextLine();

            double[] notas = new double[conteProvas];
            double soma = 0;

            for (int j = 0; j <conteProvas; j++){
                System.out.println("Gigite a nota da prova: " + (j + 1));
                notas[j] = scanner.nextDouble();

                soma += notas[j];
            }
            scanner.nextLine();


            alunos[i] = new Aluno(nome, notas, soma);
        }

    }
}