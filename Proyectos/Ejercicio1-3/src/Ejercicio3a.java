//Mismo ejercicio usando Boolean

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3a {
    public static void main(String[] args) throws IOException {
              
        System.out.println("Ingrese Un número:");
        Integer numero = cargarNumero();

        Boolean esPar = numero % 2 == 0;
        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
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
}
