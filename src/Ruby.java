public class Ruby {

    // считает количество одинаковых знаков
    public int count(String word, int i) {
        int count = 1;
        for (int j = i + 1; j < word.length(); j++) {
            if (word.charAt(i) == word.charAt(j)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // создается новое число
    public String newWord(String word) {
        StringBuilder ans = new StringBuilder();

        int i = 0;
        while (i < word.length()) {
            ans.append(count(word, i)).append(word.charAt(i));
            i += count(word, i);
        }
        return ans.toString();
    }
}
