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
	       
	        // Helps setNAme of the Pigs 
	        pig1.setName("Jim");
	        pig2 = pig1;
	        pig2.Qink();
	        pig2.setName("Bob");
	        pig2.Qink();
	        pig1.setWeight(99);
	        pig2.Qink();
	        pig1.Qink();
	        
	       
	        Pigs[] myPigs = new Pigs[3];
	        myPigs[0] = new Pigs();
	        myPigs[1] = new Pigs();
	        myPigs[2] = pig1;
	        
	        myPigs[0].setName("Craig");
	        myPigs[0].setWeight(48);
	        myPigs[1].setName("Jack");
	        myPigs[1].setWeight(18);
	        myPigs[0].Qink();
	        }
	    
	    /* --------------------------------------------------------------*/
	    
	    public void setweight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	    public String setName() {
	    	return name;
	    }
	    
	    
	    public int getweight() {
	    	return weight;
	    }
	    
	    
	    
	    public void Qnik() {
	    	int pointless = 0;
	    	
	    	if (weight > 60) {
				char[] BigQink = null;
				System.out.println(BigQink);
	    	}// end if 
			
	    	else if (weight > 14) {
	    		char[] Qink = null;
				System.out.println(Qink);
	    	}
			
		}

		void Qink() {
			
			
		}

		// Set a new string name 
	    public void setName(String newName) {
	    	name = newName;
	    }
	    
	    // The parameter newWeight is sent here 
	    public void setWeight(int newWeight) {
	    	weight = newWeight;
	    }
	    
	    // This method send info back to the caller 
	    public String getName() {
	    	return name;
	    }
	    
	    public int getWeight() {
	    	return weight;
	    }
	    
}