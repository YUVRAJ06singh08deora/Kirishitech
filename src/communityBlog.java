import javax.swing.*;
import java.awt.*;

public class communityBlog extends JFrame {
    private JButton createANewStoryButton;
    private JPanel communityForum;

    public communityBlog(){
        setTitle("Community Forum");
        setContentPane(communityForum);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
