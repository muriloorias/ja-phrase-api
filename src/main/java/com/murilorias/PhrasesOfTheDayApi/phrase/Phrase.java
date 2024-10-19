package com.murilorias.PhrasesOfTheDayApi.phrase;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "phrases")
@Entity(name = "phrases")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Phrase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String text;
    private String tipofphrase;
    private String image;

    public Phrase(PhraseRequestDTO data){
        this.title = data.title();
        this.text = data.text();
        this.tipofphrase = data.tipofphrase();
        this.image = data.image();
    }
}
