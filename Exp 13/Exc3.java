import java.awt.*; 
import java.awt.event.*; 
public class Exc3 extends MouseMotionAdapter{ 
Frame f; 
public Exc3(){ 
f=new Frame("Sanika Lad_79"); 
f.setVisible(true); 
f.setSize(500,500); 
f.setLayout(null); 
f.addMouseMotionListener(this); 
} 
public void mouseDragged(MouseEvent me){ 
Graphics g=f.getGraphics(); 
g.setColor(Color.orange); 
g.fillRect(me.getX(),me.getY(),10,10); 
} 
public static void main(String[] args){ 
new Exc3(); 
} 
}
