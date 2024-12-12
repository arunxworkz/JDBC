package com.xworkz.criminaldb.repository;

import com.xworkz.criminaldb.entity.CriminalEntity;

public interface CriminalRepository {
    boolean save(CriminalEntity entity);
}
