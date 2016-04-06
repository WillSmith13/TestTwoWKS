package edu.saintjoe.cs.wills.TestCodeWKS;


public class Pigs {

		// Sets pig name
	    public String name;
	    
	    // This value represents the pig's size
	 public int weight;
	    
	    /* -------------------------------------------------------- */
	    
	    
	    public static void main(String[] args) {
	        Pigs pig1 = new Pigs();
	        Pigs pig2;
	        pig1.Qnik();
	        
	        // Giving pig name 
	        pig1.name = "Jim";
	        
	        pig1.setName("Jim");
	        pig2 = pig1;
	        pig2.Quik();
	        pig2.setName("Bob");
	        pig2.Quik();
	        pig1.setWeight(100);
	        pig2.Quik();
	        pig1.Quik();
	        
	       
	        Pigs[] myDogs = new Pigs[3];
	        myDogs[0] = new Pigs();
	        myDogs[1] = new Pigs();
	        myDogs[2] = pig1;
	        
	        myDogs[0].setName("Fred");
	        myDogs[0].setWeight(42);
	        myDogs[1].setName("Marge");
	        myDogs[1].setWeight(13);
	        myDogs[0].bark();
	        }
	    
	    /* --------------------------------------------------------------*/
	    
	    // Instance methods begin here
	    
	    
	    // In a "standard" class, there is one getter and one setter for each instance variable
	    //   NOTE: the fancy CS names are accessor and mutator
	    public void setName(String newName) {
	    	name = newName;
	    }
	    
	    // The parameter newWeight is sent into this method see p. 74
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	    // This method returns information back to the caller see p. 75
	    public String getName() {
	    	return name;
	    }
	    
	    public int getWeight() {
	    	return weight;
	    }
	    
}