interface I1 {
    public void p();
}// end interface I1

interface I2 extends I1 {
    public void q();
}// end interface I2

class A extends Object {
    public String toString(){
        return "toString in A";
    }//end toString

    public String x(){
        return "x in A";
    }//end x
}//end class A


class B extends A implements I2 {
    public void p(){
        System.out.println("p in B");
    }//end p()

    public void q(){
        System.out.println("q in B");
    }//end q()
}//end class B

class C extends Object implements I2 {
    public void p(){
        System.out.println("p in C");
    }// end p()

    public void q(){
        System.out.println("q in C");
    }//end q
}//end class C

public class Poly06{
    public static void main(String[] args){
        I1 var1 = new B();
        System.out.println("I1 var1 = new B();\n");
        var1.p();//OK

        I2 var2 = new B();
        System.out.println("I2 var2 = new B();\n");
        var2.p();
        var2.q();

        B var3 = new B();
        System.out.println("B var3 = new B();\n");
        var3.p();
        var3.q();

        String var4 = var3.x();
        System.out.println(var4);

        String var5 = ((A)var2).x(); 
        // WTF Type I2 no access to A.. "type conversion" allows to reach ((A)var2).x
        // black magic;
        System.out.println(var5);

        String var6 = var2.toString(); // var2 type I2 no connection to Object.toString()
        System.out.println(var6);

        var2 = new C();
        var2.p();
        var2.q();
    }
}