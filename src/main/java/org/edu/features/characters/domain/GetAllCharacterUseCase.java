package org.edu.features.characters.domain;

import java.util.ArrayList;

public class GetAllCharacterUseCase {
    private CharacterRepository characterRepository ;

    public GetAllCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }
    public ArrayList<CharacterModel> execute (){
        return characterRepository.getAllCharacter();
    }
}
