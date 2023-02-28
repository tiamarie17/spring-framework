package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    public List<Speaker> findAll() {
        //declare a new array
        List<Speaker> speakers = new ArrayList<Speaker>();
        //create a new instance of Speaker object
        Speaker speaker = new Speaker();
        speaker.setFirstName("Tia");
        speaker.setLastName("Marie");

        System.out.println("cal: " + cal.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
