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
        products = new ArrayList<>();
        binarySearch = new BinarySearch<>();
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
        StringBuilder msg = new StringBuilder();
        switch (option) {
            case 1:
                Product product = searchProductByName(data);
                if (product != null)
                    msg.append(String.format("Product: %s Description: %s Price: %.2f Quantity Available: %d Category: %s Purchased Number: %d", product.getProductName(), product.getDescription(), product.getPrice(), product.getQuantityAvailable(), product.getCategory(), product.getPurchasedNumber())).append("\n");
                break;
            case 2:
                double price;
                try {
                    price = Double.parseDouble(data);
                } catch (NumberFormatException ex) {
                    throw new IncompleteDataException();
                }
                ArrayList<Product> productsFoundPrice = searchProductByPrice(price);
                sortingResults(productsFoundPrice, sortingType, sortingVariable);
                for (Product p : productsFoundPrice) {
                    msg.append(String.format("Product: %s Description: %s Price: %.2f Quantity Available: %d Category: %s Purchased Number: %d", p.getProductName(), p.getDescription(), p.getPrice(), p.getQuantityAvailable(), p.getCategory(), p.getPurchasedNumber())).append("\n");
                }
                break;
            case 3:
                ArrayList<Product> productsFoundCategory = searchProductByCategory(Category.values()[Integer.parseInt(data)]);
                sortingResults(productsFoundCategory, sortingType, sortingVariable);
                for (Product p : productsFoundCategory) {
                    msg.append(String.format("Product: %s Description: %s Price: %.2f Quantity Available: %d Category: %s Purchased Number: %d", p.getProductName(), p.getDescription(), p.getPrice(), p.getQuantityAvailable(), p.getCategory(), p.getPurchasedNumber())).append("\n");
                }
                break;
            case 4:
                int purchasedNumber;
                try {
                    purchasedNumber = Integer.parseInt(data);
                } catch (NumberFormatException ex) {
                    throw new IncompleteDataException();
                }
                ArrayList<Product> productsFoundPurchasedNumber = searchProductByPurchasedNumber(purchasedNumber);
                sortingResults(productsFoundPurchasedNumber, sortingType, sortingVariable);
                for (Product p : productsFoundPurchasedNumber) {
                    msg.append(String.format("Product: %s Description: %s Price: %.2f Quantity Available: %d Category: %s Purchased Number: %d", p.getProductName(), p.getDescription(), p.getPrice(), p.getQuantityAvailable(), p.getCategory(), p.getPurchasedNumber())).append("\n");
                }
                break;
        }
        if (msg.length() == 0) {
            return Color.BOLD + Color.YELLOW + "              NO PRODUCT HAS THAT CHARACTERISTIC               \n" + Color.RESET;
        }
        return msg.toString();
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
