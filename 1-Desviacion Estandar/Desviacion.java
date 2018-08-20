
/**
 *
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 0.1a
 */
import java.util.Scanner;
import java.lang.*;
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
        double desviacion = calculaDesviacion(numeros, sumatoria);
        System.out.println("La desviación estándar es: "+desviacion);
        
        //alexis
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
    
    public static double calculaDesviacion(int[] numeros, double sumatoria){
        //calcula la desviacion estandar
        double desviacion = 0;
        double formula = (1/((double)numeros.length - 1));
        desviacion = Math.sqrt(formula*sumatoria);
        return desviacion;
        
    }
}
