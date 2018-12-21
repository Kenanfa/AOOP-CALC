package UnitConverter;



public class CurrencyUnitConverter implements UnitConverter {
    private static final double USD_TO_TL = 5.36;
    private static final double TL_TO_USD = 0.19;

    @Override
    public double convert(String fromUnit, String toUnit, double value) {

        double valueInUSD = convertToUSD(fromUnit, value);

        double multiplier = 1;
        switch (toUnit.toLowerCase()) {
            case "tl":
                multiplier = USD_TO_TL;
                break;
        }
        return multiplier * valueInUSD;
    }

    private double convertToUSD(String fromUnit, double value) {

        double multiplier = 1;
        switch (fromUnit.toLowerCase()) {
            case "tl":
                multiplier = TL_TO_USD;
                break;
        }
        return multiplier * value;
    }
}
