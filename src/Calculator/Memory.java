package Calculator;

public class Memory {
    private static Memory instance;
    private String[] memoryArray;
    private String latestResult;
    private final int memorySize = 5;

    //Singleton pattern.
    // Private instructor to prevent initialization
    private Memory(){
        memoryArray = new String[memorySize];
    }

    public static Memory getInstance(){
        if(instance == null)
            instance = new Memory();
        return instance;
    }

    public void setMemoryValue(int memoryIndex, String value){
        memoryArray[memoryIndex] = value;
        System.out.println(value + " is saved to memory " + memoryIndex+1);
    }

    public String getMemoryValue(int memoryIndex){
        return memoryArray[memoryIndex];
    }

    public boolean memoryValueIsEmpty(int memoryIndex){
        return memoryArray[memoryIndex] == null;
    }


    public void setLatestResultValue(String latestResult) {
        this.latestResult = latestResult;
    }

    public String getLatestResultValue(){
        return latestResult;
    }

    public boolean latestResultIsSet(){
        return latestResult != null;
    }
}
