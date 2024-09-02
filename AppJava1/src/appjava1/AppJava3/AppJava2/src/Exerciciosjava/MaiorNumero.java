package Exerciciosjava;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int valor =0, maior = 0;
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.println("Informe um numero: ");
            valor = entrada.nextInt();

            if(valor > maior){
                maior = valor;
                valor = 0;
    }

}

                System.out.println("O maior valor informado foi:");
                entrada.close();
}
}