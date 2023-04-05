//배열과 반복문의 결합

public class array_ex01 {
    public static void main(String[] args) {
        String[] members = {"김", "이", "박", "곽"};
        for(int i = 0; i<members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다.");
        }
    }
}