package bagian3.kontak;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LatihanBukuKontak {
    private ArrayList<LatihanKontak> daftar = new ArrayList<>();
    private String namaBerkas;

    public LatihanBukuKontak(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    public void tambahKontak(LatihanKontak kontak) {
        daftar.add(kontak);
    }

    public void tampilkanSemua() {
        System.out.println("\n== Daftar Kontak ==");

        for (int i = 0; i < daftar.size(); i++) {
            System.out.println((i + 1) + ". " + daftar.get(i).info());
        }
    }

    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {

            for (LatihanKontak k : daftar) {
                penulis.println(k.keBaris());
            }
            System.out.println("Kontak disimpan ke " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas() {

        daftar.clear();
        try (BufferedReader pembaca =
                     new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    daftar.add(new LatihanKontak(bagian[0],bagian[1],bagian[2]));
                }
            }
            System.out.println("Kontak dimuat dari " + namaBerkas);

        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }

    public void cariKontak(String nama) {

        for (LatihanKontak k : daftar) {
            if (k.getNama().equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan:");
                System.out.println(k.info());
                return;
            }
        }
        System.out.println("Kontak dengan nama '" + nama + "' tidak ditemukan.");
    }

    public void hapusKontak(String nama) {
        for (int i = 0; i < daftar.size(); i++) {
            if (daftar.get(i).getNama().equalsIgnoreCase(nama)) {
                daftar.remove(i);
                System.out.println("Kontak " + nama + " berhasil dihapus.");
                simpanKeBerkas();
                return;
            }
        }
        System.out.println("Kontak tidak ditemukan.");
    }

    public int jumlahKontak() {
        return daftar.size();
    }
}
