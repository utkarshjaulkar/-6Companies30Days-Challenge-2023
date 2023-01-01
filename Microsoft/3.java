package Microsoft;

class Solution {
    public String getHint(String secret, String guess) {
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];
        int bulls = 0;
        char sChar, gChar;
        for (int i = 0; i < secret.length(); i++) {
            sChar = secret.charAt(i);
            gChar = guess.charAt(i);
            if (sChar == gChar) {
                bulls++;
            } else {
                secretCount[sChar - '0']++;
                guessCount[gChar - '0']++;
            }
        }
        int cows = 0;
        for (int i = 0; i < secretCount.length; i++) {
            cows += Math.min(secretCount[i], guessCount[i]);
        }
        return new StringBuilder().append(bulls).append('A').append(cows).append('B').toString();
    }
}
