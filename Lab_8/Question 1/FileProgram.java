import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File d1_source=new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\source.txt");
		File d2_target=new File("D:\\CapgeminiJA17\\LabBook_Programs\\src\\com\\capgemini\\target.txt");  
		CopyDataThread cdt = new CopyDataThread(d1_source,d2_target);
		cdt.start();
	}

}
