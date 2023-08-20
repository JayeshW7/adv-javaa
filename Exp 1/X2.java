import java.awt.*;

public class X2 
{
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Jayesh Wagh");
        frame.setLayout(new FlowLayout());

        Label nameLabel = new Label("Name:");

        TextField nameTextField = new TextField(20);

        TextArea textArea = new TextArea(5, 20);

        Button submitButton = new Button("Submit");

        Label outputLabel = new Label();

        frame.add(nameLabel);
        frame.add(nameTextField);
        frame.add(textArea);
        frame.add(submitButton);
        frame.add(outputLabel);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}
