
package vending.machine;
import java.util.Scanner ;

public class VendingMachine {

    
    public static void main(String[] args) {
     System.out.println("Welcome! To my humble shop! \n");
     int Items = displayMenu( ) ;
     int Price = priceCheck(Items) ;
     int change = insertMoney(Price) ;
     recieveChange(change) ;
    }
    
    public static int displayMenu( ) {
        Scanner select = new Scanner(System.in) ;
        
        int user_select = 0 ;
        System.out.println("Please select an item"
                                         + "\n1 : CocaCola - $ 13 "
                                         + "\n2 : Lays Potato Chips - $ 11 "
                                         + "\n3 : Sprite - $ 10 "
                                         + "\n4 : Bar-One Chocolate - $ 7 "
                                         + "\n5 : Iced Coffee - $ 15 "
                                         + "\n6 : Exit ");
        
        user_select = select.nextInt( );
        return user_select ;
    }
    
    public static int priceCheck(int menuSelect) {
        
        if (menuSelect == 1)
            return 13 ;
        if (menuSelect == 2)
            return 11 ;
        if (menuSelect == 3)
            return 10 ;
        if (menuSelect == 4)
            return 7 ;
        if (menuSelect == 5)
            return 15;
        else return 0 ;
    }
    
    public static int insertMoney(int Price) {
        Scanner insert = new Scanner(System.in) ;
        
        int money = 0 ;
        System.out.println("The item you selected costs : $" + Price + " Please insert the required amount ") ;
        money = insert.nextInt( ) ;
        
        while (money < Price) {
            System.out.println("Please insert the remaing amount") ;
            money = money + insert.nextInt( );
            
        }
        return money - Price ;
    }
    
    public static void recieveChange(int change) {
        int quarters = 0 ;
        int dimes = 0 ;
        int nickels = 0 ;
        
        while (change >= 25) {
            quarters = quarters + 1 ;
            change = change - 25 ;
        }
        
        while (change >= 10) {
            dimes = dimes + 1 ;
            change = change - 10 ;
        }
        
        while (change >= 5) {
            nickels = nickels + 1 ;
            change = change - 5 ;
        }
        
        System.out.println("\nPlease accept your change: \n" + change);

        
    }
}
