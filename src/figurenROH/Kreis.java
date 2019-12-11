package figurenROH;

public class Kreis extends Figur2D {
	private double radius;

	public Kreis(double r)
	{
		radius = r;
	}
	public Kreis()
	{
		radius=1;
	}
	
	public boolean setRadius(double radius)
	{
		boolean zulaessig=false;
		if(radius > 0)
		{
			zulaessig=true;
			this.radius = radius;
		}
		else
			if(radius < 0)
				this.radius = -radius;
			else 
				this.radius= 1;
		return zulaessig; 
	}
	public double getRadius()
	{
		return this.radius;
	}
	public double flaeche()
	{
		double flaeche= this.radius * this.radius * Math.PI;
		return flaeche;
	}
	public double umfang()
	{
		return Math.PI * 2 * radius;
	}

}
