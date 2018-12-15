package UnitConverter;

import Factories.UnitConverter;

public class UnitConvController {

    UnitConvView unitConvView;
    UnitsListSource unitsListSource;


    public UnitConvController(){

        unitConvView = new UnitConvView(this);
        unitsListSource = new UnitsListSource();
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
        double value = 9.9;

        try{
            value = Double.parseDouble(stringValue);
        }catch (NumberFormatException e){
            unitConvView.showMessageDialog("please enter a valid number/float!");
            return;
        }


        UnitConverter unitConverter; // TODO visitor here>!?!?!?

        switch (unitConvView.getUnitType().toLowerCase()){

            default:
                unitConvView.showMessageDialog("Please select a unit type!");
                return;

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
        double result = unitConverter.convert(unitConvView.getSourceUnit(),unitConvView.getDestinationUnit(),value);
        unitConvView.setResultField(Double.toString(result));


    }
}
