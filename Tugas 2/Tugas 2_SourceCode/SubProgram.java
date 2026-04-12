//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class SubProgram {

    public static int maxab(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static void tukar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Setelah tukar: a=" + a + " b=" + b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan 2 angka: ");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println("Max: " + maxab(a, b));
        tukar(a, b);

        s.close();
    }
}
