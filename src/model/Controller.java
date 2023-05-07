package model;

import color.Color;
import exceptions.DateFormatException;
import exceptions.IncompleteDataException;

import java.io.IOException;
import java.time.LocalDate;

public class Controller {

    private OrderList orderList = new OrderList();
    private ProductList productList = new ProductList();

    public OrderList getOrderList() {
        return orderList;
    }

    public ProductList getProductList() {
        return productList;
    }

    public String getCategory() {
        return getCategory();
    }

    public void addProduct(String[] data) throws IOException {

    }

    public void changeProductQuantity(String product, int quantity) throws IOException {

    }

    public void addOrder(String[] data) throws IOException {

    }

    public String searchProduct(int option, String data, int sortingType, int sortingVariable) {
        return null;
    }

    public String searchProduct(int option, String minData, String maxData, int sortingType, int sortingVariable) {
        return null;
    }

    public String searchOrder(int option, String data, int sortingType, int sortingVariable) {
        return null;
    }
}