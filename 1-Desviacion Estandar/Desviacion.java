
/**
 *
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 0.3a
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Desviacion
{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        int contador = 0;
        
        
        System.out.println("-----Desviación Estandar-----");
        System.out.println("Ingresa la cantidad de números a calcular");
        cantidad = entrada.nextInt();
        int[] numeros = new int[cantidad];
        while(cantidad>0){
            System.out.println("Ingresa el número: "+(contador + 1));
            int numero = entrada.nextInt();
            numeros[contador] = numero;
            cantidad--;
            contador++;
        }
        
        for(int i = 0; i<numeros.length; i++){
            //test
            System.out.println("-");
            System.out.println(numeros[i]);
        }
        
    }
}
