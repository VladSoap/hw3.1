package homework21.Lesson48;

public enum Season {
    SUMMER(35), SPRING(15), WINTER(0), AUTUMN(5);
    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
