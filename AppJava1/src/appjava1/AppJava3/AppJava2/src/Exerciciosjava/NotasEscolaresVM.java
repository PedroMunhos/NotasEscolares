package Exerciciosjava;

import java.util.Scanner;

public class NotasEscolaresVM {
    /**
     * Criar algoritmo para receber as notas de 5 alunos de 4 bimestres,
     * a freq. do aluno e apresentar o resultado final considerando
     * media >= 7 e freq. >= 75%
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String alunos[][] = new String [5][2];
        float notas[][] = new float[5][6];
        
        System.out.println("Notas escolares 2 :.");
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o " + (i+1) + "º Aluno: ");
            alunos[i][0] = ler.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a " + (j+1) + " nota: ");
                notas[i][j] = ler.nextFloat();
                notas [i][5] += notas[i][j];//acumula/soma 4 notas
            }//fim do for notas
            notas [i][5] = notas [i][5]/4;//calcula a media das notas
            System.out.println( "Digite a freq. do aluno" +
                    alunos[i][0] + ":");
            notas[i][4] = ler.nextFloat();
            if (notas[i][4]< 75){
                alunos[i][1] = "Rep. por falta";
            }else if(notas[i][5]< 7) {
                alunos[i][1] = "Reprovado por nota";
            }else{
                alunos[i][1] = "Aprovado";
            }
            System.out.println("-------");
        }//fim do for
        System.out.println("--Resultados --");
        for (int i = 0; i < 5; i++) {
            System.out.println("O aluno" + alunos [i][0] +
                    alunos[i][0] +
                    "Teve a media de" + notas[i][5] +
                    "e foi " + alunos[i][1] + ".");
            
        }
        System.out.println(">: Sistema de Notas encerrado :.");
    }

}
