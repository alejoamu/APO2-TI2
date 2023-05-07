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
        // Sort by name ascending
        Comparator<Product> byName = (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName());
        products.sort(byName);
        // Search for the product by its name
        int index = binarySearch.search(products, byName, new Product(nameProduct, "---", Double.MAX_VALUE, Integer.MAX_VALUE, Category.BOOKS, Integer.MAX_VALUE), 0, products.size() - 1);
        if (index == -1) return null;
        else return products.get(index);
    }

    public ArrayList<Product> searchProductByPrice(double price) {
        // Sort by price ascending
        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
        products.sort(byPrice);
        // Search for products with the specified price
        return binarySearch.searchObjectsByProperty(products, byPrice, new Product("---", "---", price, Integer.MAX_VALUE, Category.BOOKS, Integer.MAX_VALUE));
    }

    public ArrayList<Product> searchProductByCategory(Category category) {
        // Sort by category ascending
        Comparator<Product> byCategory = (p1, p2) -> p1.getCategory().compareTo(p2.getCategory());
        products.sort(byCategory);
        // Search for products with the specified category
        return binarySearch.searchObjectsByProperty(products, byCategory, new Product("---", "---", Double.MAX_VALUE, Integer.MAX_VALUE, category, Integer.MAX_VALUE));
    }

    public ArrayList<Product> searchProductByPurchasedNumber(int purchasedNumber) {
        // Sort by purchased number ascending
        Comparator<Product> byPurchasedNumber = (p1, p2) -> Integer.compare(p1.getPurchasedNumber(), p2.getPurchasedNumber());
        products.sort(byPurchasedNumber);
        // Search for products with the specified purchased number
        return binarySearch.searchObjectsByProperty(products, byPurchasedNumber, new Product("---", "---", Double.MAX_VALUE, Integer.MAX_VALUE, Category.BOOKS, purchasedNumber));
    }

    public ArrayList<Product> searchProductByQuantityAvailable(int quantityAvailable) {
        // Sort by quantity available ascending
        Comparator<Product> byQuantityAvailable = (p1, p2) -> Integer.compare(p1.getQuantityAvailable(), p2.getQuantityAvailable());
        products.sort(byQuantityAvailable);
        // Search for products within the specified quantity available range using binary search
        return binarySearch.searchObjectsByProperty(products, byQuantityAvailable, new Product("---", "---", Double.MAX_VALUE, quantityAvailable, Category.BOOKS, Integer.MAX_VALUE));
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
