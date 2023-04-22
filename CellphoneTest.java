
public class CellphoneTest {
    public static void main(String[] args) {

        String manuApple = "Apple inc.";
        String manuSamsung = "Samsung Mobile";
        String manuLG = "LG electronics";

        Iphone14 iPhone14 = new Iphone14("Iphone 14 64gb Black", manuApple, "250 gm", 96.6);
        Iphone4 iPhone4 = new Iphone4("Iphone 4 16gb Black", manuApple, "330 gm", 82.3);
        LGElectronics flipPhone = new LGElectronics("LG SM580", manuLG, "550 gm", 66.5);
        SamsungNote samsungNote = new SamsungNote("Samsung Note S22 128gb silver", manuSamsung, "310 gm", 96.1);
        SamsungS22 samsusngS22 = new SamsungS22("Samsung Galaxy S22 Plus 256gb Pink", manuSamsung, "220 gm", 98.3);

        // create new

        System.out.println();
        System.out.println(iPhone14);
        System.out.println();
        System.out.println(iPhone4);
        System.out.println();
        System.out.println(flipPhone);
        System.out.println();
        System.out.println(samsungNote);
        System.out.println();
        System.out.println(samsusngS22);

    }
}