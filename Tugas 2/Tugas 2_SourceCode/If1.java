//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = s.nextInt();

        if (a >= 0) {
            System.out.println("Positif: " + a);
        }

        s.close();
    }
}
