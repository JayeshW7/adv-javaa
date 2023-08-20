import java.awt.*;

public class X1 
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Jayesh Wagh");
        frame.setLayout(new FlowLayout());

        CheckboxGroup radioButtonGroup = new CheckboxGroup();
        Checkbox radioButton = new Checkbox("Radio Button", radioButtonGroup, false);
        Checkbox radioButton2 = new Checkbox("Radio Button 2", radioButtonGroup, false);

        Checkbox checkBox = new Checkbox("Checkbox", false);

        frame.add(radioButton);
        frame.add(checkBox);
        frame.add(radioButton2);
    
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
