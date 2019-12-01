package Year_2019;

import java.util.ArrayList;

public class DayOne {

    static String inputs = Inputs.INPUT_DAY_ONE_PART_TWO;

    static String[] inputsArray = inputs.split("\n");

     Integer convertStringToInt(String string) {
        return Integer.valueOf(string);
    }

     ArrayList<Integer> listOfIntegers(String[] strings) {
        ArrayList<Integer> tempList = new ArrayList();
        for (String string :
                strings) {
            tempList.add(convertStringToInt(string));
        }
        return tempList;
    }

    double requiredFuel(ArrayList<Integer> modules) {
         double requiredFuel = 0;

        for (int module :
                modules) {
            double temp = Math.floor(module / 3) - 2;
            requiredFuel = requiredFuel + temp;
        }
         return requiredFuel;
    }
    void solutionDayOne(ArrayList<Integer> modules) {
        System.out.println(requiredFuel(modules));
    }

    /**
     * solution for day one part two
     * @param modules
     * @return
     */
    double requiredFuelForModulesAndFuel(ArrayList<Integer> modules) {
         double requiredFuel = 0;
        // double fuelForFuelPerModule = 0;

        for (int module :
                modules) {
            double fuelForModule = Math.floor(module / 3) - 2;
            double temp = fuelForModule;
            while (Math.floor(temp/3) - 2  >= 0) {
                double fuelForFuelPerModule = Math.floor(temp/3) - 2;
                temp = fuelForFuelPerModule;
                fuelForModule = fuelForModule + fuelForFuelPerModule;
            }
            requiredFuel = requiredFuel + fuelForModule;
        }

         return  requiredFuel;
    }
    public static void main(String[] args) {
        DayOne dayOne = new DayOne();
        double result = dayOne.requiredFuelForModulesAndFuel(dayOne.listOfIntegers(inputsArray));
        System.out.println(result);
    }
}
