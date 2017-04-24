package plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	

	public static final int WIDTH = 400;
	public static final int HEIGHT = 600;
	
	
	public volatile boolean isEnd = false; 
	
	
	
	public void launchFrame(){
		this.setBounds(200,100,WIDTH,HEIGHT);
		this.setVisible(true);
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		new PaintThread().start();
	}
	

	
	
	
	//利用双缓冲处理闪烁问题
	private Image offScreenImage = null;
	private Graphics goff = null;
	@Override
	public void update(Graphics g) {
		//super.update(g);
		if(offScreenImage == null){
			offScreenImage = this.createImage(WIDTH, HEIGHT);
			goff = offScreenImage.getGraphics();
			paint(goff);//自己调用这个函数
			g.drawImage(offScreenImage, 0, 0, null);
		}
		
	}

	
	
	public class PaintThread extends Thread{
		 @Override
		public void run() {
			// TODO Auto-generated method stub
			 while(!isEnd){
				 try {
					repaint();
					 Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
	}
}
