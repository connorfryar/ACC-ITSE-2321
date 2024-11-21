import java.util.Scanner;

abstract class Card {
    protected String recipient;
    public abstract void greeting();
}

class Holiday extends Card
{
    // constructor impilictly calls the no-argument constructor from abstract class Card
    public Holiday( String r ) 
    {
        recipient = r;
    }

    public void greeting()
    {
        System.out.println("Dear " + recipient + ",");
        System.out.println("Season's Greetings!\n");
    }
}

class Birthday extends Card
{
    private int age;

    public Birthday ( String r, int years )
    {
        recipient = r;
        age = years;
    }

    public void greeting()
    {        
        System.out.println("Dear " + recipient + ", \n");
        System.out.println("Happy " + age + "th Birthday\n\n");
    }
}

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
            System.out.print("X");
        System.out.println("\n");
    }
}


// public class CardTester
// {
//     public static void main( String[] args)
//     {
//         Holiday hol = new Holiday("Santa");
//         hol.greeting();
//     }
// }

// public class CardTester
// {
//     public static void main( String[] args)
//     {
//         Holiday card01 = new Holiday("Santa");
//         card01.greeting();

//         Holiday card02 = new Holiday("Tinkerbell");
//         card02.greeting();

//         Holiday card03 = new Holiday("Elvis");
//         card03.greeting();

//     }
// } 

// public class CardTester
// {
//     public static void main( String[] args)
//     {
//         Holiday card = new Holiday("Santa");
//         card.greeting();

//         card = new Holiday("Tinkerbell");
//         card.greeting();

//         card = new Holiday("Elvis");
//         card.greeting();

//     }
// } 

public class CardTester
{
    public static void main(String[] args) 
    {
        String me;
        Scanner input = new Scanner( System.in );
        System.out.print("Your name: ");
        me = input.next();
        
        Holiday hol = new Holiday( me );
        hol.greeting();

        Birthday bd = new Birthday( me, 28 );
        bd.greeting();

        Valentine val = new Valentine( me, 7);
        val.greeting();
    }
}