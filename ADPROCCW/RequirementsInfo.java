/**
 * A CLASS TO CONTAIN INFORMATION ON TYPE OF BOX REQUIRED
 * 
 */

public class RequirementsInfo {
    private double width;
    private double length;
    private double height;
    private int colourPrint;
    private boolean sealableTop;
    private int cardboardGrade;
    private int quantity;
    private boolean bottomReinforcement;
    private boolean cornerReinforcement;
    private double basicCost;

    
    /**
    * Empty requirements in Info class.
    * 
    */
    public RequirementsInfo(){
    }

    /**
     * Construct a requirements info class setting parameters.
     * @param length The length of the box in metres.
     * @param width The width of the box in metres.
     * @param cardboardGrade The grade of the cardboard.
     * @param colourPrint The number of colours on the box (0, 1 or 2).
     * @param bottomReinforcement Whether or not the box needs bottom reinforcement.
     * @param cornerReinforcement Whether or not the pipe needs corner reinforcement.
     * @param sealableTop Whether or not the box has a sealable top.
     * @param quantity The amount of boxes needed.
     */
    
    
    public RequirementsInfo (double width, double length, double height, int cardboardGrade, int quantity, int colourPrint, boolean sealableTop, boolean bottomReinforcement, boolean cornerReinforcement){
        this.width = width;
        this.length = length;
        this.height = height;
        this.cardboardGrade = cardboardGrade;
        this.quantity = quantity;
        this.sealableTop = sealableTop;
        this.colourPrint = colourPrint;
        this.bottomReinforcement = bottomReinforcement;
        this.cornerReinforcement = cornerReinforcement;
        
        
        
    }
    
    /**
     * Print the requirements info to the console in a list.
     */
    public void printRequirementsInfo(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Cardboard Grade: " + cardboardGrade);
        System.out.println("Colour Print: " + colourPrint);
        System.out.println("Bottom Reinforcement: " + bottomReinforcement);
        System.out.println("Corner Reinforcement: " + cornerReinforcement);
        System.out.println("Sealable Top: " + sealableTop);
        System.out.println("Quantity: " + quantity);
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public boolean getSealableTop(){
        return sealableTop;
    }
    
    public int getColourPrint(){
        return colourPrint;
    }
    
    public int getCardboardGrade(){
        return cardboardGrade;
    }
    
    public boolean getBottomReinforcement(){
        return bottomReinforcement;
    }
    
    public boolean cornerReinforcement(){
        return cornerReinforcement;
    }
    
    public void setBasicCost(int grade){
        if (grade == 1)
            basicCost = 0.55; 
        
        if (grade == 2)
            basicCost = 0.65;
        
        if (grade ==3)
            basicCost = 0.82;
        
        if (grade == 4)
            basicCost = 0.98;
        
        if (grade == 5)
            basicCost = 1.5;
    }
    
        
    public boolean setGrade(int grade, int type){
        
        if(type == 1 && grade >=1 && grade <=3)
            return true;
        
        else if(type == 2 && grade >=2 && grade <=4)
            return true;
        
        else if((type == 3 || type == 4) && grade >=2 && grade <=5)
            return true;
        
        else if(type == 5 && grade >=3 && grade <=5)
            return true;
        
        else
            System.out.println("Wrong Combination");
            return false;
}
    
    public boolean colourCheck(int colour, int type){
    //Checks that the specified number of COLOURS is compatible with the box TYPE
        if (type == 1 && colour ==0)
            return true;
        else if (type == 2 && colour == 1) {
            return true;
        }
        else if ((type >= 3 && type <= 5) && colour == 2){
            return true;
        }
        else
            return false;
    }    
}

