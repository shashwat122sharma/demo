import com.qa.base.BaseClass;
import com.qa.page.LoginPagClass;
import com.qa.util.Utility;

public class Test1 {
	
	public static void main(String []args) {
		
		System.out.println("This is main functions");
		BaseClass.base();
		LoginPagClass.LoginPage();
		Utility.util();
		
	}

}
