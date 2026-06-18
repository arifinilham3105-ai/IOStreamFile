package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriStreamDanFile {
    public static void main(String[] args) throws IOException {

        // ==========================
        // SOAL 1
        // ==========================
        System.out.println("=== SOAL 1 ===");

        File laporan = new File("laporan.txt");

        System.out.println("Apakah berkas ada? : " + laporan.exists());

        if (laporan.exists()) {
            System.out.println("Ukuran berkas : " + laporan.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }

        // ==========================
        // SOAL 2
        // ==========================
        System.out.println("\n=== SOAL 2 ===");

        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        // ==========================
        // SOAL 3
        // ==========================
        System.out.println("\n=== SOAL 3 ===");

        File sementara = new File("sementara.txt");

        // Membuat file sementara.txt
        sementara.createNewFile();

        System.out.println("Sebelum dihapus:");
        System.out.println("Apakah berkas ada? : " + sementara.exists());

        // Menghapus file
        if (sementara.delete()) {
            System.out.println("Berkas berhasil dihapus.");
        } else {
            System.out.println("Berkas gagal dihapus.");
        }

        System.out.println("Sesudah dihapus:");
        System.out.println("Apakah berkas ada? : " + sementara.exists());
    }
}
