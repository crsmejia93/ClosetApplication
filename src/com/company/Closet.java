package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Closet {
    ArrayList<Jacket> jackets = new ArrayList<>();
    ArrayList<Shirt> shirts = new ArrayList<>();
    ArrayList<Pants> pants = new ArrayList<>();
    ArrayList<Footwear> footwears = new ArrayList<>();

    public Closet(){

    }

    public Jacket getJacket(int i) {
        return jackets.get(i);
    }

    public void addJackets(Jacket jacket) {
        jackets.add(jacket);
    }

    public Shirt getShirts(int i) {
        return shirts.get(i);
    }

    public void addShirts(Shirt shirt) {
        shirts.add(shirt);
    }

    public Pants getPants(int i) {
        return pants.get(i);
    }

    public void addPants(Pants pant) {
        pants.add(pant);
    }

    public Footwear getFootwear(int i) {
        return footwears.get(i);
    }

    public void addFootwear(Footwear footwear) {
        footwears.add(footwear);
    }

    public String randomOutfit(){
        Collections.shuffle(jackets);
        Collections.shuffle(shirts);
        Collections.shuffle(pants);
        Collections.shuffle(footwears);

        return "Jacket:\n"+jackets.get(1).toString()+"\nShirt:\n"+shirts.get(1).toString()+"\nPair of Pants:\n"
                +pants.get(1).toString()+"\nShoes:\n"+footwears.get(1).toString()+"\n";
    }
}
