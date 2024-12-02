public class Proj10RunnerA implements Proj10X{
    // Instance variable to store the input data
    private int data;
    
    // Constructor to save the input data
    public Proj10RunnerA(int inputData) {
        
        this.honorString();
        this.data = inputData;

    }

    public int getData() {
        return this.data;
    }

    public int getModifiedData() {
        int datacopy = this.data;
        return --datacopy;
    }

    private void honorString()
    {
      System.out.println("I certify that this program is my own work\n" +
                          "and is not the work of others. I agree not\n" +
                          "to share my solution with others.\n" +
                          "Andrew Connor\n" +
                          "Fryar");
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.data+5);
    }
}