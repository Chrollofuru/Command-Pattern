public class ThermostatDecreaseCommand implements Command {
    private final Thermostat thermostat;

    public ThermostatDecreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}