import javax.swing.JFrame;

public class Game extends JFrame {
    
    Game() {

        // set up frame
        this.add(new Board());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}