
/**
 *
 * @authors Felipe Lobo, Alexis Chacon, Sergio Baron, Pablo Roman
 * @version 0.1a
 */
import java.util.Scanner;
import java.util.Arrays;
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
        //organiza matrices
        Arrays.sort(n1);
        Arrays.sort(n2);
        if(len1>=len2){
            //evalua la matriz 2 en la 1. Es decir la mas pequena en la mas grande
            recorredor(n1, n2, len1, len2);
        }else{
            //evalua la matriz 1 en la 2
            recorredor(n2, n1, len2, len1);
        }
    }
    
    public static boolean buscar( int[] matriz, int numero){
        //System.out.println("Buscando> "+numero);
        int index = Arrays.binarySearch(matriz, numero);
        return index >= 0;
        
    }
    
    public static void recorredor(int[] grande, int[] pequena, int lenG, int lenP){
        int[] solos = new int[lenG];
        int contador =0;
        boolean repetido;
        //evalua la pequena y la grande
        
        
        for(int c : grande){
            //System.out.println(c);
            repetido = buscar(pequena, c);
            if(repetido == false){
                //System.out.println("Grande->"+c+"<->NUEVO");
                solos[contador] = c;
                contador ++;
            }
        };
        
        for(int i : pequena){
            
            //System.out.println(i);
            repetido = buscar(grande, i);
            
            //System.out.println("Buscando en Pequeña-->"+grande[c]);
            if(repetido == false){
                //System.out.println("Pequeña->"+i+"<->NUEVO");
                solos[contador] = i;
                contador ++;
            }
        };
        System.out.println("---------------\nLos valores no repetidos son:\n");
        Arrays.sort(solos);
        for(int c: solos){
            if(c!=0){
                System.out.println(c);
            }
            
        }
        System.out.println("---------------");
        //System.out.println();
    }
}
