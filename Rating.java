public class Rating {
  private String username;
  private int rating;
  // False means name is not visible.
  private boolean isNameVisible;
  
  public Rating(String username, int rating, boolean isNameVisible) {
    this.username = username;
    this.rating = rating;
    this.isNameVisible = isNameVisible;
  }

  public void HideName() {
    isNameVisible = false;
  }
}

