package co.com.academy.jael.lamda;

public class SefaultImpl implements InterfaceDefautl {

	@Override
	public void showName(String name) {
		
	}
	
	public static void main(String[] args) {
		SefaultImpl defaultImplr = new SefaultImpl();
		System.out.println(defaultImplr.nameByrDefecto("yo"));;
	}

}
