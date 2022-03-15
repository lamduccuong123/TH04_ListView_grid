package com.example.th04_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity_grid extends AppCompatActivity {
    GridView products_grid;
    ProductAdapter_grid productAdapter;
    ArrayList<Product_grid> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        products_grid = (GridView) findViewById(R.id.gridviewproduct);
        products = new ArrayList<Product_grid>();

        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.giacchuyen1));
        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.daynguon));
        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.dauchuyendoipsps2));
        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.carbusbtops2));
        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.carbusbtops2));
        products.add(new Product_grid("Cáp chuyển từ Cổng USB sang PS2","69.900 đ", "-39","(15)", R.drawable.daucam));

        productAdapter = new ProductAdapter_grid(MainActivity_grid.this,R.layout.mot_dong_sp_grid,products);
        products_grid.setAdapter(productAdapter);
    }
}