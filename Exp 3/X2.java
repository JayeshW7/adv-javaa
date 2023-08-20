import java.awt.*;

public class X2 extends Frame {
    public X2() {
    
        setLayout(new GridLayout(5, 5, 9, 11)); // 2 rows, 5 columns, gaps
        setSize(400,400);

        for (int i = 0; i <= 9; i++) {
            Button numberButton = new Button(String.valueOf(i));
            numberButton.setFont(new Font("Montserrat", Font.BOLD, 20));
            add(numberButton);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        X2 demo = new X2();
    }
}
