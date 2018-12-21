package UnitConverter;



public class WeightUnitConverter implements UnitConverter {

    private static final double KILOGRAMS_TO_POUND = 2.20462;
    private static final double POUND_TO_KILOGRAMS = 0.453592;

    @Override
    public double convert(String fromUnit, String toUnit, double value) {

        double valueInKilograms = convertToKilograms(fromUnit, value);

        double multiplier = 1;
        switch (toUnit.toLowerCase()) {
            case "pound":
                multiplier = KILOGRAMS_TO_POUND;
                break;
        }
        return multiplier * valueInKilograms;


    }

    private double convertToKilograms(String fromUnit, double value) {

        double multiplier = 1;
        switch (fromUnit.toLowerCase()) {
            case "pound":
                multiplier = POUND_TO_KILOGRAMS;
                break;
        }
        return multiplier * value;
    }
}
