package UnitConverter;

import Factories.UnitConverter;

public class VolumeUnitConverter implements UnitConverter {
    private static final double GALLON_TO_LITRE = 3.7854;
    private static final double LITRE_TO_GALLON = 0.2642;


    @Override
    public double convert(String fromUnit, String toUnit, double value) {

    return 0.01;

    }
}
