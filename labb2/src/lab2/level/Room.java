package lab2.level;

import java.awt.Color;

public class Room {
  Color floorColor = null;
  int width;
  int height;
  int x;
  int y;

  Room northDoor = null;
  Room eastDoor = null;
  Room southDoor = null;
  Room westDoor = null;

  public Room(int dx, int dy, Color color) {
    this.floorColor = color;
    this.width = dx;
    this.height = dy;
    System.out.println(dx + " " + dy + " " + color);
  }

  public void connectNorthTo(Room r) {
    this.northDoor = r;
  }

  public void connectEastTo(Room r) {
    this.eastDoor = r;
  }

  public void connectSouthTo(Room r) {
    this.southDoor = r;
  }

  public void connectWestTo(Room r) {
    this.westDoor = r;
  }
}
