package CardboardBox;
/**
 * Box 4 requirements.
 */

public class Box4 extends Box {
    
    public Box4(double Length, double Width, double Height, String grade, boolean sealableTop){
            super.boxLength = Length;
            super.boxWidth = Width;
            super.boxHeight = Height;
            super.boxGrade = grade;
            super.boxColours = "2 Colours";
            super.boxSealableTop = sealableTop;
            super.boxReinforcedBottom = true;
            super.boxReinforcedCorners = false;
            super.basePrice = 0.98;
    }
    /**
    *Returns information on Box 4.
    */
    @Override
    public String getInfo(){
        return "Type 4 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}
