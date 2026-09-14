public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living Room");
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer("Chill Vibes");

        SmartHomeHub hub = new SmartHomeHub();

        hub.register("LIVING_ROOM_LIGHT_ON", new LightOnCommand(livingRoomLight));
        hub.register("LIVING_ROOM_LIGHT_OFF", new LightOffCommand(livingRoomLight));
        hub.register("THERMOSTAT_UP", new ThermostatIncreaseCommand(thermostat));
        hub.register("THERMOSTAT_DOWN", new ThermostatDecreaseCommand(thermostat));
        hub.register("MUSIC_ON", new MusicPlayerOnCommand(musicPlayer));
        hub.register("MUSIC_OFF", new MusicPlayerOffCommand(musicPlayer));
        hub.register("VOLUME_UP", new VolumeUpCommand(musicPlayer));
        hub.register("VOLUME_DOWN", new VolumeDownCommand(musicPlayer));

        System.out.println("--- Morning routine ---");
        hub.executeCommand("LIVING_ROOM_LIGHT_ON");
        hub.executeCommand("THERMOSTAT_UP");
        hub.executeCommand("MUSIC_ON");
        hub.executeCommand("VOLUME_UP");
        hub.executeCommand("VOLUME_UP");

        System.out.println("\n--- Leaving the house ---");
        hub.executeCommand("LIVING_ROOM_LIGHT_OFF");
        hub.executeCommand("MUSIC_OFF");
        hub.executeCommand("THERMOSTAT_DOWN");

        System.out.println("\n--- Unregistered command ---");
        hub.executeCommand("GARAGE_DOOR_OPEN");
    }
}