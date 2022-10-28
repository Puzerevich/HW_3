package Package_1;

public class Car {

    public void Start() {
        StartElecticity();
        startCommand();
        startFuelSystem();
    }

    private void StartElecticity(){
        System.out.println("Start Electicity");
    }
    private void startCommand(){
        System.out.println("Start Command");
    }
    private void startFuelSystem(){
        System.out.println("Start Fuel System");
    }
}
