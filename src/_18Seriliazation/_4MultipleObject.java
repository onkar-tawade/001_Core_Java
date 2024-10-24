package _18Seriliazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _4MultipleObject {

	public static void main(String[] args) throws Exception {

		FileOutputStream f1=new FileOutputStream("D://InfoOfStudents");
		ObjectOutputStream obj1=new ObjectOutputStream(f1);
		
		_3InfoOfStudents s1= new _3InfoOfStudents();
		s1.name="Mukti";
		s1.age=23;
		s1.sub="Information Technology";
		
		_3InfoOfStudents s2= new _3InfoOfStudents();
		s2.name="Pari";
		s2.age=21;
		s2.sub="Business Logic";
		
		
        obj1.writeObject(s1);
        obj1.writeObject(s2);
        
        System.out.println("Info of girls saved...");
        
        
        FileInputStream f2=new FileInputStream("D://InfoOfStudents");
        ObjectInputStream obj2=new ObjectInputStream(f2);
        
        _3InfoOfStudents info1=(_3InfoOfStudents)obj2.readObject();
        System.out.println(info1.name);
        System.out.println(info1.age);
        System.out.println(info1.sub);
        
        
        _3InfoOfStudents info2=(_3InfoOfStudents)obj2.readObject();
        System.out.println(info2.name);
        System.out.println(info2.age);
        System.out.println(info2.sub);
        
       
	}

}
