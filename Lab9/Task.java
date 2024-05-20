import javax.swing.*;
import java.awt.event.*;

public class Task extends JFrame implements ActionListener {
    private JLabel massLabel, volumeLabel, densityLabel, resultLabel;
    private JTextField massField, volumeField, densityField;
    private JButton calculateButton;

    public Task() {
        setTitle("Archimedes' Law Calculator");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        massLabel = new JLabel("Mass (kg):");
        massLabel.setBounds(20, 20, 80, 20);
        add(massLabel);

        massField = new JTextField();
        massField.setBounds(120, 20, 150, 20);
        add(massField);

        volumeLabel = new JLabel("Volume (m^3):");
        volumeLabel.setBounds(20, 50, 80, 20);
        add(volumeLabel);

        volumeField = new JTextField();
        volumeField.setBounds(120, 50, 150, 20);
        add(volumeField);

        densityLabel = new JLabel("Density (kg/m^3):");
        densityLabel.setBounds(20, 80, 100, 20);
        add(densityLabel);

        densityField = new JTextField();
        densityField.setBounds(120, 80, 150, 20);
        add(densityField);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 110, 100, 30);
        calculateButton.addActionListener(this);
        add(calculateButton);

        resultLabel = new JLabel("");
        resultLabel.setBounds(20, 140, 260, 60);
        add(resultLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String massStr = massField.getText();
            String volumeStr = volumeField.getText();
            String densityStr = densityField.getText();

            // Перевірка, чи не є введені рядки порожніми або чи не містять вони тільки пробіли
            if (massStr.trim().isEmpty() || volumeStr.trim().isEmpty() || densityStr.trim().isEmpty()) {
                resultLabel.setText("Please enter valid values.");
                return;
            }

            try {
                double mass = Double.parseDouble(massStr);
                double volume = Double.parseDouble(volumeStr);
                double density = Double.parseDouble(densityStr);

                double buoyantForce = density * 9.8 * volume;
                double weight = mass * 9.8;

                // Виведення значень сили підняття та ваги тіла
                resultLabel.setText("<html>Buoyant Force: " + buoyantForce + " <br>Weight: " + weight + " <br>");

                // Порівняння сили підняття та ваги для визначення результату
                if (buoyantForce > weight) {
                    resultLabel.setText(resultLabel.getText() + "The object will float.</html>");
                } else if (buoyantForce == weight) {
                    resultLabel.setText(resultLabel.getText() + "The object will remain suspended.</html>");
                } else {
                    resultLabel.setText(resultLabel.getText() + "The object will sink.</html>");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Please enter valid numeric values.");
            }
        }
    }

    public static void main(String[] args) {
        new Task();
    }
}
