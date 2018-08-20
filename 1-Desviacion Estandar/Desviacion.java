
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
        double promedio = calculaPromedio(numeros);
        double sumatoria = calculaSumatoria(numeros, promedio);
        
         System.out.println("La sumatoria es: "+sumatoria);
        
    }
    
        public static double calculaPromedio(int[] numeros){
        //entra a la matriz y calcula el promedio
        double promedio;
        double suma = 0;
        for(int i = 0; i<numeros.length; i++){
            suma = suma + numeros[i];
        }
        promedio = suma/numeros.length;
        return promedio;
    }
    
      public static double calculaSumatoria(int[] numeros, double promedio){
        //calcula la sumatoria
        
        double sumatoria = 0;
        for(int i = 0; i<numeros.length; i++){
            sumatoria = sumatoria + Math.pow((numeros[i]-promedio),2);
        }
        
        return sumatoria;
    }

}
