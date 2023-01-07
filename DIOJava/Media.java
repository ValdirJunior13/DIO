import java.util.Scanner;
public class Media {

public static void main(String [] args){
Scanner scanner1 = new Scanner(System.in);
System.out.println("Digite sua primeira nota: ");
float notaUm = scanner1.nextInt();
System.out.println("Digite sua segunda nota: ");
float notaDois = scanner1.nextInt();

float mediaNotas = mediaNotas(notaUm, notaDois);
System.out.println(mediaNotas);

scanner1.close();


}
public static float mediaNotas(float notaUm, float notaDois){
    return (notaUm + notaDois)/2;
}
    
}
