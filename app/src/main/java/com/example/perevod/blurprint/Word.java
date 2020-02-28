package com.example.perevod.blurprint;

public class Word {
    private int id;
    private String word;
    private String trans;

    public Word(int id, String word, String trans) {
        this.id = id;
        this.word = word;
        this.trans = trans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String email) {
        this.word = word;
    }

    public String getTrans() {
        return trans;
    }

    public void setProvider(String provider) {
        this.trans = provider;
    }
}
