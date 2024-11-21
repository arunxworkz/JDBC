package com.xworkz.bookingdetails.service;

import com.xworkz.bookingdetails.dto.BookingDTO;
import com.xworkz.bookingdetails.repository.BookingRepoImpl;

public class BookingServiceImpl implements BookingService{
    @Override
    public boolean save(BookingDTO bookingDTO) {


        BookingRepoImpl bookreimpl = new BookingRepoImpl();
        return bookreimpl.save(bookingDTO);
    }
}
