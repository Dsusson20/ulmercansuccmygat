
public class BusinessAssociate extends Personclass {
	int timeworking, money;
	String job;
	
	public BusinessAssociate(String name, String city, String street, String phoneNum, String type ){
		super(name, city, street, phoneNum, type );
	}
	
	public int getTimeWorking(){
		return timeworking;
	}
	
	public void setTimeWorking(int time1){
		timeworking = time1;
	}
	
	public String getJob(){
		return job;
	}
	
	public void setJob(String hobby1){
		job = hobby1;
	}
	
	public int getMoneyMade(){
		return money;
	}
	
	public void setMoneyMade(int time1){
		money = time1;
	}
	
	public String toString(){
		return "Name: " + name + "\n" +
	           "Address: " + street + ", " + city + "\n" +
			   "Phone Number: " + phoneNum + "\n" +
	           "Time Working: " + timeworking + "\n" +
			   "Job: " + job + "\n" +
	           "Money Made: " + money + "\n";
	}
}
