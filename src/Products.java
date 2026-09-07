import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Products {
    public String name;
    public String Category;
    public double Price;
    public int Quantity;
    public boolean inStock;
    public Products(String name, String Category, double Price, int Quantity, boolean inStock) {
        this.name = name;
        this.Category = Category;
        this.Price = Price;
        this.Quantity = Quantity;
        this.inStock = inStock;
    }

    public static void main(String[] args) {
        List<Products> products = new ArrayList<>();

        products.add(new Products("Milk", "Liquid", 1200.0, 5, true));
        products.add(new Products("Coco", "Fruits", 300, 12, false));

        List<String> productNames = new ArrayList<>();

        for (Products p : products) {
            productNames.add(p.name);
        }



    }
}
