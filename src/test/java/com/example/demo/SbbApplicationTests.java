package com.example.demo;

import com.mysite.sbb.SbbApplication; 
import com.mysite.sbb.Question;
import com.mysite.sbb.QuestionRepository;
import com.mysite.sbb.Answer;
import com.mysite.sbb.AnswerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;


@SpringBootTest(classes = SbbApplication.class)
class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    
    @Autowired
    private AnswerRepository answerRepository;

    @Test
    void testJpa() {        
    	Optional<Answer> oa = this.answerRepository.findById(1);
        assertTrue(oa.isPresent());
        Answer a = oa.get();
        assertEquals(2, a.getQuestion().getId());
    }
}
