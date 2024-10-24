package _5encapsulation;

public class _01Employee {
            private String name,dept;
            private int salary;
            private long phone;
         
            
            public void setName(String n) {
            	name=n;
            }
            public String getName() {
            	return name;
            }
            
            public void setDept(String d) {
            	dept=d;
            }
            public String getDept() {
            	return dept;
            }
            
            public void setPhone(long p) {
            	phone=p;
            }
            public long getPhone() {
            	return phone;
            }
            
            public void setSalary(int s) {
            	salary=s;
            }
            public int getSalary() {
            	return salary;
            }
            
            public void Display() {
            	System.out.println("Name of employee is:"+name+"\n"+"Department of employee is:"+dept+"\n"+"Phone no. of employee is:"+phone+"\n"+"Salary of employee is:"+salary+"LPA");
            }

}
