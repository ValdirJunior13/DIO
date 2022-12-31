package ExerciciosEstruturas;
import java.util.Scanner;

public class Tabuada {
public static void main(String [] args){
int numTabuada;
Scanner scanner = new Scanner(System.in);

System.out.println("Digite o número que você quer ver a tabuada: ");
numTabuada = scanner.nextInt();
for(int i = 1; i <=10; i++){
    System.out.println(numTabuada + " X " + i + " = " + (numTabuada*i));
}
scanner.close();

}
}
