//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class PrintXRepeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan angka (999 untuk stop): ");
        int x = s.nextInt();

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            int sum = 0;

            do {
                sum += x;
                System.out.print("Masukkan angka: ");
                x = s.nextInt();
            } while (x != 999);

            System.out.println("Total: " + sum);
        }

        s.close();
    }
}
