package com.example.craftsupplyinventoryexplorer2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class OrderActivity extends AppCompatActivity {

    private Item item;

    private int itemQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        if(item.getInventory()<=0){
            item.orderMore(itemQuantity);
        }

    }


}
