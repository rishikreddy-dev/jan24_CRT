
public class PrimeNo2 {

	static int PrimeInRange(int a,int b) {
		for(int i=1,k=0;i<=100;i++) {
			int num=i;int c=0;
			for(int ap=1;ap<=num;ap++) {
				if(num%ap==0) {
					c++;
				}
			}if(c==2) {
				System.out.println(num);
				
			}
		}
        return 0;
	}

	public static void main(String[] args) {
		
		PrimeInRange(1,100);

	}
		
	}

