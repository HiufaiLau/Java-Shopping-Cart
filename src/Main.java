public class Main {
    public static void main(String[] args) {
        Product p = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 9);
        Product p3 = new Product("bike", 300);

        p.ShowPrice();
        p2.ShowPrice();
        p3.ShowPrice();

        ShoppingCart sc = new ShoppingCart();

        sc.addProduct(p);
//        sc.addProduct(p);
//        sc.addProduct(p);
//        sc.addProduct(p);
//        sc.addProduct(p);
//        sc.addProduct(p);


        sc.addProduct(p2);
        sc.addProduct(p2);
        sc.addProduct(p2);
        sc.addProduct(p2);
//        sc.addProduct(p2);
//        sc.addProduct(p2);
//        sc.addProduct(p2);
//        sc.addProduct(p2);

        sc.addProduct(p3);
//        sc.addProduct(p3);
//        sc.addProduct(p3);
//        sc.addProduct(p3);
//        sc.addProduct(p3);

//        sc.getProductList().forEach(product -> {
//            System.out.println(product.getName());
//            System.out.println(product.getPrice());
//        });

        sc.totalPrice();
        sc.countFreeItems(p.getName());
        sc.countFreeItems(p2.getName());
        sc.countFreeItems(p3.getName());

        Product replacedProduct = new Product("vacuum cleaner Siemens", 150);
        Product replacedProduct2 = new Product("pencil fancy", 5);
        Product replacedProduct3 = new Product("bike X", 250);

        sc.ItemsRepalcement("bike", replacedProduct3);
        sc.ItemsRepalcement("pencil", replacedProduct2);
        sc.ItemsRepalcement("vacuum cleaner", replacedProduct);


    }
}