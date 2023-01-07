import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Temperatura {
    public static void main(String [] args){
        
       

List<Double> lista = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
for(int i = 0; i <= 5; i++){
    System.out.println("Informe a temperatura do Mês: ");
    Double temp = scanner.nextDouble();
    lista.add(temp);
}

Iterator<Double> iterator = lista.iterator();
Double soma = 0d;

while(iterator.hasNext()){
    Double next = iterator.next();
    soma += next;
    

}
Double mediaTemp = (soma/lista.size());
      
System.out.println("A soma das temperaturas informadas foi: " + soma);
System.out.println("A média das temperaturas informadas é: " + mediaTemp);

System.out.println("Temperaturas Semestral: " + lista);
        System.out.println("Média temperaturas Semestral: " + mediaTemp + "ºC");
        System.out.println("----------");

for (Double temp : lista) {
  if(temp > mediaTemp) {
    int index = lista.indexOf(temp);
switch(index){
    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
}
    }
}
    }
}
