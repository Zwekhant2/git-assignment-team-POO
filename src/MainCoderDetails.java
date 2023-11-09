import java.util.Scanner;

public class MainCoderDetails {
	//Ilyas is doing Attributes
	
	//Attributes
	public String name;
	public int age;
	public String nationality;
	
	
	//Nirob is doing Methods
	
	// Methods
	static void printInformation() {
		System.out.println("Enter name of the coder " + "\n" + "Nirob" +"\n" + "Liam" +"\n"+ "Ilyas" + "\n" + "Le khang");
	}
	
	//Le Khang is doing constructor
	public	MainCoderDetails (String coderName, int coderAge, String coderNationality){
		this.name=coderName;
		this.age=coderAge;
		this.nationality=coderNationality;
		

		
			System.out.println("Name : " + coderName );
			System.out.println("Age : " + coderAge);
			System.out.println("nationality : " + coderNationality);
	}
	
	//Liam is doing objects
	public static void main(String[] args) {

		printInformation();

	Scanner in=new Scanner(System.in);
	System.out.println("Enter name");
	String userInput= in.nextLine();
		
	if(userInput.equalsIgnoreCase("Nirob")) {
		
		 MainCoderDetails objectNirob = new  MainCoderDetails("Nirob" , 22, "Bangladeshi");
	}
	else if (userInput.equalsIgnoreCase("Liam")) {
		
		 MainCoderDetails objectLiam= new MainCoderDetails("Liam" , 20 , "Myanmar");
	}		

	else if (userInput.equalsIgnoreCase("Le Khang")) {
		 MainCoderDetails objectNirob = new  MainCoderDetails("Le Khang" , 20, "Vietnam");
	}
	
	else if(userInput.equalsIgnoreCase("Ilyas")) {
		
		 MainCoderDetails objectNirob = new  MainCoderDetails("Ilyas" , 20, "Morocco");
		
		}
	}
}