/**
 * @author Mark Valentino
 */
public class Seat {
  
    private int xPos;
    private int yPos;
    private String column;
    private boolean isTaken = false;
    private boolean isWindowSeat = false;
    private boolean isAisleSeat = false;
    
    Seat(int xPos, int yPos) {
      this.xPos = xPos;
      this.yPos = yPos;
      this.column = setColumn(yPos);
    }
    
    public String setColumn(int yPos) {
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
    
    public int getXpos() {
      return xPos;
    }
    
    public int getYpos() {
      return yPos;
    }
    
    public String getColumn() {
      return column;
    }
    
    public boolean isTaken() {
      return isTaken;
    }
    
    public boolean isWindowSeat() {
      return isWindowSeat;
    }
    
    public boolean isAisleSeat() {
      return isAisleSeat;
    }
    
    public void fillSeat() {
      isTaken = true;
    }
    
  }
  