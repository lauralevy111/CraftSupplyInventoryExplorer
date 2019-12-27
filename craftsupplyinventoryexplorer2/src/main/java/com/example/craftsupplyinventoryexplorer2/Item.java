package com.example.craftsupplyinventoryexplorer2;

import java.util.ArrayList;

public class Item {
    private InventoryController inventoryController;

    public String name;
    public ArrayList<String> tags=inventoryController.getTags();

    public Item(String name){
        this.name = name;
    }

    public int getInventory(){
        return inventoryController.getInventory();
    }

}
