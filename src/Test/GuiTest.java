package Test;
import org.junit.Test;
import App.Gui;
import java.awt.event.ActionEvent;
import javax.swing.*;

import static org.junit.Assert.*;

public class GuiTest {

    @Test
    public void testValidSize() {
    	
        Gui gui = new Gui();
        
        assertTrue(gui.validSize(3));
        assertTrue(gui.validSize(5));
        assertTrue(gui.validSize(10));
        assertFalse(gui.validSize(2));
        assertFalse(gui.validSize(11));
    }
    
    @Test
    public void testChooseGameMode() {

        Gui gui = new Gui();
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "New Game");
        JRadioButton simpleGame = new JRadioButton("Simple Game");
        JRadioButton generalGame = new JRadioButton("General Game");

        simpleGame.setSelected(true);

        assertEquals("Simple Game", simpleGame.getActionCommand());
        assertTrue(simpleGame.isSelected());
        assertFalse(generalGame.isSelected());
    }
}