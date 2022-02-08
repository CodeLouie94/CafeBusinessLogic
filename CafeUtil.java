import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil{
    public int getStreakGoal(int weeks){
        int streakGoal = 0;
        for(int i =0; i <= weeks; i++){
            streakGoal += i;
        }
            return streakGoal;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i+ " " + menuItems.get(i));
        }
    }
    public double getOrderTotal(double[] prices){
        double sum = 0.0;
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
            sum += prices[i];
        }
        return sum;
    }
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }
    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        double count = price;
        for(int i = 0; i < maxQuantity; i++){
            System.out.println(i+1 + " - $" + price);
            count -= 0.50;
            // System.out.println(count);
            price += count;
        }
    }
}