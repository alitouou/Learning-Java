//Calcula el promedio de 3 números

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
              
        System.out.println("Ingrese primer número:");
        Integer numero1 = cargarNumero();

        System.out.println("Ingrese segundo número:");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese tercer número:");
        Integer numero3 = cargarNumero();

        Integer sumatoria = numero1 + numero2 + numero3;
        Double promedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El promedio es " + promedio);

          }
          /**
           * 
           * @return
           * @throws IOException
           */

    private static Integer cargarNumero() throws IOException {
        InputStreamReader capturaTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturaTeclado);
        String strNo = reader.readLine();
        Integer numero = Integer.parseInt(strNo);
        return numero;
    }
    /**
     * Esta función sirve para calcular el número mayor
     * @param numero1 primer número ingresado
     * @param numero2 segundo número ingresado
     * @param numero3 tercer número ingresado
     */
}
