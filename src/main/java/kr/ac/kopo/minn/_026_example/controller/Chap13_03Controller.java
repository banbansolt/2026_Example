package kr.ac.kopo.minn._026_example.controller;

import kr.ac.kopo.minn._026_example.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("PolyKim");
        person.setAge(20);
        person.setEmail("polykim@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}