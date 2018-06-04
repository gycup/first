import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class Student extends JFrame implements ActionListener {
	
	//定义一些控件
	 JPanel jp1,jp2;
	 JLabel jl1,jl2;
	 JButton jb1,jb2,jb3,jb4;
	 JTable jt;
	 JScrollPane jsp;
	 JTextField jtf;
	 StuModel sm; 
	 //定义连接数据库的变量
	 //Statement stat = null;
	 PreparedStatement ps;
	 Connection ct = null;
	 ResultSet rs = null;
	 
	 
	 
	 
	 public static void main(String[] args)
	 {
		 Student stud=new Student();
	 }
	 
	 public Student(){
		 jp1 = new JPanel();
		 jtf = new JTextField(10);
		 jb1 = new JButton("查询");
		 jb1.addActionListener(this);
		 jl1 = new JLabel("请输入名字:");
		  
		 jp1.add(jl1);
		 jp1.add(jtf);
		 jp1.add(jb1);
		 //创建模型对象
		 sm = new StuModel();
		  
		  
		 //初始化
		 jt = new JTable(sm);
		  
		 jsp = new JScrollPane(jt);
		  
		 //将jsp放入到jframe中
		 this.add(jsp);
		 this.add(jp1,"North");
		 this.setSize(500, 500);
		 //this.setLocation(300, 200);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 this.setLocationRelativeTo(null);	
		 this.setVisible(true);
	 }
		 public void actionPerformed(ActionEvent arg0) {
			 //判断是哪个按钮被点击
			 if(arg0.getSource() == jb1){
			 //因为把对表的数据封装到StuModel中，可以比较简单的完成查询
			 String name = this.jtf.getText().trim();
			 //写一个sql语句
			 String sql = "select * from stu where stuName = '"+name+"' ";
			 //构建一个数据模型类，并更新
			 sm = new StuModel(sql);
			 //更新jtable
			 jt.setModel(sm);
			  
			 }
}
}