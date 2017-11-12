package internetshop;

import java.util.ArrayList;

public class ComputerGameParams {
    private String name;
    private String description;
    private double price;
    private int ageRestrinct;
    private ArrayList<Genres> genres;
    public ComputerGameParams(ComputerGameParams param) {
        name = param.name;
        genres = new ArrayList<Genres>(param.genres);
        description = param.description;
        price = param.price;
        ageRestrinct = param.ageRestrinct;

    }

    public ComputerGameParams(String name, ArrayList<Genres> genres) {
        this.name = name;
        this.genres = genres;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAgeRestrinct() {
        return ageRestrinct;
    }

    public void setAgeRestrinct(int ageRestrinct) {
        this.ageRestrinct = ageRestrinct;
    }

    public ComputerGameParams(String name,
                              String description,
                              double price,
                              int ageRestrinct){
        setName(name);
        setAgeRestrinct(ageRestrinct);
        setDescription(description);
        setPrice(price);
        //new ComputerGame();
    }


    @Override
    public String toString() {
        return "ComputerGameParams{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", ageRestrinct=" + ageRestrinct +
                ", genres=" + genres +
                '}';
    }
}
