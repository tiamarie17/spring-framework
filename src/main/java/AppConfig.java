import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.service.SpeakerService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanDescriptor;

//Configure spring application


@Configuration
@ComponentScan({"com.pluralsight"}) //tells it where to scan
public class AppConfig {
    //this is how we configure context of application without autowiring
    //The bean is a singleton, only one of them will get created
    //The speakerRepository bean is injected into the speakerService bean
    //this will get returned in our application when we call it
    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON) //or you could do scope prototype
    public SpeakerService getSpeakerService(){
        //using constructor injection (without autowiring)
        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        //using setter injection (without autowiring)
//        service.setRepository(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl(); //code for autowiring
        return service;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }

     */

}
