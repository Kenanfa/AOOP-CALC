package UnitConverter;



public class UnitConverterFactory {
    public UnitConverter getUnitConverter(String unitType){
        UnitConverter unitConverter = null;
        switch (unitType.toLowerCase()) {

            case "length":
                unitConverter = new LengthUnitConverter();
                break;
            case "volume":
                unitConverter = new VolumeUnitConverter();
                break;

            case "currency":
                unitConverter = new CurrencyUnitConverter();
                break;

            case "weight":
                unitConverter = new WeightUnitConverter();
                break;
        }
        return unitConverter;
    }
}
