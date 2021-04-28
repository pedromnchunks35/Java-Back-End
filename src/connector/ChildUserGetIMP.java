package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Child;


public class ChildUserGetIMP {
	String DRIVER="com.mysql.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3306";
	String USER="BD";
	String PASSWORD="12341234";
	String sql="Select * from dai.user u join dai.child c on c.id_user=u.id_user";
    ResultSet rs;
    List<Child> lista=new ArrayList<Child>();

	public List<Child> get() {
		
		
		try {
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
			PreparedStatement ps=con.prepareStatement(sql);
	            rs=ps.executeQuery();
	            
	            //CRIACAO DA LISTA COM OS OBJETOS DA RESPOSTA
	            while(rs.next()) {
	               int id_user=rs.getInt("id_user");
	               int id_child=rs.getInt("id_child");
	               int total_points=rs.getInt("total_points");
	               int phone_number_tutor=rs.getInt("phone_number_tutor");
	               String login_type=rs.getString("login_type");
	               String status=rs.getString("status");
	               String name=rs.getString("name");
	               String birth_date=rs.getString("birth_date");
	               String photo=rs.getString("photo");
	                
	                
	                
		            lista.add(new Child(id_user,login_type,status,id_child,name,total_points,birth_date,photo,phone_number_tutor));
		            
	            }
		            
	            
	            
	            
	            
	            
	       
			
			
		} catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		return lista;
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
	}

