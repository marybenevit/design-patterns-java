package strategy.example01;

public class TestStrategy {
    public static void main(String[] args) {

        TaxCalculate taxCalculate = new TaxCalculate();
        ICMS icms = new ICMS(50.00);
        IPI ipi = new IPI(50.00);

        System.out.println(taxCalculate.calculate(icms));
        System.out.println(taxCalculate.calculate(ipi));
    }
}
