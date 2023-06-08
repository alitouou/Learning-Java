import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
      //Calcular si un número es primo
      InputStreamReader capturaTeclado = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(capturaTeclado);
     
      System.out.println("Ingrese un número entero:");
      String strNumero = reader.readLine();
      Integer numero = Integer.parseInt(strNumero);

      Boolean esPrimo = true;

      for (int i = 2; i < numero; i++) {

        if (numero % i == 0) {
            esPrimo = false;
        }
        }
         if (esPrimo) {
        System.out.println("Es primo");
        }
        else {
        System.out.println("No es primo");
        }
    }

    
}
