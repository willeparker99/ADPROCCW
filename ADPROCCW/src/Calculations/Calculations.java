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
public class Calculations {
    protected double boxArea;
    protected static double costTotal;
    protected boolean sealableTop, reinforcedBottom, reinforcedCorners;
    protected String cardboardGrade, colourPrint;
    protected int type, noInOrder;
    protected static ArrayList boxesCreated;
    
    public Calculations(double boxArea, boolean sealableTop, boolean reinforcedBottom, boolean reinforcedCorners, String cardboardGrade, String colourPrint, int noInOrder){
        this.boxArea = boxArea;
        this.sealableTop = sealableTop;
        this.reinforcedBottom = reinforcedBottom;
        this.reinforcedCorners = reinforcedCorners;
        this.cardboardGrade = cardboardGrade;
        this.colourPrint = colourPrint;
        this.noInOrder = noInOrder;
        findType();
    }
    private void findType(){
        switch(cardboardGrade){
            case "Grade 1":
                this.type = 1;
                break;
            case "Grade 2":
                switch(colourPrint){
                    case "1 Colour":
                        break;
                }
                break;
     }   
    }
    
    
    public static double TotalPrice(){
        return costTotal;
    }

}
