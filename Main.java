
class Shadowing{
    String name="azmir";
    class innerShadowing{
        String name="vali";
        public void display(){
        System.out.print(name);
        System.out.print(this.name);
        System.out.print(Shadowing.this.name);}
    }
}
public class Main{
    public static void main(String[] args){
        Shadowing s=new Shadowing();
 Shadowing.innerShadowing inner=s. new innerShadowing();
 inner.display();
 
    }
}