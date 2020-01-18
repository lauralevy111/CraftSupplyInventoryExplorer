package com.example.craftsupplyinventoryexplorer2;

public class PoscaMarker extends Marker implements ColorAble,DepleteAble {

    public String tipType;

    public PoscaMarker (String name,int colorHex, String tipType){
        super(name,colorHex);
        this.tipType = tipType;
    }
}
