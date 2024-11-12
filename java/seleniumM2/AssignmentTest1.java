package seleniumM2;

import java.util.ArrayList;

public class AssignmentTest1 {

	public static void main(String[] args) {
		//[Create ArrayList Store Heterogenous object, traverse arrayList ,then print only integer object]
			ArrayList a = new ArrayList();
			a.add(true);
			a.add(10);
			a.add("Pallavi");
			a.add('p');
			a.add(200);
			a.add(300);
			a.add(1000);
			a.add(900);
			a.add('k');
			
			for (Object obj:a) {
				 {
				
					System.out.println(obj);
				
				}
			}
		
	}

}
