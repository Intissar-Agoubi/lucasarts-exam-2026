package org.edu.features.characters.domain;

import java.util.ArrayList;

public interface CharacterRepository {
    void saveCharacter(CharacterModel characterModel) ;
    void deleteCharacter (String id );
    ArrayList<CharacterModel>getAllCharacter ();
}
