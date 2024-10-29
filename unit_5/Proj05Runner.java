// Proj05Runner.java
public class Proj05Runner {
    static String name = "Andrew Connor Fryar";

    public static String runA(String strA) {
        return strA + name;
    }
    public static StringBuffer runB(StringBuffer strBufA) {
        return strBufA.append(String.format(" %s", name));
    }
}