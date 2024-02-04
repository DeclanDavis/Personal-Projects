import java.util.Scanner;

public class MadLibs_1 {
  /*
  This program generates a mad libbed story.
  Author: Declan
  Date: 22/08/2023
  */
  	public static void main(String[] args){

  	Scanner sc = new Scanner(System.in);
  	
  	System.out.println("Please enter 2 people's names.");
  	
  	//String array to store the inputed names
  	String [] names = new String[2];
  	names[0] = sc.nextLine();
  	names[1] = sc.nextLine();
  	
  	System.out.println("Please enter 5 adjectives.");

  	//String array to store the inputed adjectives
  	String [] adjectives = new String[5];
  	for(int i = 0; i<adjectives.length;i++) {
  	adjectives[i] = sc.nextLine();
  	} 	

  	System.out.println("Please enter a verb.");
    String verb1 = sc.nextLine();

    System.out.println("Please enter 6 foods.");
    
    String [] items = new String[6];
    for(int i = 0; i < items.length; i++) {
    	items[i] = sc.nextLine();
    }
    
    System.out.println("Please enter a number.");
    long number = sc.nextLong();
    sc.nextLine(); //consume the newline character

    System.out.println("Please enter a country.");
    String place1 = sc.nextLine();   
    
    
      
      
    //The template for the story
    String story = "This morning "+names[0]+" woke up feeling "+adjectives[0]+". 'It is going to be a "+adjectives[1]+
    		" day!' said "+names[0]+". \nOutside, a bunch of "+items[0]+"s were protesting to keep "+items[1]+" in stores. They began to "+verb1+
    		" to the rhythm of the "+items[2]+", which made all the "+items[3]+"s very "+adjectives[2]+". \nConcerned, "+names[0]+" texted "+names[1]+", "
    				+ "who flew "+names[0]+" to "+place1+" and dropped "+names[0]+" in a puddle of frozen "+items[4]+". "+names[0]+" woke up in the year "
    						+ ""+number+", in a world where "+items[5]+"s ruled the world.";
    
    
    //The template for a story
    String story1 = "One day, "+names[0]+" and "+names[1]+" decided to embark on an "+adjectives[0]+" adventure. The weather was "+adjectives[1]+", and the air felt "+adjectives[2]+". They "+verb1+" to gather their essentials for the journey."
    		+ "\nPacking their bags, they included "+items[0]+", "+items[1]+", "+items[2]+" and "+items[3]+". Silly old "+names[0]+" wanted to pack a "+items[4]+" but swapped it for a "+items[5]+" upon "+names[1]+"'s advice."
    				+ "\nSetting off, they travelled for "+number+" hours until they reached "+place1+". The surroundings were "+adjectives[3]+", and the atmosphere was filled with "+adjectives[4]+" vibes. \n"+names[0]+ " and "+names[1]+" "
    						+ "couldn't help but marvel at the beauty of "+place1+"."
    								+ "\nAs they continued their journey, unexpected encounters with "+adjectives[3]+" creatures and " +adjectives[0]+ " landscapes made the adventure even more "+adjectives[1]+
    								". \nIn the end, "+names[0]+" and "+names[1]+" reflected on the day's events, realising that sometimes, the most "+adjectives[2]+" journeys lead to the most "+adjectives[3]+" memories.";
    		
    System.out.println(story);
    System.out.println();
    System.out.println(story1);
    }       
}
