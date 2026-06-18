package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiriBacaTulis {
     public static void main(String[] args) {

        // SOAL 1
        // Tulis 5 nama hari ke dalam berkas hari.txt 
        // (satu nama per baris), lalu baca kembali dan tampilkan ke layar. 
        System.out.println("=== SOAL 1 ===");
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            penulis.println("Senin");
            penulis.println("Selasa");
            penulis.println("Rabu");
            penulis.println("Kamis");
            penulis.println("Jumat");
            
            System.out.println("5 nama hari berhasil ditulis ke hari.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
        System.out.println("\nIsi hari.txt:");
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // SOAL 2
        // Tambahkan (append) 2 nama hari lagi ke berkas hari.txt 
        // tanpa menghapus isi sebelumnya, lalu tampilkan seluruh isinya.
        System.out.println("\n=== SOAL 2 ===");
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("\n2 nama hari berhasil ditambahkan.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        System.out.println("\nIsi hari.txt setelah ditambahkan:");
        
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }

        // SOAL 3
        // Baca berkas hari.txt lalu hitung dan 
        // tampilkan berapa banyak baris yang ada di dalamnya.
        System.out.println("\n=== SOAL 3 ===");
        int jumlahBaris = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("\nJumlah baris dalam hari.txt = " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}
