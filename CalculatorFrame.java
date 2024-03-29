import javax.swing.*;
import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class CalculatorFrame extends JFrame {

    private Deque<String> queue = new ArrayDeque<>();
    private void Calculate(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                String parenthesis = "";
                for (int j = i + 1; j < expression.length(); j++) {
                    if (expression.charAt(j) == '(') {
                        Calculate(expression);
                    }
                    if (expression.charAt(j) == ')') {
                        parenthesis = expression.substring(i + 1, j);
                        break;
                    }
                }
                queue.offer(parenthesis);
            }
        }

        if (!expression.contains("(")) {
            queue.offer(expression);
        }
        String operation = "";
        operation = queue.poll();

        if (operation != null && operation.contains("(")) {
            Calculate(operation);
        }
        String numS1 = "";
        String numS2 = "";
        for (int x = 0; x < operation.length(); x++) {
            if (operation.charAt(x) == 'x' || operation.charAt(x) == '-' || operation.charAt(x) == '+') {
                numS1 = operation.substring(0, x);
                numS2 = operation.substring(x + 1, operation.length());
                break;
            }

        }
        myLong num1 = new myLong();
        myLong num2 = new myLong();
        myLong finNum;
        num1.setLong(numS1);
        num2.setLong(numS2);

        if (operation.contains("x")) {
            finNum = num1.multiply(num2);
            System.out.println(finNum);
            calcField.setText(finNum.myNum);
        }
        if (operation.contains("+")) {
            finNum = num1.add(num2);
            System.out.println(finNum);
            calcField.setText(finNum.myNum);
        }

        if (operation.contains("-")) {
            finNum = num1.subtract(num2);
            System.out.println(finNum);
            calcField.setText(finNum.myNum);
        }
    }

    private JTextField calcField;

    private CalculatorFrame() {
            GridBagConstraints pc;

            setTitle("Ted's Calculator");
            setPreferredSize(new Dimension(300, 350));

            calcField = new JTextField(22);
            calcField.setEditable(false);

            JButton zeroButton = new JButton("0");
            zeroButton.addActionListener(event -> calcField.setText(calcField.getText() + "0"));

            JButton oneButton = new JButton("1");
            oneButton.addActionListener(event -> calcField.setText(calcField.getText() + "1"));

            JButton twoButton = new JButton("2");
            twoButton.addActionListener(event -> calcField.setText(calcField.getText() + "2"));

            JButton threeButton = new JButton("3");
            threeButton.addActionListener(event -> calcField.setText(calcField.getText() + "3"));

            JButton fourButton = new JButton("4");
            fourButton.addActionListener(event -> calcField.setText(calcField.getText() + "4"));

            JButton fiveButton = new JButton("5");
            fiveButton.addActionListener(event -> calcField.setText(calcField.getText() + "5"));

            JButton sixButton = new JButton("6");
            sixButton.addActionListener(event -> calcField.setText(calcField.getText() + "6"));

            JButton sevenButton = new JButton("7");
            sevenButton.addActionListener(event -> calcField.setText(calcField.getText() + "7"));

            JButton eightButton = new JButton("8");
            eightButton.addActionListener(event -> calcField.setText(calcField.getText() + "8"));

            JButton nineButton = new JButton("9");
            nineButton.addActionListener(event -> calcField.setText(calcField.getText() + "9"));

            JButton openPButton = new JButton("(");
            openPButton.addActionListener(event -> calcField.setText(calcField.getText() + "("));

            JButton closePButton = new JButton(")");
            closePButton.addActionListener(event -> calcField.setText(calcField.getText() + ")"));

            JButton multiplyButton = new JButton("x");
            multiplyButton.addActionListener(event -> calcField.setText(calcField.getText() + "x"));

            JButton subtractButton = new JButton("-");
            subtractButton.addActionListener(event -> calcField.setText(calcField.getText() + "-"));

            JButton additionButton = new JButton("+");
            additionButton.addActionListener(event -> calcField.setText(calcField.getText() + "+"));

            JButton clearButton = new JButton("C");
            clearButton.addActionListener(event -> calcField.setText(""));

            JButton calculateButton = new JButton("=");
            calculateButton.addActionListener(event -> {
                String calculation = calcField.getText();
                myStack calc = new myStack(calculation.length());
                boolean Valid = calc.isValidInput(calculation);
                if (Valid) {
                    Calculate(calculation);

                }

                if (!Valid) {
                    calcField.setText("Invalid Input");
                }
            });




            setLayout(new GridBagLayout());

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 0;
            pc.gridwidth = 25;
            pc.insets = new Insets(10, 10, 10, 10);
            add(calcField, pc);

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 1;
            pc.insets = new Insets(10, 10, 10, 10);
            add(sevenButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 1;
            pc.gridy = 1;
            pc.insets = new Insets(10, 10, 10, 10);
            add(eightButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 2;
            pc.gridy = 1;
            pc.insets = new Insets(10, 10, 10, 10);
            add(nineButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 3;
            pc.gridy = 1;
            pc.insets = new Insets(10, 10, 10, 10);
            add(multiplyButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 2;
            pc.insets = new Insets(10, 10, 10, 10);
            add(fourButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 1;
            pc.gridy = 2;
            pc.insets = new Insets(10, 10, 10, 10);
            add(fiveButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 2;
            pc.gridy = 2;
            pc.insets = new Insets(10, 10, 10, 10);
            add(sixButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 3;
            pc.gridy = 2;
            pc.insets = new Insets(10, 10, 10, 10);
            add(subtractButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 3;
            pc.insets = new Insets(10, 10, 10, 10);
            add(oneButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 1;
            pc.gridy = 3;
            pc.insets = new Insets(10, 10, 10, 10);
            add(twoButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 2;
            pc.gridy = 3;
            pc.insets = new Insets(10, 10, 10, 10);
            add(threeButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 3;
            pc.gridy = 3;
            pc.insets = new Insets(10, 10, 10, 10);
            add(additionButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 4;
            pc.insets = new Insets(10, 10, 10, 10);
            add(zeroButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 1;
            pc.gridy = 4;
            pc.insets = new Insets(10, 10, 10, 10);
            add(openPButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 2;
            pc.gridy = 4;
            pc.insets = new Insets(10, 10, 10, 10);
            add(closePButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 3;
            pc.gridy = 4;
            pc.insets = new Insets(10, 10, 10, 10);
            add(calculateButton, pc);

            pc = new GridBagConstraints();
            pc.gridx = 0;
            pc.gridy = 5;
            pc.insets = new Insets(10, 10, 10, 10);
            add(clearButton, pc);

        }

    public class myStack {
        ArrayList<Integer> STACK = new ArrayList<>();
        int i;

        private myStack(int size) {
            i = size;
        }


        private void push(Integer a) {
            STACK.add(a);
            ++i;
        }

        private Integer pop() {
            Integer r = STACK.get(STACK.size() - 1);
            STACK.remove(STACK.get(STACK.size() - 1));
            return r;
        }

        private boolean isValidInput(String input) {
            myStack leftPStack = new myStack(0);
            myStack rightPStack = new myStack(0);

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '(')
                    leftPStack.push(i);
                if (input.charAt(i) == ')')
                    rightPStack.push(i);
            }

            while (leftPStack.STACK.size() > 0) try {
                if (leftPStack.pop() > rightPStack.pop())
                    return false;
            } catch (Exception wrongLength) {
                return false;
            }

            while (rightPStack.STACK.size() > 0) {
                try {
                    if (rightPStack.pop() > leftPStack.pop())
                        return false;
                } catch (Exception wrongLength) {
                    return false;
                }
            }

            if (input.contains("++")) { return false; }
            if (input.contains("--")) { return false; }
            if (input.contains("xx")) { return false; }
            if (input.contains("+-")) { return false; }
            if (input.contains("+x")) { return false; }
            if (input.contains("-+")) { return false; }
            if (input.contains("-x")) { return false; }
            if (input.contains("x+")) { return false; }
            if (input.contains("x-")) { return false; }
            if (input.contains("(+")) { return false; }
            if (input.contains("(-")) { return false; }
            if (input.contains("(x")) { return false; }
            if (input.contains("+)")) { return false; }
            if (input.contains("-)")) { return false; }
            if (input.contains("x)")) { return false; }
            if (input.contains("()")) { return false; }
            if (input.startsWith("+")) { return false; }
            if (input.startsWith("-")) { return false; }
            if (input.startsWith("x")) { return false; }
            if (input.endsWith("+")) { return false; }
            if (input.endsWith("-")) { return false; }
            if (input.endsWith("x")) { return false; }


            return true;
        }
    }



        public static void main(String[] args) {
        CalculatorFrame myFrame = new CalculatorFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
    }
}
