public class LGElectronics extends Android {
    protected String name;

    public LGElectronics(String n, String m, String w, double r) {
        super("LG Electronics.", "heavy", 54.4);
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
        result += "Model Year: 2000\n";
        result += this.headphoneJack();
        return result;
    }
}
