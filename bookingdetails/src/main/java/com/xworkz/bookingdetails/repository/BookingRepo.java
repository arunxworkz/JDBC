package com.xworkz.bookingdetails.repository;

import com.xworkz.bookingdetails.dto.BookingDTO;

public interface BookingRepo {
    boolean save(BookingDTO bookingDTO);
}
