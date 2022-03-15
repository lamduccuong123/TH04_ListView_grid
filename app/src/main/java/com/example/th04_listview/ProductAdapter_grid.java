package com.example.th04_listview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter_grid extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Product_grid> products;
    private int positionSelected = -1;

    public ProductAdapter_grid(Context context, int layout, ArrayList<Product_grid> products) {
        this.context = context;
        this.layout = layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
             view = inflater.inflate(layout,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtTen);
        TextView txtPhanTram = (TextView) view.findViewById(R.id.txtPhanTram);
        TextView txtGia = (TextView) view.findViewById(R.id.txtGia);
        TextView txtDaBan = (TextView) view.findViewById(R.id.txtDaBan);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.hinh);

        Product_grid product = products.get(i);
        txtName.setText(product.getName());
        txtPhanTram.setText(product.getPhanTram());
        txtGia.setText(product.getGia());
        txtDaBan.setText(product.getDaBan());
        imgPicture.setImageResource(product.getPicture());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "" + product.getName(), Toast.LENGTH_SHORT).show();
                positionSelected = i;
                notifyDataSetChanged();
            }
        });
        final ConstraintLayout layout01 = (ConstraintLayout) view.findViewById(R.id.linear02);
        if(positionSelected == i){
            layout01.setBackgroundColor(Color.BLUE);
        }
        else
            layout01.setBackgroundColor(Color.WHITE);
        return view;
    }
}
