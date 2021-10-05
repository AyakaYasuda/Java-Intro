
public class MakingDecision {

	public static void main(String[] args) {
		int x = 5;
		
//		if(x == 5) {
//			System.out.println("value of x is 5");
//		} else {
//			System.out.println("value of x is not 5");
//		}
		
		if(x != 5) {
			System.out.println("value of x is not 5");
		} else {
			System.out.println("value of x is 5");
		}
		
		int y = 6, z = 7;
		
		if(y >= z) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		if(bool1 && bool2) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}
		
		boolean m = true;
		boolean n = true;
		
		if(m || n) {
			System.out.println("Condition is true");
		} else {
			System.out.println("Condition is false");
		}
		
		int b = 5;
		if(b == 5) {
			System.out.println("B equals to 5");
		}else if(b > 5) {
			System.out.println("B is greater than 5");
		}else {
			System.out.println("B is smaller than 5");
		}
		
		boolean a;
		a = (10 == 5) ? true : false;
		System.out.println(a);
	}

}
