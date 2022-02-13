import StrategyCamera.Camera;
import StrategyCamera.jpegClick;
import StrategyCamera.pngClick;

public class Main {
    public static void main(String []args) {
        Camera strategy_camera = new Camera(new jpegClick());
        strategy_camera.clickImage();
    }
}
