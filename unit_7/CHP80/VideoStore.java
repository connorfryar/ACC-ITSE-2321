class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  // constructor
  public Video( String ttl, int lngth )
  {
    title = ttl; length = lngth; avail = true; 
  }

  public String toString()
  {
    return title + ", " + length + " min. available: " + avail ;
  }
  
  public String getTitle() { return title; }
  public void setTitle( String ttl ) { title = ttl; }
  public int getLength() { return length; }
  public void setLength( int lng ) { length = lng; }
  public boolean getAvailable() { return avail;}
  public void setAvailable( boolean avl ) { avail = avl;}
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

public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );
    Movie item3 = new Movie("moviemoviemovie", 120, "Connor", "G");

    System.out.println( item1.toString() );
    System.out.println( item2.toString() );     
    System.out.println( item3.toString() );
  }
}