//domain based
import java.util.*;

int updateProfile (int newId) {}
int updateProfile (int newId, char genderId) {}
int updateProfile (int charId, int newid) {}

		class User{
			int id;
			String name;
			int salary;
			User(int userId, String userName){
				id = userId;
				name = userName;
			}
			
			User(int userId, String userName, int userSalary){
				id = userId;
				name = userName;
				salary = userSalary;
			}
		}




		class UserTest {
			public static void main(String[] args){
				//Invoking the constructor
				User student = new User(101, "John");
				User instructor = new User(102, "George", 40000);
		
				System.out.println("Name of the Student User " + student.name);
				System.out.println("Name of the Instructor User " + instructor.name);
				System.out.println("Salary of the Instructor User " + instructor.salary);
		
				//Invoking the method
				student.updateProfile("Benjamin ");
				instructor.updateProfile("Chris ", 100000);
		
				System.out.println("Updated Student Name " + student.name);
				System.out.println("Updated instructor Name " + instructor.name);
				System.out.println("Updated instructor Salary " + instructor.salary);
		
			}
		}




        int updateProfile (int newId) {}
int updateProfile (int newId, char genderId) {}
int updateProfile (int charId, int newid) {}

		class User{
			int id;
			String name;
			int salary;
			User(int userId, String userName){
				id = userId;
				name = userName;
			}
			
			User(int userId, String userName, int userSalary){
				id = userId;
				name = userName;
				salary = userSalary;
			}
		}




		class Payment {
			public static void main(String[] args){
				//Invoking the constructor
				User consumers = new User(101, "John");
				User Employe = new User(102, "George", 40000);
		
				System.out.println("Name of the Student User " + student.name);
				System.out.println("Name of the Instructor User " + instructor.name);
				System.out.println("Salary of the Instructor User " + instructor.salary);
		
				//Invoking the method
				student.updateProfile("Benjamin ");
				instructor.updateProfile("Chris ", 100000);
		
				System.out.println("Updated Student Name " + student.name);
				System.out.println("Updated instructor Name " + instructor.name);
				System.out.println("Updated instructor Salary " + instructor.salary);
		
			}
		}



        int updateProfile (int newId) {}
int updateProfile (int newId, char genderId) {}
int updateProfile (int charId, int newid) {}

		class User{
			int id;
			String name;
			int salary;
			User(int userId, String userName){
				id = userId;
				name = userName;
			}
			
			User(int userId, String userName, int userSalary){
				id = userId;
				name = userName;
				salary = userSalary;
			}
		}




		class Employe {
			public static void main(String[] args){
				//Invoking the constructor
				User employe = new User(101, "John");
				User consumers = new User(102, "George", 40000);
		
				System.out.println("Name of the emplyee User " + employee.name);
				System.out.println("Name of the Instructor User " + instructor.name);
				System.out.println("Salary of the Instructor User " + instructor.salary);
		
				//Invoking the method
				student.updateProfile("Benjamin ");
				instructor.updateProfile("Chris ", 100000);
		
				System.out.println("Updated Student Name " + student.name);
				System.out.println("Updated instructor Name " + instructor.name);
				System.out.println("Updated instructor Salary " + instructor.salary);
		
			}
		}