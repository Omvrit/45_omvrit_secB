package test1;
class Rectangle1
{
	static int lenght;
	static int breadth;
	static int Area(int length,int breadth){
		return length*breadth;
	}
		
}
class Rectangle2
{	
	int length;
	int breadth;
	public int showArea(int length,int breadth){
		return length*breadth;
	}
}
public class Demo {

	public static void main(String[] args) {
		Rectangle2 r2 = new Rectangle2();
		r2.length = 10;
		r2.breadth  = 4;
		System.out.println(r2.showArea(r2.length, r2.breadth));
		System.out.println(Rectangle1.Area(1,3));
//		
		

	}

}
