package ExerciciosArrays;

public class Consoantes {
    public static void main(String[] args){

String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p","q","r","s","t","u","v", "w","x","y","z"};
int consoante = 0;
int vogal = 0;

for(int i = 0; i <= letras.length; i++){
if (letras[i].equals("a") || letras[i].equals("e") || letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")){
System.out.println("vogal");
vogal = vogal + 1;

}
else{
    System.out.println("Consoante");
    consoante = consoante + 1;
}
System.out.println("Número de vogais: " + vogal + "   Número de consoantes: " + consoante);
}
    }
}
