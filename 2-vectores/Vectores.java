
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
    }
}
