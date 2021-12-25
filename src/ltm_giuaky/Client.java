/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltm_giuaky;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author COMPUTER
 */
public class Client extends javax.swing.JFrame {

    /**
     * Creates new form Client
     */
    public Client() {
        initComponents();
        setLocationRelativeTo(null);
        radio_writeFile.setSelected(true);
        lb_check.setVisible(false);
        lb_checkKey.setVisible(false);
        lb_fileName.setVisible(false);
        lb_checkText.setVisible(false);
        txt_filePath.setEnabled(false);
        txt_decryptText.setEditable(false);
        txt_decryptText.setEnabled(false);
    }

    public static String encrypt(final String message, final String key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    result.append((char) ((c + key.toUpperCase().charAt(j) - 2 * 'A') % 26 + 'A'));

                } else {
                    result.append((char) ((c + key.toLowerCase().charAt(j) - 2 * 'a') % 26 + 'a'));
                }
            } else {
                result.append(c);
            }
            j = ++j % key.length();
        }
        return result.toString();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btn_chonFile = new javax.swing.JButton();
        radio_writeFile = new javax.swing.JRadioButton();
        radio_readFile = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lb_countMaxChar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_quantity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_decryptText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_text = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        lb_text = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_filePath = new javax.swing.JTextField();
        btn_encrypt = new javax.swing.JButton();
        txt_nameFile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lb_txt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_key = new javax.swing.JTextField();
        lb_check = new javax.swing.JLabel();
        lb_fileName = new javax.swing.JLabel();
        lb_checkKey = new javax.swing.JLabel();
        lb_checkText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_chonFile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_chonFile.setText("Chọn ");
        btn_chonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chonFileActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_writeFile);
        radio_writeFile.setText("Ghi file");
        radio_writeFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_writeFileMouseClicked(evt);
            }
        });
        radio_writeFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_writeFileActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_readFile);
        radio_readFile.setText("Đọc file");
        radio_readFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radio_readFileMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Kí tự được xuất hiện nhiều nhất trong văn bản là: ");

        lb_countMaxChar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_countMaxChar.setText("_");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Số lượng: ");

        lb_quantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_quantity.setText("_");

        txt_decryptText.setColumns(20);
        txt_decryptText.setRows(5);
        jScrollPane1.setViewportView(txt_decryptText);

        txt_text.setColumns(20);
        txt_text.setRows(5);
        jScrollPane2.setViewportView(txt_text);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Văn bản gốc");

        lb_text.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lb_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_text.setText("Văn bản được giải mã từ máy chủ");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Chọn đường dẫn file:");

        txt_filePath.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        btn_encrypt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_encrypt.setText("Mã Hóa");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        txt_nameFile.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Nhập tên file:");

        lb_txt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lb_txt.setText(".txt");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Nhập key:");

        txt_key.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        lb_check.setForeground(new java.awt.Color(255, 51, 51));
        lb_check.setText("File được chọn không hợp lệ, chương trình chỉ nhận đuôi file .txt!");

        lb_fileName.setForeground(new java.awt.Color(255, 51, 51));
        lb_fileName.setText("Không được bỏ trống tên file!");

        lb_checkKey.setForeground(new java.awt.Color(255, 51, 51));
        lb_checkKey.setText("Không được bỏ trống key!");

        lb_checkText.setForeground(new java.awt.Color(255, 51, 51));
        lb_checkText.setText("Bạn phải nhập văn bản");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_filePath, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lb_txt))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_chonFile, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(radio_writeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(radio_readFile, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 69, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_countMaxChar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_quantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_checkText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btn_encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_text, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_checkKey, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(lb_check, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_check)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_chonFile)
                    .addComponent(radio_writeFile)
                    .addComponent(radio_readFile)
                    .addComponent(txt_filePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lb_countMaxChar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lb_quantity)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nameFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lb_txt)
                            .addComponent(lb_fileName))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_checkKey))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lb_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_checkText)
                        .addGap(150, 150, 150)
                        .addComponent(btn_encrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_writeFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_writeFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_writeFileActionPerformed

    private void radio_writeFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_writeFileMouseClicked
        btn_encrypt.setText("Mã Hóa");
        txt_decryptText.setText("");
        txt_decryptText.setEnabled(false);
        lb_quantity.setText("");
        lb_countMaxChar.setText("");
        txt_text.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_writeFileMouseClicked

    private void radio_readFileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radio_readFileMouseClicked
        btn_encrypt.setText("Giải Mã");
        txt_text.setText("");
        txt_text.setEnabled(false);
        lb_quantity.setText("");
        lb_countMaxChar.setText("");
        txt_decryptText.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_radio_readFileMouseClicked

    private void btn_chonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chonFileActionPerformed
        JFileChooser c = new JFileChooser();

        if (radio_writeFile.isSelected()) {
            c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        }

        int rVal = c.showOpenDialog(this);
        if (rVal == JFileChooser.APPROVE_OPTION) {
            String filename = c.getSelectedFile().getName();
            String dir = c.getCurrentDirectory().toString();
            txt_filePath.setText(dir + "\\");

            String fileType = "txt", check = "";
            for (int i = filename.length() - 3; i < filename.length(); i++) {
                check += filename.charAt(i);
            }
            if (radio_writeFile.isSelected()) {
                txt_filePath.setText(dir + "\\" + filename + "\\");
            } else {
                if (check.equalsIgnoreCase(fileType)) {
                    lb_check.setVisible(false);
                    String newFileName = "";
                    for (int i = 0; i < filename.length() - 4; i++) {
                        newFileName += filename.charAt(i);
                    }
                    txt_nameFile.setText(newFileName);
                } else {
                    lb_check.setText("File được chọn không hợp lệ, chương trình chỉ nhận đuôi file .txt!");
                    lb_check.setVisible(true);
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_chonFileActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
        if (txt_filePath.getText().trim().equals("")
                || txt_key.getText().trim().equals("")
                || txt_nameFile.getText().trim().equals("")) {
            if (txt_filePath.getText().trim().equals("")) {
                lb_check.setText("Không được để trống đường dẫn file!");
                lb_check.setVisible(true);
            } else {
                lb_check.setVisible(false);
            }
            if (txt_nameFile.getText().trim().equals("")) {
                lb_fileName.setVisible(true);
            } else {
                lb_fileName.setVisible(false);
            }
            if (txt_key.getText().trim().equals("")) {
                lb_checkKey.setVisible(true);
            } else {
                lb_checkKey.setVisible(false);
            }
        } else if (txt_text.getText().trim().equals("") && radio_writeFile.isSelected()) {
            if (txt_text.getText().trim().equals("") && radio_writeFile.isSelected()) {
                lb_checkText.setVisible(true);
            } else {
                lb_checkText.setVisible(false);
            }
        } else {
            boolean checkKey = true;
            for (int i = 0; i < txt_key.getText().trim().length(); i++) {
                if (65 <= txt_key.getText().trim().charAt(i)
                        && txt_key.getText().trim().charAt(i) <= 90
                        || 97 <= txt_key.getText().trim().charAt(i)
                        && txt_key.getText().trim().charAt(i) <= 122) {
                    checkKey = true;
                } else {
                    checkKey = false;
                    break;
                }
            }

            boolean checkText = true;
            int dem = 0;
            for (int i = 0; i < txt_text.getText().trim().length(); i++) {
                if (txt_text.getText().trim().charAt(i) == 46
                        || txt_text.getText().trim().charAt(i) == 44
                        || txt_text.getText().trim().charAt(i) == 32
                        || txt_text.getText().trim().charAt(i) == 32) {
                    dem++;
                    continue;
                }
                if (65 <= txt_text.getText().trim().charAt(i)
                        && txt_text.getText().trim().charAt(i) <= 90
                        || 97 <= txt_text.getText().trim().charAt(i)
                        && txt_text.getText().trim().charAt(i) <= 122) {
                    checkText = true;
                } else {
                    checkText = false;
                    break;
                }
            }
            if (!checkKey) {
                JOptionPane.showMessageDialog(this, "Key không được chứa kí tự đặc biệt hoặc số!");
            } else if (!checkText) {
                JOptionPane.showMessageDialog(this, "Văn bản không được xuống hàng, có chứa kí tự đặc biệt hoặc có dấu!");
            } else if (dem == txt_text.getText().trim().length() && radio_writeFile.isSelected()) {
                JOptionPane.showMessageDialog(this, "Văn bản không được chứa chỉ toàn dấu chấm hoặc dấu phẩy!");
            } else {
                lb_check.setVisible(false);
                lb_fileName.setVisible(false);
                lb_checkKey.setVisible(false);
                lb_checkText.setVisible(false);
                DatagramSocket client = null;
                InetAddress ip = null;
                try {
                    // tạo socket client
                    client = new DatagramSocket();
                    // khi báo cổng
                    ip = InetAddress.getByName("localhost");

                } catch (SocketException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                int port = 8888;
                System.out.println("ip" + ip);
                //tạo mãng dữ liệu, tạo nhân gửi dữ liệu
                byte[] arr;
                DatagramPacket in;  // nhận dữ liệu từ server
                DatagramPacket out; // gửi dữ liệu

                //gửi check cho server để biết đọc file hay gủi file
                int check = 1;
                if (radio_readFile.isSelected()) {
                    check = 2;
                }
                arr = new byte[256];
                arr = String.valueOf(check).getBytes();
                out = new DatagramPacket(arr, arr.length, ip, port);
                try {
                    client.send(out);
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }

                // gửi filePath cho server
                String filePath = txt_filePath.getText() + txt_nameFile.getText() + lb_txt.getText();
                arr = new byte[256];
                arr = filePath.getBytes();
                out = new DatagramPacket(arr, arr.length, ip, port);
                try {
                    client.send(out);
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }

                //gửi key cho server
                String key = txt_key.getText().trim();
                arr = new byte[256];
                arr = key.getBytes();
                out = new DatagramPacket(arr, arr.length, ip, port);
                try {
                    client.send(out);
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }

                //Gửi văn bản cho server
                String text = encrypt(txt_text.getText().trim(), key);
                arr = new byte[256];
                arr = text.getBytes();
                out = new DatagramPacket(arr, arr.length, ip, port);
                try {
                    client.send(out);
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                //JOptionPane.showMessageDialog(this, "Không tìm thấy đường dẫn. Vui lòng kiểm tra lại!");
                //JOptionPane.showMessageDialog(this, "Không tìm thấy đường dẫn. Vui lòng kiểm tra lại!");

                //Nhận check write File từ server
                boolean checkWriteFile;
                arr = new byte[256];
                in = new DatagramPacket(arr, arr.length);
                try {
                    client.receive(in);
                } catch (IOException ex) {
                    Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                }
                checkWriteFile = Boolean.valueOf(new String(in.getData(), 0, in.getLength()).trim());
                if (check == 1) {
                    if (!checkWriteFile) {
                        JOptionPane.showMessageDialog(this, "Lỗi ghi File. Vui lòng kiểm tra lại!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Mã hóa thành công!");
                    }
                } else {
                    if (!checkWriteFile) {
                        JOptionPane.showMessageDialog(this, "Lỗi đọc File. Vui lòng kiểm tra lại!");
                    }
                }
                if (checkWriteFile) {
                    //Nhận giải mã file từ server
                    String readFile;
                    arr = new byte[256];
                    in = new DatagramPacket(arr, arr.length);
                    try {
                        client.receive(in);
                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    readFile = new String(in.getData(), 0, in.getLength()).trim();
                    if (check == 2) {
                        txt_decryptText.setText(readFile);
                    }

                    //Nhận từ xuất hiện nhiều nhất
                    String charAppearMost;
                    arr = new byte[256];
                    in = new DatagramPacket(arr, arr.length);
                    try {
                        client.receive(in);
                    } catch (IOException ex) {
                        Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    charAppearMost = new String(in.getData(), 0, in.getLength()).trim();
                    String[] characterAppearMost = charAppearMost.split(" ");
                    if (charAppearMost.equals("")) {
                        lb_countMaxChar.setText("_");
                        lb_quantity.setText("_");
                        JOptionPane.showMessageDialog(this, "File không có dữ liệu. Không thể giải mã!");
                    } else {
                        String character = "";
                        for (int i = 0; i < characterAppearMost.length - 1; i++) {
                            character += characterAppearMost[i] += "  ";
                        }
                        lb_countMaxChar.setText(character.trim());
                        lb_quantity.setText(characterAppearMost[characterAppearMost.length - 1].trim());
                        if (check == 2) {
                            JOptionPane.showMessageDialog(this, "Giải mã thành công!");
                        }
                    }
                }
                client.close();
            }
        }
    }//GEN-LAST:event_btn_encryptActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_chonFile;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_check;
    private javax.swing.JLabel lb_checkKey;
    private javax.swing.JLabel lb_checkText;
    private javax.swing.JLabel lb_countMaxChar;
    private javax.swing.JLabel lb_fileName;
    private javax.swing.JLabel lb_quantity;
    private javax.swing.JLabel lb_text;
    private javax.swing.JLabel lb_txt;
    private javax.swing.JRadioButton radio_readFile;
    private javax.swing.JRadioButton radio_writeFile;
    private javax.swing.JTextArea txt_decryptText;
    private javax.swing.JTextField txt_filePath;
    private javax.swing.JTextField txt_key;
    private javax.swing.JTextField txt_nameFile;
    private javax.swing.JTextArea txt_text;
    // End of variables declaration//GEN-END:variables
}
