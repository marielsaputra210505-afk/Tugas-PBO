//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class PrintXIterasi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;

        System.out.print("Masukkan angka (999 untuk stop): ");
        int x = s.nextInt();

        if (x == 999) {
            System.out.println("Kasus kosong");
        } else {
            sum = x;

            for (;;) {
                System.out.print("Masukkan angka: ");
                x = s.nextInt();

                if (x == 999) {
                    break;
                } else {
                    sum += x;
                }
            }
        }

        System.out.println("Total: " + sum);
        s.close();
    }
}
