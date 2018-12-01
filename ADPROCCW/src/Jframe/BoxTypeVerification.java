package adproccw;

public class BoxTypeVerification {
    
    public int verify(int grade, int colours, boolean reinforcedBottom,
            boolean reinforcedCorners){
        
       if (reinforcedCorners) {
            if (verify5(grade, colours, reinforcedBottom))
                return 5;
        } else if (reinforcedBottom) {
            if (verify4(grade, colours))
                return 4;
        } else if (colours == 2) {
            if (grade >= 2 && grade <= 5)
                return 3;
        } else if (colours == 1) {
            if (grade >= 2 && grade <= 4)
                return 2;
        } else if (colours == 0) {
            if (grade >= 1 && grade <= 3)
                return 1;
        }
        return 0;
    }
    
    private boolean verify5(int grade, int colours, boolean insulation) {
        if (!insulation)
            return false;
        if (colours != 2)
            return false;
        return (grade >= 3 && grade <= 5);
    } 
    
    private boolean verify4(int grade, int colours) {
        if (colours != 2)
            return false;
        return (grade >= 2 && grade <= 5);
    }

            
    
}
