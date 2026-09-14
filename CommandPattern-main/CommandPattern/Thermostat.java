public class Thermostat {
    private int temperature = 72;
 
    public void increaseTemperature() {
        temperature++;
        System.out.println("[Thermostat] increased to " + temperature + "F");
    }
 
    public void decreaseTemperature() {
        temperature--;
        System.out.println("[Thermostat] decreased to " + temperature + "F");
    }
}