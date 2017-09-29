package pkgEmpty;

public class MyInteger {

		private int iValue;
		
		public MyInteger(int iValue) {
				super();
				this.iValue = iValue;
		}
		
		public int getiValue() {
				return iValue;
		}
		
		public boolean isEven() {
				return MyInteger.isEven(iValue);
				
		}
		
		public boolean isOdd() {
				return MyInteger.isOdd(iValue);
		}
		
		public boolean isPrime() {
				return MyInteger.isPrime(iValue);
		}
		
		public static boolean isEven(int v) {
				if ((v % 2) == 0) {
							return true;
				}
				return false;
		}
		
		public static boolean isOdd(int v) {
				if ((v % 2) == 1) {
						return true;
				}
				return false;
		}
		
		public static boolean isPrime(int v) {
				for (int i = 2; i < v; i++) {
						if (v % i == 0)
								return false;
				}
				return true;
		}
		
		public static boolean isEven(MyInteger n) {
				return n.isEven();
		}
		
		public static boolean isOdd(MyInteger n) {
				return n.isOdd();
		}
		
		public static boolean isPrime(MyInteger n) {
				return n.isPrime();
		}
		
		public boolean Equals(int v) {
				if (v == iValue) {
							return true;
				}
				return false;
		}
		
		public boolean Equals(MyInteger n) {
				return n.Equals(iValue);
				
		}
	
}
