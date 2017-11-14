package perceptron;

public class Perceptron_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//学習データ(OR)
		//double input[][] = { {1,0,0}, {1,0,1}, {1,1,0}, {1,1,1}};
		//double output[] = {-1, 1, 1, 1};
		
		//学習データ(NOR)
		//double input[][] = { {1,0,0}, {1,0,1}, {1,1,0}, {1,1,1}};
		//double output[] = {1, -1, -1, -1};
		
		//学習データ(AND)
		//double input[][] = { {1,0,0}, {1,0,1}, {1,1,0}, {1,1,1}};
		//double output[] = {-1, -1, -1, 1};
		
		//学習データ(NAND)
		double input[][] = { {1,0,0}, {1,0,1}, {1,1,0}, {1,1,1}};
		double output[] = {1, 1, 1, -1};

		Perceptron_lib plib = new Perceptron_lib(input[0].length, 0.2, input, output);
		plib.getLearning();
		System.out.println("(0,0) = "+plib.getPredict(new double[] {1.0, 0.0, 0.0})); 
		System.out.println("(1,0) = "+plib.getPredict(new double[] {1.0, 1.0, 0.0})); 
		System.out.println("(0,1) = "+plib.getPredict(new double[] {1.0, 0.0, 1.0})); 
		System.out.println("(1,1) = "+plib.getPredict(new double[] {1.0, 1.0, 1.0})); 
	}

}
