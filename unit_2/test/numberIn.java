public class numberIn {
    public static void main(String[] args) {
        int firstArg = 0; // Initialize with a default value
        if (args.length > 0) {
            try {
                firstArg = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument '" + args[1] + "' must be an integer.");
                System.exit(1);
            }
        } else {
            System.out.println("No argument provided.");
            System.exit(1);
        }
        System.out.println("First argument: " + firstArg);
    }
}

