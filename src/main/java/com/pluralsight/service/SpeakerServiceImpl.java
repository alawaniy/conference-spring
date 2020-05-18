package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl1;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

//    @Autowired
//    @Qualifier("speakerRepository1")
    private SpeakerRepository speakerRepository;


     @PostConstruct
     public void initailize()
     {
         System.out.println("PostCondtruct initlaize method called");
     }

    /*
    public SpeakerServiceImpl()
    {
       System.out.println("No Args Constructor invoked");
    }
     */

/*
    // Constructor Injection
//  @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository)
    {
        System.out.println("speakerRepository Constructor invoked");
            this.speakerRepository=speakerRepository;
    }
*/

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }

/*

    public SpeakerRepository getSpeakerRepository3() {
        return speakerRepository;
    }
*/
    // Setter Injection
    @Autowired
    public void setSpeakerRepository3(SpeakerRepository speakerRepository) {
        System.out.println("speakerRepository setter injection invoked");
        this.speakerRepository = speakerRepository;
    }

}
