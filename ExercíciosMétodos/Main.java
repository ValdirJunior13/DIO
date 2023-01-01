package ExercíciosMétodos;

class Main {
  public static void main(String[] args) {
   Operacoes operacoes = new Operacoes();
   operacoes.operar(50,50);

   horaDia hora1 = new horaDia();
   hora1.checarHora(5);

   Emprestimo conta = new Emprestimo();
   conta.fazerEmprestimo(11000, 10, 2);
  }
  
}