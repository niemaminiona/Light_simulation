import javax.swing.*;

public class LightSimulationGame extends JFrame {
    public LightSimulationGame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Light simulation");
        GraphicPanel graphicPanel = new GraphicPanel();

        this.add(graphicPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
