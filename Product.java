package com.index.pack;

class Product {

    int productId;
    String productName;
    double price;
    int quantity;

   
    Product(int id, String name, double p, int q) {
        this.productId = id;
        this.productName = name;
        this.price = p;
        this.quantity = q;
    }

    double calculateTotalPrice() {
        return price * quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotalPrice());
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        Product p1 = new Product(101, "Laptop", 50000, 2);
        Product p2 = new Product(102, "Mouse", 500, 5);

        p1.displayProduct();
        p2.displayProduct();
    }
}