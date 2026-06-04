import java.util.ArrayList;


class Team <T extends Player> {
	private String teamName;
	List<T> players = new ArrayList<>();
	Team(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() { return this.teamName; }

}