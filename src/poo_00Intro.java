public class poo_00Intro {
    public static void main(String[] args) {
        Auto myCar = new Auto();
        System.out.println(myCar.accelerate(4000));
        System.out.println(myCar.accelerate("4000"));
        // myCar.color = "red"; //! Since color is private in class Auto, we cannot
        // ! access it.

        Auto myCar2 = new Auto("red", "2013", 4);
        String myStr = myCar2.toString();
        System.out.println(myStr);
    }
}

class Auto {
    private String color;
    private String model;
    private double cil;

    // ?Constructor
    public Auto() {
        this.color = "Uknown";
        this.model = "2015";
        this.cil = 4;
    }

    // ? Overloaded Constructor
    public Auto(String color, String model, double cil) {
        this.color = color;
        this.model = model;
        this.cil = cil;
    }

    // ? A class method
    public String sayRun() {
        return "Rrrruuuun";
    }

    // ? Another class methid
    public String accelerate(int rpm) {
        return "INT!! : You are going at: " + rpm + "rpm.\n";
    }

    // ? Overload the method
    public String accelerate(String rpm) {
        return "STRING!! : You are going at: " + rpm + "rpm.\n";
    }

    // ?Method that calls another methods
    public String info(int rpm) {
        return this.sayRun() + " " + this.accelerate(rpm);
    }

}