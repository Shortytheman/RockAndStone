package workstations;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class DiveStation {
  ArrayList<Mission> missions = new ArrayList<>();

  private final String[] mainObjective = {"Mining Espedition", "Egg Hunt", "On-site Refining", "Salvage Operation",
      "Point Extraction", "Escort Duty", "Elimination", "Industrial sabotage"};
  private final String[] mainObjectiveExplanation = {"Mine a specific amount of morkite", "Collect 4-8 alien eggs",
      "Build pipelines and extract liquid morkite", "Salvage 2-3 mules", "Collect 7-10 Aquarq", "Escort the Drilldozer",
  "Kill 2-3 Dreadnoughts", "Hack robot power stations"};
  private final String[] secondaryObjective = {"Gather 14 ebo nuts", "Collect 10 fossils", "Collect 20 Boolo caps",
      "Mine 25 Hollomite", "Exterminate 10 fester fleas", "Colllect 12 gunk seeds", ""};
  private final String[] mutations = {"Golden bugs", "Cave leeches", "Regenerating bugs", "Parasites",
      "Double XP"};

  public Mission chooseMission(){
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Todays missions are: ");
    System.out.println("_________________________________");

    for (int i = 0; i < 5; i++) {
      int randomMission = rand.nextInt(7);
      int hasStats = rand.nextInt(10);
      int sidequest = rand.nextInt(5);
      System.out.println((i + 1) + ": " + mainObjective[randomMission] + "\nMission description: " + mainObjectiveExplanation[randomMission]);
      System.out.println("Extra objective: " + secondaryObjective[sidequest]);
      missions.add(new Mission(mainObjective[randomMission],mainObjectiveExplanation[randomMission],
          secondaryObjective[sidequest],""));
      if (hasStats > 7){
        int statsIs = rand.nextInt(5);
        System.out.println("Mission has rolled with extra stats: " + mutations[statsIs]);
        missions.get(i).setMutators(mutations[statsIs]);
      }
      System.out.println("_________________________________");
    }

    int choice = 0;
    do {
      try {
        System.out.println("Choose the mission that you wish to embark on");
        choice = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.print("Invalid input.. please enter a number.. ");
      }
      scanner.nextLine();
    } while (choice < 1 || choice > 5);

    return missions.get(choice - 1);
  }

}