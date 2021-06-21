package Util;

import InventoryModel.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputOutput {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getProductName() {
        System.out.println("Enter the name :");
        return scanner.next();
    }

    public static Double getProductPrice() {
        System.out.println("Enter the price : ");
        return scanner.nextDouble();
    }

    public static Double getProductWeight() {
        System.out.println("Enter the weight : ");
        return scanner.nextDouble();
    }

    public static int getUserChoice() {

        System.out.println("Press 1 - Add Products ");
        System.out.println("Press 2 - Edit Products ");
        System.out.println("Press 3 - Delete Products ");
        System.out.println("Press 4 - Display Products ");
        System.out.println("Press 5 - Exit ");


        return scanner.nextInt();
    }
    public static void display(List<Inventory> productList){
        System.out.println(productList);
    }
}