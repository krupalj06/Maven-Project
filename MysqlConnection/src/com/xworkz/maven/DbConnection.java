package com.xworkz.maven;

public class DbConnection {
	
	public static void main(String[] args) {
	
		//Comment for Git 
		Lodge log= new Lodge();
		log.setRoomid(102);
		log.setLodgeName("Ashoka");
		log.setLocation("Bangalore");
		log.setPx(3);
		log.setNoOfDays(2);
		
		LodgeDao dao = new LodgeDao();
		dao.save(log);
		
	}

}
