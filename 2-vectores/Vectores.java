
/**
 *
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 0.1a
 */
import java.util.Scanner;
public class Vectores
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        int contador = 0;
        
        
        System.out.println("Matrices No Comunes");
        System.out.println("Ingresa la cantidad de números de la matriz 1");
        cantidad = entrada.nextInt();
        int[] n1 = new int[cantidad];
        while(cantidad>0){
            System.out.println("Ingresa el número: "+(contador + 1));
            int numero = entrada.nextInt();
            n1[contador] = numero;
            cantidad--;
            contador++;
        }
        
        System.out.println("Ingresa la cantidad de números de la matriz 2");
        cantidad = entrada.nextInt();
        int[] n2 = new int[cantidad];
        contador = 0;
        while(cantidad>0){
            System.out.println("Ingresa el número: "+(contador + 1));
            int numero = entrada.nextInt();
            n2[contador] = numero;
            cantidad--;
            contador++;
        }
        pequena(n1, n2);
    }
    
    public static void pequena(int[] n1, int[] n2){
        //matriz mas pequena
        
        int len1, len2;
        len1 = n1.length;
        len2 = n2.length;
        
        if(len1>=len2){
            //evalua la matriz 2 en la 1
        }else{
            //evalua la matriz 1 en la 2
        }
    }
}
