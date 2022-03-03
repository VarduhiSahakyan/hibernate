
import com.pluralsight.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;


@Configuration
@ComponentScan("com.pluralsight")
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }
    @Bean
    public Calendar cal() throws  Exception {
        return calFactory().getObject();
    }
// setter injection

//    @Bean(name = "speakerService")
//    public SpeakerService getSpeakerService(){
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        service.setRepository(getSpeakerRepository());
//        return service;
//    }

    // constructor injection

//@Bean(name = "speakerService")
//@Scope(value = BeanDefinition.SCOPE_SINGLETON)
//public SpeakerService getSpeakerService(){
//    SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//    return service;
//}

    // aranc ays 2 i kashxati springy autowirdi ev componentScan annotationi shnorhiv

  /*  @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        return service;
    }


    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
    */


}
