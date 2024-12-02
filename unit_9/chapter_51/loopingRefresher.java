public class loopingRefresher {
    public static void main(String[] args) {
        for ( int counter = 0; counter < 10; counter ++ )
        {
            System.out.println("Counter; " + counter);
        }

        int sum = 0;
        for (int j = 0 ; j < 8 ; j++ )
        {
            sum = sum + j;
        }

        System.out.println(sum);
    }
    
}
