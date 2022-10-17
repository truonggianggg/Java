package SS4;

public class Main {
    public static void main(String[] args) {

        HDTD hd1 = new HDTD("Q001", "HEhee", 2022, 10, 17, "business", 136, 0);
        hd1.electricityBill();

        HDTD hd2 = new HDTD("Q002", "Blabla", 2022, 4, 29, 340, 0, true);
        hd2.electricityBill();

        HDTD hd3 = new HDTD("Q002", "Kakaka", 2022, 4, 25, 140, 0, false);
        hd3.electricityBill();
    }
}