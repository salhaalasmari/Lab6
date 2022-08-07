public class Account {
    private  customer customer;
     private  String id , name ;
     private  int balance =0;

     public Account(int ID, String name, char geneder ,String id , int balance ){
         this.customer = new customer(ID , name , geneder);
         this.id = id;
         this.balance= balance;
     }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public  Account(String id , String name){
        this.id=id;
        this.name=name;

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit (int amount){
        return balance+=amount;
    }
    public int debit(int amount){
        if( amount <= balance)
            return amount-balance;
        else
            System.out.println("the amount not less than ot equal balance");
            return 0;
    }
    public int transferto(Account anothor , int amount ){

        if( amount <= balance) {
            anothor.credit(amount);
        }
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
