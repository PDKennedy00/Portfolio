
public class PetDogJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//all instance variables for pet class are defined here
	private String petType;
	private String petName;
	private String petAge;
	private String dogSpaces;
	private String catSpaces;
	private String daysStay;
	private String amountDue;
	
	//all accessor and mutators are defined here
	
	public String getPetType() {
		return petType;
		
	}
	
	public void setPetType() {
		this.petType = petType;
		
	}
	
	public String getPetName() {
		return petName;
		
	}
	
	public void setPetName() {
		this.petName = petName;
		
	}
	
	public String getPetAge() {
		return petAge;
		
	}
	
	public void setPetAge() {
		this.petAge = petAge;
		
	}
	
	public String getDogSpace() {
		return dogSpace;
		
	}
	
	public void setDogSpace(String dogSpace) {
		this.dogSpace = dogSpace;
		
	}
	
	public String getCateSpace() {
		return catSpace;
		
	}
	
	public void setCatSpace(String catSpace) {
		this.catSpaces = catSpace;
		
	}
	
	public int getDaysStay() {
		return daysStay;
		
	}
	
	public void SetDaysStay(int daysStay) {
		this.daysStay = daysStay;
		
	}
	
	public double getAmountDue() {
		return amountDue;
		
	}
	
	public void setAmountDue() {
		return amountDue;
		
	}
	
	//all required methods from UML is defined here
	public void checkIn() {}
	public void checkOut() {}
	public Pet getPet() { return null; }
	public void createPet() {}
	public void updatePet() {}
	
}

//this subclass is for dogs and inherits all properties of PetDogJavaClass
public class Dog extends PetDogJavaClass {
	//all instance variable for Dog class are defined here
	public int dogSpaceNbr;
	public double dogWeight;
	public String grooming;
	
	public Dog() {}
	
	public Dog(int dogSpaceNbr, double dogWeight, String grooming) {
		this.dogSpaceNbr = dogSpaceNbr;
		this.dogWeight = dogWeight;
		this.grooming = grooming;
		
	}
	
	public int getDogSpaceNbr() {
		return dogSpaceNbr;
		
	}
	
	public void setDogSpaceNbr(int dogSpaceNbr) {
		this.dogSpaceNbr = dogSpaceNbr;
		
	}
	
	public double getDogWeight() {
		return dogweight;
		
	}
	
	public void setDogWeight(double dogWeight) {
		this.dogWeight = dogWeight;
		
	}
	
	public String getGrooming() {
		return grooming;
		
	}
	
	public void setGrooming() {
		this.grooming = grooming;
	}
}
