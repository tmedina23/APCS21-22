import java.util.*;

public class passport {
  String rawPassport = new String();

  String[] requiredFields = {"byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid"};
  ArrayList<String> presentFields = new ArrayList<String>();
  
  public boolean isValidPartOne(){
    String[] splitPassport = rawPassport.split(" ");
    for(String i : splitPassport){
      String[] fields = i.split(":");
      presentFields.add(fields[0]);
    }
    if(presentFields.containsAll(Arrays.asList(requiredFields))){
      System.out.println(presentFields);
      return true;
    } else {
      return false;
    }
  }
}