package model;

import color.Color;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exceptions.DateFormatException;
import exceptions.EmptyFileException;
import exceptions.IncompleteDataException;

import java.io.*;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class OrderList {

    static String folder = "database";
    static String path = "database/orders.json";

    private ArrayList<Order> orders;
    private BinarySearch<Product> binarySearch;

    public OrderList() {
        orders = new ArrayList<>();
        binarySearch = new BinarySearch<>();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void save() throws IOException {

    }

    public void load() throws IOException {

    }

    public String searchOrder(int option, String data, int sortingType, int sortingVariable) {
        return null;
    }

    public ArrayList<Order> searchOrderByBuyerName(String buyerName) {
        return null;
    }

    public ArrayList<Order> searchOrderByTotalPrice(double totalPrice) {
        return null;
    }

    public ArrayList<Order> searchProductByPurchasedDate(LocalDate date) {
        return null;
    }

    public void sortingResults(ArrayList<Order> list, int sortingType, int sortingVariable) {

    }

}
