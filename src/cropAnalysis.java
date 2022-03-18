import javax.swing.*;
import java.awt.*;

public class cropAnalysis extends JFrame{
    private JTextField nitrogen;
    private JTextField Phosphurus;
    private JTextField Postassium;
    private JTextField Temperature;
    private JTextField Humidity;
    private JTextField phLevel;
    private JTextField rainfall;
    private JButton predictSuitableCropButton;
    private JTextField suitableCrop;
    private JPanel cropRecommendationPannel;
    public cropAnalysis(){
        setTitle("Crop Analysis");
        setContentPane(cropRecommendationPannel);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

    }
}
