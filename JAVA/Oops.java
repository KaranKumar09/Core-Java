class Pen {
    String name;
    String color;
    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    
}
public class Oops {
    public static void main(String[] args){
        Pen pen1=new Pen();
        pen1.name="linc";
        pen1.color="red";

        Pen pen2=new Pen();
        pen2.name="linc";
        pen2.color="red";

        pen1.write();
        pen2.write();
        pen2.printColor();
    }
    
}
