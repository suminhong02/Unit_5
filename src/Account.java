public class Account {
    private String first;
    private String last;
    private int acctNum;
    private double balance;

    public Account(String first, String last, double balance){
        acctNum = (int)(Math.random()*999)+1;
        this.first = first;
        this.last = last;
        this.balance = balance;
    }
    public Account(Account account){
        this(account.first,account.last,account.balance);
    }

    public Account(){
        this("","",0);
    }

    public String getFirst(){
        return first;
    }
    public String getLast(){
        return last;
    }
    public void setFirst(String first){
        this.first = first;
    }
    public void setLast(String last){
        this.last = last;
    }
    public int getAcctNum(){
        return acctNum;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdrawal(double amount){
        if(balance-amount>=0){
                balance-=amount;
                return true;
        }
        else return false;
    }

    public  String toString(){
        return "Customer Name: "+first+" "+last+"\n"+
                "Account #: "+acctNum+"\n"+
                "Current Balance: $"+balance;
    }
}
