package kadai_014;

public class Car_Chapter14 {
	
    public static void main(String[] args) {
        // オブジェクトを作成
        CarExec_Chapter14 car = new CarExec_Chapter14();

        // ギアを3に変更
        car.gearChange(3);

        // 走行して速度を表示
        car.run();
    }
}