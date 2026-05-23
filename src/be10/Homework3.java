package be10;

public class Homework3 {
	   public static int binaryGap(int n) {
	        if(n <= 2) {
	            return 0;
	        }
	        String num = Integer.toBinaryString(n); 
	    
	        int l = num.length();
	        int maxDist = 0;
	        int dist = 0;
	        
	        for(int i=1; i<l; i++) {
	            char digit = num.charAt(i);
	            if(digit == '1') {
	                maxDist = Math.max(dist, maxDist);
	                dist = 1;
	            } 
	            else {
	                dist++;
	            }
	        }
	        return maxDist;
	    }
		public static void main(String[] args) {
		System.out.println(binaryGap(1041));
		}
	}
	

	        
//	        public static void main(String[] args) {
//	        String num = Integer.toBinaryString(32);
//	        System.out.println(num);
//	        }
//	  }

	     