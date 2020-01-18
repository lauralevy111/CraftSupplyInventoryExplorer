package com.example.craftsupplyinventoryexplorer2.Implement;

import com.example.craftsupplyinventoryexplorer2.DrawWithAble;
import com.example.craftsupplyinventoryexplorer2.Item;

public class Pen extends Item implements DrawWithAble {
    public Pen(String name, String inkColor, Double width){
        super(name);
    }
}
