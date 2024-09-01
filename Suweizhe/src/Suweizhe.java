import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.sql.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Suweizhe extends JPanel {
	  @Override
	    // Java calls the paintComponent method whem it need to.
	    public void paintComponent(Graphics g){
	        int width = getWidth();  // 取得視窗當前寬度
	        int height = getHeight();  // 取得當前視窗高度
	  
	        ImageIcon img = new ImageIcon("1.jpg");
	        img.paintIcon(null, g, 50, 50);  // 放上照片(images.jpg)起點在(50,50)
	    }

	    public static void main(String[] args) {
	        JFrame window = new JFrame();  // 建立名為window的JFrame物件
	        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	//        window.setSize(300, 300); // 設定視窗大小
	        window.setContentPane(new Suweizhe());  //可以讓paintComponent裡面畫的東西 // 顯示在window裡面

	        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	        Rectangle bounds = ge.getMaximumWindowBounds();
	        window.setBounds(bounds);
	        window.setVisible(true);  // 設定顯示視窗
	    }
}
