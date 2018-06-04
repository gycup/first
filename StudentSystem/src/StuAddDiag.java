import javax.swing.JDialog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
public class StuAddDiag extends JDialog implements ActionListener{
    JLabel jl1,jl2,jl3,jl4,jl5;
    JTextField jf1,jf2,jf3,jf4,jf5;
    JPanel jp1,jp2,jp3;
    JButton jb1,jb2;
    
    public StuAddDiag(Frame owner,String title,boolean modal){
    	super(owner,title,modal);
    	jl1=new JLabel("年级");
    	jl2=new JLabel("年龄");
    	jl3=new JLabel("性别");
    	jl4=new JLabel("名字");
    	jl5=new JLabel("学号");
    	
    	jf1=new JTextField(10);
    	jf2=new JTextField(10);
    	jf3=new JTextField(10);
    	jf4=new JTextField(10);
    	jf5=new JTextField(10);
    	
    	jb1=new JButton("添加");
    	jb1.addActionListener(this);
    	jb2=new JButton("取消");
    	
    	jp1=new JPanel();
    	jp2=new JPanel();
    	jp3=new JPanel();
    	
    	jp1.setLayout(new GridLayout(5,1));
    	jp2.setLayout(new GridLayout(5,1));
    	
    	 
    	 jp3.add(jb1);
    	 jp3.add(jb2);
    	  
    	 jp1.add(jl1);
    	 jp1.add(jl2);
    	 jp1.add(jl3);
    	 jp1.add(jl4);
    	 jp1.add(jl5);
    	 
    	  
    	 jp2.add(jf1);
    	 jp2.add(jf2);
    	 jp2.add(jf3);
    	 jp2.add(jf4);
    	 jp2.add(jf5);
    	 
    	  
    	 this.add(jp1, BorderLayout.WEST);
    	 this.add(jp2, BorderLayout.CENTER);
    	 this.add(jp3, BorderLayout.SOUTH);
    	  this.setLocationRelativeTo(null);	
    	 this.setSize(300,200);
    	 this.setVisible(true);
    	 }
    public void actionPerformed(ActionEvent e){
    	if(e.getSource()==jb1){
    		Connection ct=null;
    		PreparedStatement pstmt=null;
    		ResultSet rs=null;
    		try{
    			Class.forName("com.mysql.jdbc.Driver");
    		/*	String url="jdbc:mysql://localhost:3306/aka";
    			String user="root";
    			String passwd="794W323X68#";*/
    			ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/aka?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","794W323X68#");
    			String strsql="insert into stu values(?,?,?,?,?)";
    			pstmt=ct.prepareStatement(strsql);
    			pstmt.setString(1,jf1.getText());
    			pstmt.setString(2,jf2.getText());
    			pstmt.setString(3,jf3.getText());
    			pstmt.setString(4,jf4.getText());
    			pstmt.setString(5,jf5.getText());
    			pstmt.executeUpdate();
    			this.dispose();
    		}catch(Exception arg1){
    			arg1.printStackTrace();
    		}finally{
    			try{
    				if(rs!=null)
    			{   			
    				rs.close();
    				rs=null;
    			}
    			if(pstmt!=null){
    				pstmt.close();
    				pstmt=null;
    			}
    			if(ct!=null){
    				ct.close();
    				ct=null;
    			}
    		}catch(Exception arg2){
    			arg2.printStackTrace();   			
    		}
    	}
    }
    
    }
}
