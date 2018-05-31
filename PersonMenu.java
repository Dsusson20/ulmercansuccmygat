import java.util.ArrayList;

import TurtleGraphics.KeyboardReader;

public class PersonMenu {

	public static void main(String[] args) {
		KeyboardReader read = new KeyboardReader();
		PersonMenu prg = new PersonMenu();

		ArrayList<Personclass>person = new ArrayList<Personclass>();


		System.out.println();
		int programSELECT = 5;

		while(programSELECT != 0){
			programSELECT = read.readInt("0 to end program \n 1 to add a person \n 2 to remove a person \n 3 to edit a person \n 4 to print all people");

			System.out.println();

			while(programSELECT >= 5 || programSELECT < 0 ){
				System.out.println("ERROR Reselect Program!!");
				System.out.println("PERSON MENU:\n -Press 0 to end program\n -Press 1 to add a person\n -Press 2 to remove a person"
						+ "\n -Press 3 to edit a person\n -Press 4 to print all people");
				programSELECT = read.readInt("Which program: ");

				System.out.println();
			}

			if(programSELECT == 1){
				prg.addPerson(programSELECT, person);

			}

			if(programSELECT == 2){
				prg.removePerson(programSELECT, person);
			}

			if(programSELECT == 3){
				prg.editPerson(programSELECT, person);
			}

			if(programSELECT == 4){
				prg.printPeople(programSELECT, person);
			}

			if(programSELECT >= 5 || programSELECT <= -1 ){
				System.out.println("ERROR Reselect Program!!");
				System.out.println("BANK MENU:\n -Press 0 to end program\n -Press 1 to add a person\n -Press 2 to remove a person"
						+ "\n -Press 3 to edit a person\n -Press 4 to print all people");
				programSELECT = read.readInt("Which program: ");

				System.out.println();
			}
		}

	}

	public void addPerson(int programSELECT, ArrayList<Personclass> person) {
		KeyboardReader read = new KeyboardReader();
		String accountType = read.readLine("Do you want to add a personal friend or business associate? (p/b): ");

		if(accountType.equals("p")){
			String name = read.readLine("What is the person's name?: ");
			String street = read.readLine("What is the person's street address?: ");
			String city = read.readLine("What city does this person live in?: ");
			String phoneNum = read.readLine("What is the person's phone number?: ");
			person.add(new Personalfriend(name, city, street, phoneNum, "p"));
			person.get(person.size() -1).setHobby(read.readLine("What is the person's hobby?: "));
			person.get(person.size() -1).setTimeKnown(read.readInt("How long have you known the person?: "));
			person.get(person.size() -1).setAge(read.readInt("What is the person's age?: "));
			System.out.println("\nPERSON CREATED!\n");
		}

		else if(accountType.equals("b")){
			String name = read.readLine("What is the person's name?: ");
			String street = read.readLine("What is the person's street address?: ");
			String city = read.readLine("What city does this person live in?: ");
			String phoneNum = read.readLine("What is the person's phone number?: ");
			person.add(new BusinessAssociate(name, city, street, phoneNum, "b"));
			person.get(person.size() -1).setJob(read.readLine("What is the person's job title?: "));
			person.get(person.size() -1).setTimeWorking(read.readInt("How long have has the person worked there?: "));
			person.get(person.size() -1).setMoneyMade(read.readInt("How much does he make?: "));
			System.out.println("\nPERSON CREATED!\n");
		}

		else System.out.println("\nUnable to create an account!\n");

	}

	public void removePerson(int programSELECT, ArrayList<Personclass> person) {
		KeyboardReader read = new KeyboardReader();

		String accountType = read.readLine("Is this person you want to remove a personal friend or business associate?(p/b): ");
		String name = read.readLine("What is your name?: ");
		String phoneNum = read.readLine("What is the your phone number?: ");

		int countd = 0;
		for(int a = 0; a < person.size(); a++){
			if(person.get(a).getAccounType().equals(accountType)){
				if(name.equals(person.get(a).getName())){
					if(phoneNum.equals(person.get(a).getphoneNum())){
						person.remove(a);
						countd++;
						System.out.println("\nPerson Removed!\n");
					}
				}
			}
		}

		if(countd == 0){
			System.out.println("\nUnable to find the person!\n");
		}


	}

	public void editPerson(int programSELECT, ArrayList<Personclass> person) {
		KeyboardReader read = new KeyboardReader();
		int modify = 0, index = 0;

		String name = "";
		String accountType = "";

		if(person.size() != 0){
			name = read.readLine("What is the name of the person you want to modify?: ");
			accountType = read.readLine("Is he a personal friend or a business associate ?(p/b): ");

			for(int a = 0; a < person.size(); a++){
				if(name.equals(person.get(a).getName())){
					if(accountType.equals(person.get(a).getAccounType())){
						modify = a;
						index++;
						System.out.println("\n" + name + " is found! Use the modify menu to change information!");
					}
				}
			}
		}

		if(index == 0){
			System.out.println("\nUnable to find person to modify!\n");
		}

		int prgselect = 8;


		if(accountType.equals("p")){
			if(index > 0){
				while(prgselect != 0){
					System.out.println("\nMODIFY MENU:\n -Press 0 to end program\n -Press 1 to modify name\n -Press 2 to modify street address\n -Press 3 to to modify city"
							+ "\n -Press 4 to modify hobby\n -Press 5 to modify phone number\n -Press 6 to modify age\n -Press 7 to modify time known");
					prgselect = read.readInt("Which program: ");

					System.out.println();

					while(prgselect >= 6 || prgselect < 0 ){
						System.out.println("ERROR Reselect Program!!");
						System.out.println("\nMODIFY MENU:\n -Press 0 to end program\n -Press 1 to modify name\n -Press 2 to modify street address\n -Press 3 to to modify city"
								+ "\n -Press 4 to modify hobby\n -Press 5 to modify phone number\n -Press 6 to modify age\n -Press 7 to modify time known");
						prgselect = read.readInt("Which program: ");

						System.out.println();
					}


					if(prgselect == 1){
						String nameModify = read.readLine("What do you want to change the name to?: ");

						person.get(modify).setName(nameModify);

						System.out.println("\nName Changed!");
					}


					if(prgselect == 2){
						person.get(modify).setStreetName(read.readLine("What do you want to change the street address to?: "));
						System.out.println("\nStreet Address Changed!");
					}


					if(prgselect == 3){
						person.get(modify).setCityName(read.readLine("What do you want to change the city name to?: "));
						System.out.println("\nCity Changed!");
					}


					if(prgselect == 4){
						person.get(modify).setHobby(read.readLine("What do you want to change the hobby to?: "));
						System.out.println("\nHobby Changed!");
					}

					if(prgselect == 5){
						person.get(modify).setPhoneNum(read.readLine("What do you want to change the phone number to?: "));
						System.out.println("\nPhone Number Changed!");
					}

					if(prgselect == 6){
						person.get(modify).setAge(read.readInt("What do you want to change the age to?: "));
						System.out.println("\nAge Changed!");
					}

					if(prgselect == 7){
						person.get(modify).setTimeKnown(read.readInt("What do you want to change the time known to?: "));
						System.out.println("\nTime Known Changed!");
					}

				}

			}
		}


		if(accountType.equals("b")){
			if(index > 0){
				while(prgselect != 0){
					System.out.println("\nMODIFY MENU:\n -Press 0 to end program\n -Press 1 to modify name\n -Press 2 to modify street address\n -Press 3 to to modify city"
							+ "\n -Press 4 to modify job title\n -Press 5 to modify phone number\n -Press 6 to modify money made\n -Press 7 to modify time working");
					prgselect = read.readInt("Which program: ");

					System.out.println();

					while(prgselect >= 6 || prgselect < 0 ){
						System.out.println("ERROR Reselect Program!!");
						System.out.println("\nMODIFY MENU:\n -Press 0 to end program\n -Press 1 to modify name\n -Press 2 to modify street address\n -Press 3 to to modify city"
								+ "\n -Press 4 to modify job title\n -Press 5 to modify phone number\n -Press 6 to modify money made\n -Press 7 to modify time working");
						prgselect = read.readInt("Which program: ");

						System.out.println();
					}

					if(prgselect == 1){
						String nameModify = read.readLine("What do you want to change the name to?: ");

						person.get(modify).setName(nameModify);

						System.out.println("\nName Changed!");
					}


					if(prgselect == 2){
						person.get(modify).setStreetName(read.readLine("What do you want to change the street address to?: "));
						System.out.println("\nStreet Address Changed!");
					}

					if(prgselect == 3){
						person.get(modify).setCityName(read.readLine("What do you want to change the city name to?: "));
						System.out.println("\nCity Changed!");
					}


					if(prgselect == 4){
						person.get(modify).setJob(read.readLine("What do you want to change the job to?: "));
						System.out.println("\nJob Changed!");
					}


					if(prgselect == 5){
						person.get(modify).setPhoneNum(read.readLine("What do you want to change the phone number to?: "));
						System.out.println("\nPhone Number Changed!");
					}


					if(prgselect == 6){
						person.get(modify).setMoneyMade(read.readInt("What do you want to change the money made to?: "));
						System.out.println("\nMoney Made Changed!");
					}


					if(prgselect == 7){
						person.get(modify).setTimeWorking(read.readInt("What do you want to change the time working to?: "));
						System.out.println("\nTime working Changed!");
					}

				}

			}
		}

	}

	public void printPeople (int programSELECT, ArrayList<Personclass> person) {
		int index = 0;

		System.out.println("ALL PEOPLE: \n");

		for(int a = 0; a < person.size(); a++){
			index++;
			System.out.println("\n" + person.get(a));
		}

		if(index == 0){
			System.out.println("\nUnable to find people to print!\n");
		}
	}

}
