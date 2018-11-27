
/*
* What I have currently, is this class in addition to an order class?
*/
package cardboardbox;


public class CardboardBox {

    double width, length, height, cost;
    int quantity, grade;
    boolean sealableTop;
    
    public CardboardBox(double bwidth, double blength, double bheight, int bquantity, int bgrade, boolean hassealableTop){
        width = bwidth;
        length = blength;
        height = bheight;
        quantity = bquantity;
        grade = bgrade;
        sealableTop = hassealableTop;
    }
    
    public CardboardBox(double bwidth, double blength, double bheight, int bquantity, int bgrade, boolean hassealableTop, int colour){
        width = bwidth;
        length = blength;
        height = bheight;
        quantity = bquantity;
        grade = bgrade;
        sealableTop = hassealableTop;
    }
    
    public CardboardBox(double bwidth, double blength, double bheight, int bquantity, int bgrade, boolean hassealableTop, int colour, boolean reinforcedBottom, boolean reinforcedCorner){
        width = bwidth;
        length = blength;
        height = bheight;
        quantity = bquantity;
        grade = bgrade;
        sealableTop = hassealableTop;
    }
    
    
    public double area(){
        double area;
        area = width * length * height;
        return area;
    }
    
    
    public double pricePoint(){
        switch(grade){
            case 1: return 0.55;
            case 2: return 0.65;
            case 3: return 0.82;
            case 4: return 0.98;
            case 5: return 1.50;
            default: return 0.0;
        }
    }
    
    public double basicCost(){
        double price;
        price = (area() * pricePoint());
        return price;
    }
        
        
    
    
}
