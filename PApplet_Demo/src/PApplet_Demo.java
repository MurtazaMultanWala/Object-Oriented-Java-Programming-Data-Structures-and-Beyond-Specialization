import java.util.Calendar;
import java.text.SimpleDateFormat;
import processing.core.*;
public class PApplet_Demo extends PApplet{

	private String URL = "https://image.shutterstock.com/image-photo/palm-tropical-beach-260nw-569532439.jpg";
	private PImage backgroundImg;
	
	public void setup()
	{
		size(400,400);
		backgroundImg = loadImage(URL,"jpg");
	}
	
	public void draw() 
	{
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
     
        String CurrentTime = timeOnly.format(cal.getTime());
        
        
		// 0 means only want to specify the height not width but java by itself adjust it and height is variable
		//of core library which adjust according to canvas Dynamic
		backgroundImg.resize(0, height); 

		image(backgroundImg,0,0); //cordinates --> (0,0)
		// center parameter (first 2 arg) , width and height are last 2 args
		
		int CurrentHour = Integer.parseInt(CurrentTime.split(":")[0]);
		
		if(CurrentHour<12) 								//Morning
		{
			fill(253, 184, 19);
		}
		else if(CurrentHour >= 12 && CurrentHour< 16) 	//Evening
		{
			fill(99, 82, 30);
		}
		else											//Night
		{
			fill(48, 54, 58); 
		}
		
		ellipse(width/2, height/8, width/7, height/7);
		
	}
}
