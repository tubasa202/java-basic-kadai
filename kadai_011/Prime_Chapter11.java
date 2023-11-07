package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//整数が素数であるかの判定結果の箱
		boolean[] primeNumber = new boolean[101];
		
		for( int i = 1 ; i < primeNumber.length; i++) {
			primeNumber[i] = true;
		}
		
		//割る計算
		int  numberDivided = 2;
		while (numberDivided < primeNumber.length) {
			//そのかずでしか割り切れない素数を求める
			for( int i = numberDivided + 1 ; i < primeNumber.length; i++) {
				//その数以外で割り切れた場合
				if (i % numberDivided == 0) {
				 primeNumber[i] = false;
				 continue;
				}
			}
			
			//割る数を増やす
			numberDivided += 1;
		}
		
		//結果の出力
		for (int i = 2; i < primeNumber.length; i++) {
		   if (primeNumber[i]) {
			   System.out.println(i);
		   }
		}
	}
}

