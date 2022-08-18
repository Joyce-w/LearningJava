package com.joycewong;

public class Main {

    public static void main(String[] args) {
	//create a new player class
        //because fields are public, we can directly set field values
        //when changing field name that are public, we need to go make manual changes
        Player player = new Player();
        player.name = "Joyce";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 21;
        //**Can access fields directly, you allow more unwanted changes
        //player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
