public class Main {

    // Ejercicio 1 - Inciso 4
    public static long factorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Ejercicio 1 - Inciso 5
    public static long factorialCola(int n, long acumulador) {
        if (n <= 1) {
            return acumulador;
        }
        return factorialCola(n - 1, n * acumulador);
    }

    // Ejercicio 3 - Inciso 17
    public static void hanoiIterativo(int n, char origen, char auxiliar, char destino) {
        int maxSize = n * 3 + 10;
        int[] pilaDiscos = new int[maxSize];
        char[] pilaOrigen = new char[maxSize];
        char[] pilaAuxiliar = new char[maxSize];
        char[] pilaDestino = new char[maxSize];
        int tope = 0;

        pilaDiscos[tope] = n;
        pilaOrigen[tope] = origen;
        pilaAuxiliar[tope] = auxiliar;
        pilaDestino[tope] = destino;
        tope++;

        while (tope > 0) {
            tope--;
            int discos = pilaDiscos[tope];
            char org = pilaOrigen[tope];
            char aux = pilaAuxiliar[tope];
            char dst = pilaDestino[tope];

            if (discos == 1) {
                System.out.println(org + " -> " + dst);
            } else {
                pilaDiscos[tope] = discos - 1;
                pilaOrigen[tope] = aux;
                pilaAuxiliar[tope] = org;
                pilaDestino[tope] = dst;
                tope++;

                pilaDiscos[tope] = 1;
                pilaOrigen[tope] = org;
                pilaAuxiliar[tope] = aux;
                pilaDestino[tope] = dst;
                tope++;

                pilaDiscos[tope] = discos - 1;
                pilaOrigen[tope] = org;
                pilaAuxiliar[tope] = dst;
                pilaDestino[tope] = aux;
                tope++;
            }
        }
    }

    // Ejercicio 3 - Inciso 18
    public static long contarHanoi(int n) {
        if (n == 1) {
            return 1;
        }
        return 2 * contarHanoi(n - 1) + 1;
    }


    // Fragmento A
    public static int potencia(int x, int n) {
        if (n == 0) return 1;
        return x * potencia(x, n - 1);
    }

    // Fragmento B
    public static String invertir(String s) {
        if (s.length() <= 1) return s;
        return invertir(s.substring(1)) + s.charAt(0);
    }

    // Fragmento C
    public static int contarUnos(int[] a, int i) {
        if (i == a.length) return 0;
        return (a[i] == 1 ? 1 : 0) + contarUnos(a, i + 1);
    }

    // Ejercicio 4 - Inciso 20
    public static int potenciaRapida(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int mitad = potenciaRapida(x, n / 2);
            return mitad * mitad;
        } else {
            return x * potenciaRapida(x, n - 1);
        }
    }

    // Ejercicio 4 - Inciso 21
    public static String invertir(String s) {
        char[] caracteres = s.toCharArray();
        invertirAux(caracteres, 0, caracteres.length - 1);
        return new String(caracteres);
    }

    public static void invertirAux(char[] caracteres, int izq, int der) {
        if (izq >= der) return;
        char temp = caracteres[izq];
        caracteres[izq] = caracteres[der];
        caracteres[der] = temp;
        invertirAux(caracteres, izq + 1, der - 1);
    }

    public static void main(String[] args) {

    }
}
