package ExerciciosEstruturas;
import java.util.Scanner;
public class Nota {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int nota;
System.out.println("Digite sua nota: ");
nota = scanner.nextInt();
if (nota >= 0 & nota <= 10){
    System.out.println("Nota válida");

}
if (nota < 0 || nota > 10){
while(true){
System.out.println("Nota invalida, digite sua nota novamente: ");
nota = scanner.nextInt();
if (nota >= 0 & nota <= 10){
    System.out.println("Nota válida");
    break;
} 
scanner.close();
}
}
    }
}
