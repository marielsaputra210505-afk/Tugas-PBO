// Nama                  : Muhammad Ariel Saputra
// NIM                   : 13020240270
// Hari,Tanggal, Waktu   : Jum'at/ 2 April 2026/ 08.00

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bacakar {
    public static void main(String[] args) {
        try {
            char cc;
            int bil;
            
            // BufferedReader
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader dataIn = new BufferedReader(isr);
            
            System.out.print("hello\n");
            System.out.print("baca 1 karakter : ");
            cc = dataIn.readLine().charAt(0);
            System.out.print("baca 1 bilangan : ");
            bil = Integer.parseInt(dataIn.readLine());
            
            System.out.print(cc + "\n" + bil + "\n");
            System.out.print("bye \n");
            
            // Menggunakan Scanner
            Scanner scanner = new Scanner(System.in);
            System.out.print("(Scanner) baca 1 bilangan : ");
            int bilScanner = scanner.nextInt();
            System.out.println("Nilai dari Scanner: " + bilScanner);
            scanner.close();
            
            // Program selesai tanpa JOptionPane
            System.out.println("\nProgram selesai!");
            
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Terjadi error umum: " + e.getMessage());
            e.printStackTrace();
        }
    }
}