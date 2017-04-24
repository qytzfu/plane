package plane;

import java.awt.Graphics;

public class Plane extends MyObject{
	



	protected boolean left,right,up,down;
	
	public Plane() {
		// TODO Auto-generated constructor stub
	}
	public Plane(String image){
		super(image);
	}
	public Plane(String image,int x,int y,int height,int width,int speed){
		super(image,x,y,height,width,speed);
	}
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(this.getImage(),x,y,width,height,null);
		move();
	}
	
	public void move(){
		if(left){
			x -= speed;
		}
		if(right){
			x += speed;
		}
		if(up){
			y -= speed;
		}
		if(down){
			y += speed;
		}
	}
	
	public boolean isLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	public boolean isRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	public boolean isUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	public boolean isDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
}
