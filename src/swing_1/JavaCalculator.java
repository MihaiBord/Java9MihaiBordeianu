package swing_1;

//The java Template Calculator TODO

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Container;

public class JavaCalculator implements ActionListener{

JFrame guiFrame;
JPanel buttonPanel;
JTextField numberCalc;
int calcOperation = 0;
int currentCalc;

public static void main(String[] args) {

   EventQueue.invokeLater(JavaCalculator::new);

}

public JavaCalculator()
{
  guiFrame = new JFrame();
  guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  guiFrame.setTitle("Simple Calculator");
  guiFrame.setSize(300,300);
  guiFrame.setLocationRelativeTo(null);
  numberCalc = new JTextField();
  numberCalc.setHorizontalAlignment(JTextField.RIGHT);
  numberCalc.setEditable(false);
  guiFrame.add(numberCalc, BorderLayout.NORTH);
  buttonPanel = new JPanel();
  buttonPanel.setLayout(new GridLayout(4,4));   
  guiFrame.add(buttonPanel, BorderLayout.CENTER);

  for (int i=0;i<10;i++)
  {
      addNumberButton(buttonPanel, String.valueOf(i));
  }

  addActionButton(buttonPanel, 1, "+");
  addActionButton(buttonPanel, 2, "-");
  addActionButton(buttonPanel, 3, "*");
  addActionButton(buttonPanel, 4, "/");
  addActionButton(buttonPanel, 5, "^2");

  JButton equalsButton = new JButton("=");
  equalsButton.setActionCommand("=");
  equalsButton.addActionListener((ActionEvent event) -> {
      if (!numberCalc.getText().isEmpty())
      {
          int number = Integer.parseInt(numberCalc.getText());
          switch (calcOperation) {
              case 1:
              {
                  int calculate = currentCalc  + number;
                  numberCalc.setText(Integer.toString(calculate));
                  break;
              }
              case 2:
              {
                  int calculate = currentCalc  - number;
                  numberCalc.setText(Integer.toString(calculate));
                  break;
              }
              case 3:
              {
                  int calculate = currentCalc  * number;
                  numberCalc.setText(Integer.toString(calculate));
                  break;
              }
              case 4:
              {
                  int calculate = currentCalc  / number;
                  numberCalc.setText(Integer.toString(calculate));
                  break;
              }
              case 5:
              {
                  int calculate = currentCalc  * currentCalc;
                  numberCalc.setText(Integer.toString(calculate));
                  break;
              }
              default:
                  break;
          }
      }
  });

  buttonPanel.add(equalsButton);
  guiFrame.setVisible(true);  
}

private void addNumberButton(Container parent, String name)
{
  JButton but = new JButton(name);
  but.setActionCommand(name);
  but.addActionListener(this);
  parent.add(but);
}

private void addActionButton(Container parent, int action, String text)
{
  JButton but = new JButton(text);
  but.setActionCommand(text);
  OperatorAction addAction = new OperatorAction(1);
  but.addActionListener(addAction);
  parent.add(but);
}

@Override
public void actionPerformed(ActionEvent event)
{
  String action = event.getActionCommand();

  numberCalc.setText(action);       
}

private class OperatorAction implements ActionListener
{
  private final int operator;

  public OperatorAction(int operation)
  {
      operator = operation;
  }

  @Override
  public void actionPerformed(ActionEvent event)
  {
      currentCalc = Integer.parseInt(numberCalc.getText()); 
      calcOperation = operator;
  }
}
}