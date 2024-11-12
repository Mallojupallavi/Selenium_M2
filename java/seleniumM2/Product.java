package seleniumM2;

public class Product {

	
		String name;
		int pid;
		double price;
		
		 public Product(String name,int pid,double price){
			this.name=name;
			this.pid=pid;
			this.price=price;
		 }	
		@Override
		public String toString() {
		 return "Name: " + name + ", PID: " + pid + ", Price: " + price;
		
		} 
		
			
		}
  
	


