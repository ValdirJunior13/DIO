package ExerciciosList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Arrays;

public class Telefone {
    public static void main(String[] args){
        List<String> respostas = new ArrayList<>();
        List<String> perguntas = new ArrayList<>(Arrays.asList("Você conhecia a vitima?", "Você possui armas em casa? ", "Você estava nas proximidades? ", "Sabe entrar na casa da vitima?", "Você assasinou a vitima?"));
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        for(int i = 0; i <=4; i++){
            System.out.println("Insira sua resposta: ");
            String resposta = scanner.next();
            if (resposta == "sim"){
                count = count + 1;
            }
            respostas.add(resposta);
            
        }
        if (count >=3 ){
            System.out.println("Cumplice");
        }
        

        

        }
        
    }
    

