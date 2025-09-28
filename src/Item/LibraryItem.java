package Item;

//Single responsibility principle
public interface LibraryItem extends LateFeeCalculate {
    String getTitle();
    String getUniqueId();
    double getValue();

}
