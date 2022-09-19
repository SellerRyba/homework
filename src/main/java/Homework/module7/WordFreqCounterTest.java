package Homework.module7;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("daavhe pukuq Vy pinakado kibymerax", "Vy"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}
class WordFreqCounter{
    public float countFreq(String phrase, String word){
        String [] arr = phrase.toLowerCase().split(" ");
        float count = 0f;
        for (String ar: arr) {
            if (ar.equals(word.toLowerCase())){
                count += 1;
            }
        }
        float result = (count / arr.length);
        return result;
    }
}
