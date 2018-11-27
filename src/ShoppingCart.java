import java.util.ArrayList;
import java.util.List;

class ShoppingCart {

    private List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }


    public void addProduct(Product p) {
        this.productList.add(p);
        System.out.println(this.productList);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

}