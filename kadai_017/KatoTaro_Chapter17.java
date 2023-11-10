package kadai_017;

public class KatoTaro_Chapter17 extends Kato_Chapter17 {
	 public KatoTaro_Chapter17() {
	        familyName = "加藤";
	        setGivenName("太郎");
	        address = "東京都中野区〇×";
	    }

	    public void setGivenName(String givenName) {
	        this.givenName = givenName;
	    }

	   
	    public void eachIntroduce() {
	        System.out.println("Javaが得意です");
	    }
	}
