package fpp.lesson5hw.prob4;

public class ApplianceTest {
    void main(){
        Appliance[] appliances = {
                new WashingMachine(6),
                new Refrigerator(3),
                new Microwave(799)
        };
        for (Appliance appliance : appliances) {
            appliance.performFunction();
        }
    }
}
