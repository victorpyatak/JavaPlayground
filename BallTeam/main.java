import java.util.HashMap;

class Team{
  public Team(){

  }

  public void getStartingLayout(HashMap<String , Boolean> startLayout){
    if(startLayout.size() > 12 && startLayout.size() < 1){
      System.out.println("The Limit of team is 12 players");
    }else{
      for(String player: startLayout.keySet()){
        if(startLayout.get(player) == true){
          System.out.println(player + " is in the starting layout");
        } else{
          System.out.println(player + " is on the bench");
        }
      }
    }
  }

  public static void main(String[] args) {
    HashMap<String , Boolean> myThunder = new HashMap<String , Boolean>();

    myThunder.put("Russel Westbrook" , true);
    myThunder.put("Raymond Felton" , false);
    myThunder.put("Paul George" , true);
    myThunder.put("Andrea Robbertson" , false);
    myThunder.put("Dennis Schröder" , true);
    myThunder.put("Steven Adams" , true);
    myThunder.put("Alex Abrines" , true);

    Team teamThunder = new Team();
    teamThunder.getStartingLayout(myThunder);
  }
}
