package InventoryService;

import InventoryModel.Inventory;

import java.util.ArrayList;
import java.util.List;

public interface InventoryServiceInterface {


    void addInventory(Inventory inventory);

    void deleteInventory(String name);

    void editInventory(String name, double price, double weight);

    boolean findByName(String name);

    List<Inventory> findAll();

}