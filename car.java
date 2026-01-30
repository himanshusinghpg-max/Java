// File name: car.java
public class car {
    int modelyear;
    int mileage;

    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.modelyear = 2020;
        c1.mileage = 22;

        c2.modelyear = 2022;
        c2.mileage = 18;

        System.out.println(c1.modelyear + " " + c1.mileage);
        System.out.println(c2.modelyear + " " + c2.mileage);
    }
}