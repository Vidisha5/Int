interface Cookable{
	public void cook();
}
public class Cook {

	Cookable c = new Cookable() {

		@Override
		public void cook() {
			System.out.println("inside ano");
			
		}
		public void fun() {
			System.out.println("inside fun");
		}
	};
	
	public static void main(String[] args) {
		Cook c1 = new Cook();
		c1.c.cook();
	}
}
