package plane;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class MyObject {
	
	//使用protected
	protected int x,y,speed;
	protected int width,height;
	protected BufferedImage image = null;
	
	
	
	public MyObject() {
		// TODO Auto-generated constructor stub
	}
	public MyObject(int width,int height){
		this.width = width;
		this.height = height;
	}
	public MyObject(BufferedImage image,int x,int y,int height,int width,int speed){
		this.image = image;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.speed = speed;
	}
	public MyObject(String image,int x,int y,int height,int width,int speed){
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.speed = speed;
		this.image = ImageUtil.getImage(image);
	}
	public MyObject(String image){
		this.image = ImageUtil.getImage(image);
	}
	public void draw(Graphics g){
		g.drawImage(image,x,y,null);
	}	
	
	public Rectangle getRect(){
		return new Rectangle(x,y,width,height);
	}	
	
	public void move(){
		
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
