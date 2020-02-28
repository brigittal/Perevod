package com.example.perevod.domain.provider;

import com.example.perevod.blurprint.Word;
import com.example.perevod.domain.UseCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MockEmPr implements DataProvider<Word>, UseCase {

    private List<Word> words;
    private static MockEmPr instance;
    private static Random random;

    private MockEmPr() {
        words = new ArrayList<>();
        random = new Random();
        words.add(new Word(random.nextInt(), "cat", "кошка"));
        words.add(new Word(random.nextInt(), "dog", "собака"));
        words.add(new Word(random.nextInt(), "pig", "свинья"));
        words.add(new Word(random.nextInt(), "cow", "корова"));
        words.add(new Word(random.nextInt(), "cock", "петух"));
    }

    public static MockEmPr instance() {
        if (instance == null) {
            instance = new MockEmPr();
        }
        return instance;
    }

    @Override
    public List<Word> getData() {
        return words;
    }

    @Override
    public List<Word> getData(int count) {
        if (count < 0) throw new IllegalStateException("count < 0");
        List<Word> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(words.get(random.nextInt(words.size() - 1)));
        }
        return list;
    }

    @Override
    public Word getOneItem() {
        return new Word(1, "mouse", "мышь");
    }
}
