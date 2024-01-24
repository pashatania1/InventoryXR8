import java.util.Scanner;

public class MenuTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.nextLine();
        System.out.println("Nama : ");
        String nama_menu = in.nextLine();
        System.out.println("Jenis : ");
        String jenis = in.nextLine();
        System.out.println("Deskripsi: ");
        String deskripsi = in.nextLine();
        System.out.println("Gambar : ");
        String gambar = in.nextLine();
        System.out.println("ID : ");
        int id_menu = in.nextInt();
        System.out.println("Harga : ");
        double harga = in.nextDouble();
        
        Menu m = new Menu(id_menu, nama_menu, jenis, deskripsi, gambar, harga);
        System.out.println(m.toString());
    }
}
