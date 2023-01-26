import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Vamos a crear un ciclo for.
        // DE
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int prom = 0;
        int suma = 0;
        // Daremos un for para capturar los numeros
        for (int i = 0; i < num.length; i++) {
            // Capturamos los numeros
            System.out.println("Captura los números " + (i + 1));
            num[i] = sc.nextInt();// Se leen los números
            suma = suma + num[i];// Acumulamos los numeros
            prom = suma / num.length; // promediamos
        }
        for (int k = 0; k < num.length; k++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
            min = num[0];
        }
        System.out.println("El minimo es " + min);
    }
}
