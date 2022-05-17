import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class ConvertFrame  extends JFrame
{
    private ActionListener ActionListener;
    private JPanel firstJPanel;
    private JPanel secondJPanel;
    private JLabel label1;
    private JLabel label2;
    private JTextField inputJTextField;
    private JTextField outputJTextField;
    private JRadioButton Celinput;
    private JRadioButton Frnhtinput;
    private JRadioButton Kelinput;
    private JRadioButton Celoutput;
    private JRadioButton Frnhtoutput;
    private JRadioButton Keloutput;
    DecimalFormat three = new DecimalFormat("0.000");

    public  ConvertFrame(){
        super("INSY 4305 Temperature Conversion");
        label1 = new JLabel("Enter Numeric Temperature");
        label2 = new JLabel("Comparable Temperature is:");
        inputJTextField = new JTextField(10);
        outputJTextField = new JTextField(10);

        firstJPanel = new JPanel();
        firstJPanel.add(label1);
        firstJPanel.add(inputJTextField);

        secondJPanel = new JPanel();
        secondJPanel.add(outputJTextField);
        secondJPanel.add(label2);

        class ChoiceListener implements ActionListener
        {
            public void actionPerformed(ActionEvent event)
            {
                ConvertedTemp();
            }
        }
        ActionListener = new ChoiceListener();
        setSize(400, 200);
        convertedTable();

    }
    public void convertedTable()
    {
        JPanel leftPanel = ButtonInput();
        JPanel rightPanel = ButtonOutput();
        JPanel convertedTable = new JPanel();
        convertedTable.setLayout(new GridLayout(2, 3));
        convertedTable.add(leftPanel);
        convertedTable.add(rightPanel);
        add(convertedTable, BorderLayout.CENTER);
    }
    public JPanel ButtonInput(){JPanel radioButtonsInput = new JPanel();
        Celinput = new JRadioButton("Celsius");
        Frnhtinput = new JRadioButton("Fahrenheit");
        Kelinput = new JRadioButton("Kelvin");
        Celinput.addActionListener(ActionListener);
        Frnhtinput.addActionListener(ActionListener);
        Kelinput.addActionListener(ActionListener);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Celinput);
        buttonGroup.add(Kelinput);
        buttonGroup.add(Frnhtinput);
        radioButtonsInput.setLayout(new GridLayout(5, 1));
        radioButtonsInput.add(Celinput);
        radioButtonsInput.add(Frnhtinput);
        radioButtonsInput.add(Kelinput);
        radioButtonsInput.add(label1);
        radioButtonsInput.add(inputJTextField);
        return radioButtonsInput;

    }
    public JPanel ButtonOutput(){ JPanel radioButtonsOutput = new JPanel();
        radioButtonsOutput.setLayout(new GridLayout(5, 1));
        Celoutput = new JRadioButton("Celsius");
        Frnhtoutput = new JRadioButton("Fahrenheit");
        Keloutput =  new JRadioButton("Kelvin");
        Celoutput.addActionListener(ActionListener);
        Frnhtoutput.addActionListener(ActionListener);
        Keloutput.addActionListener(ActionListener);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(Celoutput);
        buttonGroup.add(Keloutput);
        buttonGroup.add(Frnhtoutput);
        label2 = new JLabel("Comparable Temperature is:");
        radioButtonsOutput.add(Celoutput);
        radioButtonsOutput.add(Frnhtoutput);
        radioButtonsOutput.add(Keloutput);
        radioButtonsOutput.add(label2);
        radioButtonsOutput.add(outputJTextField);
        return radioButtonsOutput;
    }

    public void ConvertedTemp() { int input;
        double result = 0;
        input = Integer.parseInt(inputJTextField.getText());
        if (Celinput.isSelected() & Keloutput.isSelected())
            result = (input + 273);
        else if (Frnhtinput.isSelected() & Keloutput.isSelected())
            result = ((.55555) * (input - 32) + 273);
        else if (Kelinput.isSelected() & Frnhtoutput.isSelected())
            result = (((input - 273) * (1.8)) + 32);
        else if (Celinput.isSelected() & Frnhtoutput.isSelected())
            result = (((1.8) * input) + 32);
        else if (Frnhtinput.isSelected() & Celoutput.isSelected())
            result = ((.55555) * (input - 32));
        else if (Kelinput.isSelected() & Celoutput.isSelected())
            result = (input - 273);
        else if (Celinput.isSelected() & Celoutput.isSelected())
            result = input;
        else if (Frnhtinput.isSelected() & Frnhtoutput.isSelected())
            result  = input;
        else if (Kelinput.isSelected() & Keloutput.isSelected())
            result = input;
        outputJTextField.setText(" "+ three.format(result));

    }

}