package Package1_10;

public class Students {
    protected int[] rollNo = new int[5];
    protected String[] name = new String[5];
    
    public Students(){
        for(int i=0; i<5; i++){
            rollNo[i] = 0;
            name[i] = "";
        }
    }
    public Students(int[] rollNo, String[] name){
        for(int i=0; i<5; i++){
            this.rollNo[i] = rollNo[i];
            this.name[i] = name[i];
        }
    }
    
}
