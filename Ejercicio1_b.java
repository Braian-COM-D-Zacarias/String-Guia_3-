public class Ejercicio1_b {
    public static void main (String [] args) {
        int x = 3;
        int a = 4;
        int z = 6;
        int numeros [] = new int[3];
        if (x<a && x<z){
            numeros[0] = x;
        }
        if (a>x && a<z){
            numeros[0] = x;
            numeros[1] = a;
        }
        if (z>a && z >x){
            numeros[2] = z;
        }


        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

    }
}
