package attendance.demo.service;

import org.springframework.stereotype.Component;

@Component
public class DataLoader  {

//    private CourseRepository courseRepository;
//    private CourseOfferingRepository courseOfferingRepository;
//
//    @Autowired
//    public DataLoader(CourseRepository courseRepository , CourseOfferingRepository courseOfferingRepository) {
//        this.courseRepository = courseRepository;
//        this.courseOfferingRepository =courseOfferingRepository;
//    }
//
//    public void run(ApplicationArguments args) {
//        LocalDate begindate = LocalDate.of(Integer.parseInt("2020"), Integer.parseInt("11"), Integer.parseInt("14"));
//        LocalDate enddate = LocalDate.of(Integer.parseInt("2021"), Integer.parseInt("12"), Integer.parseInt("19"));
//        courseRepository.save(new Course("cs544","EA","Spring"));
//        courseRepository.save(new Course("cs455","Algorithm","NP"));
//        courseRepository.save(new Course("cs467","WAP","Web"));
//        Course course = courseRepository.getOne(1);
//        courseOfferingRepository.save(new CourseOffering(course, begindate, enddate));
//    }
}