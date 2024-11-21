class Valentine extends Card
{
    private int kisses;

    public Valentine ( String r, int k)
    {
        recipient = r;
        kisses = k;
    }

    public void greeting()
    {
        System.out.println("Dear " + recipient + ","); 
        System.out.println("Love and Kisses");
        for ( int j=0; j<kisses; j++ )
            System.out.println("X");
        System.out.println("\n");
    }
}
