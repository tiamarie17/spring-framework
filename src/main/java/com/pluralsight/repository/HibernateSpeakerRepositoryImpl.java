package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }") //grabs a value out of the java.lang.Math library
    private double seedNum;

    public List<Speaker> findAll() {
        //declare a new array
        List<Speaker> speakers = new ArrayList<Speaker>();
        //create a new instance of Speaker object
        Speaker speaker = new Speaker();
        speaker.setFirstName("Tia");
        speaker.setLastName("Marie");
        speaker.setSeedNum(seedNum); //storing seedNum inside of speaker object

        System.out.println("cal: " + cal.getTime());
        System.out.println("seedNum is " + seedNum);

        speakers.add(speaker);

        return speakers;
    }
}
