package com.murilorias.PhrasesOfTheDayApi.phrase;

public record PhraseResponseDTO(Long id, String title, String text, String tipofphrase, String image) {
    public PhraseResponseDTO(Phrase phrase){
        this(phrase.getId(), phrase.getTitle(), phrase.getText(), phrase.getTipofphrase(), phrase.getImage());
    }
}