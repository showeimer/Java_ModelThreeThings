public class Runner {

    public static void main(String[] args) {
        Car myCar = new Car("Scion xD", 2010, false);
        Dog myDog = new Dog("Misha", 6, "Shiba Inu");
        Subject myClass = new Subject("Chemistry", "Xiu", 16);
        myCar.printInfo();
        myDog.printInfo();
        myClass.printInfo();

        Van myVan = new Van(true, "Gray", "Kia", 2017, false);
        myVan.printInfo();
    }

}
