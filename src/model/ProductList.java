package model;

import color.Color;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exceptions.EmptyFileException;
import exceptions.IncompleteDataException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ProductList {

    static String folder = "database";
    static String path = "database/products.json";

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

    public boolean changeQuantity(String product, int quantity) {
        return false;
    }

    public String searchProduct(int option, String data, int sortingType, int sortingVariable) {
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

    public ArrayList<Product> searchProductByQuantityAvailable(int quantityAvailable) {
        return null;
    }

    public String searchProduct(int option, String minData, String maxData, int sortingType, int sortingVariable) {
        return null;
    }

    public ArrayList<Product> searchProductByName(String initialPrefix, String finalPrefix) {
        return null;
    }

    public ArrayList<Product> searchProductByPrice(double minPrice, double maxPrice) {
        return null;
    }

    public ArrayList<Product> searchProductByPurchasedNumber(int minPurchasedNumber, int maxPurchasedNumber) {
        return null;
    }

    public ArrayList<Product> searchProductByQuantityAvailable(int minQuantityAvailable, int maxQuantityAvailable) {
        return null;
    }

    public void sortingResults(ArrayList<Product> list, int sortingType, int sortingVariable) {

    }

    public boolean hasOnlyLetterOfABC(String text) {
        return false;
    }
}
