package org.edu.features.characters.domain;

public class SaveCharacterUseCase {
    private CharacterRepository characterRepository ;

    public SaveCharacterUseCase(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }
    public void execute (CharacterModel characterModel){
        characterRepository.saveCharacter(characterModel);
    }
}
