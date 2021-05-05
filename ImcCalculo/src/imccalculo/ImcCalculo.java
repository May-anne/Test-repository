
package imccalculo;


import java.util.Scanner;

public class ImcCalculo {

    public static void main(String[] args){
        String nome, faixa;
        float peso, altura, calculo;
        
        Scanner dados = new Scanner(System.in); //Ler a entrada
        
        System.out.println("Qual o seu peso? ");
        peso = dados.nextFloat(); //Digite valores com vírgula
        
        System.out.println("Qual a sua altura? ");
        altura = dados.nextFloat(); //Digite valores com vírgula
        
        dados.nextLine(); //Esvaziar o buffer.
        
        System.out.println("Qual o seu nome? ");
        nome = dados.nextLine();
        
        
        calculo = peso/(altura*altura);
        
        if(calculo<18.5) {
        faixa = "Abaixo do peso";
        }
        
        else if((calculo>18.5) && (calculo<24.9)) {
        faixa = "Normal";
        }
        
        else if((calculo>24.9) && (calculo<29.9)) {
        faixa = "Sobrepeso";
        }
        
        else {
        faixa = "Obesidade";
        }
        
        System.out.printf("%s, seu IMC é igual a %.2f. Você se encontra na faixa: %s.", nome, calculo, faixa); /*
        A saída está formatada para o cálculo do IMC sair com duas casas decimais.
        */
    
        } 
    }
    
