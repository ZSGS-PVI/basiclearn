package DemoOops;

public class pa {
public static void main(String[] args) {
	int n=3;
	for(int i=3;i>n;i--) {
		for(int j=1;j<=i;j++) {
			if(i==j) {
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
}
