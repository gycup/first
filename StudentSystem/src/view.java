import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class view extends JFrame implements ActionListener {
	public static void main(String[] args)
	{
	  view a=new view();
	  a.run();
	}
	public void run(){
		JFrame frame=new JFrame();
		frame.setTitle("学生信息管理系统");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);	
	    Container container=frame.getContentPane();
	    container.setLayout(null);
	    JPanel pn1=new JPanel();
	    pn1.setLocation(100,200);
	    pn1.setSize(300,300);
	    JLabel lb1=new JLabel("欢迎来到学生信息管理系统");	  
	    JButton bt1=new JButton("进入");	
	    bt1.setLocation(50,50);
	    pn1.add(lb1);
	    pn1.add(bt1); 
	    frame.add(pn1);	
	    frame.setVisible(true);
	    bt1.addActionListener(this);
	}
		@Override
	    public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		   Choose ch = new Choose();
		   ch.setVisible(true);
			
		   
		}
	    }
