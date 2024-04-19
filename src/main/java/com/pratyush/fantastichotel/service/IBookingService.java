package com.pratyush.fantastichotel.service;

import com.pratyush.fantastichotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();
    List<BookedRoom> getBookingsByUserEmail(String email);
}
