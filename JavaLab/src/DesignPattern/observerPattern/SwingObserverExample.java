package DesignPattern.observerPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.annotation.Inherited;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("정말 해도 될까?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);

        frame.setSize(200, 200);
        frame.setVisible(true);

    }

    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("안 돼 분명 후회할거야");
        }
    }
    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            System.out.println("당연하지 저질러 버려");
        }
    }
}
