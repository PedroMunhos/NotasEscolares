package Exerciciosjava;

import java.util.Scanner;

public class CalcIMC {
    public static void main(String[] args) {
        float altura,peso,imc;
        String resultado = null;
        Scanner ler = new Scanner(System.in);

        System.out.println("Calculadora de IMC: ");
        System.out.println("Digite a altura: ");
        altura = ler.nextFloat();
        System.out.println("Digite o Peso: ");
        peso= ler.nextFloat();
        imc = peso / (altura * altura);
        ler.close();

        if(imc<16){
            resultado = "Magreza";
        }else if (imc<16.9){
            resultado = "Magreza moderada";
        }else if (imc<18.5){
            resultado = "Magreza leve";
        }else if (imc<24.9){
            resultado = "peso ideal";
        }else if (imc<29.9){
            resultado = "Sobrepeso";
        }else if (imc<34.9);{
            resultado = "Obesidade grau I";
        }else if (imc<39.9);{
            resultado = "Obesidade grau II";
        }else{
            resultado = "Obesidade Graus III";
        }
        
        System.out.println("Seu IMC é:" + imc);
    
    
    

    
    
        
    

        
    
    
        
    }

    
}
