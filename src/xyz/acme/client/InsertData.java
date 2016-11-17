package xyz.acme.client;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class InsertData {
	
	DataBase db = new DataBase();
	CheckList chk = new CheckList();
	public Statement stmt;
	
	public void insertData(){
		
		
		try{
			
			ArrayList<Integer> lista = new ArrayList<>();
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			
			
			
			
		}
		catch(Exception e){
			
			
		}
		
		
		
		
		
	}

}
