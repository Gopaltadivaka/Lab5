
public class TestScores {
	double Array[]=new double[100];
	public TestScores(double Array[]) {
		this.Array=Array;
		
	}
	public double getAverage() {
		double sum=0;
		for(int i=0;i<Array.length;i++) {
			if(Array[i]<0||Array[i]>100) {
				throw new IllegalArgumentException("Element: "+i+" Score: "+Array[i]);
			}else {
				sum+=Array[i];
			}
		}
		return sum/(double)Array.length;
	}
	

}
