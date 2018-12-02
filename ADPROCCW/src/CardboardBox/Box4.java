/**
 *  <h1>Box4</h1> 
 *  <p>This is a box of type 4, the type of box based on Swing inputs will be determined by an outside class.</p>
 */
package CardboardBox;
/**
 * Box 4 requirements.
 */

public class Box4 extends Box {
    /// @param Length This is the length of each side of the box
    /// @param Width This is the width of each side of the box
    /// @param Height This is the height of the box when standing
    /// @param grade This is the grade of cardboard used
    /// @param sealableTop Whether the box has a sealable top or not    
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
    /// @return Returns the info of each box
    public String getInfo(){
        return "Type 4 Box - Area: " + super.getBoxArea() + ", Cardboard Grade: " + boxGrade + ", Colours: " + boxColours + ", Sealable Top: " + boxSealableTop + ", Reinforced Bottom: " + boxReinforcedBottom + ", Reinforced Corners: " + boxReinforcedCorners + ". Total Price: £" + getPrice();
    }
    
            
    
}
