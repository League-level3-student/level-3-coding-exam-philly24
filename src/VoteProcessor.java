import java.util.ArrayList;

public class VoteProcessor {

	public Object calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		int popeVote = 0;
		int edwardVote = 0;
		for (int i = 0; i < votes.size(); i++) {
			if (votes.get(i).equalsIgnoreCase("pope francis")) {
			popeVote++;
			}
			else if (votes.get(i).equalsIgnoreCase("edward Snowden")) {
			edwardVote++;
			}
		}
		if (popeVote > edwardVote) {
			return "pope francis";
		}
		else if (popeVote < edwardVote) {
			return "edward Snowden";
		}
		else {
			return "TIE";
		
	}
	}

}
