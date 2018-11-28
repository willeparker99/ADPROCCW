/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LavMPB
 */
public class Box {
    double width;
    double length;
    double height;
    int colour;
    boolean sealTop;
    int grade;
    int quantity;
    double basicCost;
    
     
    public Box (double width, double length, double height, int grade, int quantity, int colour, boolean sealTop, boolean bottomReinforcement, boolean cornerReinforcement){
        this.width = width;
        this.length = length;
        this.height = height;
        this.grade = grade;
        this.quantity = quantity;
        this.sealTop = sealTop;
        this.colour = colour;
    }
    
    public void basicCost(int grade){
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
    
    //public void colourCheck(int colour){}
        
    
    public void gradeCheck(int grade, int type){
        
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
    }
               
    
//    public void sealTop(boolean check){
//        if (!check == true || !check == false)
//            return true;
//        else
//            System.out.println("enter a valid answer");
//            return false;
//}
          
    
}
