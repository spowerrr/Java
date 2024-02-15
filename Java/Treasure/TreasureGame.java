package OOPAssignment.Treasure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TreasureGame extends JFrame {
    private JButton[] doors;
    private int treasureDoorIndex;
    private int attemptsLeft;
    private JLabel attemptsLabel;
    private JLabel resultLabel;

    private JFrame congratsFrame;
    private JFrame gameOverFrame;

    public TreasureGame() {
        setTitle("Treasure Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        // Initialize components
        doors = new JButton[3];
        for (int i = 0; i < 3; i++) {
            doors[i] = new JButton("Door " + (i + 1));
            doors[i].addActionListener(new DoorClickListener());
        }

        attemptsLeft = 3;
        attemptsLabel = new JLabel("Attempts left: " + attemptsLeft);
        resultLabel = new JLabel("");

        setLayout(new BorderLayout());

        JPanel doorsPanel = new JPanel(new FlowLayout());
        for (JButton door : doors) {
            doorsPanel.add(door);
        }

        add(doorsPanel, BorderLayout.CENTER);
        add(attemptsLabel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.SOUTH);

        initializeGame();

        setVisible(true);

        congratsFrame = new JFrame("Congratulations!");
        congratsFrame.setSize(300, 100);
        congratsFrame.setLayout(new FlowLayout());
        congratsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        congratsFrame.setLocationRelativeTo(this);

        JLabel congratsLabel = new JLabel("Congratulations! You found the treasure!");
        congratsFrame.add(congratsLabel);
        congratsFrame.setVisible(false);

        gameOverFrame = new JFrame("Game Over");
        gameOverFrame.setSize(300, 100);
        gameOverFrame.setLayout(new FlowLayout());
        gameOverFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameOverFrame.setLocationRelativeTo(this);

        JLabel gameOverLabel = new JLabel("Game Over. You couldn't find the treasure!");
        gameOverFrame.add(gameOverLabel);
        gameOverFrame.setVisible(false);
    }

    private void initializeGame() {
        treasureDoorIndex = new Random().nextInt(3);

        for (JButton door : doors) {
            door.setEnabled(true);
        }

        //System.out.println("Treasure is behind Door " + (treasureDoorIndex + 1));

        attemptsLabel.setText("Attempts left: " + attemptsLeft);
        resultLabel.setText("");
    }

    private void playGame(int chosenDoorIndex) {
        for (JButton door : doors) {
            door.setEnabled(false);
        }
        attemptsLeft--;

        if (chosenDoorIndex == treasureDoorIndex) {
            resultLabel.setText("Congratulations! You found the treasure!");
            congratsFrame.setVisible(true);
            setVisible(false);

            Timer timer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            timer.setRepeats(false);
            timer.start();
        } else {
            resultLabel.setText("Sorry,this is not the right door");
            if (attemptsLeft > 0) {
                attemptsLabel.setText("Attempts left: " + attemptsLeft);

                Timer timer = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        initializeGame();
                    }
                });
                timer.setRepeats(false);
                timer.start();
            } else {
                gameOverFrame.setVisible(true);
                setVisible(false);

                Timer timer = new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        }
    }

    private class DoorClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton clickedDoor = (JButton) e.getSource();
            int chosenDoorIndex = -1;

            for (int i = 0; i < 3; i++) {
                if (clickedDoor == doors[i]) {
                    chosenDoorIndex = i;
                    break;
                }
            }

            playGame(chosenDoorIndex);
        }
    }

    public static void main(String[] args) {
        new TreasureGame();
    }
}
