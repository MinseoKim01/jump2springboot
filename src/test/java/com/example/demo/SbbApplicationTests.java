package com.example.demo;

import com.mysite.sbb.SbbApplication; 
import com.mysite.sbb.Question;
import com.mysite.sbb.QuestionRepository;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;


@SpringBootTest(classes = SbbApplication.class)
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
    	List<Question> all = this.questionRepository.findAll();
    	assertEquals(2, all.size());
    	
    	Question q = all.get(0);
    	assertEquals("sbb가 무엇인가요?", q.getSubject());
    }
}
