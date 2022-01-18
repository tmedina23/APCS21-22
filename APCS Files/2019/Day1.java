public class Main {
  public static int partTwo(int starting_point) {
    int massTotal = 0;
    int currentTotal = starting_point;
    while (currentTotal > 2) {
      currentTotal = (currentTotal/3)-2;
      if (currentTotal > 0) {
        massTotal += currentTotal;
      }
    }
    return massTotal;
  }
  public static int partOne(int starting_point) {
    int massTotal = 0;
    int currentTotal = starting_point;
    currentTotal = (currentTotal/3)-2;
    if (currentTotal > 0) {
      massTotal += currentTotal;
    }
    return massTotal;
  }

  public static void main(String[] args) {
    int[] MassArray = {116115, 58728, 102094, 104856, 86377, 97920, 101639, 95328, 103730, 57027, 83080, 57748, 101606, 54629, 90901, 59983, 109795, 123270, 141948, 92969, 149805, 143555, 141387, 136357, 90236, 63577, 127108, 130012, 88223, 51426, 117663, 63924, 56251, 108505, 89625, 126994, 120237, 99351, 136948, 123702, 129849, 93541, 110900, 63759, 58537, 132943, 118213, 104274, 84606, 125256, 76355, 116711, 79344, 66355, 117654, 116026, 80244, 129786, 73054, 119806, 90941, 53877, 96707, 58226, 101666, 53819, 54558, 77342, 149653, 87843, 54388, 128862, 55752, 89962, 147224, 118486, 56910, 124854, 57052, 55495, 62530, 128104, 68788, 60915, 62155, 123614, 115522, 116920, 101263, 92339, 92234, 81542, 78062, 137207, 92082, 120032, 136537, 109035, 115819, 75955};
    int partOneFuel = 0;
    for(int m : MassArray) {
      partOneFuel += partOne(m);
    }
    int partTwoFuel = 0;
    for(int m : MassArray) {
      partTwoFuel += partTwo(m);
    }
    System.out.println("Part One: " + partOneFuel);
    System.out.println("Part Two: " + partTwoFuel);
  }

}
