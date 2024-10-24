package _18Seriliazation;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _1stseriAndDeserilization {

	public static void main(String[] args) throws Exception {
		
               ///....Seriliazation....
		FileOutputStream f=new FileOutputStream("D://fileInput.txt");
		ObjectOutputStream obj= new ObjectOutputStream(f);
		
		
		_0Student s=new _0Student();
		s.name="Onkar";
		s.age=20;
		s.gender="Male";
		
		obj.writeObject(s);
		
		System.out.println("Students info saved...");
		
		///.....De-seriliazation................
		FileInputStream f1=new FileInputStream("D://fileInput.txt");
		ObjectInputStream obj1=new ObjectInputStream(f1);
		_0Student s1=(_0Student)obj1.readObject();
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.gender);

	}

}
