import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    private List<Product> productList;
    private int totalPrice;

    public ShoppingCart() {
        productList = new ArrayList<>();
        totalPrice = 0;
    }


    public void addProduct(Product p) {
        this.productList.add(p);
//        System.out.println(this.productList);
        totalPrice += p.getPrice();

    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}