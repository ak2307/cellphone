abstract public class Smartphone {

    // proctected data variables
    protected String manufacturer;
    protected String weight;
    protected double rating;

    // Constructor
    public Smartphone(String m, String w, double r) {
        manufacturer = m;
        weight = w;
        rating = r;
    }

    // to write the information down.
    public String toString() {
        String result = "Manufacturer: " + manufacturer + "\n";
        result += "Weight of the phone: " + weight + "\n";
        result += "Rating of the phone: " + rating + "\n";

        return result;
    }

    public abstract String headphoneJack();
}
