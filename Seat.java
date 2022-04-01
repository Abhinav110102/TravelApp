/**
 * Class for storing and determining seat data such as if it is an aisle 
 * seat or window seat on a seat in a flight. 
 * @author Mark Valentino
 */
public class Seat {
    // X position of seat as a number
    private int xPos;
    // y position of seat as a number
    private int yPos;
    // X position of seat as a letter
    private String column;
    private boolean isTaken;
    private boolean isWindowSeat = false;
    private boolean isAisleSeat = false;
    
    /**
     * Constructor. Calls setColum method since xPos is passed through.
     * @author Mark Valentino
     */
    Seat(int xPos, int yPos, boolean isTaken) {
      this.xPos = xPos;
      this.yPos = yPos;
      this.isTaken = isTaken;
      this.column = setColumn(xPos);
    }
    
    public Seat(String xPos, int yPos, boolean isTaken) {
      this.isTaken = isTaken;
      this.xPos = setXPos(xPos);
      this.yPos = yPos;
      this.column = setColumn(this.xPos);
    }

    /**
     * Method to determine the column letter of a seat which is needed for
     * printing a ticket.
     * @param xPos the column number to be converted to a column letter.
     * @return seatLetter the converted result.
     * @author Mark Valentino
     */
    public String setColumn(int xPos) {
      String seatLetter = "";
      switch(yPos) {
        case 0:
          seatLetter = "A";
          isWindowSeat = true;
          break;
        case 1:
          seatLetter = "B";
          break;
        case 2:
          seatLetter = "C";
          isAisleSeat = true;
          break;
        case 3:
          seatLetter = "D";
          isAisleSeat = true;
          break;
        case 4:
          seatLetter = "E";
          break;
        case 5:
          seatLetter = "F";
          isWindowSeat = true;
          break;
      }
      return seatLetter;
    }
    
    /**
     * Getter method that returns x position of seat.
     * @return xPos the x position of the seat.
     * @author Mark Valentino
     */
    public int getXpos() {
      return xPos;
    }
    
    /**
     * Getter method that returns y position of seat.
     * @return yPos the y position of the seat.
     * @author Mark Valentino
     */
    public int getYpos() {
      return yPos;
    }
    
    /**
     * Getter method that returns column letter of seat.
     * @return column the column letter of the seat.
     * @author Mark Valentino
     */
    public String getColumn() {
      return column;
    }
    
     /**
     * Getter method that returns if seat is taken.
     * @return isTaken the boolean to be returned.
     * @author Mark Valentino
     */
    public boolean isTaken() {
      return isTaken;
    }
    
     /**
     * Getter method that returns if seat is a window seat.
     * @return isWindowSeat the boolean to be returned.
     * @author Mark Valentino
     */
    public boolean isWindowSeat() {
      return isWindowSeat;
    }
    
    /**
     * Getter method that returns if seat is aisle seat.
     * @return isAisleSeat the boolean to be returned.
     * @author Mark Valentino
     */
    public boolean isAisleSeat() {
      return isAisleSeat;
    }
    
    /**
     * Method to fill a seat by changing isTaken to true.
     * @author Mark Valentino
     */
    public void fillSeat() {
      isTaken = true;
    }
    
    public int setXPos(String column) {
      if (column.equals("A")) {return 0;}
      if (column.equals("B")) {return 1;}
      if (column.equals("C")) {return 2;}
      if (column.equals("D")) {return 3;}
      if (column.equals("E")) {return 4;}
      return 5;
    }
  }
  
