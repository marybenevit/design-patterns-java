package strategy.example01;

public class IPI implements Tax{

    private Double value;

    public IPI (Double value) {
        this.value = value;
    }

    @Override
    public double calculateTax() {
        return this.value * 0.2;
    }
}
