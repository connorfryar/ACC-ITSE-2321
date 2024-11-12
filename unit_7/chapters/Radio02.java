package chapters;

/*File Radio02.java
Copyright, R.G.Baldwin
Simulates the manufacture and use of a 
combination car radio and tape player.

This program produces the following
output on the computer screen:
  
Combo object constructed
Button 3 programmed
Play Radio
  Playing the station at 93.5 Mhz
Insert Tape
  Tape is in
  Radio is off
Play Radio
  Remove the tape first
Remove Tape
  Tape is out
  Radio is on
Play Radio
  Playing the station at 93.5 Mhz
Play Tape
  Insert the tape first
Insert Tape
  Tape is in
  Radio is off
Play Tape
  Tape is playing
Remove Tape
  Tape is out
  Radio is on
Play Radio
  Playing the station at 93.5 Mhz
**************************************/

public class Radio02{
    //This class simulates the 
    // manufacturer and the human user
    public static void main(
                          String[] args){
      Combo myObjRef = new Combo();
      myObjRef.setStationNumber(3,93.5);
      myObjRef.playStation(3);
      myObjRef.insertTape();
      myObjRef.playStation(3);
      myObjRef.removeTape();
      myObjRef.playStation(3);
      myObjRef.playTape();
      myObjRef.insertTape();
      myObjRef.playTape();
      myObjRef.removeTape();
      myObjRef.playStation(3);
    }//end main
  }//end class Radio02
  //===================================//
  
  class Radio{
    //This class simulates the plans from
    // which the radio object is created.
    protected double[] stationNumber = 
                           new double[5];
    protected boolean tapeIn = false;
    //---------------------------------//
    
    public void setStationNumber(
                  int index,double freq){
      stationNumber[index] = freq;
      System.out.println("Button " 
                + index + " programmed");
    }//end method setStationNumber
    //---------------------------------//
    
    public void playStation(int index){
      System.out.println("Play Radio");
      if(!tapeIn){
        System.out.println(
            "  Playing the station at " 
                 + stationNumber[index]
                 + " Mhz");
      }else{
        System.out.println(
              "  Remove the tape first");
      }//end if/else
    }//end method playStation
    
  }//end class Radio
  //===================================//
  
  class Combo extends Radio{
    
    public Combo(){//constructor
      System.out.println(
             "Combo object constructed");
    }//end constructor
    //---------------------------------//
    
    public void insertTape(){
      System.out.println("Insert Tape");
      tapeIn = true;
      System.out.println("  Tape is in");
      System.out.println(
                       "  Radio is off");
    }//end insertTape method
    //---------------------------------//
    
    public void removeTape(){
      System.out.println("Remove Tape");
      tapeIn = false;
      System.out.println(
                        "  Tape is out");
      System.out.println(
                        "  Radio is on");
    }//end removeTape method
    //---------------------------------//
    
    public void playTape(){
      System.out.println("Play Tape");
      if(!tapeIn){
        System.out.println(
              "  Insert the tape first");
      }else{
        System.out.println(
                    "  Tape is playing");
      }//end if/else
    }//end playTape
  }//end class combo