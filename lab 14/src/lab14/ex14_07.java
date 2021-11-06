package lab14;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class ex14_07 extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;

    private JTextArea textAreaEnglish;
    private JTextArea textAreaLatim;

    public ex14_07() {
        super("Latim de Porco");
        setLayout(new FlowLayout(FlowLayout.CENTER));

        startGUI();
    }

    public void startGUI() {
        textAreaEnglish = new JTextArea(5, 20);
        textAreaEnglish.setWrapStyleWord(true);
        textAreaEnglish.setLineWrap(true);
        textAreaEnglish.addKeyListener(this);
        add(new JScrollPane(textAreaEnglish));

        add(new JLabel(" >> "));

        textAreaLatim = new JTextArea(5, 20);
        textAreaLatim.setWrapStyleWord(true);
        textAreaLatim.setLineWrap(true);
        add(new JScrollPane(textAreaLatim));
    }

    public void englishToPingLatin() {
        String[] tokens = textAreaEnglish.getText().split(" ");

        StringBuilder latin = new StringBuilder();

        for (int i = 0; i < tokens.length; i++) {
            try {
                latin.append(
                        String.format("%s ", tokens[i].substring(1, tokens[i].length()) + tokens[i].charAt(0) + "ay"));
            } catch (Exception e) {
            }

        }
        printLatinWord(latin);

    }

    public void printLatinWord(StringBuilder latin) {
        textAreaLatim.setText(latin.toString());
    }

    public static void main(String[] args) {
        ex14_07 frame = new ex14_07();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        englishToPingLatin();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        englishToPingLatin();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        englishToPingLatin();
    }

}
