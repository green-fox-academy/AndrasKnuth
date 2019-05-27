
public class TennisGameImpSwitch implements TennisGame {

  private int matchScore1 = 0;
  private int matchScore2 = 0;
  private String player1Name;
  private String player2Name;

  public TennisGameImpSwitch(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }
@Override
  public void wonPoint(String playerName) {
    if (playerName.equals("player1"))
      matchScore1 += 1;
    else
      matchScore2 += 1;
  }
@Override
  public String getScore() {
    String score = "";
    int tempScore;
    if (matchScore1 == matchScore2) {
      switch (matchScore1) {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;
      }
    } else if (matchScore1 >= 4 || matchScore2 >= 4) {
      int minusResult = matchScore1 - matchScore2;
      if (minusResult == 1) score = "Advantage player1";
      else if (minusResult == -1) score = "Advantage player2";
      else if (minusResult >= 2) score = "Win for player1";
      else score = "Win for player2";
    } else {
      for (int i = 1; i < 3; i++) {
        if (i == 1) tempScore = matchScore1;
        else {
          score += "-";
          tempScore = matchScore2;
        }
        switch (tempScore) {
          case 0:
            score += "Love";
            break;
          case 1:
            score += "Fifteen";
            break;
          case 2:
            score += "Thirty";
            break;
          case 3:
            score += "Forty";
            break;
        }
      }
    }
    return score;
  }
}

