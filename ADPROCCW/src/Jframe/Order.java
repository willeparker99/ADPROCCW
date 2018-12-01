package adproccw;

import CardboardBox.Box;

public class Order {
    
    private Box orderBox;
    private int orderQuantity;
    
    public Order(Box box, int quantity){
        orderBox = box;
        orderQuantity = quantity;
        
    }
    
    
    public void setBox(Box box){
        orderBox = box;
    }
    
    public void setQuantity(int quantity){
        orderQuantity = quantity;
    }
    
    public Box getBox(){
        return orderBox;
    }
    
    public double getPipePrice(){
        return orderBox.getPrice();
    }
    
    
    public double getOrderPrice(){
        double sum = orderBox.getPrice() * orderQuantity;
        return(sum);
        
    }
    
    
    
}
