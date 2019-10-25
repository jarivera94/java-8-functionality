package co.com.academy.jael.lamda;

public class Lamda {

	public static void main(String[] args) {
	
		MyName myanonymNameJ7 = new MyName() {
			
			@Override
			public String myName(String name) {
				// TODO Auto-generated method stub
				return "10";
			}
		};
		System.out.println(myanonymNameJ7.myName("hola"));
		
		MyName myAnonymName = (String name)->name;
		System.out.println(myAnonymName.myName("yo"));
		
		/*Espace para sum */
		
		OperationSum sum = (a, b)->  a+b;		
		System.out.println(sum.sum(10, 20));
		
		OperationSum sumn2 = (a, b) ->{
			int result =a+b;
			
			return result*=3;
		};
		
		System.out.println(sumn2.sum(2, 10));
 }
}
