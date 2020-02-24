package Core_Java_Lab_Code_10;

@FunctionalInterface
interface Accept{

	public boolean check(String usernam,String password);
}
public class Exercise3
{

	public static void main(String[]args) {
		String username="piyushsngh636@gmail.com";
		String password="amrit";
		Accept a=(str1,str2)->{
			if(str1.equals("piyushsngh636@gmail.com") && str2.equals("amrit"));
			return true;
		};
		System.out.println(a.check(username,password));
	}
}
