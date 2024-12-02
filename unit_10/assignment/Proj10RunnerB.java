public class Proj10RunnerB implements Proj10X {
    // Instance variable to store the input data
    private int data;

    // Constructor to save the input data
    public Proj10RunnerB(int inputData) {
        
        this.toString();
        this.data = inputData;

    }

    public int getData() {
        return this.data;
    }

    public int getModifiedData() {
        int datacopy = this.data;
        return ++datacopy;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.data+5);
    }
}
