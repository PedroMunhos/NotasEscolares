package appjava4;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        int contDiv = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero inteiro: ");

        int numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            if(numero % i == 0){
                contDiv ++;

            }     
            
        }
            switch (contDiv) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }
    }

}
