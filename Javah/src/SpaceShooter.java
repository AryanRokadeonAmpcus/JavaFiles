//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.util.ArrayList;
//import java.util.Random;
//
//public class SpaceShooter extends JPanel implements ActionListener, KeyListener {
//
//    Timer timer = new Timer(20, this);
//
//    int playerX = 180;
//    int score = 0;
//
//    ArrayList<Rectangle> bullets = new ArrayList<>();
//    ArrayList<Rectangle> enemies = new ArrayList<>();
//
//    Random random = new Random();
//
//    public SpaceShooter() {
//        JFrame frame = new JFrame("Space Shooter");
//
//        frame.setSize(400, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(this);
//        frame.setVisible(true);
//        frame.addKeyListener(this);
//
//        timer.start();
//    }
//
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        setBackground(Color.BLACK);
//
//        // Player
//        g.setColor(Color.GREEN);
//        g.fillRect(playerX, 500, 40, 40);
//
//        // Bullets
//        g.setColor(Color.YELLOW);
//        for (Rectangle bullet : bullets) {
//            g.fillRect(bullet.x, bullet.y, bullet.width, bullet.height);
//        }
//
//        // Enemies
//        g.setColor(Color.RED);
//        for (Rectangle enemy : enemies) {
//            g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
//        }
//
//        g.setColor(Color.WHITE);
//        g.drawString("Score: " + score, 10, 20);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//        if (random.nextInt(40) == 0) {
//            enemies.add(new Rectangle(random.nextInt(360), 0, 30, 30));
//        }
//
//        for (int i = 0; i < bullets.size(); i++) {
//            bullets.get(i).y -= 8;
//        }
//
//        for (int i = 0; i < enemies.size(); i++) {
//            enemies.get(i).y += 3;
//        }
//
//        for (int i = 0; i < bullets.size(); i++) {
//            Rectangle bullet = bullets.get(i);
//
//            for (int j = 0; j < enemies.size(); j++) {
//                Rectangle enemy = enemies.get(j);
//
//                if (bullet.intersects(enemy)) {
//                    bullets.remove(i);
//                    enemies.remove(j);
//                    score += 10;
//                    break;
//                }
//            }
//        }
//
//        Rectangle player = new Rectangle(playerX, 500, 40, 40);
//
//        for (Rectangle enemy : enemies) {
//            if (enemy.intersects(player)) {
//                JOptionPane.showMessageDialog(this,
//                        "Game Over!\nScore: " + score);
//                System.exit(0);
//            }
//        }
//
//        repaint();
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//
//        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//            playerX -= 15;
//        }
//
//        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//            playerX += 15;
//        }
//
//        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//            bullets.add(new Rectangle(playerX + 18, 490, 5, 10));
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {}
//
//    @Override
//    public void keyTyped(KeyEvent e) {}
//
//    public static void main(String[] args) {
//        new SpaceShooter();
//    }
//}