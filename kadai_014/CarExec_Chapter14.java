package kadai_014;

public class CarExec_Chapter14 {
    // フィールド
    private int gear = 1;
    private int speed = 10;

    // コンストラクタ (ギアと速度は初期値として設定)
    public CarExec_Chapter14() {
        System.out.println("ギア1から3に切り替えました");
      //  System.out.println("速度は時速" + speed + "kmです");
    }

    // ギアを変更して速度を更新
    public void gearChange(int afterGear) {
        switch (afterGear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10;
                break;
        }
    }

    // 現在の速度を表示
    public void run() {
        System.out.println("速度は時速" + speed + "kmです");
    }
}

