package com.example.craftsupplyinventoryexplorer2;

public class PoscaMarker extends Item implements ColorAble {

    public int colorHex;

    public PoscaMarker (String name,int colorHex){
        super(name);
        this.colorHex = colorHex;
    }
}
