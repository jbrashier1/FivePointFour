import javax.swing.JOptionPane;
/**
 * Created by jackbrashier on 4/25/17.
 */
public class CarDriver {
    public static void main(String [] args) {

        Car myCar = new Car();
        Car hisCar = new Car();
        Car herCar = new Car();

        myCar.setColor(JOptionPane.showInputDialog(null, "What color is myCar?"));
        myCar.setMake(JOptionPane.showInputDialog(null, "What make is myCar?"));
        myCar.setEngineSize(Double.parseDouble(JOptionPane.showInputDialog(null, "What is myCar's engine size?")));
        myCar.setHorsepower(Integer.parseInt(JOptionPane.showInputDialog(null, "What is myCar's horsepower?")));

        hisCar.setColor(JOptionPane.showInputDialog(null, "What color is hisCar?"));
        hisCar.setMake(JOptionPane.showInputDialog(null, "What make is hisCar?"));
        hisCar.setEngineSize(Double.parseDouble(JOptionPane.showInputDialog(null, "What is hisCar's engine size?")));
        hisCar.setHorsepower(Integer.parseInt(JOptionPane.showInputDialog(null, "What is hisCar's horsepower?")));

        herCar.setColor(JOptionPane.showInputDialog(null, "What color is herCar?"));
        herCar.setMake(JOptionPane.showInputDialog(null, "What make is herCar?"));
        herCar.setEngineSize(Double.parseDouble(JOptionPane.showInputDialog(null, "What is herCar's engine size?")));
        herCar.setHorsepower(Integer.parseInt(JOptionPane.showInputDialog(null, "What is herCar's horsepower?")));

        JOptionPane.showMessageDialog(null, "myCar: " + myCar);
        JOptionPane.showMessageDialog(null, "hisCar: " + hisCar);
        JOptionPane.showMessageDialog(null, "herCar: " + herCar);

        Car car4 = new Car(myCar.getColor(), myCar.getMake(), myCar.getHorsepower(), myCar.getEngineSize());

        JOptionPane.showMessageDialog(null, "car4: " + car4);

        JOptionPane.showMessageDialog(null, "car4 = myCar? - " + car4.equals(myCar));


    }
}
