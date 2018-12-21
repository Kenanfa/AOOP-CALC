package UnitConverter;



// Concrete class
public class LengthUnitConverter implements UnitConverter {


    // Multipliers
    private static final double MM_TO_METER = 0.001;
    private static final double CM_TO_METER = 0.01;
    private static final double KM_TO_METER = 1000;
    private static final double MILE_TO_METER = 1609.344;

    private static final double METER_TO_MM = 1000;
    private static final double METER_TO_CM = 100;
    private static final double METER_TO_KM = 0.001;
    private static final double METER_TO_MILE = 0.0006213712;



    public double convert(String fromUnit, String toUnit, double value) {
        double valueInMeters = convertToMeter(fromUnit,value);

        double multiplier = 1;
        switch (toUnit.toLowerCase()){
            case "mile":
                multiplier = METER_TO_MILE;
                break;
            case "kilometer":
                multiplier = METER_TO_KM;
                break;

            case "centimeter":
                multiplier = METER_TO_CM;
                break;

            case "millimeter":
                multiplier = METER_TO_MM;
                break;
        }
        return multiplier*valueInMeters;
        }


    private double convertToMeter(String fromUnit,double value){

        double multiplier = 1;
        switch (fromUnit.toLowerCase()){
            case "mile":
                multiplier = MILE_TO_METER;
                break;
            case "kilometer":
                multiplier = KM_TO_METER;
                break;

            case "centimeter":
                multiplier = CM_TO_METER;
                break;

            case "millimeter":
                multiplier = MM_TO_METER;
                break;
        }

        return multiplier*value;
    }
}
