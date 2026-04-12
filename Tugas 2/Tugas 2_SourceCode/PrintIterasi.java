//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class PrintIterasi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = s.nextInt();

        int i = 1;
        System.out.println("Print dengan ITERASI:");

        for (;;) {
            System.out.println(i);
            if (i == N) {
                break;
            } else {
                i++;
            }
        }

        s.close();
    }
}
