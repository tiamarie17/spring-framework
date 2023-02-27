package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
//what code looks like with Spring
    //configuring our SpeakerServiceImpl to be injected rather than having hard-coded configured instances

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("in SpeakerServiceImpl no args constructor");
    }
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("in SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

//    @Autowired //this automatically injects SpeakerRepository bean into this setter
    public void setRepository(SpeakerRepository repository) {
        System.out.println("in SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
