package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//年代とサービス使用料金の変数宣言
		int userAge = 30;
		int serviceCost = 3000;
		
		 switch(userAge) {
		case 10 -> serviceCost = 1000;
		case 20 -> serviceCost = 2000;
		case 30 -> serviceCost = 3000;
		case 40 -> serviceCost = 3000;
		case 50 -> serviceCost = 4000;
		case 60 -> serviceCost = 4000;
		case 70 -> serviceCost = 4000;
		case 80 -> serviceCost = 5000;
	    default -> serviceCost = 500;
		};
		
		//料金の表示
		System.out.println(userAge + "代の料金は" +serviceCost + "円");

	}

}
