
import controller.Config;
import controller.ReaderTxt;
import controller.SearchData;
import java.net.URI;
import java.awt.Desktop;
import java.io.IOException;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private AudioClip alive;
    private AudioClip soundPop;
    private AudioClip soundMess;

    /* Creates new form Main */
    public Main() {
        initComponents();

        /* load resources */
        alive = getSound(Config.pathSoundAlive);
        soundPop = getSound(Config.pathSoundPop);
        soundMess = getSound(Config.pathSoundMess);

        /* settings */
        changeColorBtnSend("#66CC00");
        setIconImage(getImage(Config.pathIconBot));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        nameBot = new javax.swing.JLabel();
        btnOne = new javax.swing.JButton();
        lbStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        panelInput = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ChatBot - Juan Poveda");

        background.setBackground(new java.awt.Color(255, 255, 255));

        panelHeader.setBackground(new java.awt.Color(51, 51, 51));
        panelHeader.setForeground(new java.awt.Color(255, 255, 255));

        lbIcon.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-user.png"))); // NOI18N

        nameBot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameBot.setForeground(new java.awt.Color(255, 255, 255));
        nameBot.setText("Chat Bot");

        btnOne.setBackground(new java.awt.Color(51, 51, 51));
        btnOne.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOne.setForeground(new java.awt.Color(51, 51, 51));
        btnOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-teach.png"))); // NOI18N
        btnOne.setBorder(null);
        btnOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOneMouseClicked(evt);
            }
        });

        lbStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setText("Online");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameBot, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameBot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelHeaderLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lbStatus))
                            .addComponent(lbIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        screen.setEditable(false);
        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        screen.setRows(5);
        screen.setBorder(null);
        jScrollPane1.setViewportView(screen);

        panelInput.setBackground(new java.awt.Color(255, 255, 255));

        txtInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInput.setForeground(new java.awt.Color(102, 102, 102));
        txtInput.setText("Hola");
        txtInput.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtInput.setPreferredSize(new java.awt.Dimension(30, 17));

        btnSend.setBackground(new java.awt.Color(102, 204, 0));
        btnSend.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSend.setForeground(new java.awt.Color(255, 255, 255));
        btnSend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-send.png"))); // NOI18N
        btnSend.setBorder(null);
        btnSend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelInputLayout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(panelInputLayout);
        panelInputLayout.setHorizontalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelInputLayout.setVerticalGroup(
            panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOneMouseClicked
        learnMe();
    }//GEN-LAST:event_btnOneMouseClicked

    private void btnSendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSendMouseClicked
        String input = txtInput.getText();
        if (validateInput(input))
            askMe(input);
        else
            changeColorBtnSend(Config.colorRed);
    }//GEN-LAST:event_btnSendMouseClicked

    /* @param args the command line arguments */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel nameBot;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelInput;
    private javax.swing.JTextArea screen;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

    private void learnMe() {
        String question = JOptionPane.showInputDialog("Pregunta : ");
        String answer = JOptionPane.showInputDialog("respuesta a: " + question);

        if (validateInput(question) && validateInput(answer)) {
            ReaderTxt reader = new ReaderTxt();
            reader.save(
                    reader.readTxt(Config.pathTxtFile),
                    reader.newQuestion(question, answer)
            );
        }
    }

    private void learnMe(String question) {
        String answer = JOptionPane.showInputDialog("respuesta a: " + question);

        if (validateInput(answer)) {
            ReaderTxt reader = new ReaderTxt();
            reader.save(
                    reader.readTxt(Config.pathTxtFile),
                    reader.newQuestion(question, answer)
            );
        }
    }

    private void askMe(String question) {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    /* feedback to user */
                    cleanInput();
                    soundPop.play();
                    changeColorBtnSend(Config.colorGreen);

                    /* reply to user */
                    updateScreen(Config.acronymUser, question);
                    String answer = new SearchData().translate(question);

                    if (answer == null || answer.equalsIgnoreCase("ok")) {
                        learnMe(question);
                        answer = new SearchData().translate(question);
                    }

                    animationWriting(answer);

                    if (question.equalsIgnoreCase("reproducir musica")) {
                        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=I_izvAbhExY"));
                    }

                    /* ask to user */
                    if (getProbability() > 4) {

                        String botAsk = new SearchData().translate(getRandomQuestion());
                        JOptionPane.showInputDialog("Main, line 321 -> " + botAsk);

                        if (!botAsk.equalsIgnoreCase("ok")) {

                            animationQuestion(botAsk);

                            if (botAsk.equalsIgnoreCase("pongamos musica")) {
                                alive.play();
                            }
                        }
                    }

                } catch (Exception e) {
                    
                }
            }
        });

        thread.start();
    }

    /* -- animations --*/
    private void animationWriting(String message) throws URISyntaxException, InterruptedException, IOException {

        Thread.sleep(getRandomTime());

        lbStatus.setForeground(Color.decode(Config.colorBlue));
        lbStatus.setText("seen at.");

        Thread.sleep(getRandomTime());

        lbStatus.setForeground(Color.decode(Config.colorGreen));
        lbStatus.setText("typing...");

        Thread.sleep(getRandomTime());

        lbStatus.setForeground(Color.decode(Config.colorWhite));
        lbStatus.setText("Online.");
        soundMess.play();

        updateScreen(Config.acronymBot, message);
    }

    private void animationQuestion(String message) throws InterruptedException {

        Thread.sleep(1000);
        lbStatus.setForeground(Color.decode(Config.colorGreen));
        lbStatus.setText("typing...");

        Thread.sleep(500);
        lbStatus.setForeground(Color.decode(Config.colorWhite));
        lbStatus.setText("Online.");

        updateScreen(Config.acronymBot, message);
        soundMess.play();
    }

    /* -- resources --*/
    private Image getImage(String path) {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource(path));
    }

    private AudioClip getSound(String path) {
        return java.applet.Applet.newAudioClip(getClass().getResource(path));
    }

    private int getProbability() {
        return (int) (Math.random() * 9) + 1;
    }

    private int getRandomTime() {
        return (int) (Math.random() * Config.timeRandom) + 1000;
    }

    private String getRandomQuestion() {
        int num = (int) (Math.random() * 9) + 1;
        return Integer.toString(num) + "p";
    }

    /* -- UI -- */
    private void updateScreen(String sender, String message) {
        screen.append(sender + ": " + message + "\n");
    }

    private void changeColorBtnSend(String code) {
        btnSend.setBackground(Color.decode(code));
    }

    private boolean validateInput(String input) {

        if (input != null) {
            return !(input.isBlank() || input.isEmpty());
        }

        return false;
    }

    private void cleanInput() {
        txtInput.setText("");
    }

}