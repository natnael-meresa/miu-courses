package fpp.lesson5hw.prob2;

public class TestSensor {
    void main() {
        Sensor[] sensors = {
                new LightSensor("Home", 200),
                new LightSensor("Kitchen", 2),
                new Temperature("Garden", 24.5),
                new Temperature("LivingRoom", 104.5),
                new SoundSensor("Bedroom", 65.0)
        };

        for (Sensor sensor: sensors) {
            System.out.println(sensor);
            System.out.println();
        }
    }
}
