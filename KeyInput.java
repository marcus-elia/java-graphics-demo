import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter
{
    private GameManager manager;

    public KeyInput(GameManager inputManager)
    {
        manager = inputManager;
    }

    public void keyPressed(KeyEvent e)
    {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT)
        {
            manager.setLeft(true);
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            manager.setRight(true);
        }
        if(key == KeyEvent.VK_UP)
        {
            manager.setUp(true);
        }
        if(key == KeyEvent.VK_DOWN)
        {
            manager.setDown(true);
        }
    }

    public void keyReleased(KeyEvent e)
    {
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT)
        {
            manager.setLeft(false);
        }
        if(key == KeyEvent.VK_RIGHT)
        {
            manager.setRight(false);
        }
        if(key == KeyEvent.VK_UP)
        {
            manager.setUp(false);
        }
        if(key == KeyEvent.VK_DOWN)
        {
            manager.setDown(false);
        }
    }
}
