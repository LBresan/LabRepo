package p3;

import java.awt.*;
import java.awt.event.*;
import javax. swing. *;

public class VoteCounterPanel extends JPanel{
    
private int votesForJoe;
private JButton joe;
private JLabel labelJoe;
private int votesForSam;
private JButton sam;
private JLabel labelSam;
private static final int DIM_X = 300;
private static final int DIM_Y = 40;
// ------------------------------------------------
// Constructor: Sets up the GUI.
// ------------------------------------------------
public VoteCounterPanel(){
    
    votesForJoe = 0;
    joe = new JButton("Vote for Joe");
    joe.addActionListener(new JoeButtonListener());
    labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
    add(joe);
    add(labelJoe);
    setPreferredSize(new Dimension(DIM_X, DIM_Y));
    setBackground(Color.cyan);
    
    votesForSam = 0;
    sam = new JButton("Vote for Sam");
    sam.addActionListener(new SamButtonListener());
    labelSam = new JLabel("Votes for Sam: " + votesForSam);
    add(sam);
    add(labelSam);
    setPreferredSize(new Dimension(DIM_X, DIM_Y));
    setBackground(Color.cyan);

}

private class SamButtonListener implements ActionListener{
    
    public void actionPerformed(ActionEvent event){
        votesForSam++;
        labelSam.setText("Votes for Sam: " + votesForSam);
    }
    
}
// **************************************************
// Represents a listener for button push (action) events
// **************************************************
private class JoeButtonListener implements ActionListener{
    
//---------------------------------------------
// Updates the counter and label when Vote for Joe
// button is pushed
//---------------------------------------------
public void actionPerformed(ActionEvent event){
    
    votesForJoe++;
    labelJoe.setText("Votes for Joe: " + votesForJoe);
    
        }
    }
}