/**
 * Class for managing a Pet and determining if a ticket is needed
 * for the pet. Child of Family class
 * @author Mark Valentino
 */
public class Pet extends Family {

  private int weight;
  private String name;

  /**
   * Constructor
   */
  public Pet(String name, int weight, int age){
    super(name, "", age);
    this.name = name;
    this.weight = weight;
  }

  /**
   * Method to determine wether or not a ticket is needed
   * since pets above a certain weight need a ticket.
   * @return true if weight >= 35
   */
  public boolean ticketNeeded(){ 
    return weight >= 35;
  }
}
