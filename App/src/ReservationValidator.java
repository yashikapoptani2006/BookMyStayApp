public class ReservationValidator {

    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {

        if (guestName == null || guestName.isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty");
        }

        if (!inventory.getRoomAvailability().containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type");
        }

        int available = inventory.getRoomAvailability().get(roomType);

        if (available <= 0) {
            throw new InvalidBookingException("No rooms available for selected type");
        }
    }
}