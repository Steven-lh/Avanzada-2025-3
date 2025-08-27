package controller;
import view.Window;
import model.Number;
/**
 *
 * @author Steven
 */
public class Launcher {
    public static void main(String[] args) {
        Window window = new Window();
        window.readNumber();
        window.displayNumber();
    }
}