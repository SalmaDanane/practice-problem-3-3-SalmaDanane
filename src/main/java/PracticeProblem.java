public class PracticeProblem{

    public static void main(String args[]){
    }

    public static String evenOrOdd(int num){
 String bum;
 if (num == 0){
    bum = "Zero";
 }
 else if (num % 2 == 0) {
    bum = "Even";
 }
 else {
    bum = "Odd";
 }
 return bum;
    }

public static String positiveOrNegative(int num) {
    String pon;

    if (num > 0 ){
        pon = "Positive";
    }
    else if (num < 0){
        pon = "Negative";

    }
    else {
        pon = "Zero";
    }
    return pon;
}


public static String pluralize(String word) {

    word = word.toLowerCase();
    String bird = "something";

    if(word.endsWith("ey")){
        bird = "eys";
    }
    else if (word.endsWith("ife")){
        bird = "ives";
    }
    else if (word.endsWith("y")){
        bird = "ies";
    }
    else {
        bird = "s";
    }
    return bird;


}
    
}
