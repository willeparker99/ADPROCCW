package CardboardBox;
/**
 * Box 3 requirements.
 */

public class Box3 extends Box {
    
    public Box3(double Length, double Width, double Height, String grade, boolean sealableTop){
            super.boxLength = Length;
            super.boxWidth = Width;
            super.boxHeight = Height;
            super.boxGrade = grade;
            super.boxColours = "2 Colours";
            super.boxSealableTop = sealableTop;
            super.boxReinforcedBottom = false;
            super.boxReinforcedCorners = false;
            super.basePrice = 0.82;
    }
    /**
    *return information on Box 3.
    */
    @Override
    public String getInfo(){
        return "Type 3 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}
