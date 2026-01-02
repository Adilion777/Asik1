public class Artist {
    private String name;
    private int birthYear;
    private String nationality;

    public Artist(String name, int birthYear, String nationality) {
        this.name = name;
        this.birthYear = birthYear;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getNationality() {
        return nationality;
    }

    public void displayInfo() {
        System.out.println("Artist: " + name +
                ", Born: " + birthYear +
                ", Nationality: " + nationality);
    }
}
