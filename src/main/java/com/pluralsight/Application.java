package com.pluralsight;

import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[])
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService sc1= applicationContext.getBean("speakerService",SpeakerService.class);

        System.out.println(sc1.findAll().get(0).getFirstName());
        System.out.println(sc1.findAll().get(0).getLastName());

        /* Case 1: Checking Singleton behaviour
        --------Both Object sc1 and sc2 gives the same object reference/address.---------
        com.pluralsight.service.SpeakerServiceImpl@1a75e76a
        com.pluralsight.service.SpeakerServiceImpl@1a75e76a

         */
        System.out.println(sc1);

        SpeakerService sc2= applicationContext.getBean("speakerService",SpeakerService.class);
        System.out.println(sc2);


         /* Case 1: Checking Prototype behaviour
        --------Object sc1 and sc2 are t distinct instance with Prototype---------
        com.pluralsight.service.SpeakerServiceImpl@1a75e76a
        com.pluralsight.service.SpeakerServiceImpl@5524cca1
         */


    }


}
