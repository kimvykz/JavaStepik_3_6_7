import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {
    static JPanel panel = new JPanel();

    static void addObject(JComponent o, int n, float alignmentX){
        o.setAlignmentX(alignmentX);
        panel.add(o);
        panel.add(Box.createVerticalStrut(n));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton");

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton radioButtonWinter = new JRadioButton("Winter");
        JRadioButton radioButtonSpring = new JRadioButton("Spring");
        JRadioButton radioButtonSummer = new JRadioButton("Summer");
        JRadioButton radioButtonAutumn = new JRadioButton("Autumn");
        JButton button = new JButton("Answer");
        JLabel label = new JLabel("Ответ: ");

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        radioButtonWinter.setActionCommand("winter");
        radioButtonSpring.setActionCommand("spring");
        radioButtonSummer.setActionCommand("summer");
        radioButtonAutumn.setActionCommand("autumn");

        buttonGroup.add(radioButtonWinter);
        buttonGroup.add(radioButtonSpring);
        buttonGroup.add(radioButtonSummer);
        buttonGroup.add(radioButtonAutumn);

        panel.add(radioButtonWinter);
        panel.add(radioButtonSpring);
        panel.add(radioButtonSummer);
        panel.add(radioButtonAutumn);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonModel selectedButton = buttonGroup.getSelection();
                if (selectedButton != null) {

                    label.setText("Ответ: " + selectedButton.getActionCommand());
                }
            }
        });

        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setSize(panel.getSize());
        frame.setVisible(true);
    }
}
