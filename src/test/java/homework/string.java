package homework;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating string
		String str="doing homework";
		System.out.println(str.length());
		System.out.println(str.charAt(7));
		System.out.println(str.indexOf("o"));
		System.out.println(str.indexOf("o",str.indexOf("o")+1));
		
		
		//concatination
		
		String a="huzzatul";
		String b=" islam";		
		
		a.concat(b);	
		
		System.out.println(a.concat (b));
		
		//substring
		System.out.println(str.substring(3,7));
	
		//string comparison
		String a1="waiting for vaca";
		String b1="waiting for vaca";
		System.out.println(a1.equals(b1));
		
		
		String c1="waiting for Vaca";
		String d1="waiting for vaca";
		System.out.println(c1.equals(d1));
		System.out.println(c1.equalsIgnoreCase(d1));
		
		//trim
		String t= " hello java ";
        String t1= t.trim();
		System.out.println(t1);
		
		
		
		
		
		
	}

}
