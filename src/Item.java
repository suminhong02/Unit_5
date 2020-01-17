public class Item {
    private String number;
    private String description;
    private double price;
    public Item(String n, String d, double p){
        number = n;
        description = d;
        price = p;
        if(price<0){
            price = 0;
        }
    }
    public double getTotalPrice(int quantity){
        if(quantity<0){
            quantity = 0;
        }
        double total = price*quantity;
        return total;
    }

    public String toString(){
        return "Item: "+number+"\nPrice: $"+price+"\nDescription: "+description;
    }
}
