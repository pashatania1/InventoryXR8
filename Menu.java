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

    public int getIDMenu() {
        return id_menu;
    }
    public String getNamaMenu() {
        return nama_menu;
    }
    public String getJenis() {
        return jenis;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public String getGambar() {
        return gambar;
    }
    public double getHarga() {
        return harga;
    }

    public void setIDMenu(int id_menu) {
        this.id_menu = id_menu;
    }
    public void setNamaMenu(String nama_menu) {
        this.nama_menu = nama_menu;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
    public void setHarga(double harga) {
        this.harga = harga;
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
