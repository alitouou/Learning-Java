public class Ejercicio {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2; 

        while (contador < 100) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            //Se utiliza raíz cuadrada de numero como límite superior en el bucle, se reduce la cantidad de iteraciones necesarias y se mejora la eficiencia del algoritmo de determinación de números primos.
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
