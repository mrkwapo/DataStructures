import java.util.HashMap;

public class MyClass {
	public static void main(String[ ] args) {
		HashMap<Integer, String> points = new HashMap<Integer, String>();
		points.put(154,"Amy");
		points.put(42,"Dave");
		points.put(43,"Rob");
		   System.out.println(points.get(42)); //Dave
	           System.out.println(points);// {154="Amy", 42="Dave", 43,"Rob"}
	           System.out.println(points.keySet()); //[154, 42, 43]
                   System.out.println(points.values()); //[Amy, Dave, Rob]
	  }
}
