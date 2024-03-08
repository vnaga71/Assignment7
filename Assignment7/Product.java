/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

public class Product {

    private void print(String name1, int id1, double price1, boolean available1, char category1) {
        String name;
        int id;
        double price;
        boolean available;
        char category;
        System.out.print("Product Details:" + "Name:" + "\n" + name1 + "\n" + "ID:" + id1 + "\n" + "Price:" + price1 + "\n" + "Available:" + available1 + "\n" + "Category:" + category1);
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.print("nothing", 5678, 150000.0, true, 'p');
    }
}
