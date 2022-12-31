package ExerciciosArrays;

public class arrayMultidimensional{
    public static void main(String[] args){


int[][] num = {{1,2,3,4}, {5,6,7,8}, {9,5,3,2}, {7,2,3,1}};    

System.out.println("A matriz é: ");
for(int linha = 0; linha < 4; linha++){
    for(int coluna = 0; coluna < 4; coluna++){
System.out.printf("\t %d \t", num[linha][coluna]);
    }
System.out.println();


}
    }
}