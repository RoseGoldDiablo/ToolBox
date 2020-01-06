package Components;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    static final int WINDOW_HEIGHT = 768, WINDOW_WIDTH = 768;

    public Window(  String title  ){
        super(  title  );
        this.setSize(  WINDOW_WIDTH, WINDOW_HEIGHT  );
        this.setDefaultCloseOperation(  3  );
    }

    public void Clear(){
        this.getContentPane().removeAll();
    }
}
