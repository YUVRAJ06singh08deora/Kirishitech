import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buyAndSellHome extends JFrame{
    private JPanel buyAndSellHome;
    private JButton buyButton;
    private JButton sellButton;
    private JButton trackStatusOfBuyButton;
    public buyAndSellHome(){
        setTitle("Buy and Sell Home");
        setContentPane(buyAndSellHome);
        setMinimumSize(new Dimension(500, 429));
        setSize(1200, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buy b=new buy();
                setVisible(true);
            }
        });
        sellButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sell s=new sell();
                setVisible(true);
            }
        });
        trackStatusOfBuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trackingPage t= new trackingPage();
                setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

    }
}
