package ExercíciosMétodos;
import java.util.Scanner;
public class Operacoes{
  public int numeroUm;
  public int numeroDois;
  int soma;
  int subtracao;
  int divisao;
  int multiplicacao;
  Scanner scanner = new Scanner(System.in);
  
public void setOperar(int numeroUm, int numeroDois){
  this.numeroUm  = numeroUm;
  this.numeroDois = numeroDois;
}
public int operar(int numeroUm, int numeroDois){
  System.out.println("Digite a opção desejada: ");
  int num = scanner.nextInt();

  switch(num){
    case 1:
      soma = numeroUm + numeroDois;
      System.out.println("Soma dos números: " + numeroUm + " e " + numeroDois + " é: " + soma);      
      break;
    case 2:
      subtracao = numeroUm - numeroDois;
      System.out.println("subtracao dos números: " + numeroUm + " e " + numeroDois + " é: " + subtracao);
      break;
      
    case 3:
      multiplicacao = numeroUm*numeroDois;
      System.out.println("resultado da multiplicacao dos números: " + numeroUm + " e " + numeroDois+ " é: " + multiplicacao);
      
      break;
      
    case 4:
      divisao = numeroUm/numeroDois;
      System.out.println("Resultado da divisao dos números: " + numeroUm + " e " + numeroDois+ " é: " + divisao);
      break;

 
  }
  return num;
}
}

