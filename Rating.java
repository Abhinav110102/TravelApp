/**
 * Class for handing a rating associated with a user.
 * @author Mark Valentino
 */
public class Rating {
  private String username;
  private int rating;
  // False means name is not visible.
  private boolean isNameVisible;
  
  /**
   * Constructor
   * @author Mark Valentino
   */
  public Rating(String username, int rating, boolean isNameVisible) {
    this.username = username;
    this.rating = rating;
    this.isNameVisible = isNameVisible;
  }

  /**
   * Method to hide a user's name on a review
   * @author Mark Valentino
   */
  public void HideName() {
    isNameVisible = false;
  }
}

