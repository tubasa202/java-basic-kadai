package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	  public KatoIchiro_Chapter17() {
	        familyName = "加藤";
	        setGivenName("一郎");
	        address = "東京都中野区〇×";
	    }

	    public void setGivenName(String givenName) {
	        this.givenName = givenName;
	    }

	    
	    public void eachIntroduce() {
	        System.out.println("好きな食べ物はリンゴです");
	    }
	}
