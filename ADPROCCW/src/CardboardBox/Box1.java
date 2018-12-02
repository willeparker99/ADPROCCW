package CardboardBox;

public class Box1 extends Box {
    
    public Box1(double Length, double Width, double Height, String grade, boolean sealableTop){
            super.boxLength = Length;
            super.boxWidth = Width;
            super.boxHeight = Height;
            super.boxGrade = grade;
            super.boxColours = "No Colour";
            super.boxSealableTop = sealableTop;
            super.boxReinforcedBottom = false;
            super.boxReinforcedCorners = false;
            super.basePrice = 0.55;
    }
    @Override
    public String getInfo(){
        return "Type 1 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}