package Core_Java_Lab_Code_10;

@FunctionalInterface
interface Lab10Assign2Fun{
	public String modify(String str);
}

public class Exercise2 {

	public static void main(String[]args) {
		String str="ABES";
		Lab10Assign2Fun f1=(s)->
		{
			String z="";
			for(int i=0;i<s.length();i++) {
				char x=s.charAt(i);
				z+=x+" ";
			}
			z.trim();
			return z;
		};
		System.out.println(f1.modify(str));
	}
}

