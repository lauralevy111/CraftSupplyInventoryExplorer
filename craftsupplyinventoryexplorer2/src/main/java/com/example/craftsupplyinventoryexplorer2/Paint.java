package com.example.craftsupplyinventoryexplorer2;

public class Paint extends Item implements DepleteAble{

    public int colorHex;

    public Paint(String name, int colorHex){
        super(name);
        this.colorHex = colorHex;
    }
}
