import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Artwork> artworks = new ArrayList<>();

        // Predefined artist
        Artist artist = new Artist("Vincent van Gogh", 1853, "Dutch");

        // USER INPUT (Scanner)
        System.out.print("Enter artwork title: ");
        String title = sc.nextLine();

        System.out.print("Enter year created: ");
        int year = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        artworks.add(new Artwork(title, year, artist, price));

        artworks.add(new Artwork("Guernica", 1937,
                new Artist("Pablo Picasso", 1881, "Spanish"), 190000));

        // POLYMORPHISM
        for (ArtItem item : artworks) {
            item.displayInfo();
            System.out.println();
        }

        // SEARCHING
        System.out.println("Searching for 'Guernica':");
        for (Artwork a : artworks) {
            if (a.getTitle().equalsIgnoreCase("Guernica")) {
                System.out.println(a);
            }
        }

        // FILTERING
        System.out.println("Artworks more expensive than 160000:");
        for (Artwork a : artworks) {
            if (a.getPrice() > 160000) {
                System.out.println(a);
            }
        }

        // SORTING
        artworks.sort(Comparator.comparingDouble(Artwork::getPrice));

        System.out.println("Sorted by price:");
        for (Artwork a : artworks) {
            System.out.println(a);
        }
    }
}
