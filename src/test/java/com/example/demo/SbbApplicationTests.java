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
import java.util.Optional;


@SpringBootTest(classes = SbbApplication.class)
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
    	Optional<Question> oq = this.questionRepository.findById(1);
    	if(oq.isPresent()) {
    		Question q = oq.get();
    		assertEquals("sbb가 무엇인가요?", q.getSubject());
    		System.out.println("조회된 제목: " + q.getSubject());
    	}
    }
}
