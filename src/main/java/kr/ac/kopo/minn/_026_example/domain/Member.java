package kr.ac.kopo.minn._026_example.domain;

import lombok.Data;
import lombok.Setter;

@Data
public class Member {
    private String id;
    private String passwd;
    private String city;
    private String gender;
    private String[] hobby;
    private String greetings;
}