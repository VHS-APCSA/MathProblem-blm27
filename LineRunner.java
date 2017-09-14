package myMath;

public class LineRunner 
{
	public static void main(String[] args)
	{
		Line line = new Line(new Point(15, 4), new Point(5, 10));
		String equation = line.getEquation();
		System.out.println(equation);
		line.setPointA(new Point(8, -17));
		equation = line.getEquation();
		System.out.println(equation);
	}
}
