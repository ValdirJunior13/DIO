public class Inicio{
    
public static void main(String [] args){
String primeiroNome = "Valdir";
String segundoNome = "Zacarias";

String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
System.out.println(nomeCompleto);


}
public static String nomeCompleto(String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}
}
