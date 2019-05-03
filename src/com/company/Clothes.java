package com.company;

public class Clothes {
    private String color;
    private String material;
    private String size;

    public Clothes() {
    }

    public Clothes(String color, String material, String size) {
        this.color = color;
        this.material = material;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString(){
        return "Color : "+getColor()+"\nMaterial: "+getMaterial()+"\nSize: "+getSize()+"\n";
    }
}
