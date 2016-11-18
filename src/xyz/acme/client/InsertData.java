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
			
			
			Connection con = db.connectToDb();
			stmt = con.createStatement();
			for(int i=0;i<lista.size();i++){
				int num = chk.getId()+1;
				int num2 = ran.genInt();
			
				
				stmt.executeUpdate("INSERT into datasensor (DATAID,SENSOR_SENSORID,DATA,TIMESTAMP) values('"+num+"','"+lista.get(i)+"','"+num2+"',to_timestamp('"+tstmp+"','YYYY/MM/DD HH24:MI:SSXFF'))");
				
			}
			
			
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
		
		
		
		
		
	}

}
