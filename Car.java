/**
 * Created by jackbrashier on 4/25/17.
 */
public class Car {
    static int carCounter = 0;
    String color;
    int horsepower;
    String make;
    double engineSize;

    //Default Constructor
    public Car() {
        carCounter++;
        this.make = "Toyota";
        this.color = "Silver";
        this.horsepower = 250;
        this.engineSize = 2.5;
    }

    //Custom Constructor
    public Car(String color, String make, int horsepower, double engineSize) {
        carCounter++;
        this.color = color;
        this.make = make;
        this.horsepower = horsepower;
        this.engineSize = engineSize;
    }

    //Methods

    //Returns make
    public String getMake() {
        return make;
    }

    //Sets make
    public void setMake(String newMake) {
        this.make = newMake;
    }

    //Returns color
    public String getColor() {
        return color;
    }

    //Sets color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    //Returns horsepower
    public int getHorsepower() {
        return horsepower;
    }

    //Sets horsepower
    public void setHorsepower(int newHorsepower) {
        this.horsepower = newHorsepower;
    }

    //Gets engineSize
    public double getEngineSize() {
        return engineSize;
    }

    //Sets engineSize
    public void setEngineSize(double newEngineSize) {
        this.engineSize = newEngineSize;
    }

    //Returns instance variables of the car
    public String toString() {
        String output = (this.color + " " + this.make + ", " + this.horsepower + ", " + this.engineSize);
        return output;
    }

    //Returns the amount of cars created so far.
    public static int getCount() {
        int count = carCounter;
        return count;
    }

    //Returns true if two cars are the same car.
    public boolean equals(Car car2) {
        if(this.getColor() == car2.getColor() && this.getMake() == car2.getMake() && this.getEngineSize() == car2.getEngineSize() && this.getHorsepower() == car2.getHorsepower()) {
            return true;
        } else {
            return false;
        }
    }
}