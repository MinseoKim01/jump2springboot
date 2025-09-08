package com.mysite.sbb.question;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    
    @Transactional(readOnly = true)
    public List<Question> getList() {
        return this.questionRepository.findAll();
    }
}