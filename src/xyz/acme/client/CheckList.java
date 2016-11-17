package xyz.acme.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class CheckList {
	
	DataBase db = new DataBase();
	public Statement stmt;
	public ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> getDataId(){
		
		
		try{
			
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			String query = "select * from datasensor";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				int sensorid = rs.getInt("DATAID");
				
				list.add(sensorid);
				
				
			
				
			}
			System.out.println(list);
			return list;
			
		}
		catch(Exception e){
			System.out.println("error");
			return null;
			
			
		}
		
		
		
		
		
		
	}
	
	
	public int getId(){
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista = this.getDataId();
		
		if(lista.isEmpty()){
			int value = 0;
			return value;
			
		}
		else{
			int value = Collections.max(lista);
			return value;
			
			
		}
		
		
		
	}


}
