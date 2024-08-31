//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Car myCar = new Car(4, "Blue", 2.5f, "Gasoline", "Honda");
            myCar.honk();
            myCar.displayInfo();

            // Optionally, you can also use the toString method to display the car info
            System.out.println(myCar.toString());
        }
    }