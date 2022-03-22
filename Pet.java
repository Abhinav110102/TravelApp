/**
 * Class for managing a Pet and determining if a ticket is needed
 * for the pet.
 * @author Mark Valentino
 * //Should I put Abi as stub creator?
 */
public class Pet {

  private int weight;
  private String name; // ADD NAME TO UML

  /**
   * Constructor
   */
  public Pet(String name , int weight){
    this.name = name;
    this.weight = weight;
  }

  /**
   * Method to determine wether or not a ticket is needed
   * since pets above a certain weight need a ticket.
   * @return true if wieght > 16
   */
  public boolean ticketNeeded(){ // NEED EXACT WEIGHT
    if (weight > 16) {
      return true;
    }
  }
}

