public class Ejercicio1_c {
    public static void main(String[] args) {
        int numeros[] = new int[] { 5, 37, 33,20 };
        int resultado = 0;
        int x = 4;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>x) {
                resultado = resultado + numeros[i];
            }
            }
        System.out.println(resultado);
    }
}

