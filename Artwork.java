public class Artwork {
    private String title;
    private int YearCreated;
    private Artist artist;
    private double price;
    public Artwork(String title,int YearCreated,Artist artist,double price){
        this.title = title;
        this.YearCreated = YearCreated;
        this.artist = artist;
        this.price = price;
}
public String getTitle(){
        return title;
}
public void setTitle(String title){
        this.title= title;
}
public int getYearCreated(){
        return YearCreated;
}
public void setYearCreated(int YearCreated){
        this.YearCreated = YearCreated;
}
public Artist getArtist(){
        return artist;
}
public void setArtist(Artist artist){
        this.artist = artist;
}
public double getPrice(){
        return price;
}
public void setPrice(double price){
        this.price = price;
}

public void displayArtwork(){
        System.out.println("Artwork:"+ title + " (" + YearCreated + ")");
        System.out.println("Price: $" + price );
    System.out.println("By:" + artist.getName());


}

public boolean isMoreExpensiveThan(Artwork other){
        return this.price > other.price;
}

}
