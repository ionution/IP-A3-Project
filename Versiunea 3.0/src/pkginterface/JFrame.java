/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;
import bingbangsearch.*;
import newsfeed.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;
import java.io.*;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.HyperlinkEvent;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author macbook
 */
public class JFrame extends javax.swing.JFrame {
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static Object toolkit;
    static Object[][] stiri=new Object[1000][2];
    static String[] coloane={"Titlu","Descriere"};
    public JFrame() {
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InternalFrame = new javax.swing.JInternalFrame();
        scroll = new javax.swing.JScrollPane();
        newsArea = new javax.swing.JEditorPane();
        scrollPanel1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        newsButton = new javax.swing.JButton();
        englishButton = new javax.swing.JButton();
        romanaButton = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        getNews = new javax.swing.JButton();
        colorMixer = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        searchEngineSelector = new javax.swing.JComboBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        Site1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        Options = new javax.swing.JLabel();
        backOpt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        HelpButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        header = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BingBang Words");
        setAlwaysOnTop(true);
        setFocusable(false);
        setMinimumSize(screenSize);
        setName("JFrame"); // NOI18N
        getContentPane().setLayout(null);

        InternalFrame.setVisible(true);

        newsArea.setContentType("text/html"); // NOI18N
        newsArea.setFocusable(false);
        newsArea.setRequestFocusEnabled(false);
        newsArea.setVerifyInputWhenFocusTarget(false);
        newsArea.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                newsAreaHyperlinkUpdate(evt);
            }
        });
        scroll.setViewportView(newsArea);
        newsArea.setEditable(false);

        InternalFrame.getContentPane().add(scroll, java.awt.BorderLayout.CENTER);

        getContentPane().add(InternalFrame);
        InternalFrame.setBounds(520, 330, 700, 470);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        scrollPanel1.setViewportView(tabel);

        getContentPane().add(scrollPanel1);
        scrollPanel1.setBounds(520, 330, 700, 470);

        newsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/newspaper.png"))); // NOI18N
        newsButton.setBorderPainted(false);
        newsButton.setContentAreaFilled(false);
        newsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newsButton);
        newsButton.setBounds(540, 240, 120, 80);

        englishButton.setBackground(new java.awt.Color(255, 255, 255));
        englishButton.setText("English");
        englishButton.setPreferredSize(new java.awt.Dimension(100, 30));
        englishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishButtonActionPerformed(evt);
            }
        });
        getContentPane().add(englishButton);
        englishButton.setBounds(240, 720, 100, 30);

        romanaButton.setBackground(new java.awt.Color(255, 255, 255));
        romanaButton.setText("Română");
        romanaButton.setPreferredSize(new java.awt.Dimension(100, 30));
        romanaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romanaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(romanaButton);
        romanaButton.setBounds(360, 720, 100, 30);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 204, 102));
        jTextField4.setText("      Language");
        jTextField4.setAutoscrolls(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField4.setFocusable(false);
        jTextField4.setPreferredSize(new java.awt.Dimension(110, 30));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(80, 720, 110, 30);

        getNews.setBackground(new java.awt.Color(255, 204, 102));
        getNews.setText("GetNews");
        getNews.setToolTipText("");
        getNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNewsActionPerformed(evt);
            }
        });
        getContentPane().add(getNews);
        getNews.setBounds(280, 560, 100, 30);

        colorMixer.setBackground(new java.awt.Color(238, 238, 102));
        colorMixer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "White", "Red", "Yellow", "Blue", "Green" }));
        colorMixer.setPreferredSize(new java.awt.Dimension(100, 30));
        colorMixer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMixerActionPerformed(evt);
            }
        });
        getContentPane().add(colorMixer);
        colorMixer.setBounds(280, 320, 100, 30);
        colorMixer.getAccessibleContext().setAccessibleName("colorMixer");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 204, 102));
        jTextField1.setText("   Search Engine");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField1.setFocusable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(110, 30));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 260, 110, 30);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 204, 102));
        jTextField2.setText("     RSS Option");
        jTextField2.setAutoscrolls(false);
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setFocusable(false);
        jTextField2.setPreferredSize(new java.awt.Dimension(110, 30));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 420, 110, 30);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 204, 102));
        jTextField3.setText("     Color Mixer");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField3.setFocusable(false);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(80, 320, 110, 30);

        searchEngineSelector.setBackground(new java.awt.Color(255, 255, 102));
        searchEngineSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Google", "Bing" }));
        getContentPane().add(searchEngineSelector);
        searchEngineSelector.setBounds(280, 260, 100, 30);

        jRadioButton2.setBackground(new java.awt.Color(255, 204, 102));
        jRadioButton2.setText("Economie ");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(100, 520, 110, 40);
        jRadioButton2.setName("http://www.hotnews.ro/rss");

        Site1.setBackground(new java.awt.Color(255, 204, 102));
        Site1.setText("World Sport CNN");
        Site1.setName("http://rss.cnn.com/rss/edition_worldsportblog.rss");
        getContentPane().add(Site1);
        Site1.setBounds(100, 480, 130, 40);

        jRadioButton3.setBackground(new java.awt.Color(255, 204, 102));
        jRadioButton3.setText("MotorSport CNN");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(100, 560, 130, 40);
        jRadioButton3.setName("http://rss.cnn.com/rss/edition_motorsport.rss");

        Options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/Options.png"))); // NOI18N
        getContentPane().add(Options);
        Options.setBounds(170, 160, 170, 60);
        Options.getAccessibleContext().setAccessibleName("Options");

        backOpt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/back.png"))); // NOI18N
        getContentPane().add(backOpt);
        backOpt.setBounds(40, 150, 440, 670);
        backOpt.getAccessibleContext().setAccessibleName("backOpt");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 350, 590, 450);

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/back.png"))); // NOI18N
        getContentPane().add(back);
        back.setBounds(510, 230, 740, 590);

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/loop.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(1200, 150, 50, 50);

        searchBar.setAutoscrolls(false);
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBarKeyPressed(evt);
            }
        });
        getContentPane().add(searchBar);
        searchBar.setBounds(510, 150, 740, 50);

        HelpButton.setBackground(new java.awt.Color(255, 204, 102));
        HelpButton.setText("Help");
        HelpButton.setFocusable(false);
        HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(HelpButton);
        HelpButton.setBounds(1140, 30, 100, 29);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/Title.png"))); // NOI18N
        getContentPane().add(title);
        title.setBounds(40, 10, 410, 80);

        header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/header.png"))); // NOI18N
        header.setMaximumSize(new java.awt.Dimension(1500, 120));
        header.setMinimumSize(new java.awt.Dimension(1500, 120));
        header.setPreferredSize(new java.awt.Dimension(1500, 120));
        getContentPane().add(header);
        header.setBounds(0, 0, 1280, 90);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkginterface/res/bkg.jpg"))); // NOI18N
        background.setFocusable(false);
        background.setPreferredSize(screenSize
        );
        getContentPane().add(background);
        background.setBounds(0, 0, 1500, 1180);

        getAccessibleContext().setAccessibleName("JFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpButtonActionPerformed
       JOptionPane.showMessageDialog(HelpButton,"   Instructions  \n In this application you can :\n"
                 + "1.Search for a word or a paragraph\n"
                 + "2.Select what search engine do you want to use with SearchEngine button\n"
                 + "3.Use ColorMixer button to change application design\n"
                 + "4.Select the RSS sites from where do you want to read the news ");
    }//GEN-LAST:event_HelpButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        newsArea.setVisible(true);
        InternalFrame.setVisible(true);
        StringBuilder builder = new StringBuilder();
        String results[][]=new String[100][2];
        try {
            results=BingBangSearch.search(searchBar.getText(),searchEngineSelector.getSelectedItem().toString());
        } catch (SAXException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        builder.append("<font size='6'><ol>");
        
        for (int i=0;i<results.length;i++) 
            if (results[i][1]!=null && results[i][1].length()>1)
                builder.append("<li><a href="+results[i][0]+">"+results[i][1]+"</a></li><br>");
        newsArea.setText(builder.toString());
    }//GEN-LAST:event_searchButtonActionPerformed

                               

    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void newsAreaHyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_newsAreaHyperlinkUpdate
        if (HyperlinkEvent.EventType.ACTIVATED.equals(evt.getEventType())) {
                            System.out.println(evt.getURL());
                            Desktop desktop = Desktop.getDesktop();

                            try {
                                desktop.browse(evt.getURL().toURI());
                            } catch (IOException ex) {
                                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (URISyntaxException ex) {
                                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
    }//GEN-LAST:event_newsAreaHyperlinkUpdate

    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed

        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
           InternalFrame.setVisible(true);
           StringBuilder builder = new StringBuilder();
           String results[][]=new String[100][2];
           try {
               results=BingBangSearch.search(searchBar.getText(),searchEngineSelector.getSelectedItem().toString());
           } catch (SAXException ex) {
               Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
               Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ParserConfigurationException ex) {
               Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
           }

           builder.append("<font size='6'><ol>");

           for (int i=0;i<results.length;i++) 
               if (results[i][1]!=null && results[i][1].length()>1)
                   builder.append("<li><a href="+results[i][0]+">"+results[i][1]+"</a></li><br>");
           newsArea.setText(builder.toString());
        }
    }//GEN-LAST:event_searchBarKeyPressed

    private void colorMixerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMixerActionPerformed
        JComboBox comboBox = (JComboBox) evt.getSource();

                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("White")||selected.toString().equals("Alb") )
                {searchBar.setBackground(Color.white);
                HelpButton.setBackground(Color.white);
                newsArea.setBackground(Color.white);
                jTextField1.setBackground(Color.white);
                jTextField2.setBackground(Color.white);
                jTextField3.setBackground(Color.white);
                searchEngineSelector.setBackground(Color.white);
                colorMixer.setBackground(Color.white);
                getNews.setBackground(Color.white);
                romanaButton.setBackground(Color.white);
                englishButton.setBackground(Color.white);
                jTextField4.setBackground(Color.white);}
                else if(selected.toString().equals("Red")||selected.toString().equals("Rosu"))
                {Color myColor3 = new Color(255,100,70);
                searchBar.setBackground(myColor3);
                HelpButton.setBackground(myColor3);
                newsArea.setBackground(myColor3);
                jTextField1.setBackground(myColor3);
                jTextField2.setBackground(myColor3);
                jTextField3.setBackground(myColor3);
                searchEngineSelector.setBackground(myColor3);
                colorMixer.setBackground(myColor3);
                getNews.setBackground(myColor3);
                romanaButton.setBackground(myColor3);
                englishButton.setBackground(myColor3);
                jTextField4.setBackground(myColor3);}
                 else if(selected.toString().equals("Default")||selected.toString().equals("Prestabilit"))
                  {Color myColor = new Color(255,204,102);
                searchBar.setBackground(Color.white);
                HelpButton.setBackground(myColor);
                newsArea.setBackground(Color.white);
                jTextField1.setBackground(myColor);
                jTextField2.setBackground(myColor);
                jTextField3.setBackground(myColor);
                searchEngineSelector.setBackground(Color.white);
                colorMixer.setBackground(Color.white);
                getNews.setBackground(myColor);
                romanaButton.setBackground(Color.white);
                englishButton.setBackground(Color.white);
                jTextField4.setBackground(myColor);}
                else if(selected.toString().equals("Blue") || selected.toString().equals("Albastru"))
                {Color myColor2 = new Color(0,190,255);
                searchBar.setBackground(myColor2);
                HelpButton.setBackground(myColor2);
                newsArea.setBackground(myColor2);
                jTextField1.setBackground(myColor2);
                jTextField2.setBackground(myColor2);
                jTextField3.setBackground(myColor2);
                searchEngineSelector.setBackground(myColor2);
                colorMixer.setBackground(myColor2);
                getNews.setBackground(myColor2);
                romanaButton.setBackground(myColor2);
                englishButton.setBackground(myColor2);
                jTextField4.setBackground(myColor2);}
                else if(selected.toString().equals("Green")||selected.toString().equals("Verde"))
                {searchBar.setBackground(Color.green);
                HelpButton.setBackground(Color.green);
                newsArea.setBackground(Color.green);
                jTextField1.setBackground(Color.green);
                jTextField2.setBackground(Color.green);
                jTextField3.setBackground(Color.green);
                searchEngineSelector.setBackground(Color.green);
                colorMixer.setBackground(Color.green);
                getNews.setBackground(Color.green);
                romanaButton.setBackground(Color.green);
                englishButton.setBackground(Color.green);
                jTextField4.setBackground(Color.green);}
                else if(selected.toString().equals("Yellow")||selected.toString().equals("Galben"))
                {searchBar.setBackground(Color.yellow);
                HelpButton.setBackground(Color.yellow);
                newsArea.setBackground(Color.yellow);
                jTextField1.setBackground(Color.yellow);
                jTextField2.setBackground(Color.yellow);
                jTextField3.setBackground(Color.yellow);
                searchEngineSelector.setBackground(Color.yellow);
                colorMixer.setBackground(Color.yellow);
                getNews.setBackground(Color.yellow);
                romanaButton.setBackground(Color.yellow);
                englishButton.setBackground(Color.yellow);
                jTextField4.setBackground(Color.yellow);}
    }//GEN-LAST:event_colorMixerActionPerformed

    private void romanaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romanaButtonActionPerformed
       HelpButton.setText("Ajutor");
       jTextField4.setText("        Limba");
       jTextField1.setText("   Motor de cautare");
       jTextField3.setText("   Paleta de culori");
       jTextField2.setText("    Optiuni RSS");
       getNews.setText(" Afiseaza");
       colorMixer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prestabilit", "Alb", "Rosu", "Galben", "Albastru", "Verde" }));
    }//GEN-LAST:event_romanaButtonActionPerformed

    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_englishButtonActionPerformed
        // TODO add your handling code here:
       HelpButton.setText("Help");
       jTextField4.setText("      Language");
       jTextField1.setText("   Search Engine");
       jTextField3.setText("     Color Mixer");
       jTextField2.setText("     RSS Options");
       getNews.setText("GetNews");
       colorMixer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Default", "White", "Red", "Yellow", "Blue", "Green" }));
    }//GEN-LAST:event_englishButtonActionPerformed

    private void newsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsButtonActionPerformed

       newsArea.setVisible(false);
       newsArea.setFocusable(false);
       
       stiri=RssTest.getContent("http://rss.cnn.com/rss/edition.rss");
       DefaultTableModel model=(DefaultTableModel) tabel.getModel();
            tabel.setModel(new javax.swing.table.DefaultTableModel(stiri,coloane));
       
    }//GEN-LAST:event_newsButtonActionPerformed
    
    private void getNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNewsActionPerformed
        try {
            InternalFrame.setClosed(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        newsArea.setVisible(false);
        if(Site1.isSelected()){
            stiri=RssTest.getContent(Site1.getName());
            tabel.setModel(new javax.swing.table.DefaultTableModel(stiri,coloane));
        }
        
        if(jRadioButton2.isSelected()){
            stiri=RssTest.getContent(jRadioButton2.getName());
            tabel.setModel(new javax.swing.table.DefaultTableModel(stiri,coloane));
        }
        
        if(jRadioButton3.isSelected()){
            stiri=RssTest.getContent(jRadioButton3.getName());
            tabel.setModel(new javax.swing.table.DefaultTableModel(stiri,coloane));
        }

           
            
    }//GEN-LAST:event_getNewsActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        if (evt.getClickCount() == 1) {
            Object titlu= tabel.getModel().getValueAt(tabel.getSelectedRow(), 0);
            Object descriere = tabel.getModel().getValueAt(tabel.getSelectedRow(), 1);
            
            JTextArea textArea = new JTextArea();
            textArea.setText(descriere.toString());
            textArea.setLineWrap(true);
            JScrollPane scrollPane = new JScrollPane(textArea);		
	    scrollPane.setPreferredSize(new Dimension(400, 200));
            JOptionPane.showMessageDialog(tabel,scrollPane ,titlu.toString(),JOptionPane.INFORMATION_MESSAGE);
            
            
        }
    }//GEN-LAST:event_tabelMouseClicked
    
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HelpButton;
    private javax.swing.JInternalFrame InternalFrame;
    private javax.swing.JLabel Options;
    private javax.swing.JRadioButton Site1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel backOpt;
    private javax.swing.JLabel background;
    private javax.swing.JComboBox colorMixer;
    private javax.swing.JButton englishButton;
    private javax.swing.JButton getNews;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JEditorPane newsArea;
    private javax.swing.JButton newsButton;
    private javax.swing.JButton romanaButton;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scrollPanel1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox searchEngineSelector;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
