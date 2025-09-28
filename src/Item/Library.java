package Item;

public class Library {
    private LibraryItem[] items;
    public Library(LibraryItem[] items){
        this.items = items;
    }
    public  double calaculateTotalValue(){
        double totalValue =0;
        for(LibraryItem item : items){
            totalValue += item.getValue();
        }
        return totalValue;
    }
}


