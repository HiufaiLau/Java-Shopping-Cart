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
//        totalPrice += p.getPrice();
        //        System.out.println(this.productList);
    }

    public void totalPrice() {
//        int newTotalPrice = 0;
        for (Product p : productList) {
            totalPrice += p.getPrice();
        }
        if(productList.size() >= 5) {
            System.out.println("The total price after discount" + ":" + Math.floor(totalPrice * 0.9)+ "€");
        } else {
            System.out.println("The total price" + ":" + totalPrice);
        }
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