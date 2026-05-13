package org.edu.features.characters.data;

import org.edu.features.characters.domain.CharacterModel;

import java.util.ArrayList;
import java.util.Objects;

public class CharacterMemLocalDataSource {
    private static CharacterMemLocalDataSource instance = null ;

    public CharacterMemLocalDataSource() {
    }

    ArrayList<CharacterModel> storage =new ArrayList<>();
    void save(CharacterModel characterModel){
        storage.add(characterModel);
    }
    public void  delte (String id ){
        storage.removeIf(characterModel -> Objects.equals(characterModel.getId(),id));
    }
    public  ArrayList<CharacterModel>getAll (){
        return storage ;
    }
    public CharacterModel getCharacterById(String id ){
        for (CharacterModel characterModel : storage){
            if (characterModel.getId()==id){
                return characterModel;
            }
        }
        return null ;
    }
    public static CharacterMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new CharacterMemLocalDataSource();
        }
        return instance ;
    }

}
