import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PinballGame extends JPanel implements ActionListener {

    private final Timer timer;

    private int ballX = 300;
    private int ballY = 150;
    private final int ballSize = 20;

    private int dx = 3;
    private int dy = 3;

    private int paddleX = 250;
    private final int paddleWidth = 100;
    private final int paddleHeight = 10;

    private int lives = 3;
    private int score = 0;

    private boolean gameOver = false;
    private boolean shattered = false;

    public PinballGame() {

        setPreferredSize(new Dimension(600, 400));
        setBackground(Color.BLACK);
        setFocusable(true);

        timer = new Timer(10, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    paddleX -= 20;
                    if (paddleX < 0)
                        paddleX = 0;
                }

                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    paddleX += 20;
                    if (paddleX > getWidth() - paddleWidth)
                        paddleX = getWidth() - paddleWidth;
                }
            }
        });
    }

    private void resetBall() {
        ballX = getWidth() / 2;
        ballY = 100;
        dx = 3;
        dy = 3;
        shattered = false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Ball
        if (!shattered) {
            g.setColor(Color.WHITE);
            g.fillOval(ballX, ballY, ballSize, ballSize);
        } else {
            // Shatter effect
            g.setColor(Color.RED);
            g.drawLine(ballX, ballY, ballX - 15, ballY - 15);
            g.drawLine(ballX, ballY, ballX + 15, ballY - 15);
            g.drawLine(ballX, ballY, ballX - 15, ballY + 15);
            g.drawLine(ballX, ballY, ballX + 15, ballY + 15);
        }

        // Paddle
        g.setColor(Color.GRAY);
        g.fillRect(
                paddleX,
                getHeight() - 30,
                paddleWidth,
                paddleHeight);

        // Score
        g.setColor(Color.GREEN);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + score, 10, 25);

        // Lives
        g.drawString("Lives: " + lives, 10, 50);

        // Game Over
        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("GAME OVER", 150, 200);

            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Final Score: " + score, 220, 240);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (gameOver || shattered) {
            repaint();
            return;
        }

        ballX += dx;
        ballY += dy;

        // Side walls
        if (ballX <= 0 || ballX >= getWidth() - ballSize) {
            dx = -dx;
        }

        // Top wall
        if (ballY <= 0) {
            dy = -dy;
        }

        // Paddle collision
        int paddleY = getHeight() - 30;

        if (ballY + ballSize >= paddleY
                && ballY + ballSize <= paddleY + paddleHeight
                && ballX + ballSize >= paddleX
                && ballX <= paddleX + paddleWidth
                && dy > 0) {

            dy = -dy;
            score += 10; // Add score when hitting paddle
        }

        // Ball touched ground
        if (ballY > getHeight()) {

            lives--;
            shattered = true;

            if (lives <= 0) {
                gameOver = true;
                timer.stop();
            } else {

                Timer respawn = new Timer(700, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        resetBall();
                    }
                });

                respawn.setRepeats(false);
                respawn.start();
            }
        }

        repaint();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Pinball Game");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new PinballGame());

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}