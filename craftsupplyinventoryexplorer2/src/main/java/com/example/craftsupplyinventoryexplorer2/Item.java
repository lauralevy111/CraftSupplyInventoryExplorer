package com.example.craftsupplyinventoryexplorer2;

import java.util.ArrayList;

public class Item {
    private InventoryController inventoryController;

    public String name;
    public ArrayList<String> tags=inventoryController.getTags();

    public Item(String name){
        this.name = name;
    }

    public void setInventory(int quantity){this.inventoryController.setInventory(quantity);}

    public int getInventory(){
        return inventoryController.getInventory();
    }

    public void orderMore(int quantity){
        inventoryController.addInventory(quantity);

        //todo: send api call to order more through like micheals craft store

    }

}
