import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_a {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto = "Hola Como estan?";
        char caracter;
        int numeroDeVeces = 0;
        while (texto.isEmpty());
        System.out.print("Introduce un carácter: ");
        caracter = (char) System.in.read();
        numeroDeVeces = contarCaracteres(texto, caracter);
        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
    }

    //calcular el número de veces que se repite un carácter en un String
    public static int contarCaracteres(String cadena, char caracter) {
        int pos, cont = 0;
        //se busca la primera vez que aparece
        pos = cadena.indexOf(caracter);
        while (pos != -1) { //mientras se encuentre el caracter
            cont++;           //se cuenta
            //se sigue buscando a partir de la posición siguiente a la encontrada
            pos = cadena.indexOf(caracter, pos + 1);
        }
        return cont;
    }
}



