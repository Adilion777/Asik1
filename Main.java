import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Artwork> artworks = new ArrayList<>();

        /* Artwork Info */
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter year created: ");
        int year = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // ⚠️ ОБЯЗАТЕЛЬНО — очистка Scanner

        /* Entering Artist info */
        System.out.print("Enter artist name: ");
        String artistName = sc.nextLine();

        System.out.print("Enter artist birth year: ");
        int birthYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter artist nationality: ");
        String nationality = sc.nextLine();

        Artist artist = new Artist(artistName, birthYear, nationality);

        /* Entering Gallery info */
        System.out.print("Enter gallery name: ");
        String galleryName = sc.nextLine();

        System.out.print("Enter gallery location: ");
        String galleryLocation = sc.nextLine();

        ArtGallery gallery = new ArtGallery(galleryName, galleryLocation);
        GalleryDAO galleryDAO = new GalleryDAO();
        int galleryId = galleryDAO.addGallery(gallery);

        /* Creating Artwork */
        Artwork artwork = new Artwork(title, year, artist, price);
        artworks.add(artwork);

        // Пример второго объекта (как раньше)
        artworks.add(new Artwork(
                "Guernica",
                1937,
                new Artist("Pablo Picasso", 1881, "Spanish"),
                190000
        ));

        /* Savin data in DB */
        ArtistDAO artistDAO = new ArtistDAO();
        ArtworkDAO artworkDAO = new ArtworkDAO();

        int artistId = artistDAO.addArtist(artist);
        artworkDAO.addArtwork(artwork, artistId);

        System.out.println("\n✔ Artwork saved to database!\n");

        /* Polymorphism */
        for (ArtItem item : artworks) {
            item.displayInfo();
            System.out.println();
        }

        /* Searching */
        System.out.println("Searching for 'Guernica':");
        for (Artwork a : artworks) {
            if (a.getTitle().equalsIgnoreCase("Guernica")) {
                System.out.println(a);
            }
        }

        /* Filtration */
        System.out.println("Artworks more expensive than 160000:");
        for (Artwork a : artworks) {
            if (a.getPrice() > 160000) {
                System.out.println(a);
            }
        }

        /* sorting */
        artworks.sort(Comparator.comparingDouble(Artwork::getPrice));

        System.out.println("Sorted by price:");
        for (Artwork a : artworks) {
            System.out.println(a);
        }


        System.out.println();
        gallery.displayGallery();
    }
}
