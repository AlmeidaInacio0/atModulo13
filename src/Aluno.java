public class Aluno {

    private String nome;
    private double[] notas;
    private double somaNotas;

    public Aluno(String nome, double[] notas, double somaNotas) throws Exception {
        this.nome = nome;

        validarNotas(notas);

        this.notas = notas;
        this.somaNotas = somaNotas;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);

        System.out.println("Notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Prova " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Soma das notas: " + somaNotas);

        double media = somaNotas / notas.length;
        System.out.println("Média: " + media);
    }

    private void validarNotas(double[] notas) throws Exception {
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 0 || notas[i] > 10) {
                throw new Exception(
                        "Nota inválida na prova " + (i + 1) +
                                ". A nota deve estar entre 0 e 10."
                );
            }
        }
    }
}