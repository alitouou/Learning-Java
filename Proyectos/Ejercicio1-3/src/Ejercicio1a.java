//Mismo ejercicio organizado de manera más limpia y con comentarios
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1a {
    public static void main(String[] args) throws IOException {
        //Solicita los números en la consola       
               System.out.println("Ingrese primer número:");
               Integer numero1 = cargarNumero();
       
               System.out.println("Ingrese segundo número:");
               Integer numero2 = cargarNumero();
               
               System.out.println("Ingrese tercer número:");
               Integer numero3 = cargarNumero();
       
               calcularNumeroMayor(numero1, numero2, numero3);
               calcularNumeroMenor(numero1, numero2, numero3);
       
                 }
       
           private static Integer cargarNumero() throws IOException {
       //Ingresa, lee y asigna los números typeados
               InputStreamReader capturaTeclado = new InputStreamReader(System.in);
               BufferedReader reader = new BufferedReader(capturaTeclado);
               String strNo = reader.readLine();
               Integer numero = Integer.parseInt(strNo);
               return numero;
           }
               
           private static void calcularNumeroMayor (Integer numero1, Integer numero2, Integer numero3) {
       //Calcula el número mayor ingresado
               
               int mayor = numero1;
               if (numero2 > mayor) {
                   mayor = numero2;
               }
               if (numero3 > mayor) {
                   mayor = numero3;
               }
       
               System.out.println("EL mayor número es: " + mayor);
             
           }
           
           private static void calcularNumeroMenor (Integer numero1, Integer numero2, Integer numero3) {
       //Calcula el número menor ingresado
              
               int menor = numero1;
               if (numero2 < menor) {
                   menor = numero2;
               }
               if (numero3 < menor) {
                   menor = numero3;
               }
       
               System.out.println("El menor número es: " + menor);
       }
       }
       