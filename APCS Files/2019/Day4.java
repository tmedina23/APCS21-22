class Main {
 public static boolean rules(int number) {
    int num = number;
    int currentDigit = num % 10;
    num = num/10;
    while(num > 0) {
      if (currentDigit < num % 10) {
        return false;
      } else {
        currentDigit = num % 10;
        num = num/10;
      }
    }
    //flag = false
    boolean flag = false;
    // reset number in question
    num = number;
    currentDigit = num % 10;
    num = num/10;
    //start loop
    while(num > 0) {
      //if current digits is = to the one to the left
      if (currentDigit == num % 10){
        //move left one digit, num % 10 = pervious current digit
        currentDigit = num % 10;
        num = num/10;
        //if the second digit from the first time = the third digit
        if (currentDigit == num % 10) {
          //flag = false (should only happen if there is a set of 3 or more)
          while (num > 0) {
            currentDigit = num % 10;
            num = num/10;
            if (currentDigit == num % 10){
              return false;
            }
          }
        } else {
          //flag = true (should only happens if there is a set of two)
          return true;
        }
      //if the first pair of digits weren't =
      } else {
        currentDigit = num % 10;
        num = num/10;
      }
    }
    if (flag == false) {
      return false;
    } else {
      return true;
    }

  }

  public static void loop(String[] range) {
    int min = Integer.parseInt(range[0]);
    int max = Integer.parseInt(range[1]);
    int numberOfPasswords = 0;
    for (int i = min; i <= max; i++) {
      if (rules(i) == true){
        System.out.println(i);
        numberOfPasswords += 1;
      }
    }
    System.out.println(numberOfPasswords);
  }

  public static void main(String[] args) {
    String range = "458753-566403";
    String arrayRange[] = range.split("-");
    loop(arrayRange);
    //System.out.println(rules(467777));
  }
}