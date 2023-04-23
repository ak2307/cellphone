public class IPhone extends Smartphone {

    // constructor
    public IPhone(String m, String w, double r) {
        super(m, w, r);
    }

    @Override
    public String headphoneJack() {
        String result = new String();
        result += "No headphone jack, goodluck!";
        return result;
    }

}
