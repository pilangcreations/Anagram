/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagram.lib;

import java.util.ArrayList;

/**
 *
 * @author Ravindu Denuwan
 */
public class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "abstraction",
        "ambiguous",
        "arithmetic",
        "backslash",
        "bitmap",
        "circumstance",
        "combination",
        "consequently",
        "consortium",
        "decrementing",
        "dependency",
        "disambiguate",
        "dynamic",
        "encapsulation",
        "equivalent",
        "expression",
        "facilitate",
        "fragment",
        "hexadecimal",
        "implementation",
        "indistinguishable",
        "inheritance",
        "internet",
        "java",
        "localization",
        "microprocessor",
        "navigation",
        "optimization",
        "parameter",
        "patrick",
        "pickle",
        "polymorphic",
        "rigorously",
        "simultaneously",
        "specification",
        "structure",
        "lexical",
        "likewise",
        "management",
        "manipulate",
        "mathematics",
        "hotjava",
        "vertex",
        "unsigned",
        "traditional"};

    public StaticWordLibrary() {
    }

    @Override
    public String getWord(int index) {
        return WORD_LIST[index];
    }

    @Override
    public int getSize() {
        return WORD_LIST.length;
    }

    @Override
    public String[] getScrambledWord(int index) {
        ArrayList cts = new ArrayList();
        String word = this.getWord(index);
        char[] wordCharacter = word.toCharArray();
        for (char character : wordCharacter){
            cts.add(character);
        }
        StringBuilder builder = new StringBuilder();
        int size = cts.size();
        for(int i = 0; i < size; i++) {
            int idx = (int) (Math.random() * cts.size());
            builder.append(cts.get(idx));
            cts.remove(idx);
        }
        return new String[]{word, builder.toString()};
    }

}
