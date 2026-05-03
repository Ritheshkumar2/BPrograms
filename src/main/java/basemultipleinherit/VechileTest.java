package basemultipleinherit;

public class VechileTest implements VechileOne, VechileTwo {

    @Override
    public void vechileName() {
        System.out.println("KIA");
    }

    @Override
    public void vechileNumber() {
        System.out.println("1234");
    }

	@Override
	public void showType() {
		
		VechileOne.super.showType();
		VechileTwo.super.showType();
	}
	

//    // Mandatory because both interfaces have same default method
//    @Override
//    public void showType() {
//        System.out.println("Multiple Inheritance Resolved");
//    }
}
