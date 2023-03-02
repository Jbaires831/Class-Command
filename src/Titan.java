/*
Author: Jonathan Baires
Date: March 1, 2023
Description:
 */

import java.util.HashMap;

public class Titan extends Person{

    HashMap<String, Istone>guantlet = new HashMap<>();

    public void addStone(Istone stone){
        if (stone instanceof PowerStone){
            guantlet.put("Power", stone);
        }

        if (stone instanceof  SpaceStone){
            guantlet.put("Space", stone);
        }
    }

    public void snap(){
        for(String stone : guantlet.keySet()){
            System.out.println("Activating the " + stone + "Stone");
            guantlet.get(stone).special(this);
        }
    }

    public Titan(){
        super(500.0, "Thanos", "Titan");
    }

}
