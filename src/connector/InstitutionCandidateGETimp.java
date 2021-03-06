package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import models.Collaborator;
import models.Candidate_Institution;

public class InstitutionCandidateGETimp {
	String DRIVER="com.mysql.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3306";
	String USER="BD";
	String PASSWORD="12341234";
	String sql="Select * from dai.candidate_institution";
    ResultSet rs; 
    List<Candidate_Institution> lista=new ArrayList<Candidate_Institution>();
    
    public List<Candidate_Institution> GetAll() {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			Connection con=DriverManager.getConnection(URL,USER,PASSWORD);
			PreparedStatement ps=con.prepareStatement(sql);
	            rs=ps.executeQuery();
	            
	            //CRIACAO DA LISTA COM OS OBJETOS DA RESPOSTA
	            while(rs.next()) {
                 int id_candidate=rs.getInt("id_candidate");
                 String name=rs.getString("name");
                 int nif=rs.getInt("nif");
                 String address=rs.getString("address");
                 String county=rs.getString("county");
                 String district=rs.getString("district");
                 String post_code=rs.getString("post_code");
                 int phone_number=rs.getInt("phone_number");
                 String email=rs.getString("email");
              
	            
	            	
	            
	            	
	            	
	            	
		           
		            lista.add(new Candidate_Institution(id_candidate,name,address,county,district,post_code,nif,phone_number,email));
		            
		             
		           
		            
		            }
		            
	
			
		} catch (SQLException | ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		 return lista;
	}
    
 
}
