public class ArtGallery {
    public String galleryName;
    public String galleryLocation;

    public ArtGallery(String galleryName, String galleryLocation){
        this.galleryName = galleryName;
        this.galleryLocation = galleryLocation;
    }
        public String getGalleryName(){
        return galleryName;
        }
        public void setGalleryName(String galleryName){
        this.galleryName = galleryName;
        }
        public String getGalleryLocation(){
        return galleryLocation;
        }
        public void setGalleryLocation(String galleryLocation){
        this.galleryLocation = galleryLocation;
        }
        public void displayGallery(){
            System.out.println("Gallery: "+ galleryName + " | Located in:" + galleryLocation);

        }
}


