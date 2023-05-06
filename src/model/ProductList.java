package model;

import color.Color;
import com.google.gson.Gson;
import exceptions.IncompleteDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ProductList {

    static String folder = "database";
    static String path = "database/products.txt";

    private ArrayList<Product> products;
    private BinarySearch<Product> binarySearch;

    public ProductList() {

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void save() throws IOException {

    }

    public void load() throws IOException {

    }

    public void show() {

    }

    public boolean changeQuantity(String product, int quantity) {
        return false;
    }

    public String searchProduct(int option, String data) {
        return null;
    }

    public Product searchProductByName(String nameProduct) {
        return null;
    }

    public ArrayList<Product> searchProductByPrice(double price) {
        return null;
    }

    public ArrayList<Product> searchProductByCategory(Category category) {
        return null;
    }

    public ArrayList<Product> searchProductByPurchasedNumber(int purchasedNumber) {
        return null;
    }

}
