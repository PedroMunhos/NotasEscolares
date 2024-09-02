package Exerciciosjava;

import java.util.Scanner;

public class NotasEscolares {
    /**
     *Receber 4 notas de 0 a 10 e fazer a media dos
     *4 bimestres, considerando media maior que 7 para aprovação
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float notas[] = new float [5];
        String aluno, resultado;

        System.out.println(".: Notas Escolares :.");
        System.out.print("Informe o nome do aluno:");
        aluno = ler.nextLine();
        aluno = aluno.toUpperCase();

        for (int i = 0; i < 4; i++) {
            System.out.println("Informa a "+ (i+1)+ "nota: ");
            notas[i] = ler.nextFloat();
            notas[4] = notas[4] + notas[i];
        }
        notas[4] = notas[4]/4; //calcula media

        if (notas[4]>=7){
            resultado = "aprovado";
        }else{
            resultado = "reprovado";
    }

        System.out.println("O(a) aluno(a)" +
                aluno + "teve a media" +
                notas[4] + "e foi" + resultado + ".");
}

}
