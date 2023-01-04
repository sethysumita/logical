package Main;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String s1 = "ssly";
        int freq[] = new int[s1.length()];
        int i ,j;
        char string[]= s1.toCharArray();
        for(i =0;i<s1.length();i++) {
            freq[i] = 1;
            for (j = i + 1; j < s1.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    string[j] = '0';

                }
            }
        }
            System.out.println("corresponding frequency");
            for(i=0;i< freq.length;i++){
                if(string[i] != ' ' && string[i] != '0')
                    System.out.println(string[i] + "-" + freq[i]);
        }

    }
}
