package UnitConverter;

// Factory pattern
public interface UnitConverter {
    double convert(String fromUnit, String toUnit, double value );
}