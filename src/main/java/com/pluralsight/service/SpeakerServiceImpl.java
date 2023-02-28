package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class  SpeakerServiceImpl implements SpeakerService {
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
    @PostConstruct //runs after constructors have been called
    private void initialize(){
        System.out.println("In initialize, gets called after constructors");
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
