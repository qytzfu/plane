package plane;

import java.awt.Color;
import java.awt.Graphics;

public class Bullet extends MyObject{
	protected double degree;
	public Bullet(){
		
	}
	public Bullet(int x,int y,int speed, int width, int height){
		super();
		//this.image = image;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.degree = Math.random()*Math.PI * 2;
		this.width = width;
		this.height = height;
	}
	
	
	public void move(){
		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);
		
		if(x < 0 || x > MyFrame.WIDTH){
			degree = Math.PI - degree;
		}
		if(y < 0 || y > MyFrame.HEIGHT){
			degree = -degree;
		}
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		Color old = g.getColor();
		g.setColor(Color.white);
		g.fillOval(x, y, width, height);
		g.setColor(old);
		move();
	}
}
