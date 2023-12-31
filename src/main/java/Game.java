import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import java.io.IOException;

public class Game {
    private Screen screen;
    public Game(){
   try {
        Terminal terminal = new
                DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
    } catch (IOException e) {
        e.printStackTrace();
    }}
    private void draw() throws IOException{
        screen.clear();
        screen.setCharacter(10, 10, TextCharacter.fromCharacter('X')
                [0]);
        screen.refresh();
    }
    public void run(){
        Game game = new Game();
        try {
            game.draw();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
