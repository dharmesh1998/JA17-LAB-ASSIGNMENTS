package polymorphismcasestudy;

public class MainPolyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Admin obj=new Admin();
    obj.getDetails();
    obj.doAdminStuff();
    
    Academic obj2=new Academic();
    obj2.getDetails();
    obj2.giveLecture();
    
	}

}
