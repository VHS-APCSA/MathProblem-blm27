public class QuadraticEquation {
	public QuadraticEquation()
	{
		ABC solve = new ABC(1, 1, 1);
		double x1;
		double x2;
		x1 = (-(solve.getB()) - (Math.sqrt(Math.pow((solve.getB()), 2) - (4*(solve.getA())*(solve.getC())))))/(2*(solve.getA()));
		x2 = (-(solve.getB()) + (Math.sqrt(Math.pow((solve.getB()), 2) - (4*(solve.getA())*(solve.getC())))))/(2*(solve.getA()));
		System.out.println("x = " +x1+ "\n" + "x = " +x2);
	}
	
}
