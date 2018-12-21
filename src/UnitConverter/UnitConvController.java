package UnitConverter;


public class UnitConvController {

    UnitConvView unitConvView;
    UnitsListSource unitsListSource;
    UnitConverterFactory unitConverterFactory;


    public UnitConvController(){

        unitConvView = new UnitConvView(this);
        unitsListSource = new UnitsListSource();
        unitConverterFactory = new UnitConverterFactory();
    }

    public UnitConvView getUnitConvView(){
        return unitConvView;
    }

    public void unitTypeSelected(String selectedUnitType) {
        System.out.println(selectedUnitType);
        String[] unitsList = unitsListSource.getUnitsList(selectedUnitType);
        unitConvView.setSourceUnitComboBoxes(unitsList);
        unitConvView.setDestinationUnitComboBox(unitsList);
    }

    public void convertButtonPressed(){
        String stringValue = unitConvView.getTextFieldValue();
        double value;

        try{
            value = Double.parseDouble(stringValue);
        }catch (NumberFormatException e){
            unitConvView.showMessageDialog("please enter a valid number/float!");
            return;
        }
        try {
            UnitConverter unitConverter = unitConverterFactory.getUnitConverter(unitConvView.getUnitType().toLowerCase());
            double result = unitConverter.convert(unitConvView.getSourceUnit(),unitConvView.getDestinationUnit(),value);
            unitConvView.setResultField(Double.toString(result));
        }catch (NullPointerException e){
            unitConvView.showMessageDialog("Please select unit type!");
        }





    }
}
