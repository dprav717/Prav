package inheritance;

//import com.Bank.Customer;

public class B {

	public static void main(String[] args) {
		A customerobj1 = new A();
		
		customerobj1.id="abc";
		customerobj1.name="abc";
		customerobj1.salary=10000.0;
		
		System.out.println("obj1:"+customerobj1.hashCode());
		
		
		
		/*A customerobj2 = new A();
		
		System.out.println("obj2:"+customerobj2.hashCode());
		
		 
		
		customerobj2.id="abc";
		customerobj2.name="abc";
		customerobj2.salary=10000.0;*/
	
		
		A customerobj2 = customerobj1;
		 
		System.out.println("obj3:"+customerobj2.hashCode());
		
		if(customerobj2.equals(customerobj1)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("N");
		}

	}

}
