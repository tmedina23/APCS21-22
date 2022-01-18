class Main {
  public static int process(int[] arr) {
    for(int x=0; x < arr.length; x+=4){
      if(arr[x] == 1) { //opcode 1
        int index1 = arr[x+1];
        int index2 = arr[x+2];
        int storageIndex = arr[x+3];
        arr[storageIndex] = arr[index1] + arr[index2];
      } else if (arr[x] == 2){ // opcode 2
        int index1 = arr[x+1];
        int index2 = arr[x+2];
        int storageIndex = arr[x+3];
        arr[storageIndex] = arr[index1] * arr[index2];
      } else {
        break;
      }
    }
    return arr[0];
  }

  public static void main(String[] args) {
    int[] input = {1,12,2,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,6,19,23,1,10,23,27,2,27,13,31,1,31,6,35,2,6,35,39,1,39,5,43,1,6,43,47,2,6,47,51,1,51,5,55,2,55,9,59,1,6,59,63,1,9,63,67,1,67,10,71,2,9,71,75,1,6,75,79,1,5,79,83,2,83,10,87,1,87,5,91,1,91,9,95,1,6,95,99,2,99,10,103,1,103,5,107,2,107,6,111,1,111,5,115,1,9,115,119,2,119,10,123,1,6,123,127,2,13,127,131,1,131,6,135,1,135,10,139,1,13,139,143,1,143,13,147,1,5,147,151,1,151,2,155,1,155,5,0,99,2,0,14,0};

    //part 1
    System.out.println("Part One: "+process(input));

    //part 2 
    for(int noun = 0; noun < 100; noun++){
      for(int verb = 0; verb < 100; verb++){
        int[] newinput = input.clone();
        newinput[1] = noun;
        newinput[2] = verb;
        int output = process(newinput);
        System.out.println(output);
        System.out.println(input[1]+":"+input[2]);
        if(output == 19690720){
          System.out.println(100 * input[1] + input[2]);
        }
      }
    }
  }
}