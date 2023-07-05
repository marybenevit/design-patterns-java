package strategy.example01;

public class ICMS implements Tax {

    private Double value;

    public ICMS(Double value) {
        this.value = value;
    }

    @Override
    public double calculateTax() {
        return this.value * 0.1;
    }
}
