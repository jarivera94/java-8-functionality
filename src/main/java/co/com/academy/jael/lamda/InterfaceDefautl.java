package co.com.academy.jael.lamda;

public interface InterfaceDefautl {

	void showName(String name);
	
	
	default String nameByrDefecto(String name) {
		return name +"default"; 
	}
}
