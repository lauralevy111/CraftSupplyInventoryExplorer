package com.example.craftsupplyinventoryexplorer2.Implement;

import com.example.craftsupplyinventoryexplorer2.ColorAble;
import com.example.craftsupplyinventoryexplorer2.DepleteAble;

public class PoscaMarker extends Marker implements ColorAble, DepleteAble {

    public String tipType;

    public PoscaMarker (String name,int colorHex, String tipType){
        super(name,colorHex);
        this.tipType = tipType;
    }
}
