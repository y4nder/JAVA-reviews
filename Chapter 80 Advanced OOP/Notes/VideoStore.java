class Video{
    protected String title;
    protected int length;
    protected boolean avail;

    public Video(String ttl){
        title = ttl; length = 90; avail = true;
    }

    public Video(String ttl, int lngth){
        title = ttl; length = lngth; avail = true;
    }

    public String toString(){
        return title + ", " + length + " min. available: " + avail;
    }

    public String getTitle(){ return title; }
    public void setTitle(String ttl){ title = ttl; }

    public int getLength(){ return length; }
    public void setLength(int len){ length = len; }

    public boolean getAvailable(){ return avail; }
    public void setAvailable(boolean avl){ avail = avl; }
}

class Movie extends Video{
    private String director;
    private String rating;

    public Movie(String ttl, int len, String dir, String rting){
        super(ttl, len);
        director = dir;
        rating = rting;
    }

    public String getDirector(){ return director; }
    public String getRating(){ return rating; }

    public String toString(){
        return getTitle() + ", " + getLength() + " min. available " + getAvailable() + 
            " dir: " + director + " rating: " + rating; 
    }
}

public class VideoStore {
    public static void main(String[] args){
        Video item1 = new Video("Jaws", 120);
        Movie item2 = new Movie("Jaws", 120, "Spielberg", "PG");

        System.out.println(item1.toString());
        System.out.println(item2.toString());
    }
}
