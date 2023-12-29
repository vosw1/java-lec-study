package ex08.example;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        String url = "http://www.naver.com?username=ssar&password=1234";

        // username값과, password값 찾아보기
        String username = null;
        String password = null;

        // 1. 네이버 주소 분리
        String[] sites = url.split("\\?");
        for (String site : sites) {
            String[] logs = site.split("&");
            // username과 password 분리
            for (String log : logs) {
                System.out.println(log);

                // 키와 값 분리
                String[] ids = log.split("=");
                if (ids.length == 2) {
                    String key = ids[0];
                    String value = ids[1];

                    // username과 password 변수에 값 할당
                    if ("username".equals(key)) {
                        username = value;
                    } else if ("password".equals(key)) {
                        password = value;
                    }
                }
            }
        }
        // 결과 출력
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
