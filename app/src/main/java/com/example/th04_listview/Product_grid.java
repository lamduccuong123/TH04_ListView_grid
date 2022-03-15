package com.example.th04_listview;

public class Product_grid {
    private String name;
    private String gia;
    private String phanTram;
    private String daBan;
    private int picture;

    public Product_grid(String name, String gia, String phanTram, String daBan, int picture) {
        this.name = name;
        this.gia = gia;
        this.phanTram = phanTram;
        this.daBan = daBan;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getPhanTram() {
        return phanTram;
    }

    public void setPhanTram(String phanTram) {
        this.phanTram = phanTram;
    }

    public String getDaBan() {
        return daBan;
    }

    public void setDaBan(String daBan) {
        this.daBan = daBan;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
