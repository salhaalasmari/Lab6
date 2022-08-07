public class Invoice {

    private Customer2 Customer;
    private  int idInvoice;
    private double amount;

    public  Invoice(int id, String name, int discount , int idInvoice , double amount){
        this.Customer = new Customer2(id , name , discount);
        this.idInvoice=idInvoice;
        this.amount=amount;
    }


    public int getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(int idInvoice) {
        this.idInvoice = idInvoice;
    }

    public Customer2 getCustomer() {
        return Customer;
    }

    public void setCustomer(Customer2 customer) {
      this.Customer = customer;
    }

    public double getAmount() {
        return amount;
    }
   public int getCustomerID(){
        return  this.Customer.getId();
   }
   public int getCustomerDiscount(){
        return this.Customer.getDiscount();
   }
   public String getCustomerName(){
        return this.Customer.getName();
   }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public  double getAmountAfterDiscount(){
        return this.amount -=this.amount * getCustomerDiscount()/100;

    }
}
