public abstract class ArtItem {

    protected String title;
    protected double price;

    public ArtItem(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void displayInfo();
}
