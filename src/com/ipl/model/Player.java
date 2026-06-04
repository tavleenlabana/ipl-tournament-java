import java.util.List;

enum Role { BATSMAN, BOWLER, ALLROUNDER, WICKETKEEPER }


class Player {
	private String name;
	private String gender;
	private Role role;
	// String role; //can't be string user masti kr skta

	Player(String name, String gender, Role role) {
		this.name = name;
		this.gender = gender;
		this.role = role;
	}

	public String getName() { return this.name; }
	public String getGender() { return this.gender; }
    public Role getRole() { return this.role; }
}

class Team <T extends Player> {
	private String teamName;
	List<T> players = new ArrayList<>();
	Team(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamName() { return this.teamName; }

}