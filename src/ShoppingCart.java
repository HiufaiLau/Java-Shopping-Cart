import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ShoppingCart {

    private List<Product> productList;
    private Double totalPrice;

    public ShoppingCart() {
        productList = new ArrayList<>();
        totalPrice = 0D;
    }

    public void addProduct(Product p) {
        this.productList.add(p);
//                System.out.println(this.productList);
    }

    public void countFreeItems(String itemName) {
        int size = productList.stream()
                .filter(item -> item.getName().equals(itemName))
                .collect(Collectors.toList())
                .size();
        double removeFreeItems = Math.floor(size/4);
        size -= removeFreeItems;
        System.out.println(itemName + " : " + size);
    }

    public void ItemsRepalcement(String productName, Product replacement){

        for (Product product: productList){
            System.out.println("old list: " + product.getName());
        }

        List<Product> newList = productList.stream().map(product -> {
            if (productName.equals(product.getName())) {
                return replacement;
            } else {
                return product;
            }
        }).collect(Collectors.toList());

        productList = newList;

        for (Product product: productList){
            System.out.println("New list: " + product.getName());
        }

//
//        for (Product product : productList) {
//            countFreeItems(product.getName());
//        }

        System.out.println("This replacement"+" : " + replacement.getName() + " " +replacement.getPrice()+ "€");

    }

    public void totalPrice() {
        for (Product p : productList) {
            totalPrice += p.getPrice();
        }
        System.out.println("The original total price" + " : " + getTotalPrice() + "€");
        if(productList.size() >= 5) {
            System.out.println("The total price after 10% discount" + ":" + Math.floor(totalPrice * 0.9)+ "€");
        } else {
            System.out.println("The total price" + ":" + Math.floor(totalPrice));
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}