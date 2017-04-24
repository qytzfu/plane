package plane;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageUtil {
	public static BufferedImage getImage(String imagePath){
//		URL url = GameFrame.class.getClassLoader().getResource(imagePath);
//		System.out.println(url);
//		url = GameFrame.class.getResource(imagePath);
//		System.out.println(url);
//		getImage("");
//		
//		
//		try {
//			Image image = ImageIO.read(new File("D:/workspace/plane/image/t.jpg"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		URL url = GameFrame.class.getClassLoader().getResource(imagePath);
		BufferedImage image = null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;

	}
}
