import java.util.*;

public class DaySeven {

    static String theFirstStep;
    static String lastStep;
    static String result = "";

    static String inputJoro = "Step W must be finished before step B can begin.\n" +
            "Step G must be finished before step T can begin.\n" +
            "Step B must be finished before step P can begin.\n" +
            "Step R must be finished before step M can begin.\n" +
            "Step K must be finished before step Q can begin.\n" +
            "Step Z must be finished before step X can begin.\n" +
            "Step V must be finished before step S can begin.\n" +
            "Step D must be finished before step U can begin.\n" +
            "Step Y must be finished before step J can begin.\n" +
            "Step A must be finished before step C can begin.\n" +
            "Step M must be finished before step U can begin.\n" +
            "Step E must be finished before step X can begin.\n" +
            "Step T must be finished before step F can begin.\n" +
            "Step U must be finished before step C can begin.\n" +
            "Step C must be finished before step Q can begin.\n" +
            "Step S must be finished before step N can begin.\n" +
            "Step X must be finished before step H can begin.\n" +
            "Step F must be finished before step L can begin.\n" +
            "Step Q must be finished before step J can begin.\n" +
            "Step P must be finished before step J can begin.\n" +
            "Step I must be finished before step L can begin.\n" +
            "Step J must be finished before step L can begin.\n" +
            "Step L must be finished before step N can begin.\n" +
            "Step H must be finished before step O can begin.\n" +
            "Step N must be finished before step O can begin.\n" +
            "Step B must be finished before step S can begin.\n" +
            "Step A must be finished before step T can begin.\n" +
            "Step G must be finished before step K can begin.\n" +
            "Step Z must be finished before step N can begin.\n" +
            "Step V must be finished before step I can begin.\n" +
            "Step Z must be finished before step Q can begin.\n" +
            "Step I must be finished before step J can begin.\n" +
            "Step S must be finished before step I can begin.\n" +
            "Step P must be finished before step I can begin.\n" +
            "Step B must be finished before step C can begin.\n" +
            "Step M must be finished before step L can begin.\n" +
            "Step G must be finished before step Z can begin.\n" +
            "Step M must be finished before step C can begin.\n" +
            "Step U must be finished before step F can begin.\n" +
            "Step B must be finished before step Y can begin.\n" +
            "Step W must be finished before step U can begin.\n" +
            "Step G must be finished before step M can begin.\n" +
            "Step M must be finished before step J can begin.\n" +
            "Step C must be finished before step L can begin.\n" +
            "Step K must be finished before step D can begin.\n" +
            "Step S must be finished before step X can begin.\n" +
            "Step Q must be finished before step N can begin.\n" +
            "Step V must be finished before step N can begin.\n" +
            "Step R must be finished before step C can begin.\n" +
            "Step E must be finished before step H can begin.\n" +
            "Step D must be finished before step P can begin.\n" +
            "Step H must be finished before step N can begin.\n" +
            "Step X must be finished before step O can begin.\n" +
            "Step K must be finished before step Y can begin.\n" +
            "Step R must be finished before step F can begin.\n" +
            "Step L must be finished before step O can begin.\n" +
            "Step Y must be finished before step M can begin.\n" +
            "Step T must be finished before step I can begin.\n" +
            "Step T must be finished before step Q can begin.\n" +
            "Step B must be finished before step F can begin.\n" +
            "Step C must be finished before step N can begin.\n" +
            "Step V must be finished before step M can begin.\n" +
            "Step T must be finished before step N can begin.\n" +
            "Step S must be finished before step L can begin.\n" +
            "Step P must be finished before step H can begin.\n" +
            "Step X must be finished before step Q can begin.\n" +
            "Step Z must be finished before step I can begin.\n" +
            "Step Q must be finished before step O can begin.\n" +
            "Step I must be finished before step N can begin.\n" +
            "Step E must be finished before step P can begin.\n" +
            "Step R must be finished before step L can begin.\n" +
            "Step P must be finished before step L can begin.\n" +
            "Step T must be finished before step H can begin.\n" +
            "Step G must be finished before step X can begin.\n" +
            "Step J must be finished before step H can begin.\n" +
            "Step G must be finished before step V can begin.\n" +
            "Step K must be finished before step N can begin.\n" +
            "Step R must be finished before step Q can begin.\n" +
            "Step Z must be finished before step T can begin.\n" +
            "Step E must be finished before step F can begin.\n" +
            "Step Y must be finished before step H can begin.\n" +
            "Step P must be finished before step N can begin.\n" +
            "Step S must be finished before step O can begin.\n" +
            "Step L must be finished before step H can begin.\n" +
            "Step W must be finished before step E can begin.\n" +
            "Step X must be finished before step N can begin.\n" +
            "Step Z must be finished before step D can begin.\n" +
            "Step A must be finished before step H can begin.\n" +
            "Step T must be finished before step X can begin.\n" +
            "Step E must be finished before step Q can begin.\n" +
            "Step K must be finished before step U can begin.\n" +
            "Step M must be finished before step T can begin.\n" +
            "Step J must be finished before step O can begin.\n" +
            "Step D must be finished before step N can begin.\n" +
            "Step K must be finished before step A can begin.\n" +
            "Step G must be finished before step E can begin.\n" +
            "Step R must be finished before step H can begin.\n" +
            "Step W must be finished before step M can begin.\n" +
            "Step U must be finished before step N can begin.\n" +
            "Step Q must be finished before step H can begin.\n" +
            "Step Y must be finished before step A can begin.";

    static String input = "Step J must be finished before step H can begin.\n" +
            "Step N must be finished before step C can begin.\n" +
            "Step G must be finished before step P can begin.\n" +
            "Step M must be finished before step I can begin.\n" +
            "Step H must be finished before step X can begin.\n" +
            "Step B must be finished before step Y can begin.\n" +
            "Step C must be finished before step L can begin.\n" +
            "Step F must be finished before step I can begin.\n" +
            "Step V must be finished before step O can begin.\n" +
            "Step W must be finished before step Q can begin.\n" +
            "Step E must be finished before step L can begin.\n" +
            "Step U must be finished before step S can begin.\n" +
            "Step D must be finished before step K can begin.\n" +
            "Step Y must be finished before step X can begin.\n" +
            "Step T must be finished before step R can begin.\n" +
            "Step I must be finished before step K can begin.\n" +
            "Step A must be finished before step K can begin.\n" +
            "Step L must be finished before step X can begin.\n" +
            "Step Q must be finished before step S can begin.\n" +
            "Step S must be finished before step O can begin.\n" +
            "Step P must be finished before step Z can begin.\n" +
            "Step X must be finished before step R can begin.\n" +
            "Step Z must be finished before step O can begin.\n" +
            "Step O must be finished before step K can begin.\n" +
            "Step R must be finished before step K can begin.\n" +
            "Step J must be finished before step W can begin.\n" +
            "Step F must be finished before step V can begin.\n" +
            "Step A must be finished before step X can begin.\n" +
            "Step Z must be finished before step K can begin.\n" +
            "Step M must be finished before step O can begin.\n" +
            "Step X must be finished before step K can begin.\n" +
            "Step E must be finished before step K can begin.\n" +
            "Step J must be finished before step K can begin.\n" +
            "Step E must be finished before step Y can begin.\n" +
            "Step B must be finished before step Q can begin.\n" +
            "Step X must be finished before step Z can begin.\n" +
            "Step D must be finished before step L can begin.\n" +
            "Step N must be finished before step I can begin.\n" +
            "Step N must be finished before step B can begin.\n" +
            "Step V must be finished before step A can begin.\n" +
            "Step H must be finished before step R can begin.\n" +
            "Step N must be finished before step L can begin.\n" +
            "Step U must be finished before step O can begin.\n" +
            "Step A must be finished before step O can begin.\n" +
            "Step V must be finished before step Z can begin.\n" +
            "Step O must be finished before step R can begin.\n" +
            "Step Q must be finished before step P can begin.\n" +
            "Step F must be finished before step Q can begin.\n" +
            "Step P must be finished before step R can begin.\n" +
            "Step S must be finished before step X can begin.\n" +
            "Step J must be finished before step E can begin.\n" +
            "Step V must be finished before step P can begin.\n" +
            "Step M must be finished before step D can begin.\n" +
            "Step I must be finished before step S can begin.\n" +
            "Step Q must be finished before step O can begin.\n" +
            "Step M must be finished before step H can begin.\n" +
            "Step W must be finished before step X can begin.\n" +
            "Step D must be finished before step O can begin.\n" +
            "Step X must be finished before step O can begin.\n" +
            "Step Y must be finished before step Z can begin.\n" +
            "Step F must be finished before step L can begin.\n" +
            "Step V must be finished before step T can begin.\n" +
            "Step V must be finished before step E can begin.\n" +
            "Step Y must be finished before step A can begin.\n" +
            "Step I must be finished before step R can begin.\n" +
            "Step L must be finished before step O can begin.\n" +
            "Step U must be finished before step X can begin.\n" +
            "Step Q must be finished before step X can begin.\n" +
            "Step P must be finished before step X can begin.\n" +
            "Step G must be finished before step C can begin.\n" +
            "Step A must be finished before step L can begin.\n" +
            "Step M must be finished before step U can begin.\n" +
            "Step L must be finished before step S can begin.\n" +
            "Step S must be finished before step P can begin.\n" +
            "Step S must be finished before step K can begin.\n" +
            "Step F must be finished before step T can begin.\n" +
            "Step Q must be finished before step K can begin.\n" +
            "Step G must be finished before step M can begin.\n" +
            "Step G must be finished before step F can begin.\n" +
            "Step T must be finished before step Q can begin.\n" +
            "Step F must be finished before step Z can begin.\n" +
            "Step I must be finished before step Z can begin.\n" +
            "Step N must be finished before step X can begin.\n" +
            "Step J must be finished before step F can begin.\n" +
            "Step W must be finished before step E can begin.\n" +
            "Step M must be finished before step Z can begin.\n" +
            "Step G must be finished before step X can begin.\n" +
            "Step V must be finished before step U can begin.\n" +
            "Step P must be finished before step O can begin.\n" +
            "Step U must be finished before step R can begin.\n" +
            "Step G must be finished before step Z can begin.\n" +
            "Step F must be finished before step R can begin.\n" +
            "Step L must be finished before step R can begin.\n" +
            "Step F must be finished before step A can begin.\n" +
            "Step I must be finished before step O can begin.\n" +
            "Step D must be finished before step T can begin.\n" +
            "Step U must be finished before step L can begin.\n" +
            "Step B must be finished before step S can begin.\n" +
            "Step S must be finished before step Z can begin.\n" +
            "Step J must be finished before step N can begin.\n" +
            "Step H must be finished before step T can begin.";

    static String inp2ut =
            "Step C must be finished before step A can begin.\n" +
            "Step C must be finished before step F can begin.\n" +
            "Step A must be finished before step B can begin.\n" +
            "Step A must be finished before step D can begin.\n" +
            "Step B must be finished before step E can begin.\n" +
            "Step D must be finished before step E can begin.\n" +
            "Step F must be finished before step E can begin.";

    static List<String> steps = DayTwo.ids(inputJoro);

    static String getPreviousStep(String steps) {
        return steps.split("[\\s]")[1];
    }

    static String getNexStep(String steps) {
        return steps.split("[\\s]")[7];
    }

    static void findFirstStep() {
        Set<String> previousSteps = new HashSet<>();
        Set<String> nextSteps = new HashSet<>();
        List<String> firstStep = new ArrayList<>();

        for (String step :
                steps) {
            previousSteps.add(getPreviousStep(step));
            nextSteps.add(getNexStep(step));
        }

        for (String previousStep :
                previousSteps) {
           if (!nextSteps.contains(previousStep)) {
               firstStep.add(previousStep);
           }
        }
        Collections.sort(firstStep);
        theFirstStep = firstStep.get(0);

        result = result + theFirstStep;
        System.out.println("actual first step is: " + firstStep.get(0));


        for (String nextStep: nextSteps) {
            if (!previousSteps.contains(nextStep)) {
                System.out.println("Expected last step is: " + nextStep);
                lastStep = nextStep;
            }
        }
    }

    static void findTheNextStep(String finishedStep) {
        List<String> possibleNextSteps = new ArrayList<>();
        List<String> newListOfSteps = new ArrayList<>();
        HashSet<String> temp = new HashSet<>();
        String newStep = finishedStep;
        String singleNextStep = "";
        do {
            for (String step: steps) {
                if (step.contains("Step " + newStep + " must be finished" )) {
                    possibleNextSteps.add(getNexStep(step));
                    newListOfSteps.add(step);
                }
            }
            Collections.sort(possibleNextSteps);

            for (String newSingleStep: steps) {
               for (String newPosibleNextStep: possibleNextSteps) {
                   if (newSingleStep.contains("Step " + newPosibleNextStep)) {
                       temp.add(getNexStep(newSingleStep));
                       singleNextStep = getNexStep(newSingleStep);
                   }
               }
            }

            if (temp.size() == 1) {
                for (String nextStep: possibleNextSteps) {
                    result = result + nextStep;
                }
                possibleNextSteps.clear();

                result = result + singleNextStep;
                newStep = singleNextStep;
            } else {
                finishedStep = possibleNextSteps.get(0);
                newStep = possibleNextSteps.get(0);
                possibleNextSteps.remove(possibleNextSteps.get(0));
                result = result + finishedStep;
            }
            temp.clear();
        } while (!result.contains(lastStep));
    }


    public static void main(String[] args) {
        findFirstStep();
        findTheNextStep(theFirstStep);
        System.out.println(result);
    }
}
