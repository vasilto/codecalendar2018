import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class DaySix {

    static String ppinput = "242, 112\n" +
            "292, 356\n" +
            "66, 265\n" +
            "73, 357\n" +
            "357, 67\n" +
            "44, 303\n" +
            "262, 72\n" +
            "220, 349\n" +
            "331, 301\n" +
            "338, 348\n" +
            "189, 287\n" +
            "285, 288\n" +
            "324, 143\n" +
            "169, 282\n" +
            "114, 166\n" +
            "111, 150\n" +
            "251, 107\n" +
            "176, 196\n" +
            "254, 287\n" +
            "146, 177\n" +
            "149, 213\n" +
            "342, 275\n" +
            "158, 279\n" +
            "327, 325\n" +
            "201, 70\n" +
            "145, 344\n" +
            "227, 345\n" +
            "168, 261\n" +
            "108, 236\n" +
            "306, 222\n" +
            "174, 289\n" +
            "67, 317\n" +
            "316, 302\n" +
            "248, 194\n" +
            "67, 162\n" +
            "232, 357\n" +
            "300, 193\n" +
            "229, 125\n" +
            "326, 234\n" +
            "252, 343\n" +
            "51, 263\n" +
            "348, 234\n" +
            "136, 337\n" +
            "146, 82\n" +
            "334, 62\n" +
            "255, 152\n" +
            "326, 272\n" +
            "114, 168\n" +
            "292, 311\n" +
            "202, 62";

    static String input = "1, 1\n" +
            "1, 6\n" +
            "8, 3\n" +
            "3, 4\n" +
            "5, 5\n" +
            "8, 9";

    static Integer[][] testGrid = new Integer[10][10];

    static Integer[][] grid = testGrid;
    static int numberOfAreas;


    static List<String> coordinates = DayTwo.ids(input);

    static int getCoordinateX(String coordinates) {
        return Integer.parseInt(coordinates.split("\\D+")[0]);
    }

    static int getCoordinateY(String coordinates) {
        return Integer.parseInt(coordinates.split("\\D+")[1]);
    }

    static void initialCoordinateLocationsInTheGrid(List<String> listOfCoordinates) {
        Map<Integer[][], Integer> temp = new HashMap<>();
        int areaId = 0;

        for (String coordinates: listOfCoordinates) {
            grid[getCoordinateX(coordinates)][getCoordinateY(coordinates)] = areaId;
            areaId++;
        }
        numberOfAreas = areaId;
    }

    static int findManhattanDistanceBetweenTwoPoints(int emptyPointCoordinateX, int emptyPointCoordinatesY, String coordinatesSecondPoint) {
        return Math.abs(emptyPointCoordinateX - getCoordinateX(coordinatesSecondPoint)) + Math.abs(emptyPointCoordinatesY - getCoordinateY(coordinatesSecondPoint));
    }

    static void setArea(List<String> listOfCoordinates) {
        Map<Integer, Integer> manhattanDistanceAndAreaCenter = new HashMap<>();
        Integer areaCenter;
        Integer singleManhattanDistance;
        List<Integer> manhattanDistances = new ArrayList<>();
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid.length; y++) {
                if (grid[x][y] == null) {
                    for (String coordinate :
                            listOfCoordinates) {
                        areaCenter = grid[getCoordinateX(coordinate)][getCoordinateY(coordinate)];
                        singleManhattanDistance = findManhattanDistanceBetweenTwoPoints(x, y, coordinate);
//                        if (manhattanDistances.contains(singleManhattanDistance)) {
//                            grid[x][y] = 100;
//                            break;
//                        }
                        manhattanDistances.add(singleManhattanDistance);
                        manhattanDistanceAndAreaCenter.put(singleManhattanDistance, areaCenter);
                    }
                    if (grid[x][y] == null) {
                        Collections.sort(manhattanDistances);
                        if (manhattanDistances.get(0) == manhattanDistances.get(1)) {
                            grid[x][y] = 100;
                        } else {
                            grid[x][y] = manhattanDistanceAndAreaCenter.get(manhattanDistances.get(0));
                            
                        }
                    }
                    manhattanDistanceAndAreaCenter.clear();
                    manhattanDistances.clear();
                }
            }
        }
    }

    static void daySixPartOne() {
        initialCoordinateLocationsInTheGrid(coordinates);
        setArea(coordinates);
    }

    public static void main(String[] args) {
        daySixPartOne();
        System.out.println(grid);
    }
}
