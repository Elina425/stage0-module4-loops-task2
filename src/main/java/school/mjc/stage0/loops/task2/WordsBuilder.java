package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String w = "";
        int i =0;
        while(i<chars.length && chars[i] != ' '){
            w+=chars[i];
            i++;
        }

    }
}
