package com.murilorias.PhrasesOfTheDayApi.controller;

import com.murilorias.PhrasesOfTheDayApi.phrase.Phrase;
import com.murilorias.PhrasesOfTheDayApi.phrase.PhraseRepository;
import com.murilorias.PhrasesOfTheDayApi.phrase.PhraseRequestDTO;
import com.murilorias.PhrasesOfTheDayApi.phrase.PhraseResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("phrases")
public class PhraseController {
    @Autowired
    private PhraseRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void savePhrase(@RequestBody PhraseRequestDTO data){
        Phrase phraseData = new Phrase(data);
        repository.save(phraseData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<PhraseResponseDTO> getAll(){

        List<PhraseResponseDTO> phraseList = repository.findAll().stream().map(PhraseResponseDTO::new).toList();
        return phraseList;
    }
}
