package main.java.SOLID.Exercise4.Services;

import main.java.SOLID.Exercise4.Room.Room;
import main.java.SOLID.Exercise4.Room.RoomType;

import java.util.List;

public class RoomAllocatorImpl implements RoomAllocator {

    @Override
    public Room allocateRoom(List<Room> rooms, RoomType requestedRoomType) {
        for(Room room : rooms) {
            if(room.isAvailable() && room.getType().equals(requestedRoomType)) {
                room.setAvailable(false);
                return room;
            }
        }
        throw new IllegalStateException("No available room of type " + requestedRoomType);
    }
}
