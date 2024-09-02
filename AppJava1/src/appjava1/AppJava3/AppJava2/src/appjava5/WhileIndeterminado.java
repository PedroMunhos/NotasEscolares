package appjava5;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String valor = "";

        while(!valor.equalsIgnoreCase("Sair") ){
            System.out.print("Voce escolheu: ");
            valor = entrada.nextLine();
    }
    System.out.println("Voce Saiu!");
    entrada.close();
}
}
