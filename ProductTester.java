import java.util.Scanner;

public class ProductTester {
    // atribut/global variabel
    public static void main(String[] args) {
        // local variabel
        int maxSize = -1;

        Scanner in = new Scanner(System.in);
        try {
            do {
                System.out.println("Masukkan jumlah barang: ");
                System.out.println("Masukkan 0 jika tidak ingin menambahkan");
                maxSize = in.nextInt();
            } while (maxSize <= 0);
        } catch (Exception e) {
            System.out.println("input salah");
        }

        if (maxSize == 0) {
            System.out.println("tidak ada produk");
        } else {
            // array input product
            Product p[] = new Product[maxSize];
            for (int i = 0; i < maxSize; i++) {
                in.nextLine();
                System.out.println("Product " + i);
                System.out.println("Name : ");
                String name = in.nextLine();
                System.out.println("Item Number : ");
                int number = in.nextInt();
                System.out.println("Stock :");
                int stock = in.nextInt();
                System.out.println("Price : ");
                double price = in.nextDouble();

                p[i] = new Product(number, name, price, stock);
            }
            displayInventory(p);
        }
        in.nextLine();
    }

    public static void displayInventory(Product[] p) {
        // show product
        for (Product pro : p) {
            System.out.println(pro.toString());
            System.out.println("---------------------------");
        }
    }
}