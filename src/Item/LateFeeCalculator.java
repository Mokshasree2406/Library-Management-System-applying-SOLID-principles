package Item;

public class LateFeeCalculator {
    public int totalLateFee(LateFeeCalculate items[] , int days){
        int totalFee = 0;
        for(LateFeeCalculate item : items){
            totalFee += item.calculateLateFee(days);
        }
        return totalFee;
    }
}
