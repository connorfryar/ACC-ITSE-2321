// interface I1 {
//     public void p();
// } // end interface I1

// interface I2 extends I1 {
//     public void q();
//     // allowed in interfaces
//     // Methods, which are implicitly abstract
//     // Variables, which are implicitly constant (final)
//     // newer versions of java allow for default methods and private interface methods
// } // end interface I2

// // interfaces can not be instantiated




// class A extends Object {
//     public String toString() // overridden toString
//     {
//         return "toString in A";
//     }// end toString
//     public String x()
//     {
//         return "x in A";
//     }// end x()
// }

// class B extends A implements I2 {
//     public void p(){} // end p()

//     public void q(){} // end q()
// } // end of class B

// class C extends Object implements I2{
//     public void p(){};
//     public void q(){};
// }// end of class C with concrete definitions of methods created in interfaces.

// public class Poly05{
//     public static void main(String[] args){
//     }// end of main
// } // end of class Poly05


/*File Poly05.java
Copyright, R.G.Baldwin
**************************************/

interface I1{
    public void p();
  }//end interface I1
  //===================================//
  
  interface I2 extends I1{
    public void q();
  }//end interface I2
  //===================================//
  
  class A extends Object{
    public String toString(){
      return "toString in A";
    }//end toString()
    //---------------------------------//
    
    public String x(){
      return "x in A";
    }//end x()
    //---------------------------------//
  }//end class A
  //===================================//
  
  class B extends A implements I2{
    public void p(){
    }//end p()
    //---------------------------------//
    
    public void q(){
    }//end q();
    //---------------------------------//
  }//end class B
  //===================================//
  
  class C extends Object implements I2{
    public void p(){
    }//end p()
    //---------------------------------//
    
    public void q(){
    }//end q();
    //---------------------------------//
  }//end class B
  //===================================//
  
  public class Poly05{
    public static void main(String[] args){
    }//end main
  }//end class Poly05