package models;

public class SamengesteldeIntrest {
    private final double kapitaal;
    private final double intrestVoet;
    private final int aantalJaren;
    private static final String EURO = "\u20AC";

    public SamengesteldeIntrest(double kapitaal, double intrestVoet, int aantalJaren) {
        super();
        this.kapitaal = kapitaal;
        this.intrestVoet = intrestVoet;
        this.aantalJaren = aantalJaren;
    }

    public double berekenOpbrengst() {
        return kapitaal * Math.pow((1 + intrestVoet/100),aantalJaren);
    }

    public String getOpbrengst(){
        return this.toString();
    }

    @Override
    public String toString() {
        return String.format("met een kapitaal van %s %.2f en een intrest van %.2f %% over een periode van %d jaren \n" +
                        "is de opbrengst %s %.2f", EURO, kapitaal, intrestVoet, aantalJaren, EURO, berekenOpbrengst());
    }
}
