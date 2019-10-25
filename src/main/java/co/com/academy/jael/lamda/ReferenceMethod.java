package co.com.academy.jael.lamda;

import java.util.ArrayList;
import java.util.List;

public class ReferenceMethod {

	public static void main(String[] args) {
		
		Work work = ()-> User.referenceByMethod();
		Work workMR =User::referenceByMethod;
		///Reference by static method
		work.acction();
		workMR.acction();
		
		//Methos by instance
		User user = new User("jael ");
		Work work1 =() ->user.referenceByParticularMethod();;
		Work work2 =user::referenceByParticularMethod;
		
		work1.acction();
		work2.acction();
		
		WorkString workString = (word) ->word.toUpperCase();
		WorkString workStringReference =String::toUpperCase;
		
		System.out.println(workString.acction("lambda"));
		System.out.println(workStringReference.acction("reference"));
		
		List<User> listUser = new ArrayList<User>();
		listUser.add(new User("1"));
		listUser.add(new User("2"));
		listUser.add(new User("3"));
		listUser.add(new User("4"));
		listUser.add(new User("5"));
		
		listUser.forEach(name->{
			System.out.println(name.getName());
		});
		
		listUser.forEach(User::getName);
		
		IUser userLambda = (name )->new User(name);
		IUser user3 = User::new; 
		
	}
}
