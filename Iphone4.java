public class Iphone4 extends IPhone {

    protected String name;

    public Iphone4(String n, String m, String w, double r) {
        super(m, w, r);
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String toString() {
        String result = name + "\n" + super.toString();
        result += "Model Year: 2010\n";
        result += this.headphoneJack();
        return result;
    }

}
