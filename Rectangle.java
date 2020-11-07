public class Rectangle extends Squade{
	
	private double width = 1.0;
	private double leagth = 1.0;
	
	public Rectangle( double width, double leagth, String color, boolean filled) {
		this.width = width;
		this.leagth = leagth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLeagth() {
		return leagth;
	}
	
	public void setWidth( double width) {
		this.width = width;
	}
	
	public void setLeagth( double leagth) {
		this.leagth = leagth;
	}
	
	public double getArea() {
		return leagth * width;
	}
	
	public double getPerimeter() {
		return 2 * (leagth + width);
	}
	
	public String toString(){ Rectangle[shape[color = "", filled = "",],width = "", leagth = ""]
	}