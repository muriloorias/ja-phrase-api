package com.murilorias.PhrasesOfTheDayApi.phrase;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PhraseRepository extends JpaRepository<Phrase, Long> {

}
