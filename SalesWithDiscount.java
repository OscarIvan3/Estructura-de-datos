public class SalesWithDiscount {
    public double totalWithDiscount() {
        double[] sales = {100.0, 200.0, 150.0, 300.0};
        double total = 0;
        
        for (double sale : sales) {
            total += sale * 0.9; 
        }
        
        return total;
    }
}