
package equaçãodessegundograu;

import java.util.Scanner;


public class EquaçãodesSegundoGrau {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    //Entrada
    System.out.print("Digite o valor referente ao 'A': ");
    float A = Float.valueOf(input.nextLine());
    System.out.print("Digite o valor referente ao 'B': ");
    float B = Float.valueOf(input.nextLine());
    System.out.print("Digite o valor referente ao 'C': ");
    float C = Float.valueOf(input.nextLine());
    
    //Processo
    float delta = (B*B) - 4*A*C;
    float raiz1 = -B + (delta/(delta*2))/(2*A);
    float raiz2 = -B -(delta/(delta*2))/(2*A);
    
    //Saída
    System.out.println("A primeita raíz é: "+raiz1);
    System.out.println("A segunda raíz é: "+raiz2);
    }
    
}
