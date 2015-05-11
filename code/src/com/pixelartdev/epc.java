package com.pixelartdev;

import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Deniz Celebi
 */
public class epc extends javax.swing.JFrame {
    
    private Preferences prefs;
    private String username = null;
    private String apikey = null;
    private String code = null;
    private String[] data = null;
    
    public epc() {
        initComponents();
        
        savedLabel.setVisible(false);        
        
        prefs = Preferences.userRoot().node("EnvatoPurchaseChecker");
        username = prefs.get("Username", " ");        
        apikey = prefs.get("ApiKey", " ");
        nameField.setText(username);
        keyField.setText(apikey);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeField = new javax.swing.JTextField();
        codeLabel = new javax.swing.JLabel();
        panelSeperator = new javax.swing.JSeparator();
        nameLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        keyLabel = new javax.swing.JLabel();
        keyField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        savedLabel = new javax.swing.JLabel();
        checkBtn = new javax.swing.JButton();
        contentPane = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        saveItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        fileSeperator = new javax.swing.JPopupMenu.Separator();
        exportItem = new javax.swing.JMenuItem();
        infoMenu = new javax.swing.JMenu();
        helpItem = new javax.swing.JMenuItem();
        aboutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Envato Purchase Code Checker");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("epcc-icon.png")));
        setResizable(false);

        codeLabel.setText("Purchase Code");

        nameLabel.setText("Envato Username");

        keyLabel.setText("Api Key");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        savedLabel.setVisible(false);
        savedLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        savedLabel.setForeground(new java.awt.Color(0, 165, 46));
        savedLabel.setText("Saved!");

        checkBtn.setText("Check!");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        resultArea.setColumns(20);
        resultArea.setRows(5);
        contentPane.setViewportView(resultArea);

        fileMenu.setText("File");

        saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveItem.setText("Save");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveItem);

        openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openItem.setText("Open");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        fileMenu.add(openItem);
        fileMenu.add(fileSeperator);

        exportItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        exportItem.setText("Export");
        exportItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportItemActionPerformed(evt);
            }
        });
        fileMenu.add(exportItem);

        menuBar.add(fileMenu);

        infoMenu.setText("Info");

        helpItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        helpItem.setText("Help");
        helpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpItemActionPerformed(evt);
            }
        });
        infoMenu.add(helpItem);

        aboutItem.setText("About");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        infoMenu.add(aboutItem);

        menuBar.add(infoMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentPane)
                    .addComponent(panelSeperator)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeLabel)
                        .addGap(18, 18, 18)
                        .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(keyLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField)
                            .addComponent(keyField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(savedLabel)
                                .addGap(20, 20, 20))
                            .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyLabel)
                    .addComponent(keyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(codeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPane, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = nameField.getText();
        String key = keyField.getText();
        
        prefs.put("Username", name);
        prefs.put("ApiKey", key);
        
        savedLabel.setVisible(true);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        code = codeField.getText();
        if(username.length() >0 && apikey.length() >0 && code.length() >0) {
            code = code.replace(" ", ",");
            code = code.replace(";",",");
            if(code.contains(",")) {
                String[] codes = code.split(",");
                data = new String[codes.length];
                for(int i=0; i<codes.length; i++) {
                    checkIt(codes[i], i);
                }
            }else {
                data = new String[0];
                checkIt(code, 0);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Something went wrong. Check your input fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    private void checkIt(String scode, int num) {
        String uri = "http://marketplace.envato.com/api/edge/"+username+"/"+apikey+"/verify-purchase:"+scode+".json";
        String result = null;
        URL url;
        HttpURLConnection connection = null;
        try {
            url = new URL(uri);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            InputStream stream = connection.getInputStream();
            InputStreamReader isReader = new InputStreamReader(stream );
            BufferedReader br = new BufferedReader(isReader);

            String line = null;
            while ((line = br.readLine()) != null) {
                result = line;
            }
            br.close();

            if(result != null) {
                try {
                    JSONObject obj = new JSONObject(result);
                    JSONObject purchase = obj.getJSONObject("verify-purchase");
                    String buyer = purchase.getString("buyer");
                    String item_name = purchase.getString("item_name");
                    String licence = purchase.getString("licence");
                    String text = resultArea.getText();
                    text += "Purchase Code: "+scode+"\nBuyer: "+buyer+"\nItem Name: "+item_name+"\nLicence: "+licence+"\n----------\n";
                    resultArea.setText(text);
                    
                    data[num] = scode+","+buyer+","+item_name+","+licence;                   
                    
                }catch(JSONException e) {
                  //  JOptionPane.showMessageDialog(null, "Error:\n"+e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
            }else {
                String text = resultArea.getText();
                text += "Invalid Purchase Code!\nPurchase Code: "+scode+"\n----------\n";
                resultArea.setText(text);
                
                data[num] = scode+",invalid code,-,-";
                
            }
        }catch(java.net.UnknownHostException ex) {
            JOptionPane.showMessageDialog(null, "Please check your internet connection");
        }catch(IOException e) {
           // JOptionPane.showMessageDialog(null, "Error:\n"+e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        Info info = new Info(this, false);
        info.setVisible(true);
    }//GEN-LAST:event_aboutItemActionPerformed

    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        Help help = new Help();
        help.setVisible(true);
    }//GEN-LAST:event_helpItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        String temp = codeField.getText();
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(prefs.get("Path",System.getProperty("user.home").toString()) ));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Envato Purchase Code Checker", "ecc");
        chooser.setFileFilter(filter);
        int retrival = chooser.showSaveDialog(this);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            prefs.put("Path", chooser.getCurrentDirectory().toString());
            try {
                FileWriter fw;
                if(chooser.getSelectedFile().toString().endsWith(".ecc")) {
                    fw = new FileWriter(chooser.getSelectedFile());
                }else {
                    fw = new FileWriter(chooser.getSelectedFile()+".ecc");
                }
                temp = temp.replaceAll(";", ",");
                temp = temp.replaceAll(" ", ",");
                String[] codes = temp.split(",");
                fw.write("Envato Purchase Code Checker v1.1.3\n");
                fw.write(temp);
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_saveItemActionPerformed

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        codeField.setText("");
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(prefs.get("Path",System.getProperty("user.home").toString()) ));
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Envato Purchase Code Checker", "ecc");
        chooser.setFileFilter(filter);
        int retrival = chooser.showOpenDialog(this);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            prefs.put("Path", chooser.getCurrentDirectory().toString());            
            try {
                try (BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()))) {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();
                    System.out.println(line);
                    
                    while (line != null) {
                        if(line.contains("Envato")) {
                            line = br.readLine();
                        }else {
                            sb.append(line);
                            sb.append(System.lineSeparator());
                            line = br.readLine();
                        }
                    }
                    codeField.setText(sb.toString());
                }
            }catch(IOException e) {
                
            }
        }
    }//GEN-LAST:event_openItemActionPerformed

    private void exportItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportItemActionPerformed
        if(resultArea.getText().length() >0) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File(prefs.get("PathExport",System.getProperty("user.home").toString()) ));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel CSV", "csv");
            chooser.setFileFilter(filter);
            int retrival = chooser.showSaveDialog(this);
            if (retrival == JFileChooser.APPROVE_OPTION) {
                prefs.put("PathExport", chooser.getCurrentDirectory().toString());
                try {
                    FileWriter fw;
                    if(chooser.getSelectedFile().toString().endsWith(".csv")) {
                        fw = new FileWriter(chooser.getSelectedFile());
                    }else {
                        fw = new FileWriter(chooser.getSelectedFile()+".csv");
                    }
                    fw.write("purchase code,buyer,item name,licence");
                    for(int i=0; i<data.length; i++) {
                        fw.write(data[i]+"\n");
                    }

                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }else {
            JOptionPane.showMessageDialog(null, "You need to get a result before you can export it!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_exportItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (UnsupportedLookAndFeelException | 
               ClassNotFoundException | 
               InstantiationException | 
               IllegalAccessException e) {}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new epc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JButton checkBtn;
    private javax.swing.JTextField codeField;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JScrollPane contentPane;
    private javax.swing.JMenuItem exportItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPopupMenu.Separator fileSeperator;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JMenu infoMenu;
    private javax.swing.JTextField keyField;
    private javax.swing.JLabel keyLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JSeparator panelSeperator;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JButton saveBtn;
    private javax.swing.JMenuItem saveItem;
    private javax.swing.JLabel savedLabel;
    // End of variables declaration//GEN-END:variables
}
