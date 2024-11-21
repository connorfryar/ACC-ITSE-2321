public class Proj08Runner {
    private static final String honorString = "I certify that this program is my own work\n" +
                "and is not the work of others. I agree not\n" + 
                "to share my solution with others.";

    private static final String myName = "Andrew Connor Fryar\n";

    public Proj08Runner(){
        System.out.println("=======This line is required in the output.=======");
        System.out.println("=======This line is required in the output.=======");
        System.out.println("=======This line is required in the output.=======");
    }

    static String run(String cert) {
        if ( "certification".equals(cert) ) {
            return honorString;
        }
        return "invalid input";
    }

    static String run(int i, String name) {
        return myName;
    }

    public byte run(int number) {
        return (byte) number; // Cast the number to byte
    }


}
    