package arraylist_DS;

public class patter111 {

	    public static void printPattern(int n,int m) {
	    	for(int i=1;i<=m;i++) {
	    		for(int j=1;j<=n;j++) {
	    			if(i==1||j==1||i==m||j==n) {
	    				System.out.print("X");
	    			}
	    			else {
	    				System.out.print("0");
	    			}
	    		}
	    		System.out.println();
	    	}
	    
	    }
	    public static void main(String[] args) {
	        int row =3 ;
	        int col=3;
	       
	        printPattern(row,col);
	    }
	}

