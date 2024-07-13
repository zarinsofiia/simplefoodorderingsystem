
public class Drink extends Menu
{
    private String drinkChoice;
    
    Drink()
    {
        super();
        drinkChoice = null;
    }
    
    Drink(int q, String dC)
    {
        super(q);
        drinkChoice = dC;
    }
    
    public String getDrinkChoice()
    {
        return drinkChoice;
    }
    
    public void setDrinkChoice(String dC)
    {
        drinkChoice = dC;
    }
        
   
    public double calcPrice()
    {
        double totalPrice=0;
        double drinkPrice=0;
        switch(drinkChoice)
        {
            case "Coca Cola" :
                drinkPrice = 4.00;
                totalPrice = drinkPrice*quantity;
                break;
            
            case "Milkshake" :
                drinkPrice = 9.50;
                totalPrice = drinkPrice*quantity;
                break;

            case "Americano" :
                drinkPrice= 8.50;
                totalPrice = drinkPrice*quantity;
                break;

            case "Lemonade" :
                drinkPrice= 6.50;
                totalPrice = drinkPrice*quantity;
                break; 
        }
        return totalPrice;
    }
    
    public String toString()
    {
        return super.toString() + "\n\t\tTotal Drink Price: RM " + calcPrice();
        
    }
}
