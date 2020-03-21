import java.util.Calendar;
import java.text.SimpleDateFormat;
import processing.core.*;



public class ChangeColorShape extends PApplet{
	PImage backgroundImg;
	private String URL = "https://image.shutterstock.com/image-photo/palm-tropical-beach-260nw-569532439.jpg";
	 
	
	public void setup()
	{
		size(400,400);
		background(255);
		stroke(0);
		backgroundImg = loadImage(URL,"jpg");
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
	}
	
	public void draw() 
	{
		int[] color = sunColorSec(second());
        fill(color[0], color[1], color[1]);
        ellipse(width/2, height/8, width/7, height/7);
		
	}

	public int[] sunColorSec(float seconds) {
		int[] rgb = new int[3];
		
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		
		rgb[0] = (int) (255*ratio);
		rgb[1] = (int) (255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
}
