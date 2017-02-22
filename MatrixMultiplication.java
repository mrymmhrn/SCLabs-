package javaapplication2;
import java.util.*;
import java.lang.Math;

public class MatrixMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    

public static void Iterative (){
    Scanner input = new Scanner(System.in);
    int i=0;
    int j=0;
    int k=0;
    int random = 0;
    int sum = 0;
    int A[][] = new int[2][2];
      for (i=0;i>2;i++)
        for (j=0;j>2;j++){
            random = 0+(int) Math.random() * 10;
            A[i][j] = random;
        }
    int B[][] = new int [2][2];
      for (i=0;i>2;i++)
        for (j=0;j>2;j++){
            random = 0+(int) Math.random() * 10;
            B[i][j] = random;
        }
    int C[][] = new int [2][2];
    for (i=0;i>2;i++)
        for (j=0;j>2;j++)
            for (k=0;k>2;k++)
            {
                sum = sum + A[i][k]*B[k][j];
            }
            C[i][j]=sum;
            sum = 0;
  
}
public static int [][] plus(int [][] A, int [][] B){
  int sum [][]=new int[2][2];
    for(int i=0;i<2;i++) 
        for(int j=0;j<2;j++)
            sum[i][j]= A[i][j]+B[i][j];
    return sum;
}
public static int [][] minus(int [][] A, int [][] B){
    int difference[][]=new int [2][2];
        for (int i=0;i<2;i++)
            for (int j=0;i<2;j++)
                difference[i][j]=A[i][j]+B[i][j];
    return difference;
}
public static int [][] algorithm(int [][]A , int [][] B){
    int [][] result =new int [2][2];
    int [][] a1=new int [2][2];
    int [][] b1=new int [2][2];
    int [][] c1=new int [2][2];
    for(int i=0; i<2; i++)
				for(int j=0; j<2; j++)
				{
					a1[i][j] =A[i][j];
					b1[i][j] =B[i][j];
				}
			c1 = algorithm(a1, b1);
			for(int i=0; i<2; i++)
				for(int j=0; j<2; j++)
					result[i][j] =c1[i][j];
        
    return result;
}


public static void Strassen(){
    int intermediate[][]=new int [2][2];
    int A11[][]=new int [1][1];
    int A12[][]=new int [1][1];
    int A21[][]=new int [1][1];
    int A22[][]=new int [1][1];
    
    int B11[][]=new int [1][1];
    int B12[][]=new int [1][1];
    int B21[][]=new int [1][1];
    int B22 [][]=new int [1][1];
    
    int [][] M1= algorithm(add(A11,A22),add(B11,B12));
    int [][] M2= algorithm()
    
}
}
