package Chapter08.YouDoIt;

public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String name){
        teamName = name;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setMember(int number, String name){
        members[number] = name;
    }
    public String getMembers(int number){
        return members[number];
    }
}
