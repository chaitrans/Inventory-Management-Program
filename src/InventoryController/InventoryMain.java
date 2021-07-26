package InventoryController;

import InventoryModel.Inventory;
import InventoryService.InventoryService;
import Util.UserInputOutput;

import java.util.Scanner;

/**
 * Main class to read Inventory name, price of inventory and weight of inventory from user.
 * And perform CRED operation.
 * @author Chaitra NS
 * @since 22 July 2021
 */

public class InventoryMain {
    static Scanner scanner = new Scanner(System.in);

    //static InventoryServiceInterface inventoryServiceInterface = new InventoryService();
    public static void main(String[] args) {

        InventoryService inventoryService = new InventoryService();

        boolean flag = true;
        while (flag) {
            int choice = UserInputOutput.getUserChoice();

            switch (choice) {
                case 1:
                    Inventory inventory = readDataFromConsole();
                    inventoryService.addInventory(inventory);
                    break;
                case 2:
                    String editName = UserInputOutput.getProductName();
                    if (inventoryService.findByName(editName)) {

                        double price = UserInputOutput.getProductPrice();
                        double weight = UserInputOutput.getProductWeight();

                        inventoryService.editInventory(editName, price, weight);
                    }
                    break;
                case 3:
                    String name = UserInputOutput.getProductName();
                    if (inventoryService.findByName(name)) {
                        inventoryService.deleteInventory(name);
                    }
                    break;
                case 4:
                    UserInputOutput.display(inventoryService.findAll());
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Input !!!");
                    break;
            }
        }
    }

    public static Inventory readDataFromConsole() {
        Inventory inventory = new Inventory();
        System.out.println("Add Inventory");

        String name = UserInputOutput.getProductName();
        inventory.setName(name);

        double price = UserInputOutput.getProductPrice();
        inventory.setPrice(price);

        double weight = UserInputOutput.getProductWeight();
        inventory.setWeight(weight);

        return inventory;
    }
}
