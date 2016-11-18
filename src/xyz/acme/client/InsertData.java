package xyz.acme.client;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

public class InsertData {
	
	DataBase db = new DataBase();
	CheckList chk = new CheckList();
	Time time = new Time();
	RandomInt ran = new RandomInt();
	public Statement stmt;
	ArrayList<Integer> lista = new ArrayList<>();
	SensorID si = new SensorID();
	
	public void insertData(){
		
		
		try{
			
			lista = si.getSensorId();
			
			Timestamp tstmp = time.getTime();
			int num = chk.getId()+1;
			
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			for(int i=0;i<lista.size();i++){
				int num2 = ran.genInt();
				System.out.println("dataid: "+ num + "data: "+num2+ "sensorId:"+lista.get(i)+"fecha: "+tstmp);
				stmt.executeUpdate("INSERT into datasensor");
				
			}
			
			
			
		}
		catch(Exception e){
			
			
		}
		
		
		
		
		
	}

}
