public class Hardware {
    public static void main(String []args){
        Item i = new Item("4343", "Circular saw", 122.50);
        Item k = new Item("9876", "Hammer", 19.75);
        Item l = new Item("1239", "Level", 12.99);
        System.out.println(i.getTotalPrice(2)+k.getTotalPrice(5)+l.getTotalPrice(12));
        System.out.println(i);
        System.out.println(k);
        System.out.println(l);
    }
}
