package bagian3.kontak;

public class LatihanMainKontak {
    public static void main(String[] args) {

        LatihanBukuKontak buku =
                new LatihanBukuKontak("kontak.txt");

        buku.tambahKontak(
                new LatihanKontak("Andi","0811111","andi@gmail.com"));

        buku.tambahKontak(
                new LatihanKontak("Budi","0822222","budi@gmail.com"));

        buku.tambahKontak(
                new LatihanKontak("Citra","0833333","citra@gmail.com"));

        buku.simpanKeBerkas();
        buku.muatDariBerkas();
        buku.tampilkanSemua();

        System.out.println("\n=== Cari Kontak ===");
        buku.cariKontak("Budi");
        System.out.println("\n=== Hapus Kontak ===");
        buku.hapusKontak("Budi");
        System.out.println("\n=== Daftar Kontak Setelah Dihapus ===");
        buku.tampilkanSemua();
    }
}
