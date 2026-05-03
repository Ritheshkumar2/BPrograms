package basemultipleinherit;

public interface VechileTwo {

 
   
   void vechileNumber();

   default void showType() {
       System.out.println("VechileTwo interface");
   }
}
