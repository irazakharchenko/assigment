package internetshop;

import java.util.ArrayList;

public class ComputerGameBox{
    protected ArrayList<ComputerGame> objcts;

    public ComputerGame searchGame(String name){
        for (ComputerGame game: objcts){
            if (game.getName().equals(name)){
                return game;
            }
        }
        return null;
    }

    public void addGame(ComputerGame cgame){
        this.objcts.add(cgame);

    }




    //public ArrayList<ComputerGame> filter(String filt, String categoryFilter) {
        //switch (categoryFilter);

    //}
}
