import java.util.ArrayList;

public class program9 {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<Product>();
        Product p=new Product();
        p.title="Xmen";
        p.price=333;
        products.add(p);
    }
}
class Product{
    String title;
    int price;
}