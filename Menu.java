public abstract class Menu
{
    public double totalPrice;
    public int quantity;
    //default constructor
    public Menu()
    {
        quantity = 0;
       
    }
    //normal constructor
    public Menu( int q)
    {
        quantity = q;   
    }
    //accessor
    public int quantity() { return quantity; }
    
    public void setALL(int q)
    {
        quantity = q;
        
    }
    
    public String toString()
    {
       return "\t\tGENERATING...\n "; 
    }
    
    public abstract double calcPrice();
       
}
