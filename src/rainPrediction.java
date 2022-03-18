import javax.swing.*;
import java.awt.*;

public class rainPrediction extends JFrame{
    private JTextField precipitation;
    private JTextField maxTemp;
    private JTextField minTemp;
    private JTextField wind;
    private JButton predictButton;
    private JTextField textField1;
    private JPanel weatherPredictionPannel;
  public rainPrediction(){
      setTitle("Rain Prediction");
      setContentPane(weatherPredictionPannel);
      setMinimumSize(new Dimension(500, 429));
      setSize(1200, 700);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setVisible(true);
  }
    public static void main(String[] args) {


    }
}
