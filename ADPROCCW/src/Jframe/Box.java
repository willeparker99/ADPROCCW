package adproccw;

public abstract class Box {
    
    private double boxLength;
    private double boxWidth;
    private double boxHeight;
    private int boxGrade;
    private int boxColours;
    private boolean boxReinforcedCorners;
    private boolean boxReinforcedBottom;
    private boolean boxSealableTop;
    
    private double boxPrice;
    
    protected double priceModifier;
    
    public box(double length, double width, double height, int grade, int colours,
            boolean reinforcedCorners, boolean reinforcedBottom, boolean sealableTop){
        boxLength = length;
        boxWidth = width;
        boxHeight = height;
        boxGrade = grade;
        boxColours = colours;
        boxReinforcedCorners = reinforcedCorners;
        boxReinforcedBottom = reinforcedBottom;
        boxSealableTop = sealableTop;
        
    }
    
    public double getBoxLength(){
        return boxLength;
    }
    
    public double getBoxWidth(){
        return boxWidth;
    }
    
    public double getBoxHeight(){
        return boxHeight;
    }
    
    public double getBoxArea(){
        return boxLength * boxWidth * boxHeight;
    }
    
    public int getBoxGrade(){
        return boxGrade;
    }
    
    public int getBoxColours(){
        return boxColours;
    }
    
    public boolean hasReinforcedBottom(){
        return boxReinforcedBottom;
    }
    
    public boolean hassealableTop(){
        return boxSealableTop;
    }
    
    public boolean hasReinforcedCorners(){
        return boxReinforcedCorners;

    }
    
    public double getPrice(){
        double[] prices = {0.55, 0.65, 0.82, 0.98, 1.5};
        
        double pricePoint = getBoxArea() * prices[boxGrade - 1];
        
        boxPrice = pricePoint + (pricePoint * priceModifier);
        
        if(SealableTop)
            boxPrice += pricePoint * 0.1;
        
        return boxPrice;
        
    }
    
    
    
}
