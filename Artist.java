public class Artist {
    private String name;
    private int BirthYear;
    private String nationality;

    public Artist(String name, int BirthYear,String nationality){
        this.name = name;
        this.BirthYear = BirthYear;
        this.nationality = nationality;


    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getBirthYear(){
        return BirthYear;
    }
    public void setBirthYear(int BirthYear){
        this.BirthYear = BirthYear;
    }
    public String getNationality (){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;

    }

    public void DisplayInfo(){
        System.out.println("Artist"+ name + "born in" + BirthYear + "Nationality" + nationality);
    }

}
