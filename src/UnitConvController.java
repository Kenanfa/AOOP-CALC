public class UnitConvController {

    UnitConvView unitConvView;

    public UnitConvController(){
        unitConvView = new UnitConvView(this);
    }

    public UnitConvView getUnitConvView(){
        return unitConvView;
    }
    public void unitTypeSelected(String selectedItem) {
        System.out.println(selectedItem);
    }
}
