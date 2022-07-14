package Algo;

public class ObjectCopy implements Cloneable{
	public int a;
	
	public static void main(String[] args) {
		//object creation
		ObjectCopy obj = new ObjectCopy();
		obj.a = 5;
		
		//shallow copy: obj1.a also is = 5; but if we change obj.a = 6, then obj1.a also becomes = 6.
		ObjectCopy obj1 = obj;	// actually we just have two references to the same object
		System.out.println("obj1.a = "+obj1.a);
		obj.a = 2;
		System.out.println("obj1.a = "+obj1.a);
		
		//deep copy: manual value setting
		ObjectCopy obj2 = new ObjectCopy();
		obj2.a = obj.a;
		
		//cloning 
		try {
			ObjectCopy obj3 =  (ObjectCopy) obj.clone();
			obj.a = 2;
			System.out.println("obj3 = "+obj3.a);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


