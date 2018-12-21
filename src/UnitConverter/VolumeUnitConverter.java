package UnitConverter;



public class VolumeUnitConverter implements UnitConverter {
    private static final double GALLON_TO_LITRE = 3.7854;
    private static final double LITRE_TO_GALLON = 0.2642;


    @Override
    public double convert(String fromUnit, String toUnit, double value) {

        double valueInLitre = convertToLitre(fromUnit, value);

        double multiplier = 1;
        switch (toUnit.toLowerCase()) {
            case "gallon":
                multiplier = LITRE_TO_GALLON;
                break;
        }
        return multiplier * valueInLitre;


    }

    private double convertToLitre(String fromUnit, double value) {

        double multiplier = 1;
        switch (fromUnit.toLowerCase()) {
            case "gallon":
                multiplier = GALLON_TO_LITRE;
                break;
        }
        return multiplier * value;
    }

}
