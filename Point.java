package myMath;

public class Point 
{
	private int xval;
	private int yval;
	public Point()
	{
		xval = 0;
		yval = 0;
	}
	public Point(int xval, int yval) 
	{
		this.xval = xval;
		this.yval = yval;
	}
	public int getXval() 
	{
		return xval;
	}
	public void setXval(int xval) 
	{
		this.xval = xval;
	}
	public int getYval() 
	{
		return yval;
	}
	public void setYval(int yval) 
	{
		this.yval = yval;
	}
	
}
