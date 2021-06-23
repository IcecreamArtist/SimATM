package com.example.simATM;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyFrame extends JFrame {
    MyFrame(String title,String pic){
        super(title);

        // ���ͼƬ��ʾ�ؼ�
        BgPanel root = new BgPanel(pic);
        this.setContentPane(root);

        root.setLayout(null);

        root.add(new JLabel("�����ı�"));
        root.add(new JButton("���԰�ť"));

    }

    private class BgPanel extends JPanel{
        Image image = null;

        public BgPanel(String pic){
            URL imageUrl = MyFrame.class.getResource(pic);
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
