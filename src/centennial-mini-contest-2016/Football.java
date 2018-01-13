import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String teamOneString = scanner.next();
            String teamTwoString = scanner.next();
            scanner.nextLine();
            Team teamOne = new Team(teamOneString);
            Team teamTwo = new Team(teamTwoString);
            while (scanner.hasNextLine()) {
                String actionString = scanner.next();
                String teamString = scanner.next();
                if (!actionString.equals("0") && !teamString.equals("0")) {
                    Action action = Action.getAction(actionString);
                    Team team = teamOne.name.equals(teamString) ? teamOne : teamTwo;
                    if (team.name.equals(teamString)) {
                        if (action.points > 0) {
                            team.points += action.points;
                        } else {
                            Team otherTeam = team.name.equals(teamOneString) ? teamTwo : teamOne;
                            otherTeam.points += Math.abs(action.points);
                        }
                    }
                } else {
                    break;
                }
            }
            if (teamOne.points != teamTwo.points) {
                System.out.println(teamOne.points > teamTwo.points ? teamOne.name + " " + teamOne.points : teamTwo.name + " " + teamTwo.points);
            } else {
                System.out.println("TIE " + teamOne.points);
            }
        }
    }

    static class Team {
        String name;
        int points;

        Team(String name) {
            this.name = name;
            points = 0;
        }
    }

    enum Action {
        TOUCHDOWN(6), FIELDGOAL(3), EXTRAPOINT(1), CONVERSION(2), SAFETY(-2);

        int points;

        Action(int points) {
            this.points = points;
        }

        public static Action getAction(String actionName) {
            for (Action action : values()) {
                if (action.toString().equals(actionName)) {
                    return action;
                }
            }
            return null;
        }
    }
}
    