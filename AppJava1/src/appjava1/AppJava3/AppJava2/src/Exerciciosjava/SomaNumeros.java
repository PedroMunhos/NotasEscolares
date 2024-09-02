package Exerciciosjava;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int SomaNumeros = 0, numero = 0;

        while(numero >= 0){
            System.out.println("Informe um numero inteiro:");
            numero = entrada.nextInt();

            if(numero >= 0){
                SomaNumeros += numero;
    }
}
        System.out.println("A soma dos numeros é");
        entrada.close();
     
}
}