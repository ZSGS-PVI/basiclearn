package DemoOops;

public class patternzohotest {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==j) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
