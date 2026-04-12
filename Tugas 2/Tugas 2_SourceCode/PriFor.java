//Nama  : Muhammad Ariel Saputra
//Nim   : 13020240270
//Kelas : A3

import java.util.Scanner;

public class PriFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = s.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        s.close();
    }
}
