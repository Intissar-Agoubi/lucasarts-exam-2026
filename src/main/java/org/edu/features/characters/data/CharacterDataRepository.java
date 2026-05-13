package org.edu.features.characters.data;

import org.edu.features.characters.domain.CharacterModel;
import org.edu.features.characters.domain.CharacterRepository;

import java.util.ArrayList;

public class CharacterDataRepository implements CharacterRepository {
    private CharacterMemLocalDataSource characterMemLocalDataSource ;

    public CharacterDataRepository(CharacterMemLocalDataSource characterMemLocalDataSource) {
        this.characterMemLocalDataSource = characterMemLocalDataSource;
    }

    @Override
    public void saveCharacter(CharacterModel characterModel) {

    }

    @Override
    public void deleteCharacter(String id) {

    }

    @Override
    public ArrayList<CharacterModel> getAllCharacter() {
        return null;
    }
}
