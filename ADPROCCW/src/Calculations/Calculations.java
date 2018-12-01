/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

/**
 *
 * @author tama3
 */
import CardboardBox.*;
import java.util.ArrayList;
public final class Calculations {
    
    protected double Length, Width, Height;
    protected static double costTotal;
    protected boolean sealableTop, reinforcedBottom, reinforcedCorners;
    protected String cardboardGrade, colourPrint;
    protected int type, noInOrder;
    protected static ArrayList<Box> boxesCreated = new ArrayList<>();
    
    public Calculations(double Length, double Width, double Height, boolean sealableTop, boolean reinforcedBottom, boolean reinforcedCorners, String cardboardGrade, String colourPrint, int noInOrder){
        this.Length = Length;
        this.Width = Width;
        this.Height = Height;
        this.sealableTop = sealableTop;
        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
        this.cardboardGrade = cardboardGrade;
        this.colourPrint = colourPrint;
        this.noInOrder = noInOrder;
        findType();
        genBoxLi();
    }
    public ArrayList<Box> getBoxLi(){
        return boxesCreated;
    }
    public Box getBoxByIndex(int index){
        return boxesCreated.get(index);
    }
    private void findType(){
        switch(cardboardGrade){
            case "Grade 1":
                this.type = 1;
                break;
                
            case "Grade 2":
                switch(colourPrint){
                    case "No Colour":
                        this.type = 1;
                    case "1 Colour":
                        this.type = 2;
                        break;
                    case "2 Colours":
                        if(reinforcedBottom){
                            type = 4;
                        } else {
                            type = 3;
                        }
                        break;
                }
                break;
                
            case "Grade 3":
                switch(colourPrint){
                    case "No Colour":
                        this.type = 1;
                    case "1 Colour":
                        this.type = 2;
                        break;
                    case "2 Colours":
                        if(reinforcedBottom && reinforcedCorners){
                            type = 5;
                        } else if (reinforcedBottom){
                            type = 4;
                        } else {
                            type = 3;
                        }
                        break;
                }
                break;
                
            case "Grade 4":
                switch(colourPrint){
                    case "1 Colour":
                        this.type = 2;
                        break;
                    case "2 Colours":
                        if(reinforcedBottom && reinforcedCorners){
                            type = 5;
                        } else if (reinforcedBottom){
                            type = 4;
                        } else {
                            type = 3;
                        }
                        break;
                }
                break;
                
            case "Grade 5":
                switch(colourPrint){
                    case "2 Colours":
                        if(reinforcedBottom && reinforcedCorners){
                            type = 5;
                        } else if (reinforcedBottom){
                            type = 4;
                        } else {
                            type = 3;
                        }
                        break;
                }
        }
           
    }
    private void genBoxLi(){
        for(int i = 0; i < noInOrder; i++){

            switch (type) {
                case 1:
                    Box box1 = new Box1(Length, Width, Height, cardboardGrade, sealableTop);
                    boxesCreated.add(box1);
                    break;
                case 2:
                    Box box2 = new Box2(Length, Width, Height, cardboardGrade, sealableTop);
                    boxesCreated.add((Box)box2);
                    break;
                case 3:
                    Box box3 = new Box3(Length, Width, Height, cardboardGrade, sealableTop);
                    boxesCreated.add((Box)box3);
                    break;
                case 4:
                   Box box4 = new Box4(Length, Width, Height, cardboardGrade, sealableTop);
                    boxesCreated.add((Box)box4);
                    break;
                case 5:
                    Box box5 = new Box5(Length, Width, Height, cardboardGrade, sealableTop);
                    boxesCreated.add((Box)box5);
                    break;
                default:
                    System.out.println("Error");
                    Box boxDefault = new Box5(0, 0, 0, "Error", false);
                    boxesCreated.add(boxDefault);
                    break;
            }
        }
            
    }
    
    public static double TotalPrice(){
        return costTotal;
    }

}
