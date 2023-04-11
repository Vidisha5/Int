interface DI1{
	public default void show() {
		System.out.println("di1");
	}
}
interface DI2{
	public default void show() {
		System.out.println("di2");
	}
}
public class DemoClas implements DI1{
   public void show() {
	   DI1.super.show();
	   //DI2.super.show();
   }
   public static void main(String[] args) {
	   DemoClas dc = new DemoClas();
	   dc.show();
   }
}
