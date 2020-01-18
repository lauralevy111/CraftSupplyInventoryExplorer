package com.example.craftsupplyinventoryexplorer2.Implement;

import com.example.craftsupplyinventoryexplorer2.DrawWithAble;
import com.example.craftsupplyinventoryexplorer2.Item;

public class Marker extends Item implements DrawWithAble {

    public int colorHex;

    public Marker(String name, int colorHex){
        super(name);
        this.colorHex = colorHex;
    }
}
