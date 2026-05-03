package basemultipleinherit;

public interface VechileOne {

    abstract void vechileName(); //abstract not required
    
    default void showType() {
    	System.out.print("VechileOne interface");
    
    }
	
}
