package ExercíciosMétodos;
import java.util.Scanner;

public class Emprestimo{
  public int salario;
  public int taxa = 0;
  public int parcelas = 0;
  Scanner scanner = new Scanner(System.in);


public void setEmprestimo(){
  this.salario = salario;
  this.taxa = taxa;
  this.parcelas = parcelas;
  
}

public int setTaxa(int taxa){
  taxa = taxa + 10;
  return taxa;
}

public int setParcelas(int parcelas){
  parcelas = parcelas + 2;
  return parcelas;
  
}
public int fazerEmprestimo(int salario, int taxa, int parcelas){

  if (salario>= 10000){
    salario = (salario*taxa)/parcelas;
    System.out.println("Esse é o valor depois da conta: " + salario);
  }
  else {
    System.out.println("Informe seu salário: ");
    salario = (salario*taxa)/parcelas;
    System.out.println("Esse é o valor depois da conta: " + salario);
  }
  return salario;
  }
  

}