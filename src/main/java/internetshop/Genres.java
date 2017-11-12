package internetshop;

public enum Genres {
    ACTION("action"), MOBA("moba"), SIMULATION("simulation");

    private String name;

    Genres(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name;
    }
}
