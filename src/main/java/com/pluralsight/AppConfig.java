package com.pluralsight;


import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl1;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    /*
    @Bean(name="speakerService")
//  @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){

        //Constructor Injection
        //SpeakerServiceImpl sc  = new SpeakerServiceImpl(getSpeakerRepository());

        //Setter Injection
        //SpeakerServiceImpl sc  = new SpeakerServiceImpl();
        //sc.setSpeakerRepository(getSpeakerRepository());

        SpeakerServiceImpl sc  = new SpeakerServiceImpl();
        return sc;
    }

     */

    /*
    @Bean(name="speakerRepository")
//  @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

    @Bean(name="speakerRepository1")
//  @Bean
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerRepository getSpeakerRepository1(){
        return new HibernateSpeakerRepositoryImpl1();
    }

     */
}
