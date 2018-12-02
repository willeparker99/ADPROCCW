package CardboardBox;

import java.text.DecimalFormat;

public abstract class Box {
    
    protected double boxLength, boxWidth, boxHeight, boxPrice, basePrice;
    protected boolean boxReinforcedCorners, boxSealableTop, boxReinforcedBottom;
    protected String boxGrade, boxColours;
    
    public double getBoxArea(){
        return boxLength * boxHeight * boxWidth;
    }
    
    public double getPrice(){
        double pricebasic = basePrice * ((boxLength * boxWidth * 4) + (boxLength * boxHeight * 2));
        double priceTotal = pricebasic;
        
        if(boxSealableTop){
            priceTotal += pricebasic*1.1;
        }
        if("1 Colour".equals(boxColours)){
            priceTotal += pricebasic*1.12;
        } else if ("2 Colours".equals(boxColours)){
            priceTotal += pricebasic*1.15;
        }
        if(boxReinforcedBottom){
            priceTotal += pricebasic*1.13;
        }
        if(boxReinforcedCorners){
            priceTotal += pricebasic*1.12;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        String priceTotalString = df.format(priceTotal);
        priceTotal = Double.parseDouble(priceTotalString);
        return priceTotal;
    }
    public String getInfo(){
            return "";
    }
}
