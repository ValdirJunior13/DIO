package ExercíciosMétodos;
import java.util.Scanner;
public class horaDia {
    Scanner scanner = new Scanner(System.in);
    public int hora;

public void setHora(int hora){
  this.hora = hora;
  
}
public int checarHora(int hora){
    System.out.println("Informe a hora do dia: ");
    if (hora >= 6 && hora <= 13){
      System.out.println("Bom dia!");
      
    }
    else if(hora <= 24 && hora > 13){
      System.out.println("Boa noite!");
      
    }
    else if(hora >= 0 && hora <= 5){
      System.out.println("Boa madrugada! ");
    }
  return hora;
    }
   
    }
    

