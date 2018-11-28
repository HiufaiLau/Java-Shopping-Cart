class Product {

        private String name;

        private int price;



//    int freeItemsPrice;



    public Product(){} // if send something to front end

    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void ShowPrice() {
        System.out.println(name + " " + "is" +" "+ price + "€");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
