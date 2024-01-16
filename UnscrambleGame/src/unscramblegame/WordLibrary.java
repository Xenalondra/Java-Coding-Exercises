/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unscramblegame;

/**
 *
 * @author Alondra Bio
 */
public class WordLibrary {
    private String word;
    private String scrambled;
    

    WordLibrary(String scrambled, String word){
        this.word = word;
        this.scrambled = scrambled;
    }
    
    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the scrambled
     */
    public String getScrambled() {
        return scrambled;
    }

    /**
     * @param scrambled the scrambled to set
     */
    public void setScrambled(String scrambled) {
        this.scrambled = scrambled;
    }
    
    
}
