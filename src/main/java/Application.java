import com.pluralsight.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[]){
        //loading Appconfig class into application context
        //will register two beans (speakerService and speakerRepository)
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        SpeakerService service = new SpeakerServiceImpl(); w/o Spring
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println("service is " + service);
        System.out.println(service.findAll().get(0).getFirstName());

        //When this is printed, you will get the same result/ object address instance as service because it is a singleton

        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);
        System.out.println("service2 is " + service2);
    }
}
