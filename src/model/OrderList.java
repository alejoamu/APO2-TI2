package model;

import com.google.gson.Gson;
import exceptions.EmptyFileException;
import exceptions.NegativeNumberException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class OrderList {

    static String folder = "database";
    static String path = "database/orders.txt";

    private ArrayList<Order> orders;
    private BinarySearch<Product> binarySearch;

    public OrderList() {

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

    public void show() {

    }

    public String searchOrder(int option, String data) {
        return null;
    }

    public String deleteOrder(String buyName) throws IOException {
        return null;
    }

}
