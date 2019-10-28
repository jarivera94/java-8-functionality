package co.com.academy.jael.optiona;

import java.util.Optional;

/**
 * @author jael.rivera
 *
 */
public class OptionalTest {

	public static void main(String[] args) {
		testOptional("jael");
		orElseOptional("alberto");
		orElseOptional("");
		orElseOptional(null);
		orElseThrow("jael");
		//orElseThrow(null);
		isPresent("yo");
		isPresent(null);
		
	}
	
	public static void testOptional (String name ) {
		System.out.println("name length "+name.length());
	}
	
	public static void createOptional() {
		Optional<String> optional = Optional.empty();
		String yo =optional.get();
	}
	
	public static void orElseOptional(String name) {
		Optional<String> optional = Optional.ofNullable(name);
		//Optional<String> optional1 = Optional.of(name);
		
		String nombreOfnull= optional.orElse("default");
		//String nombreOf = optional1.orElse("Vacio");
		System.out.println(nombreOfnull);
		//System.out.println(nombreOf);
	}
	
	public static void orElseThrow (String name) {
		Optional<String> optional = Optional.ofNullable(name);
		optional.orElseThrow(NullPointerException::new);
		String name1 = optional.get();
		System.out.println(name1);
	}
	
	public static void isPresent (String name) {
		Optional<String> optional = Optional.ofNullable(name);
		System.out.println(optional.isPresent());
	}
}
