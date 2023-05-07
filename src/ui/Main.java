package ui;

import color.Color;
import exceptions.DateFormatException;
import exceptions.EmptyFileException;
import exceptions.IncompleteDataException;
import exceptions.NegativeNumberException;
import model.Controller;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static final Controller controller = new Controller();
    public static final String category = controller.getCategory();

    public static void main(String[] args) throws IOException {

    }

    public void showMainMenu() throws IOException {

    }

    public void showProductManagementMenu() throws IOException {

    }

    public void showOrderManagementMenu() throws IOException {

    }

    public void showProductSearchMenu() {

    }

    public void showOrderSearchMenu() {

    }

    public int[] sortingSubmenuProduct() {
        return null;
    }

    public int[] sortingSubmenuOrder() {
        return null;
    }

    public void addProduct() throws IOException {

    }

    public void addOrder() throws IOException {

    }

    public void changeQuantity() throws IOException {

    }

}