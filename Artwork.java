public class Artwork extends ArtItem {

    private int YearCreated;
    private Artist artist;

    public Artwork(String title, int YearCreated, Artist artist, double price) {
        super(title, price); // abstraction + inheritance
        this.YearCreated = YearCreated;
        this.artist = artist;
    }

    public int getYearCreated() {
        return YearCreated;
    }

    public void setYearCreated(int YearCreated) {
        this.YearCreated = YearCreated;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public void displayInfo() {
        System.out.println("Artwork: " + title + " (" + YearCreated + ")");
        System.out.println("Price: $" + price);
        System.out.println("By: " + artist.getName());
    }

    public boolean isMoreExpensiveThan(Artwork other) {
        return this.price > other.price;
    }

    @Override
    public String toString() {
        return title + " (" + YearCreated + ") - $" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Artwork)) return false;
        Artwork a = (Artwork) o;
        return YearCreated == a.YearCreated && title.equals(a.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + YearCreated;
    }
}



