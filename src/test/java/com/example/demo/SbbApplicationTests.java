package com.example.demo;

import com.mysite.sbb.SbbApplication; 
import com.mysite.sbb.Question;
import com.mysite.sbb.QuestionRepository;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.List;
import java.util.Optional;


@SpringBootTest(classes = SbbApplication.class)
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {        
    	assertEquals(2,this.questionRepository.count());
    	Optional<Question> oq = this.questionRepository.findById(1);
    	assertTrue(oq.isPresent());
    	Question q = oq.get();
    	this.questionRepository.delete(q);
    	assertEquals(1, this.questionRepository.count());
    }
}
