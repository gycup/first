import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Choose extends JFrame implements ActionListener{
	JPanel j1;
	JButton bt1,bt2;
	JLabel lb1;

	
	public static void main(String[] args)
	{
		Choose b=new Choose();
	}
	public Choose(){
		JFrame frame=new JFrame();
		frame.setTitle("学生信息管理系统");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);	
	    Container container=frame.getContentPane();
	    container.setLayout(null);
	    JPanel pn1=new JPanel();
	    pn1.setLocation(100,200);
	    pn1.setSize(300,300);
	    JLabel lb1=new JLabel("请选择模式");	  
	     bt1=new JButton("学生");
	    bt1.addActionListener(this);
	     bt2=new JButton("教师");	
	    bt2.addActionListener(this);
	    bt1.setLocation(50,50);
	    pn1.add(lb1);
	    pn1.add(bt1); 
	    pn1.add(bt2);
	    frame.add(pn1);	
	    frame.setVisible(true);		
	}
	
	public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub		
		if(e.getSource()==bt1)
		{	
					 Student stu=new Student();
					 stu.setVisible(true);				
	    }		
		else if(e.getSource()==bt2)       
		{ 
			JF a=new JF();
			a.setVisible(true);			
		}	
	}
}




