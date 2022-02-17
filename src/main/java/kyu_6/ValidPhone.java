package kyu_6;

//https://www.codewars.com/kata/525f47c79f2f25a4db000025/train/java
public class ValidPhone {
    public static boolean validPhoneNumber(String phoneNumber) {
       return phoneNumber.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$");
    }
}