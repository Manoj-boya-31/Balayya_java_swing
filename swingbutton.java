import javax.swing.*;
public class swingbutton {
    public static void main(String[] args)  
    {
        JFrame frame = new JFrame();//creating an INSTANCE of frame
        JButton button = new JButton("BALAYAA!");//creating an INSTANCE of button
        button.setBounds(130,100,100,40);
        frame.add(button);//adding button ON TO the frame
        frame.setSize(400, 500);
        frame.setLayout(null);//using no layouts(only blank)
        frame.setVisible(true);//To be visible on java IDE screen
    }   
}