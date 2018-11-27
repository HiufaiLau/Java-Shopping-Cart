public class Main {
    public static void main(String[] args) {
        Product p = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product replacedProduct = new Product("vacuum cleaner Siemens", 150);
        Product replacedProduct2 = new Product("pencil fancy", 1);
        Product replacedProduct3 = new Product("bike X", 250);

        p.ShowPrice();
        p2.ShowPrice();
        p3.ShowPrice();
        replacedProduct.ShowPrice();
        replacedProduct2.ShowPrice();
        replacedProduct3.ShowPrice();


        ShoppingCart sc = new ShoppingCart();

        sc.addProduct(p);
        sc.addProduct(p2);
        sc.addProduct(p3);

        sc.getProductList().forEach(product -> {
            System.out.println(product.getName());
            System.out.println(product.getPrice());
        });

        System.out.println("The total price" + ":" + sc.getTotalPrice() + "€");
    }
}