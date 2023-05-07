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
        StringBuilder msg = new StringBuilder();
        if(data.isEmpty()) {throw new IncompleteDataException();}
        switch (option) {
            case 1:
                ArrayList<Order> ordersFoundBuyerName = searchOrderByBuyerName(data);
                sortingResults(ordersFoundBuyerName, sortingType, sortingVariable);
                for (Order o : ordersFoundBuyerName) {
                    msg.append(String.format("BuyerName: %s ProductsOrder: %s TotalPrice: %.2f Products Quantity: %s Purchase Date: %s ", o.getBuyerName(), Arrays.toString(o.getProductsOrder()), o.getTotalPrice(), Arrays.toString(o.getProductsQuantity()), o.getPurchasedDate())).append("\n");
                }
                break;
            case 2:
                double totalPrice = -1;
                try {
                    totalPrice = Double.parseDouble(data);
                } catch (NumberFormatException ex) {
                    throw new IncompleteDataException();
                }
                ArrayList<Order> ordersFoundTotalPrice = searchOrderByTotalPrice(totalPrice);
                sortingResults(ordersFoundTotalPrice, sortingType, sortingVariable);
                for (Order o : ordersFoundTotalPrice) {
                    msg.append(String.format("BuyerName: %s ProductsOrder: %s TotalPrice: %.2f Products Quantity: %s Purchase Date: %s ", o.getBuyerName(), Arrays.toString(o.getProductsOrder()), o.getTotalPrice(), Arrays.toString(o.getProductsQuantity()), o.getPurchasedDate())).append("\n");
                }
                break;
            case 3:
                LocalDate date;
                try {
                    date = LocalDate.parse(data);
                } catch (DateTimeException ex) {
                    throw new DateFormatException();
                }
                ArrayList<Order> ordersByDate = searchProductByPurchasedDate(date);
                sortingResults(ordersByDate, sortingType, sortingVariable);
                for (Order o : ordersByDate) {
                    msg.append(String.format("BuyerName: %s ProductsOrder: %s TotalPrice: %.2f Products Quantity: %s Purchase Date: %s ", o.getBuyerName(), Arrays.toString(o.getProductsOrder()), o.getTotalPrice(), Arrays.toString(o.getProductsQuantity()), o.getPurchasedDate())).append("\n");
                }
                break;
        }
        if (msg.length() == 0) {
            return Color.BOLD + Color.YELLOW + "               NO ORDER HAS THAT CHARACTERISTIC                \n" + Color.RESET;
        }
        return msg.toString();
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
