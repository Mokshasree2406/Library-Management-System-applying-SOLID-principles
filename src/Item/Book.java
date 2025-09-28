package Item;

public class Book implements LibraryItem {
    private String title;
    private String author;
    private String uniqueId;
    private double value;
    public Book(String title , String uniqueId , String author , double value){
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }
    public String getTitle(){
        return this.title;
    }
    public String getUniqueId(){
        return this.uniqueId;
    }

    public int calculateLateFee(int days){
        return days*10;
    }

    public double getValue(){
        return this.value;
    }
}
