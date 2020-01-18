package com.example.craftsupplyinventoryexplorer2;

public class Marker extends Item implements DrawWithAble {

    public int colorHex;

    public Marker(String name, int colorHex){
        super(name);
        this.colorHex = colorHex;
    }
}
