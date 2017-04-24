package plane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GameFrame extends MyFrame{
	
	Image background = ImageUtil.getImage("images/background.jpeg");
	Plane plane = new Plane("images/plane.jpg",WIDTH/2-50,HEIGHT-50,50,50,30);
	ArrayList<Bullet> bulletList = new ArrayList<>();
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(background, 0, 0, null);
		plane.draw(g);
		for(int i=0;i<bulletList.size();i++){
			Bullet b = bulletList.get(i);
			if(plane.getRect().intersects(b.getRect())){
				isEnd = true;
				paintInfo(g,"you died!!,",100,200,15,Color.green);
			}
			b.draw(g);
		}
	}
	
	public void paintInfo(Graphics g, String string, int x, int y, int word_size, Color color){
		Font font = new Font("正楷",Font.BOLD, word_size);
		Color c  = g.getColor();
		g.setColor(color);
		g.setFont(font);
		g.drawString(string, x,y);
		g.setColor(c);
	}
	
	@Override
	public void launchFrame() {
		// TODO Auto-generated method stub
		super.launchFrame();
		addKeyListener(new MyKeyEvent());
		for(int i=0;i<10;i++){
			Bullet bullet = new Bullet(GameFrame.WIDTH/2,GameFrame.HEIGHT/2,20,10,10);
			bulletList.add(bullet);
		}
		
	}
	
	
	public class MyKeyEvent extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()){
			case KeyEvent.VK_LEFT:
				plane.setLeft(true);
				break;
			case KeyEvent.VK_RIGHT:
				plane.setRight(true);
				break;
			case KeyEvent.VK_UP:
				plane.setUp(true);
				break;
			case KeyEvent.VK_DOWN:
				plane.setDown(true);
				break;
			default:
			}
		}
		@Override
		public void keyReleased(KeyEvent event) {
			switch(event.getKeyCode()){
			case KeyEvent.VK_LEFT:
				plane.setLeft(false);
				break;
			case KeyEvent.VK_RIGHT:
				plane.setRight(false);
				break;
			case KeyEvent.VK_UP:
				plane.setUp(false);
				break;
			case KeyEvent.VK_DOWN:
				plane.setDown(false);
				break;
			default:
			}
		}
		
	}
	
	public static void main(String[] args) {
		new GameFrame().launchFrame();
		
	}
}




















































































