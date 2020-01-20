package com.example.craftsupplyinventoryexplorer2.Implement;

import com.example.craftsupplyinventoryexplorer2.DrawWithAble;
import com.example.craftsupplyinventoryexplorer2.Item;

public class Marker extends Item implements DrawWithAble {

    public int colorHex;
    public String brand;

    public Marker(String name, int colorHex, String brand){
        super(name);
        this.colorHex = colorHex;
        this.brand = brand;
    }
}
