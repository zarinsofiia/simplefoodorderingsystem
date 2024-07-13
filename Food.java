
public class Food extends Menu
{
    private String foodChoice;
    
    Food()
    {
        super();
        foodChoice = null;
    }
    
    Food(int q, String fC)
    {
        super(q);
        foodChoice = fC;
    }
    
    public String getFoodChoice()
    {
        return foodChoice;
    }
    
    public void setFoodChoice(String fC)
    {
        foodChoice = fC;
    }
    
    public double calcPrice()
    {
        double totalPrice=0;
        double foodPrice=0;
            switch(foodChoice)
        {
            case "Beef Burger" :
                foodPrice= 5.50;
                totalPrice = foodPrice*quantity;
                break;
            case "Apple Pie" :
                foodPrice = 6.00;
                totalPrice = foodPrice*quantity;
                break;

            case "Hot Dogs" :
                foodPrice = 5.00;
                totalPrice = foodPrice*quantity;
                break;

            case "Sandwich" :
                foodPrice= 4.50;
                totalPrice = foodPrice*quantity;
                break;    
        }
        
        return totalPrice;
    }
    
    public String toString()
    {
        return super.toString() + "\n\t\tTotal Food Price: RM " + calcPrice(); 
    }  
}
