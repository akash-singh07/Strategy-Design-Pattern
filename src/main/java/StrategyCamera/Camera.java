package StrategyCamera;

public class Camera {
    private Click click;
    public Camera(Click click) {
        this.click = click;
    }

    public void clickImage() {
        click.clickImage();
    }
}
