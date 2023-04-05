public class array {
    public static void main(String[] args) {
        String[] classGroup = {"Test", "1", "2", "3"};      //배열의 정의
        System.out.println(classGroup[1]);      //배열의 출력

        //배의을 정의하는 다른 방법
        String[] testGroup = new String[4];
        testGroup[0] = "Test";
        System.out.println(testGroup[0]);
        testGroup[1] = "22";
        System.out.println(testGroup[1]);

        System.out.println(classGroup.length);      //.length는 배열의 길이
        //결과 : 4
    }
}