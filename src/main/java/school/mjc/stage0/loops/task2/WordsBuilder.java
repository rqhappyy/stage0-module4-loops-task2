package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        int i = 0;
        StringBuilder result = new StringBuilder();
        while(i<=chars.length-1){
            result.append(chars[i]);
            i++;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        buildPhrase('m','a','m','a');
    }
}
