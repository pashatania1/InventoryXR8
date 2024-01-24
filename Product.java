public class Product {
    // Instance field declarations
    int number;
    String name;
    double price;
    int stock;
    boolean status;

    // Constuctor default
    public Product() {
        number = 1;
        name = "TV";
        price = 1000000;
        stock = 100;
        status = true;
    }

    // overload constuctor
    public Product(int number, String name, double price, int qty) {
        this.number = number;
        this.name = name;
        this.price = price;
        stock = qty;
        status = true;
    }

    // Getter(Accessor)
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean getStatus() {
        return status;
    }

    // Setter(Mutator)
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int qty) {
        this.stock = qty;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getInventoryValue() {
        return this.price * this.stock;
    }

    // override toString method
    public String toString() {
        String st;
        if (status == true) {
            st = "Active";
        } else {
            st = "Discontinued";
        }
        return "Item Number: " + number
                + "\nName: " + name
                + "\nNumber in stock: " + stock
                + "\nPrice : " + price
                + "\nStock Value: " + getInventoryValue()
                + "\nProduct Status: " + st;
    }
}
