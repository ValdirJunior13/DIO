package ExerciciosEstruturas;
import java.util.Scanner;
public class nomeIdade {
    public static void main(String [] args){
Scanner scanner = new Scanner(System.in);

while(true){
    System.out.println("Digite seu nome: ");
    String nome = scanner.nextLine();
    if (nome.equals("0")) break;
    
    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    System.out.println(idade);
}
    
scanner.close();
}

    }
