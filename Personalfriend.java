public class Personalfriend extends Personclass {

	int timeKnown, age;
	String hobby;
	
	public Personalfriend(String name, String city, String street, String phoneNum, String type ){
		super(name, city, street, phoneNum, type );
	}
	
	public int getTimeknown(){
		return timeKnown;
	}
	
	public void setTimeKnown(int time1){
		timeKnown = time1;
	}
	
	public String getHobby(){
		return hobby;
	}
	
	public void setHobby(String hobby1){
		hobby = hobby1;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int time1){
		age = time1;
	}
	
	public String toString(){
		return "Name: " + name + "\n" +
	           "Address: " + street + ", " + city + "\n" +
			   "Phone Number: " + phoneNum + "\n" +
	           "Time Known: " + timeKnown + "\n" +
			   "Hobby: " + hobby + "\n" +
	           "Age: " + age + "\n";
	}
	
}


