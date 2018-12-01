package CardboardBox;

public abstract class Box {
    
    protected double boxLength, boxWidth, boxHeight, boxPrice, basePrice;
    protected boolean boxReinforcedCorners, boxSealableTop, boxReinforcedBottom;
    protected String boxGrade, boxColours;
    
    public double getBoxArea(){
        return boxLength * boxHeight * boxWidth;
    }
    
    public double getPrice(){
        double price = basePrice * getBoxArea();
        if(boxSealableTop){
            price*=1.1;
        }
        if("1 Colour".equals(boxColours)){
            price*=1.12;
        } else if ("2 Colours".equals(boxColours)){
            price*=1.15;
        }
        if(boxReinforcedBottom){
            price*=1.13;
        }
        if(boxReinforcedCorners){
            price*=1.12;
        }
        return price;
    }
    public String getInfo(){
            return "";
    }
}
