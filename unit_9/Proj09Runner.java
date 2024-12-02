public class Proj09Runner{

    byte valA;  //Instance variable

    //constructor
    Proj09Runner( byte valA )
    {
      honorString();
      this.valA = valA;
    }
    
    private void honorString()
    {
      System.out.println("I certify that this program is my own work\n" +
                          "and is not the work of others. I agree not\n" +
                          "to share my solution with others.\n" +
                          "Andrew Connor Fryar\n");
    }

    @Override
    public String toString() 
    {
      return "Class Proj09Runner " + this.valA;
    }

}
