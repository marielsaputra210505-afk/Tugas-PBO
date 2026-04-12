//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class PrintXWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Masukkan angka (999 untuk stop): ");
        int x = s.nextInt();

        while (x != 999) {
            sum += x;
            System.out.print("Masukkan angka: ");
            x = s.nextInt();
        }

        System.out.println("Total: " + sum);
        s.close();
    }
}
