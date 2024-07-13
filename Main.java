import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        //Welcome dialog
        ImageIcon icon = new ImageIcon("restaurant.jpg");
        Image image = icon.getImage();  
        Image newimg = image.getScaledInstance(120, 100,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
    
        String[] cont = {"Continue"};
        JOptionPane.showOptionDialog
        (null, 
        "WELCOME TO OUR RESTAURANT", 
        "OUR LITTLE RESTAURANT :)", 
        JOptionPane.YES_OPTION, 
        JOptionPane.INFORMATION_MESSAGE, 
        icon, 
        cont, 
        0);
        
        //Choose food dialog
        ImageIcon icon2 = new ImageIcon("hungry.jpg");
        Image image2 = icon2.getImage();  
        Image newimg2 = image2.getScaledInstance(180, 180,  java.awt.Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newimg2);
       
        String foodList[] = {"Beef Burger", "Apple Pie", "Hot Dogs", "Sandwich"};
        String foodChoice = (String)JOptionPane.showInputDialog
        (null, "Which Food Would You Like To Order?" + 
        "\nBeef Burger : RM5.50" + "\nApple Pie : RM6.00" + "\nHot Dogs: RM5.00" + "\nSandwich : RM 4.50", 
        "HUNGRY???",
        JOptionPane.QUESTION_MESSAGE, icon2, foodList, foodList[0]);
        
        //Enter quantity of food
        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity: "));
        Food food = new Food(quantity, foodChoice);
        double totalFood = food.calcPrice();
        String option[] = {"ORDER DRINK"};
        JOptionPane.showOptionDialog(null,food.toString(), "FOOD SUBPRICES", 
        JOptionPane.YES_OPTION,JOptionPane.ERROR_MESSAGE, icon,option, 0);
        
        
        //Choose drink dialog
        ImageIcon icon3 = new ImageIcon("juice.jpg");
        Image image3 = icon3.getImage(); 
        Image newimg3 = image3.getScaledInstance(180, 180,  java.awt.Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(newimg3);
        
        String drinkList[] ={"Coca Cola", "Milkshake", "Americano", "Lemonade"};
        String drinkChoice = (String)JOptionPane.showInputDialog
        (null, "Which Drink Would You Like To Order?" + 
        "\nCoca Cola : RM4.00" + "\nMilkshake : RM9.50"  + "\nAmericano : RM8.50" + "\nLemonade : RM6.50",
        "THIRSTY???",
        JOptionPane.QUESTION_MESSAGE, icon3, drinkList,  drinkList[0]);
        
        
        //Enter quantity of drink
        quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter quantity: "));
        Drink drink = new Drink(quantity, drinkChoice);
        double totalDrink = drink.calcPrice();
        JOptionPane.showOptionDialog(null, drink.toString(), "DRINK SUBPRICES", 
        JOptionPane.YES_OPTION,JOptionPane.INFORMATION_MESSAGE, icon,cont, 0);
        
        //Generate receipt dialog
        ImageIcon icon7 = new ImageIcon("receipt.png");
        Image image7 = icon7.getImage();   
        Image newimg7 = image7.getScaledInstance(180, 120,  java.awt.Image.SCALE_SMOOTH);
        icon7 = new ImageIcon(newimg7);
        
        double totalBill;
        totalBill = food.calcPrice() + drink.calcPrice();
        String[] pay = {"PAY"};
        JOptionPane.showOptionDialog(null, "Food ordered: " + foodChoice + "\nFood Prices : RM " +totalFood 
                                        +"\nDrink Ordered: " + drinkChoice + "\nDrink Prices: RM " + totalDrink
                                         +"\nTotal bill: RM "+ totalBill,
                                        "RECEIPT",JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, icon7, pay ,0);
        
        //Choose payment method
        ImageIcon icon4 = new ImageIcon("pay.jpg");
        Image image4 = icon4.getImage(); //  
        Image newimg4 = image4.getScaledInstance(180, 120,  java.awt.Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(newimg4);
        String payment[] = { "Online Banking", "Cash"};
        String paymentType = (String)JOptionPane.showInputDialog
        (null, "Choose Payment Type", "PAYMENT METHOD ", JOptionPane.QUESTION_MESSAGE, icon4, payment, payment[0]);
        
        ImageIcon icon5 = new ImageIcon("fpx.png");
        Image image5 = icon5.getImage(); //  
        Image newimg5 = image5.getScaledInstance(180, 120,  java.awt.Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(newimg5);
        
        ImageIcon icon6 = new ImageIcon("cash.png");
        Image image6 = icon6.getImage(); //  
        Image newimg6 = image6.getScaledInstance(120,90,  java.awt.Image.SCALE_SMOOTH);
        icon6 = new ImageIcon(newimg6);
        String exit[] = {"Exit"};
        switch (paymentType)
        {
            case "Online Banking" :
                JOptionPane.showOptionDialog(null, "PAYMENT METHOD : "+paymentType, "PAYMENT",
                JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, icon5, exit,0);
                break;
            case "Cash" :
                JOptionPane.showOptionDialog(null, "PAYMENT METHOD : " + paymentType, "PAYMENT",
                JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, icon6, exit ,0);
        }
        
        //Thank you dialog
        ImageIcon icon8 = new ImageIcon("love.png");
        Image image8 = icon8.getImage(); //  
        Image newimg8 = image8.getScaledInstance(120, 90,  java.awt.Image.SCALE_SMOOTH);
        icon8 = new ImageIcon(newimg8);
        String[] goodbye = {"GOOD BYE ><"};
        JOptionPane.showOptionDialog(null, "THANK YOU FOR BUYING FROM US! \nCOME AGAIN <3.\n", "HAVE A GOOD DAY :)",
                JOptionPane.YES_OPTION, JOptionPane.INFORMATION_MESSAGE, icon8, goodbye ,0);
    }
}
