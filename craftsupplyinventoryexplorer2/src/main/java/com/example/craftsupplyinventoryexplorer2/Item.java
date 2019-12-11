package com.example.craftsupplyinventoryexplorer2;

import java.util.ArrayList;

public class Item {

    public String name;
    public ArrayList<String> tags;

    public Item(String name, ArrayList<String>tags){
        this.name = name;
        this.tags=tags;

    }
}
