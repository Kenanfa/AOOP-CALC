import java.util.ArrayList;

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
}
