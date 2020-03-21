import processing.core.*;

public class HappyFace extends PApplet{

	public void setup() 
	{
		size(400,400);
		background(200,200,200);
	}
	
	public void draw() 
	{
		fill(255,255,0);
		ellipse(width/2, height/2, width/3, height/3);
		
		fill(0,0,0);
		ellipse(width/2-25,height/2-10, width/15, height/15);
		ellipse(width/2+25,height/2-10, width/15, height/15);
		
		arc(width/2+2,height/2+20, width/10, height/10, 0, PI);
	}
}
