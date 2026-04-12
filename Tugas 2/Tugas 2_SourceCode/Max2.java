//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class Max2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan 2 angka: ");
        int a = s.nextInt();
        int b = s.nextInt();

        if (a >= b) {
            System.out.println("Max: " + a);
        } else {
            System.out.println("Max: " + b);
        }

        s.close();
    }
}
