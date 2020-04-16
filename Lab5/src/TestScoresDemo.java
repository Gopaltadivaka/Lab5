
public class TestScoresDemo {
	public static void main(String[]args) {
		double[] scores1= {1,2.5,3,100,80,10.8};
		double[] scores2= {1,2.5,3,100,80,10.8,101};
		try {
		TestScores s=new TestScores(scores1);
		System.out.println("The average of scores is: "+s.getAverage());
		}
		catch(IllegalArgumentException ex){
			System.out.println("Invalid score found.\n"+ex.getMessage());
		}
		try {
			TestScores s=new TestScores(scores2);
			System.out.println("The average of scores is: "+s.getAverage());
			}
			catch(IllegalArgumentException ex){
				System.out.println("Invalid score found.\n"+ex.getMessage());
			}
	}
}
