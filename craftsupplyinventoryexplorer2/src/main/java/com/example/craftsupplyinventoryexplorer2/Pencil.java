package com.example.craftsupplyinventoryexplorer2;

public class Pencil extends Item implements DrawWithAble {

    public String softness;

    public Pencil(String name, String softness){
        super(name);
        this.softness = softness;

    }



}
