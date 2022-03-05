import java.util.*;  
class collection{
	
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();  
			list.add("Ravi");  
			list.add("Vijay");  
			list.add("Ravi");  
			list.add("Ajay");
            System.out.println("Using Advaced for loop");
			
			
			
			Object[] arr = list.toArray();
			
			for(String s: arr)
			System.out.println(s);
			      
		}  
	}  