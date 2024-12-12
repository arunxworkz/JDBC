package com.xworkz.criminaldb.service;

import com.xworkz.criminaldb.dto.CriminalDTO;
import com.xworkz.criminaldb.entity.CriminalEntity;
import com.xworkz.criminaldb.repository.CriminalRepoImpl;
import com.xworkz.criminaldb.repository.CriminalRepository;
import org.springframework.stereotype.Service;

@Service
public class CriminalServiceImpl implements CriminalService{

    @Override
    public boolean save(CriminalDTO dto) {

        System.out.println("This is the dat from the service " +
                "impl "+dto.toString());

        CriminalEntity entity = new CriminalEntity();
        entity.setCriminal_name(dto.getCiminal_name());
        entity.setAge(dto.getCriminal_age());
        entity.setSection_applied(dto.getSection_applied());
        entity.setCriminal_hometown(dto.getCriminal_hometown());

        CriminalRepository criminalRepository = new CriminalRepoImpl();
        boolean saved = criminalRepository.save(entity);
        System.out.println(saved);
        return false;
    }
}
