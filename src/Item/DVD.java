package Item;

public class DVD implements LibraryItem {
    private String title;
    private String artist;
    private String uniqueId;
    private double value;
    public DVD(String title , String uniqueId , String artist , double value){
        this.title = title;
        this.uniqueId = uniqueId;
        this.artist = artist;
        this.value = value;
    }
    public String getTitle(){
        return this.title;
    }
    public String getUniqueId(){
        return this.uniqueId;
    }

    public int calculateLateFee(int days){
        return days*30;
    }

    public double getValue(){
        return this.value;
    }
}