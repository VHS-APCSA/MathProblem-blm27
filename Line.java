package myMath;

public class Line 
{
	private Point pointA;
	private Point pointB;
	public Line()
	{
		pointA = null;
		pointB = null;
	}
	public Line(Point pointA, Point pointB)
	{
		this.pointA = pointA;
		this.pointB = pointB;
	}
	//slope = (y2 - y1) / (x2 - x1)
	public double getSlope()
	{
		double slope = 0.0;
		slope = (double) (pointA.getYval() - pointB.getYval()) / 
				(pointA.getXval() - pointB.getXval());
		return slope;
	}
	//b = y - mx
	public double getIntercept()
	{
		double intercept = 0.0;
		intercept = pointA.getYval() - getSlope() * pointB.getXval();
		return intercept;
	}
	public String getEquation()
	{
		String equation = "";
		equation = "y = " + this.getSlope() + " x + " + this.getIntercept();
		return equation;
	}
	public Point getPointA() 
	{
		return pointA;
	}
	public void setPointA(Point pointA) 
	{
		this.pointA = pointA;
	}
	public Point getPointB() 
	{
		return pointB;
	}
	public void setPointB(Point pointB) 
	{
		this.pointB = pointB;
	}
	
}
