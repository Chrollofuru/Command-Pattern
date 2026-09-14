public class Light {
    private final String location;
    private int brightness;

    public Light(String location) {
        this.location = location;
        this.brightness = 0;
    }

    public void turnOn() {
        brightness = 100;
        System.out.println("[Light:" + location + "] ON  (brightness=" + brightness + "%)");
    }

    public void turnOff() {
        brightness = 0;
        System.out.println("[Light:" + location + "] OFF");
    }

    public void setBrightness(int level) {
        brightness = Math.max(0, Math.min(100, level));
        System.out.println("[Light:" + location + "] brightness set to " + brightness + "%");
    }
}