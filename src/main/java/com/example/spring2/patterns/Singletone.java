package com.example.spring2.patterns;

public class Singletone {
    public static void main(String[] args) {
        Tone tone1 = Tone.getInstance();
        Tone tone2 = Tone.getInstance();
        System.out.println(tone1);
        System.out.println(tone2);
    }
}

class Tone {
    private static Tone tone = null;

    public static Tone getInstance() {
        if (tone == null) {
            tone = new Tone();
        }
        return tone;
    }
}
