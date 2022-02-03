package lab2;

import java.awt.Color;
import java.util.Random;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {

  public void run() {
    Random r = new Random();
    int numRooms = r.nextInt(1) + 5; // Random number of rooms between 5 and 6

    Level level = new Level();

    Room[] rooms = new Room[numRooms];

    for (int i = 0; i < numRooms; i++) {
      rooms[i] = new Room(r.nextInt(10) + 1, r.nextInt(10) + 1,
          new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
      
      level.place(rooms[i], r.nextInt(10), r.nextInt(10));

      if (i != 0) {
        // rooms[i] är ditt current rum
        rooms[i - 1].connectNorthTo(rooms[i]);
        rooms[i].connectSouthTo(rooms[i - 1]); // Detta gör att vi får en dubbelriktad graf
      }
    }
  }

}