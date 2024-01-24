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

    }
}
