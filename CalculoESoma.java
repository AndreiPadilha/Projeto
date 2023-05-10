
package calculoesom;

import java.util.Scanner;


public class CalculoESom {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    //Entrada
    System.out.print("Digite o primeiro número desejado: ");
    float n1 = Float.valueOf(input.nextLine());
    System.out.print("Digite o segundo número desejado: ");
    float n2 = Float.valueOf(input.nextLine());
    
    //Processo
    float soma = n1+n2;
    
    //Saída
    System.out.println("A soma dos dois números é: "+soma);
    }
    
}
