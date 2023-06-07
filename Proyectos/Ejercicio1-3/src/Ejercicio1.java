//Ingresa 3 números indicando el mayor y menor de ellos
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturaTeclado = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(capturaTeclado);
       
        System.out.println("Ingrese primer número:");
        String strNo1 = reader.readLine();
        Integer numero1 = Integer.parseInt(strNo1);

        System.out.println("Ingrese segundo número:");
        String strNo2 = reader.readLine();
        Integer numero2 = Integer.parseInt(strNo2);
        
        System.out.println("Ingrese tercer número:");
        String strNo3 = reader.readLine();
        Integer numero3 = Integer.parseInt(strNo3);

        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }

        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("EL mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

          }
}
