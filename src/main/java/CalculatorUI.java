import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorUI extends JFrame implements ActionListener {
    Calculator calculator = new Calculator();
    JLabel displayLabel;
    String selectedOperation = "";

    public CalculatorUI(){
        super("Michael's Calculator");

        UIManager.put("Label.font",new FontUIResource(new Font("Dialog",Font.PLAIN,20)));
        UIManager.put("Label.font",new FontUIResource(new Font("Dialog",Font.PLAIN,20)));

        JPanel panel = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        panel.setLayout(gridBagLayout);
        setContentPane(panel);

        displayLabel = new JLabel("0");
        var displayLabelConstraints = new GridBagConstraints(0, 0, 2, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(20, 20,20, 20),0,1);
        panel.add(displayLabel, displayLabelConstraints);

        JButton button0 = new JButton("0");
        var button0constraints = new GridBagConstraints(0, 4, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(1, 1, 1, 1), 0, 0);
        button0.addActionListener(e -> {
            calculator.attachToMainNumber("0");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button0, button0constraints);

        JButton button1 = new JButton("1");
        var button1constraints = new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(1, 1, 1, 1),0, 0);
        button1.addActionListener(e -> {
            calculator.attachToMainNumber("1");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button1, button1constraints);

        JButton button2 = new JButton("2");
        var button2constraints = new GridBagConstraints(1,3,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1,1 ,1),0,0);
        button2.addActionListener(e -> {
            calculator.attachToMainNumber("2");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button2,button2constraints);

        JButton button3 = new JButton("3");
        var button3constraints = new GridBagConstraints(2,3,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0,0);
        button3.addActionListener(e -> {
            calculator.attachToMainNumber("3");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button3,button3constraints);

        JButton button4 = new JButton("4");
        var button4constraints = new GridBagConstraints(0,2,1,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(1, 1, 1, 1),0,0);
        button4.addActionListener(e -> {
            calculator.attachToMainNumber("4");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button4,button4constraints);

        JButton button5 = new JButton("5");
        var button5constraints = new GridBagConstraints(1, 2, 1, 1, 1, 1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0, 0);
        button5.addActionListener(e -> {
            calculator.attachToMainNumber("5");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button5,button5constraints);

        JButton button6 = new JButton("6");
        var button6constraints = new GridBagConstraints(2, 2, 1, 1, 1, 1,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(1, 1,1, 1), 0, 0);
        button6.addActionListener(e -> {
            calculator.attachToMainNumber("6");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button6,button6constraints);

        JButton button7 = new JButton("7");
        var button7constraints = new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button7.addActionListener(e -> {
            calculator.attachToMainNumber("7");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button7,button7constraints);

        JButton button8 = new JButton("8");
        var button8constraints = new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button8.addActionListener(e -> {
            calculator.attachToMainNumber("8");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button8,button8constraints);

        JButton button9 = new JButton("9");
        var button9constraints = new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1), 0, 0);
        button9.addActionListener(e -> {
            calculator.attachToMainNumber("9");
            displayLabel.setText(calculator.getPrimaryNumber());
        });
        panel.add(button9,button9constraints);




        JButton plusButton = new JButton("+");
        var plusButtonConstraints = new GridBagConstraints(3, 4, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1,1,1,1), 0, 0);
        plusButton.addActionListener(this);
        panel.add(plusButton,plusButtonConstraints);

        JButton subtractButton = new JButton("-");
        var subtractButtonConstraints = new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0,0);
        subtractButton.addActionListener(this);
        panel.add(subtractButton,subtractButtonConstraints);

        JButton equalButton = new JButton("=");
        var equalButtonConstraints = new GridBagConstraints(2, 4, 1, 1, 1, 1,GridBagConstraints.CENTER,GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0,0);
        equalButton.addActionListener(this);
        panel.add(equalButton, equalButtonConstraints);

        JButton divisionButton = new JButton("÷");
        var divisionButtonConstraints = new GridBagConstraints(3 ,1 ,1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0, 0);
        divisionButton.addActionListener(this);
        panel.add(divisionButton,divisionButtonConstraints);

        JButton multiplyButton = new JButton("x");
        var multiplyButtonConstraints = new GridBagConstraints(3 ,2 ,1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0, 0);
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton,multiplyButtonConstraints);

        JButton clearButton = new JButton("C");
        var clearButtonConstraints = new GridBagConstraints(1 ,4 ,1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(1, 1, 1, 1),0, 0);
        clearButton.addActionListener(this);
        panel.add(clearButton,clearButtonConstraints);

        setPreferredSize(new Dimension(400,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (((JButton) e.getSource()).getText().equals("C")){
            selectedOperation = "";
            calculator.resetPrimaryNumber();
        }
        if (((JButton) e.getSource()).getText().equals("+")){
            selectedOperation = "+";
        }
        else if (((JButton) e.getSource()).getText().equals("-")){
            selectedOperation = "-";
        }
        else if (((JButton) e.getSource()).getText().equals("x")){
            selectedOperation = "x";
        }
        else if (((JButton) e.getSource()).getText().equals("÷")){
            selectedOperation = "÷";
        }
        if (((JButton) e.getSource()).getText().equals("=")){
            if (selectedOperation.equals("+")){
                calculator.add(displayLabel.getText());
                displayLabel.setText(calculator.getPrimaryNumber());
            }
            else if (selectedOperation.equals("-")){
                calculator.subtract(displayLabel.getText());
                displayLabel.setText(calculator.getPrimaryNumber());
            }
            else if (selectedOperation.equals("x")){
                calculator.multiply(displayLabel.getText());
                displayLabel.setText(calculator.getPrimaryNumber());
            }
            else if (selectedOperation.equals("÷")){
                calculator.divide(displayLabel.getText());
                displayLabel.setText(calculator.getPrimaryNumber());
            }
        } else {
            calculator.storeAndResetPrimaryNumber();
            displayLabel.setText(calculator.getPrimaryNumber());
        }

    }
}
