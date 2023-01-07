package ExerciciosEstruturas;
import java.util.Scanner;

public class maiorMedia {
    public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
int num;
int somatorio = 0;
int maiorNumero = 0;

int i = 0;

do {
    System.out.println("Digite um número: ");
    num = scanner.nextInt();
    i++;
    somatorio = somatorio + num;

if (num > maiorNumero){
    maiorNumero = num;
}
}
while(i<5);
System.out.println("Maior número é: " + maiorNumero);
System.out.println("A média da soma dos números é:  " + (somatorio/5));

scanner.close();
}

    }

