package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ArrayList;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        //declare a new array
        List<Speaker> speakers = new ArrayList<Speaker>();
        //create a new instance of Speaker object
        Speaker speaker = new Speaker();
        speaker.setFirstName("Tia");
        speaker.setLastName("Marie");

        speakers.add(speaker);

        return speakers;
    }
}
