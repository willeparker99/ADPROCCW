package CardboardBox;
/**
 * Box 2 requirements.
 */
public class Box2 extends Box {
    
    public Box2 (double Length, double Width, double Height, String grade, boolean sealableTop){
            super.boxLength = Length;
            super.boxWidth = Width;
            super.boxHeight = Height;
            super.boxGrade = grade;
            super.boxColours = "1 Colour";
            super.boxSealableTop = sealableTop;
            super.boxReinforcedBottom = false;
            super.boxReinforcedCorners = false;
            super.basePrice = 0.65;
    }
    @Override
    public String getInfo(){
        return "Type 2 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}
