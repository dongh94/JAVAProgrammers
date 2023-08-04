class babbling {
    /**
     * 프로그래머스 Level0 옹알이1 문제
     * Stirng을 비교할 때는 replace해서 다른 문자로 만든후
     * 다른 문자로 모두 다 변동이 안되었다면
     * 카운트 하지 않는다.
     * @return
     */
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = new String[] {"aya", "ye", "woo", "ma" };
        for (String bab : babbling) {
            for (String s : say) {
                bab = bab.replace(s, "*");
            }
            if (isAllright(bab)) {
                answer++;
            }
        }
        return answer;
    }

    public boolean isAllright(String str) {
        for (char ch : str.toCharArray()) {
            if (ch != '*') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        babbling bab = new babbling();
        int result = bab.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
        System.out.println(result);
    }
}
