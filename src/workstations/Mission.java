package workstations;

public class Mission {

  private String mainObjective;
  private String mainObjectiveDescription;
  private String secondaryObjective;
  private String mutators;

  public Mission(String mainObjective, String mainObjectiveDescription, String secondaryObjective, String mutators){
  this.mainObjective = mainObjective;
  this.mainObjectiveDescription = mainObjectiveDescription;
  this.secondaryObjective = secondaryObjective;
  this.mutators = mutators;
  }

  public void setMutators(String mutators) {
    this.mutators = mutators;
  }

  public String getMainObjective() {
    return mainObjective;
  }

  public String getMainObjectiveDescription() {
    return mainObjectiveDescription;
  }

  public String getSecondaryObjective() {
    return secondaryObjective;
  }

  public String getMutators() {
    return mutators;
  }

}
