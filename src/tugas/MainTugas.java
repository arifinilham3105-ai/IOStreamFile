package tugas;

public class MainTugas {
    // NAMA : Muhammad Arifin Ilham
    // NPM  : 2410010106
     public static void main(String[] args) {

        // ARRAY KATEGORI
        String[] kategori = {"Makanan","Minuman","Elektronik"};

        System.out.println("=== DAFTAR KATEGORI ===");

        for (int i = 0; i < kategori.length; i++) {
            System.out.println((i + 1) + ". "+ kategori[i]);
        }

        // Membuat gudang pertama
        Gudang gudang = new Gudang("barang.txt");

        // Menambah minimal 5 barang
        gudang.tambahBarang(new Barang("Beras", 15000, 20));

        gudang.tambahBarang(new Barang("Gula", 18000, 15));

        gudang.tambahBarang(new Barang("Minyak Goreng", 22000, 10));

        gudang.tambahBarang(new Barang("Teh Kotak", 5000, 50));

        gudang.tambahBarang(new Barang("Lampu LED", 25000, 8));

        // Menampilkan data
        gudang.tampilkanSemua();

        // Menyimpan ke file
        gudang.simpanKeBerkas();

        // Membuat objek gudang baru
        Gudang gudangBaru = new Gudang("barang.txt");

        // Membaca kembali dari file
        gudangBaru.muatDariBerkas();

        // Menampilkan data hasil baca
        gudangBaru.tampilkanSemua();

        // Menampilkan total nilai persediaan
        System.out.println("\nTotal Nilai Persediaan = Rp"+ gudangBaru.totalNilai());
    }
}
