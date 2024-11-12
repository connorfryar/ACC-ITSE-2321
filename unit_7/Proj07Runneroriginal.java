class Proj07Runner extends Proj07 {
    // Experimented with ChatGPT Comment creation with Canvas
    // in order to auto generate code post writing it.
    // Constructor: Initializes the object and calls the 
    // honor statement method to print the certification message.
    public Proj07Runner() {
        honorStatement();
    }
    
    // Override the run method from the superclass Proj07 
    // to include custom output.
    // This method will print the my name.
    @Override
    void run() {
      // Print the student's name as required by the assignment.
      System.out.println("Andrew Connor Fryar\n");
    }
  
    // Method to display the honor statement.
    // This prints the required certification statement 
    // when an instance of Proj07Runner is created.
    public void honorStatement() {
      System.out.println(
          "I certify that this program is my own work\n"
          + "and is not the work of others. I agree not\n"
          + "to share my solutions with others.");
    }
}
// End of Proj07Runner class