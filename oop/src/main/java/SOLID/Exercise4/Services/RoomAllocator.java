package main.java.SOLID.Exercise4.Services;

import main.java.SOLID.Exercise4.Room.Room;
import main.java.SOLID.Exercise4.Room.RoomType;

import java.util.List;

public interface RoomAllocator {

    Room allocateRoom(List<Room> rooms, RoomType roomType);
}
