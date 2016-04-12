package sp.drm.demo;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo extends JFrame {
	public Demo() {
	}

	public void demo() {
		URL url = this.getClass().getResource("/WMMXbkC.gif");
		ImageIcon imgIcon = new ImageIcon(url);
		JLabel label = new JLabel(imgIcon);
		this.setTitle("Demo");
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	/*public static final void main(String[] args) {
		URL url = ClassLoader.getSystemResource("WMMXbkC.gif");
		ImageIcon imgIcon = new ImageIcon(url);
		JLabel label = new JLabel(imgIcon);
		Demo demo = new Demo();
		demo.setTitle("Demo");
		demo.add(label);
		demo.pack();
		demo.setLocationRelativeTo(null);
		demo.setVisible(true);
	}*/
}