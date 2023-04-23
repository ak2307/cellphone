public class Android extends Smartphone {

    public Android(String m, String w, double r) {
        super(m, w, r);
    }

    @Override
    public String headphoneJack() {
        String result = new String();
        result += "There is a headphone jack, Yayy!!";
        return result;
    }

}
