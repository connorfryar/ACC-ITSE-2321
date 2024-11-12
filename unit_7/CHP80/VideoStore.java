class Video
{
  protected String  title;    // name of the item
  protected int     length;   // number of minutes
  protected boolean avail;    // is the video in the store?
  // able to add items later and effect all children
  protected int   price;    // retroactive addition

  // private String  title;    // name of the item
  // private int     length;   // number of minutes
  // private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; price = 0; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; price = 0;
  }
  
   // constructor
   public Video( String ttl, int lngth, int pr )
   {
     title = ttl; length = lngth; avail = true; price = pr;
   }

  public String toString()
  {
    return title + ", " + length + " min. available: " + avail + " price: " + price;
  }
  
  public String getTitle() { return title; }
  public void setTitle( String ttl ) { title = ttl; }
  public int getLength() { return length; }
  public void setLength( int lng ) { length = lng; }
  public boolean getAvailable() { return avail;}
  public void setAvailable( boolean avl ) { avail = avl;}
  public int getPrice() { return price;}
  public void setPrice(int prce) {price = prce;}
}

class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // G, PG, R, or X

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );      // use the base class's constructor to initialize members inherited from it
    director = dir;           // initialize what's new to Movie
    rating = rtng;      
  }
  // If the members of the superclass are protected 
  // and you do not want to inherit all actions made in
  // super.toString()
  // public String toString()
  // {
  //   return "Title: " + title  + ", length; " + length + " min. available: " + avail +
  //    " dir: " + director + " rating: " + rating;
  // }

  //If accessing private members of the superclass
  public String toString()
  {
    return super.toString() + " dir: " + director + " rating: " + rating; 
  }

  // w/o using super()
  // public String toString()
  // {
  //   return getTitle() + ", " + getLength() + " min. available:" + getAvailable() +
  //   " dir: " + director + " rating: " + rating;
  // }

  public String getDirector() { return director; }
  public String getRating() { return rating; }
}  

class MusicVideo extends Video
{
  private String artist;
  private String category;
 
  // constructor
  public MusicVideo ( String ttl, int len, String art, String cat )
  {
    super( ttl, len );
    artist   = art;
    category = cat;
  }
  
  public String toString()
  {
    return super.toString() +  "artist:" + artist + " style: " + category ;
  }
  
  // Setters and Getters
  public String  getArtist() { return artist; }
  public String  getCategory() { return category; }
}

public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );
    Movie item3 = new Movie("moviemoviemovie", 120, "Connor", "G");
    MusicVideo item4 = new MusicVideo("connors Jams", 10, "Allison W", "Fusion");

    System.out.println( item1.toString() );
    System.out.println( item2.toString() );     
    System.out.println( item3.toString() );
    System.out.println( item4.toString() );
  }
}