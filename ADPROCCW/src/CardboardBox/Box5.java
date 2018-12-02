/**
 *  <h1>Box5</h1> 
 *  <p>This is a box of type 5, the type of box based on Swing inputs will be determined by an outside class.</p>
 */

package CardboardBox;
/**
 * Box 5 requirements.
 */

public class Box5 extends Box {
    /// @param Length This is the length of each side of the box
    /// @param Width This is the width of each side of the box
    /// @param Height This is the height of the box when standing
    /// @param grade This is the grade of cardboard used
    /// @param sealableTop Whether the box has a sealable top or not    
    public Box5(double Length, double Width, double Height, String grade, boolean sealableTop){
            super.boxLength = Length;
            super.boxWidth = Width;
            super.boxHeight = Height;
            super.boxGrade = grade;
            super.boxColours = "2 Colours";
            super.boxSealableTop = sealableTop;
            super.boxReinforcedBottom = true;
            super.boxReinforcedCorners = true;
            super.basePrice = 1.5;
    }
    /**
    *Returns information on Box 5.
    */
    @Override
    /// @return Returns the info of each box
    public String getInfo(){
        return "Type 5 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}
