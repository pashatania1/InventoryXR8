public class Menu {
    int id_menu;
    String nama_menu;
    String jenis;
    String deskripsi;
    String gambar;
    double harga;

    public Menu() {
        id_menu = 1;
        nama_menu = "Bakso";
        jenis = "Makanan";
        deskripsi = "Makanan khas Malang";
        gambar = "bakso.jpeg";
        harga = 10000;
    }

    public Menu(int id_menu, String nama_menu, String jenis, String deskripsi, String gambar, double harga) {
        this.id_menu = id_menu;
        this.nama_menu = nama_menu;
        this.jenis = jenis;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.harga = harga;
    }

    public int id_menu() {
        return id_menu;
    }

    public String toString() {
        return "ID : " + id_menu
                + "\nNama : " + nama_menu
                + "\nJenis : " + jenis
                + "\nDeskripsi : " + deskripsi
                + "\nGambar: " + gambar
                + "\nHarga " + harga;
    }

}
