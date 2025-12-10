import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Artist artist1 = new Artist("Vincent van Gogh", 1853, "Dutch");
        Artist artist2 = new Artist("Pablo Picasso", 1881,"Spanish");

        Artwork artwork1 = new Artwork("Starry Night", 1889,artist1, 150000.0);
        Artwork artwork2 = new Artwork("Guernica", 1937,artist2, 190000.0);

        ArtGallery gallery = new ArtGallery("World Art Museum", "Paris");

        gallery.displayGallery();
        System.out.println("-----------------------------");

        artwork1.displayArtwork();
        System.out.println();
        artwork2.displayArtwork();
        System.out.println("-----------------------------");

        if(artwork1.isMoreExpensiveThan(artwork2)) {
            System.out.println(artwork1.getTitle() + "is more expensive than" + artwork2.getTitle());
        }
        else {
            System.out.println(artwork2.getTitle() + " is more expensive than " + artwork1.getTitle());
        }
    }
}
