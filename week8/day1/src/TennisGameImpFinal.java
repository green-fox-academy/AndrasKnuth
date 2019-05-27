public class TennisGameImpFinal implements TennisGame {

  private int player1score;
  private int player2score;
  private String player1Name;
  private String player2Name;

  public TennisGameImpFinal(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public String getScore() {
    String score;
    if (player1score < 4 && player2score < 4) {
      String[] party = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      score = party[player1score];
      return (player1score == player2score) ? score + "-All" : score + "-" + party[player2score];
    } else {
      if (player1score == player2score)
        return "Deuce";
      score = player1score > player2score ? player1Name : player2Name;
      return ((player1score - player2score) * (player1score - player2score) == 1) ? "Advantage " + score : "Win for " + score;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1"))
      this.player1score += 1;
    else
      this.player2score += 1;
  }
}