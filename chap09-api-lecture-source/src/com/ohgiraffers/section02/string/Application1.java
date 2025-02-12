package com.ohgiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {

        /* 설명.
        *    String 은 불변 객체 -> 값을 할당하게 되면, 객체를 할당
        * 
        *
        *  */
        /* 수업목표. Strnig 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
        /* 목차. 1. charAt() */
        String str1 = "apple";

        for(int i=0; i<str1.length(); i++){
            System.out.println("charAt(" + i + ") = " + str1.charAt(i));
        }

        /* 목차. 2. compareTo()
                문자열a.compareTo(  answkduf
                문자열을 사전순으로 비교
                같으면 0 반환
                다르면 음수/양수 ->
        * */
        String str2 = "java";
        String str3 = "java";
        String str4 = "Java";
        String str5 = "mariaDB";

        int j = 'j';
        int J = 'J';
        System.out.println("j = " + j);
        System.out.println("J = " + J);
        System.out.println(str2.compareTo(str3));   // 같음 => 0 반환
        System.out.println(str2.compareTo(str4));   // 다름  => 매개변수보다 큼 (양수 반환)
        System.out.println(str4.compareTo(str2));
        System.out.println(str2.compareTo(str5));
        System.out.println(str5.compareTo(str2));
        // 정수값이 반환됨 (???)

        /* 목차. 3. concat() */
        System.out.println("concat() : " + str2.concat(str5));

        /* 목차. 4. indexOf() */
        String indexOf = "java mariaDB";
        System.out.println("indexOf('a'))= " + indexOf.indexOf('z'));
        System.out.println("indexOf('z')= " + indexOf.indexOf('z'));
        // 특정 인덱스가 존재하지 않으면 -1 을 출력
        // 특정 문자가 여러 개일 경우 문자의 갯수를 반환

        /* 목차. 5. trim()
        *       공백 제거
        * */
        String trimStr = "    java     ";
        System.out.println("trimStr # " + trimStr.trim() + "#");
        System.out.println("trim(): #" + trimStr.trim() + "#");

        /* 목차. 6. toLowerCase() / toUpperCase()
        *
        * */
        String caseStr = "javamariaDB";

        System.out.println("toLowerCase()= " + caseStr.toLowerCase());
        System.out.println("toUpperCase()= " + caseStr.toUpperCase());


        /* 목차. sunbsting(=ringe */
        String javamariaDB = "javamariaDB";
        System.out.println("substring(3, 6) : " + javamariaDB.substring(3, 6));
        System.out.println("substring(3) : " + javamariaDB.substring(3));
        System.out.println("javamariaDB: " + javamariaDB);

        /* 목차. 8. replace()
        *   타겟을 교체
        * */
        System.out.println("replace() : " + javamariaDB.replace("java", "python"));
        System.out.println("javamariaDB: " + javamariaDB);
        
        /* 목차. 9. length()
        *       문자열의 길이를 반환
        * */
        System.out.println("length() : " + javamariaDB.length());
        System.out.println("javamariaDB: " + javamariaDB);
        
        
        /* 목차. 10. isEmpty() 
        *       빈 문자열인지에 따라 true/false 형태로 출력  
        * */
        System.out.println("\"\".isEmpty() = " + "".isEmpty());
        System.out.println("\"\".isEmpty() = " + "ABC".isEmpty());





    }
}
