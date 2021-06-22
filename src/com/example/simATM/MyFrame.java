package com.example.simATM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyFrame extends JFrame {
    MyFrame(String title){
        super(title);

        // 添加图片显示控件
        BgPanel root = new BgPanel();
        this.setContentPane(root);

        root.setLayout(new BoxLayout(root,BoxLayout.Y_AXIS));
        root.add(new JLabel("样例文本"));
        root.add(new JButton("测试按钮"));

    }

    private class BgPanel extends JPanel{
        Image image = null;

        public BgPanel(){
            URL imageUrl = MyFrame.class.getResource("ATM.jpg");
            try{
                image= ImageIO.read(imageUrl);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        @Override
        protected void paintComponent(Graphics g){
            int width = this.getWidth();
            int height = this.getHeight();
            g.clearRect(0,0,width,height);

            g.drawImage(image,0,0,width,height,null);

        }
    }
}
