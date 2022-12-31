package ExerciciosEstruturas;
import java.util.Scanner;
public class parImpar {
    public static void main(String [] args){
int num;
int pares = 0;
int impares = 0;
int i = 0;
Scanner scanner = new Scanner(System.in);

do {
    i++;
    System.out.println("Digite números inteiros");
    num = scanner.nextInt();
    if (num%2 == 0){
        pares = pares + 1;
        System.out.println("é um número par");
    
    }

    else if(num%2 != 0){
        impares = impares + 1;
        System.out.println("Número impar");

    }

}while(i < 5);
 System.out.println("Quantidade de números pares: " + pares);
 System.out.println("Quantidade de números impares: " + impares);
 scanner.close();
    }
}
