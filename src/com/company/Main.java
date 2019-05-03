package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Collaborators: Oona Carbonie, Jinsook Kwon, Jacob Lefler, and Cesar Mejia
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Closet> closets = new ArrayList<>();
        Closet closetOne = new Closet();
        Closet closetTwo = new Closet();
        Closet closetThree = new Closet();

        //all the objects of Jacket, Shirt, Pants, and Footwear are created here
	    Jacket cottonJacket = new Jacket("Blue", "Cotton", "M");
	    Jacket leatherJacket = new Jacket("Green", "Leather", "XL");
	    Jacket suitJacket = new Jacket("Red", "Cotton", "S");
	    Shirt poloShirt = new Shirt("Red", "Cotton", "M");
	    Shirt tShirt = new Shirt("Sky Blue", "Cotton", "L");
	    Shirt silkShirt = new Shirt("Purple", "Silk", "M");
	    Pants jeans = new Pants("Blue", "Denim","32");
	    Pants leggings = new Pants("Tye Dye", "Spandex", "XS");
	    Pants skirt = new Pants("Pink", "Leather", "XXL");
	    Footwear sneakers = new Footwear("black", "leather", "12");
	    Footwear stilettos = new Footwear("Black", "Leather", "2");
	    Footwear clown = new Footwear("Yellow", "Rubber", "15");

	    //Every object created above is place inside the first closet
	    closetOne.addJackets(cottonJacket);
	    closetOne.addJackets(leatherJacket);
	    closetOne.addJackets(suitJacket);
	    closetOne.addShirts(poloShirt);
	    closetOne.addShirts(tShirt);
	    closetOne.addShirts(silkShirt);
	    closetOne.addPants(jeans);
	    closetOne.addPants(leggings);
	    closetOne.addPants(skirt);
	    closetOne.addFootwear(sneakers);
	    closetOne.addFootwear(stilettos);
	    closetOne.addFootwear(clown);


        closetTwo.addJackets(cottonJacket);
        closetTwo.addJackets(leatherJacket);
        closetTwo.addJackets(suitJacket);
        closetTwo.addShirts(poloShirt);
        closetTwo.addShirts(tShirt);
        closetTwo.addShirts(silkShirt);
        closetTwo.addPants(jeans);
        closetTwo.addPants(leggings);
        closetTwo.addPants(skirt);
        closetTwo.addFootwear(sneakers);
        closetTwo.addFootwear(stilettos);
        closetTwo.addFootwear(clown);


        closetThree.addJackets(cottonJacket);
        closetThree.addJackets(leatherJacket);
        closetThree.addJackets(suitJacket);
        closetThree.addShirts(poloShirt);
        closetThree.addShirts(tShirt);
        closetThree.addShirts(silkShirt);
        closetThree.addPants(jeans);
        closetThree.addPants(leggings);
        closetThree.addPants(skirt);
        closetThree.addFootwear(sneakers);
        closetThree.addFootwear(stilettos);
        closetThree.addFootwear(clown);

        closets.add(closetOne);
        closets.add(closetTwo);
        closets.add(closetThree);

        String closetChosen;
        while(true) {
            System.out.print("Choose your closet or quit(y/n): ");
            closetChosen = input.nextLine();
            if (!closetChosen.equalsIgnoreCase("y")){
                if (closetChosen.equalsIgnoreCase("closetOne")) {
                    System.out.println("Closet One\n"+closetOne.randomOutfit());
                } else if (closetChosen.equalsIgnoreCase("closetTwo")) {
                    System.out.println("Closet Two\n"+closetTwo.randomOutfit());
                } else if (closetChosen.equalsIgnoreCase("closetThree")) {
                    System.out.println("Closet Three\n"+closetThree.randomOutfit());
                }
            }else{
                break;
            }
        }
    }
}
