
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author mitrm7692
 */


public class Assignment8 extends JComponent{

    // Height and Width of our game
    static final int WIDTH = 1275;
    static final int HEIGHT = 956;
    
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000)/desiredFPS;
    

    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g)
    {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        
        for(int i=0; i<WIDTH; i = i + 30){
            g.drawLine(i, 0, i, HEIGHT);
            g.drawLine(0, i, WIDTH, i);
            
        }
        
        // GAME DRAWING GOES HERE
        g.setColor(Color.BLACK);
        g.fillRect(30, 900, 270, 30);
        g.fillRect(30, 870, 30, 30);
        g.fillRect(60, 840, 60, 30);
        g.fillRect(120, 810, 60, 30);
        g.fillRect(180, 780, 30, 30);
        g.fillRect(210, 750, 30, 30);
        g.fillRect(240, 720, 30, 30);
        g.fillRect(270, 660, 30, 60);
        g.fillRect(300, 630, 30, 30);
        g.fillRect(330, 570, 30, 60);
        g.fillRect(300, 540, 30, 30);
        g.fillRect(270, 510, 30, 30);
        g.fillRect(240, 540, 30, 60);
        g.fillRect(240, 660, 30, 30);
        g.fillRect(210, 630, 30, 30);
        g.fillRect(180, 600, 30, 30);
        g.fillRect(150, 570, 30, 30);
        g.fillRect(120, 480, 30, 90);
        g.fillRect(150, 450, 30, 30);
        g.fillRect(180, 420, 60, 30);
        g.fillRect(330, 300, 30, 60);
        g.fillRect(240, 390, 60, 30);
        g.fillRect(300, 360, 30, 90);
        g.fillRect(360, 270, 30, 30);
        g.fillRect(390, 240, 90, 30);
        g.fillRect(450, 210, 90, 30);
        g.fillRect(480, 270, 30, 30);
        g.fillRect(510, 300, 120, 30);
        g.fillRect(510, 330, 30, 30);
        g.fillRect(540, 360, 60, 30);
        g.fillRect(540, 240, 30, 30);
        g.fillRect(570, 270, 30, 30);
        //side of face
        g.fillRect(630, 330, 30, 210);
        g.fillRect(600, 510, 30, 30);
        g.fillRect(570, 540, 30, 30);
        g.fillRect(420, 570, 150, 30);
        g.fillRect(390, 540, 30, 30);
        g.fillRect(360, 510, 30, 30);
        g.fillRect(330, 450, 30, 60);
        g.fillRect(660, 480, 90, 30);
        g.fillRect(570, 540, 30, 30);
        g.fillRect(750, 450, 120, 30);
        g.fillRect(720, 480, 30, 120);
        g.fillRect(570, 600, 150, 30);
        g.fillRect(870, 480, 30, 120);
        g.fillRect(840, 570, 90, 30);
        g.fillRect(750, 600, 120, 30);
        g.fillRect(900, 480, 30, 30);
        g.fillRect(930, 510, 30, 60);
        g.fillRect(540, 630, 30, 30);
        g.fillRect(510, 660, 30, 90);
        g.fillRect(540, 750, 30, 30);
        g.fillRect(540, 750, 30, 30);
        
        //Helmet colour
        g.setColor(Color.blue);
        g.fillRect(390, 270, 90, 120);
        g.fillRect(360, 300, 30, 210);
        g.fillRect(480, 300, 30, 90);
        g.fillRect(510, 360, 30, 30);
        g.fillRect(540, 390, 60, 30);
        g.fillRect(600, 330, 30, 60);
        g.fillRect(390, 510, 30, 30);
        
            
        g.setColor(Color.CYAN);
        g.fillRect(330, 360, 30, 90);
        // GAME DRAWING ENDS HERE
    }
    
    
    // The main game loop
    // In here is where all the logic for my game will go
    public void run()
    {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        
        // the main game loop section
        // game will end if you set done = false;
        boolean done = false; 
        while(!done)
        {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();
            
            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            
            

            // GAME LOGIC ENDS HERE 
            
            // update the drawing (calls paintComponent)
            repaint();
            
            
            
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            if(deltaTime > desiredTime)
            {
                //took too much time, don't wait
            }else
            {
                try
                {
                    Thread.sleep(desiredTime - deltaTime);
                }catch(Exception e){};
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");
       
        // creates an instance of my game
        Assignment8 game = new Assignment8();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        // adds the game to the window
        frame.add(game);
         
        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // starts my game loop
        game.run();
    }
}