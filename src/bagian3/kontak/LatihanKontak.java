package bagian3.kontak;

public class LatihanKontak {
    private String nama;
    private String nomor;
    private String email;

    public LatihanKontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() {
        return email;
    }

    // format penyimpanan ke file
    public String keBaris() {
        return nama + ";" + nomor + ";" + email;
    }

    // format tampilan
    public String info() {
        return nama + " - " + nomor + " - " + email;
    }
}
