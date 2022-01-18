import java.util.*;

class day6 {
    public static void main(String[] args) {
        int[] input = {4,1,1,4,1,2,1,4,1,3,4,4,1,5,5,1,3,1,1,1,4,4,3,1,5,3,1,2,5,1,1,5,1,1,4,1,1,1,1,2,1,5,3,4,4,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1,5,1,1,1,4,1,2,3,5,1,2,2,4,1,4,4,4,1,2,5,1,2,1,1,1,1,1,1,4,1,1,4,3,4,2,1,3,1,1,1,3,5,5,4,3,4,1,5,1,1,1,2,2,1,3,1,2,4,1,1,3,3,1,3,3,1,1,3,1,5,1,1,3,1,1,1,5,4,1,1,1,1,4,1,1,3,5,4,3,1,1,5,4,1,1,2,5,4,2,1,4,1,1,1,1,3,1,1,1,1,4,1,1,1,1,2,4,1,1,1,1,3,1,1,5,1,1,1,1,1,1,4,2,1,3,1,1,1,2,4,2,3,1,4,1,2,1,4,2,1,4,4,1,5,1,1,4,4,1,2,2,1,1,1,1,1,1,1,1,1,1,1,4,5,4,1,3,1,3,1,1,1,5,3,5,5,2,2,1,4,1,4,2,1,4,1,2,1,1,2,1,1,5,4,2,1,1,1,2,4,1,1,1,1,2,1,1,5,1,1,2,2,5,1,1,1,1,1,2,4,2,3,1,2,1,5,4,5,1,4};
        ArrayList<Integer> input2 = new ArrayList<Integer>();
        for(int i : input){
            input2.add(i);
        }
        System.out.println(Collections.frequency(input2, 1));
        System.out.println(Collections.frequency(input2, 2));
        System.out.println(Collections.frequency(input2, 3));
        System.out.println(Collections.frequency(input2, 4));
        System.out.println(Collections.frequency(input2, 5));
        System.out.println(Collections.frequency(input2, 6));
        System.out.println(Collections.frequency(input2, 7));
        System.out.println(Collections.frequency(input2, 8));
        long[] lanternfish = {0,Collections.frequency(input2, 1),Collections.frequency(input2, 2),Collections.frequency(input2, 3),Collections.frequency(input2, 4),Collections.frequency(input2, 5),Collections.frequency(input2, 6),Collections.frequency(input2, 7),Collections.frequency(input2, 8)};
        for(int days=0; days<256; days++){
            System.out.println(Arrays.toString(lanternfish));
            long numOfFishChange = lanternfish[0];
            for(int fish=1; fish<lanternfish.length; fish++){
                    lanternfish[fish-1] = lanternfish[fish];
            }
            lanternfish[6] += numOfFishChange;
            lanternfish[8] = numOfFishChange;
            System.out.println(numOfFishChange);
        }
        long sumOfFish = 0;
        for(int i=0; i<lanternfish.length;i++){
            sumOfFish+=lanternfish[i];
        }
        System.out.println(sumOfFish);
    }
}