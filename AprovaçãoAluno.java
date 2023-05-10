
package aprovaçãoaluno;

import java.util.Scanner;


public class AprovaçãoAluno {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
 //Entrada
 System.out.print("Digite a sua primeira nota: ");
 float nota1 = Float.valueOf(input.nextLine());
 System.out.print("Digite a sua segunda nota: ");
 float nota2 = Float.valueOf(input.nextLine());
 System.out.print("Digite a sua terceira nota: ");
 float nota3 = Float.valueOf(input.nextLine());
 System.out.print("Digite a sua quarta nota: ");
 float nota4 = Float.valueOf(input.nextLine());
 
 //Processog
 float media = (nota1+nota2+nota3+nota4)/4;
 boolean aprovado = media >= 6;
 
 //Saída
 System.out.println("Você está aprovado: "+aprovado);
         
   
    }
    
}
