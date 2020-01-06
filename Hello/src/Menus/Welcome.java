package Menus;

import Components.Button;
import Components.Window;

import java.awt.*;
import java.util.concurrent.Flow;

public class Welcome {
    Window Menu;
    Button Continue;
    Button Exit;

    public Welcome(){
        Menu = new Window(  "Welcome"  );
        Continue = new Button(  "Continue"  );
        Exit = new Button(  "Exit"  );

        Menu.setLayout(  new FlowLayout()  );
        Menu.add(  Continue  );
        Menu.add(  Exit  );
        Menu.setVisible(  true  );
    }
}
