/**
*   <h1>Box</h1>
*   <p>Abstract box class used to format box types 1 through 5</p>
*/

package CardboardBox;

import java.text.DecimalFormat;

public abstract class Box {
    
    protected double boxLength, boxWidth, boxHeight, basePrice;
    protected boolean boxReinforcedCorners, boxSealableTop, boxReinforcedBottom;
    protected String boxGrade, boxColours;
    /// This method is to get the total area of a box based on its length, width and height.
    /// @param None
    /// @return Returns the total area of the box
    public double getBoxArea(){
        return boxLength * boxHeight * boxWidth;
    }
    /// This method is to get the surface area of a box based on its length, width and height.
    /// @param None
    /// @return Returns the surface area of the box
    public double getBoxSurfaceArea(){
        return basePrice * ((boxLength * boxWidth * 2) + (boxWidth * boxHeight * 4));
    }
    /// This method is to get the price of a box based on the parameters parsed.
    /// @param None
    /// @return Returns the price of the box based on the parameters of the sub class
    public double getPrice(){
        double pricebasic = getBoxSurfaceArea();
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
        DecimalFormat df = new DecimalFormat("#.##");
        String priceTotalString = df.format(priceTotal);
        priceTotal = Double.parseDouble(priceTotalString);
        return priceTotal;
    }
    /// This method must be overwritten
    /// @param None
    /// @return Returns the info of the box
    public String getInfo(){
            return "";
    }
}
