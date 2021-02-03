package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;
    private int width;
    private int height;
    private String operatingSystem;


    public Phone(int width, int height) {
        super();
        this.width=width;
        this.height=height;

    }

    public Phone(String operatingSystem) {
        super();
        this.operatingSystem=operatingSystem;
    }

    public Phone() {

    }


    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String networkType() {
        return "4G";
    }
}
