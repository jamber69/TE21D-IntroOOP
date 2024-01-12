public class Account {
    // Attributes
    private int money;
    private String name;
    private int accountNumber;
    private Customer owner;

    // Constructor
    public Account(int money, String name, int accountNumber, Customer owner){
        this.money = money;
        this.name = name;
        this.accountNumber = accountNumber;
        this.owner = owner;

    }

    // Methods
    public void transferMoney(Account receiver, int amount){
        receiver.money += amount;
        this.money -= amount;


    }

    private void test(){
        System.out.println("This is a private method");
    }

    // Getters & Setters
    public int getMoney(){
        return this.money;
    }

    public void setMoney(int money){
        if (money <0) {
            System.out.println("No negative sums!");
        }else{

            this.money = money;
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
