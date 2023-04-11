import java.util.ArrayList;
import java.util.Optional;

class Demo {

	public static void main(String[] args) {
		System.out.println("hi");
		
	    ArrayList al = new ArrayList();
	  
	    Optional o = al.stream().findFirst();
	    //if(o.isPresent())
	    System.out.println(o.get());
	}
}
