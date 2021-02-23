/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagram.lib;

/**
 *
 * @author Ravindu Denuwan
 */
public abstract class WordLibrary {

    protected WordLibrary() {
    }
    
    public abstract String getWord(int index);

    public abstract int getSize();
    
    public abstract String[] getScrambledWord(int index);
}
