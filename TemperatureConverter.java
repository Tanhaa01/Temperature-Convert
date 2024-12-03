import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TemperatureConverter {

    public static JFrame fram;
    public static JPanel panel1;
    public static JPanel panel2;
    public static JPanel panel3;
    public static JLabel Fahrenheit;
    public static JTextField textFahrenheit;
    public static JLabel Celsius;
    public static JTextField textCelsius;
    public static JButton button;

    public static void main(String[] args) {

        fram = new JFrame("Fahrenheit to Celsius Conversion");
        fram.setSize(250, 200);
        fram.setLayout(new FlowLayout());

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        Fahrenheit = new JLabel("Enter Fahrenheit Temperature");
        textFahrenheit = new JTextField(10);
        Celsius = new JLabel("Temperature in Celsius");
        textCelsius = new JTextField(10);
        textCelsius.setEditable(false);

       button = new JButton("Convert");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String Ftext = textFahrenheit.getText();
                    double fahrenheit = Double.parseDouble(Ftext);
                    double celsius = (fahrenheit - 32) * 5 / 9;
                    textCelsius.setText(String.valueOf(celsius));
                } catch (NumberFormatException ex) {
                    textCelsius.setText("Invalid Input");
                }
            }
        });

        panel1.add(Fahrenheit);
        panel1.add(textFahrenheit);
        panel2.add(Celsius);
        panel2.add(textCelsius);
        panel3.add(button);

        fram.add(panel1);
        fram.add(panel2);
        fram.add(panel3);

        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setVisible(true);
    }
}
