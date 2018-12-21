package UnitConverter;


public class UnitsListSource {
    private String[] length;
    private String[] volume;
    private String[] weight;
    private String[] currency;
    private boolean isInitialized;
    final static String[] unitTypes = { "Volume", "Length", "Weight", "Currency"};
    
    private void initializeArrays(){
        if(!isInitialized){
            length = new String[]{"Millimeter","Centimeter", "Meter","Kilometer","Mile"};
            volume = new String[]{"Litre","Gallon"};
            weight = new String[]{"Kilograms","Pound"};
            currency = new String[]{"USD","TL"};

        }
        isInitialized = true;
    }

    public String[] getUnitsList(String selectedUnitType) {
        if(!isInitialized)
            initializeArrays();

        switch(selectedUnitType.toLowerCase()) {
            case "length":
                return length;
            case "volume":
                return volume;
            case "weight":
                return weight;
            case "currency":
                return currency;

        }
        return null;
    }
}
