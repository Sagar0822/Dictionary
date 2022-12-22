package com.example.dictionarysagar11dec;

import java.util.HashMap;

public class DictionaryUsingHashMap {
    HashMap<String , String> dictionary;

    public DictionaryUsingHashMap() {  //right click generate - constructer shortcut
        this.dictionary = new HashMap<>();
        addWordList();
    }

    public boolean addWords(String word, String meaning){
        try{
            dictionary.put(word,meaning);
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
}
public String getMeaning(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        else{
            return "Word does not exist in dictionary!";
        }
}
private void addWordList(){
        addWords("hello" , "used when you meet somebody, for attracting somebody’s attention or when you are using the telephone");
        addWords("dictionary" , "a book that lists the words connected with a particular subject and tells you what they mean");
        addWords("word" , "a thing that you say; a short statement or comment");

}

}
