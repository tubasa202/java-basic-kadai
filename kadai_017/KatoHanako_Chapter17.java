package kadai_017;

public class KatoHanako_Chapter17 extends Kato_Chapter17 {
    public KatoHanako_Chapter17() {
        familyName = "加藤";
        setGivenName("花子");
        address = "東京都中野区〇×";
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}


