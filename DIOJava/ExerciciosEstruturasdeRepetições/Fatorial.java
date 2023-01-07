package ExerciciosEstruturas;
import java.util.Scanner;
public class Fatorial {
    public static void main(String [] args){

Scanner scanner = new Scanner(System.in);
int fatorial;
System.out.println("Digite o valor do fatorial: ");
fatorial = scanner.nextInt();
int multiplicacao = 1;
for(int i = fatorial;i>=1; i--){
    multiplicacao *= i;

}
System.out.println(fatorial + "! " + "= " + multiplicacao);
scanner.close();    
}

}
