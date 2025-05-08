package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_makeRoomOccupied() {
        //arrange
        Room room = new Room(2, 100.0, false, false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkOut_shouldnot_makeRoomOccupied() {
        //arrange
        Room room = new Room(2, 100.0, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
    }
}