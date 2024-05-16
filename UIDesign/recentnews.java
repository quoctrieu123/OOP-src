/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javausertable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author User
 */
public class recentnews extends javax.swing.JPanel {
    
    private int page;
    private JSONObject jsonobject;
    private JSONArray jsonArray;
    private MouseAdapter mouseListener;
    public recentnews(JSONArray jsonArray) {
        initComponents();
        page =0;
        JButton[] btns = {nextbutton,backbutton};
        for (JButton btn:btns)
        {
        btn.setBackground(new Color(30,40,44));
        btn.setUI(new BasicButtonUI());
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(new Color(30,40,44));
            }
        });
        currentpage.setText("Page "+ (page+1) +" out of 6" );
        this.jsonArray = jsonArray;
        jsonobject = (JSONObject)jsonArray.get(page*4);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image1.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title1.setText((String)jsonobject.get("title"));
                subtitle1.setText((String)jsonobject.get("creationDate"));
                author1.setText((String)jsonobject.get("author"));
                type1.setText((String)jsonobject.get("type"));
                title1.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews( (JSONObject) jsonArray.get(page*4)));
            }
            }); 
        jsonobject =  (JSONObject)jsonArray.get(page*4+1);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image2.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title2.setText((String)jsonobject.get("title"));
                subtitle2.setText((String)jsonobject.get("creationDate"));
                type2.setText((String)jsonobject.get("type"));
                author2.setText((String)jsonobject.get("author"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+1)));
            }
            };
                title2.addMouseListener(mouseListener);
        
        jsonobject = (JSONObject)jsonArray.get(page*4+2);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image3.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title3.setText((String)jsonobject.get("title"));
                subtitle3.setText((String)jsonobject.get("creationDate"));
                type3.setText((String)jsonobject.get("type"));
                author3.setText((String)jsonobject.get("author"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+2)));
            }
            };
                title3.addMouseListener(mouseListener);
        jsonobject = (JSONObject)jsonArray.get(page*4+3);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image4.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title4.setText((String)jsonobject.get("title"));
                subtitle4.setText((String)jsonobject.get("creationDate"));
                author4.setText((String)jsonobject.get("author"));
                type4.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+3)));
            }
            };
                title4.addMouseListener(mouseListener);
    }}
    public void showform(Component comp)
        {
            this.removeAll();
            this.add(comp);
            this.repaint();
            this.revalidate();
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        currentpage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nextbutton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        news1 = new javausertable.RoundedPanel();
        image1 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        author1 = new javax.swing.JLabel();
        subtitle1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        news2 = new javausertable.RoundedPanel();
        image2 = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        author2 = new javax.swing.JLabel();
        subtitle2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        news3 = new javausertable.RoundedPanel();
        image3 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        author3 = new javax.swing.JLabel();
        subtitle3 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        news4 = new javausertable.RoundedPanel();
        image4 = new javax.swing.JLabel();
        title4 = new javax.swing.JLabel();
        author4 = new javax.swing.JLabel();
        subtitle4 = new javax.swing.JLabel();
        type4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 40, 44));
        setPreferredSize(new java.awt.Dimension(700, 600));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(30, 40, 44));
        jPanel1.setPreferredSize(new java.awt.Dimension(581, 40));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setBackground(new java.awt.Color(30, 40, 44));
        jPanel6.setPreferredSize(new java.awt.Dimension(160, 40));

        currentpage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        currentpage.setForeground(new java.awt.Color(255, 255, 255));
        currentpage.setText("Page 1 out of 6");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Overview_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(currentpage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(currentpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6);

        backbutton.setBackground(new java.awt.Color(30, 40, 44));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Back To.png"))); // NOI18N
        backbutton.setBorder(null);
        backbutton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(backbutton);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RECENT NEWS");
        jPanel1.add(jLabel3);

        nextbutton.setBackground(new java.awt.Color(30, 40, 44));
        nextbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Next page.png"))); // NOI18N
        nextbutton.setBorder(null);
        nextbutton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(nextbutton);

        jPanel5.setBackground(new java.awt.Color(30, 40, 44));

        jComboBox2.setBackground(new java.awt.Color(30, 40, 44));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "News", "Article", "Blog" }));

        search.setBackground(new java.awt.Color(30, 40, 44));
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Search.png"))); // NOI18N
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(30, 40, 44));
        jPanel2.setPreferredSize(new java.awt.Dimension(25, 285));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setBackground(new java.awt.Color(30, 40, 44));
        jPanel3.setPreferredSize(new java.awt.Dimension(25, 285));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );

        add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(30, 40, 44));
        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 0, 20));

        news1.setBackground(new java.awt.Color(102, 102, 102));
        news1.setRoundBottomLeft(30);
        news1.setRoundBottomRight(30);
        news1.setRoundTopLeft(30);
        news1.setRoundTopRight(30);
        news1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/thumbnail.jpg"))); // NOI18N
        image1.setText("jLabel4");
        image1.setPreferredSize(new java.awt.Dimension(122, 80));
        news1.add(image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title1.setText("Title: Ronaldo: The best football player in the world");
        title1.setToolTipText("See Detail\n");
        news1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author1.setText("Author: Messi");
        news1.add(author1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle1.setText("Creation Date: 24/05/2004");
        news1.add(subtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type1.setText("Type");
        news1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news1);

        news2.setBackground(new java.awt.Color(102, 102, 102));
        news2.setRoundBottomLeft(30);
        news2.setRoundBottomRight(30);
        news2.setRoundTopLeft(30);
        news2.setRoundTopRight(30);
        news2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/thumbnail.jpg"))); // NOI18N
        image2.setText("jLabel4");
        image2.setPreferredSize(new java.awt.Dimension(122, 80));
        news2.add(image2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title2.setText("Title: Ronaldo: The best football player in the world");
        title2.setToolTipText("See Detail\n");
        news2.add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author2.setText("Author: Messi");
        news2.add(author2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle2.setText("Creation Date: 24/05/2004");
        news2.add(subtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type2.setText("Type");
        news2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news2);

        news3.setBackground(new java.awt.Color(102, 102, 102));
        news3.setRoundBottomLeft(30);
        news3.setRoundBottomRight(30);
        news3.setRoundTopLeft(30);
        news3.setRoundTopRight(30);
        news3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/thumbnail.jpg"))); // NOI18N
        image3.setText("jLabel4");
        image3.setPreferredSize(new java.awt.Dimension(122, 80));
        news3.add(image3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title3.setText("Title: Ronaldo: The best football player in the world");
        title3.setToolTipText("See Detail\n");
        news3.add(title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author3.setText("Author: Messi");
        news3.add(author3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle3.setText("Creation Date: 24/05/2004");
        news3.add(subtitle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type3.setText("Type");
        news3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news3);

        news4.setBackground(new java.awt.Color(102, 102, 102));
        news4.setRoundBottomLeft(30);
        news4.setRoundBottomRight(30);
        news4.setRoundTopLeft(30);
        news4.setRoundTopRight(30);
        news4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/thumbnail.jpg"))); // NOI18N
        image4.setText("jLabel4");
        image4.setPreferredSize(new java.awt.Dimension(122, 80));
        news4.add(image4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        title4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        title4.setText("Title: Ronaldo: The best football player in the world");
        title4.setToolTipText("See Detail\n");
        news4.add(title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 470, -1));

        author4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        author4.setText("Author: Messi");
        news4.add(author4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        subtitle4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitle4.setText("Creation Date: 24/05/2004");
        news4.add(subtitle4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        type4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        type4.setText("Type");
        news4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel4.add(news4);

        add(jPanel4, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttonActionPerformed

        if (page==5)
         {
             return;
         }
         else
         {
                page = page +1;
                jsonobject = (JSONObject)jsonArray.get(page*4);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image1.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title1.setText((String)jsonobject.get("title"));
                subtitle1.setText((String)jsonobject.get("creationDate"));
                author1.setText((String)jsonobject.get("author"));
                type1.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4)));
            }
            };
                title1.addMouseListener(mouseListener);
                jsonobject = (JSONObject)jsonArray.get(page*4+1);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image2.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title2.setText((String)jsonobject.get("title"));
                subtitle2.setText((String)jsonobject.get("creationDate"));
                author2.setText((String)jsonobject.get("author"));
                type2.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+1)) );
            }
            };
                title2.addMouseListener(mouseListener);
            jsonobject = (JSONObject)jsonArray.get(page*4+2);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image3.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
                    
            }
                title3.setText((String)jsonobject.get("title"));
                subtitle3.setText((String)jsonobject.get("creationDate"));
                author3.setText((String)jsonobject.get("author"));
                type3.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+2)) );
            }
            };
                title3.addMouseListener(mouseListener);
                jsonobject = (JSONObject)jsonArray.get(page*4+3);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image4.setIcon(icon);
                type4.setText((String)jsonobject.get("type"));
            } catch (IOException e) {
                e.printStackTrace();
            }
                title4.setText((String)jsonobject.get("title"));
                subtitle4.setText((String)jsonobject.get("creationDate"));
                author4.setText((String)jsonobject.get("author"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                showform(new ViewNews((JSONObject) jsonArray.get(page*4+3)) );
            }
            };
                title4.addMouseListener(mouseListener);
                currentpage.setText("Page "+ (page+1) +" out of 6" );
         }
    }//GEN-LAST:event_nextbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        if (page ==0)
        {
            return;
        }
        else
        {
            page = page-1;
            jsonobject = (JSONObject)jsonArray.get(page*4);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image1.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title1.setText((String)jsonobject.get("title"));
                subtitle1.setText((String)jsonobject.get("creationDate"));
                author1.setText((String)jsonobject.get("author"));
                type1.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                   showform(new ViewNews((JSONObject) jsonArray.get(page*4)) );
            }
            };
                title1.addMouseListener(mouseListener);
            jsonobject = (JSONObject)jsonArray.get(page*4+1);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image2.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title2.setText((String)jsonobject.get("title"));
                subtitle2.setText((String)jsonobject.get("creationDate"));
                author2.setText((String)jsonobject.get("author"));
                type2.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+1)) );
            }
            };
                title2.addMouseListener(mouseListener);
            jsonobject = (JSONObject)jsonArray.get(page*4+2);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image3.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title3.setText((String)jsonobject.get("title"));
                subtitle3.setText((String)jsonobject.get("creationDate"));
                author3.setText((String)jsonobject.get("author"));
                type3.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+2)) );
            }
            };
                title3.addMouseListener(mouseListener);
            jsonobject = (JSONObject)jsonArray.get(page*4+3);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image4.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title4.setText((String)jsonobject.get("title"));
                subtitle4.setText((String)jsonobject.get("creationDate"));
                author4.setText((String)jsonobject.get("author"));
                type4.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+3)) );
            }
            };
                title4.addMouseListener(mouseListener);
                currentpage.setText("Page "+ (page+1) +" out of 6" );
              
        }
        
    }//GEN-LAST:event_backbuttonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        this.jsonArray = new getrecent().printserver((String)this.jComboBox2.getSelectedItem());
        page=0;
        currentpage.setText("Page "+ (page+1) +" out of 6" );
        jsonobject = (JSONObject)jsonArray.get(page*4);
                try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image1.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title1.setText((String)jsonobject.get("title"));
                subtitle1.setText((String)jsonobject.get("creationDate"));
                author1.setText((String)jsonobject.get("author"));
                type1.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4)) );
            }
            };
                title1.addMouseListener(mouseListener);
        jsonobject = (JSONObject)jsonArray.get(page*4+1);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image2.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title2.setText((String)jsonobject.get("title"));
                subtitle2.setText((String)jsonobject.get("creationDate"));
                author2.setText((String)jsonobject.get("author"));
                type2.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+1)) );
            }
            };
                title2.addMouseListener(mouseListener);
        
        jsonobject = (JSONObject)jsonArray.get(page*4+2);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image3.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title3.setText((String)jsonobject.get("title"));
                subtitle3.setText((String)jsonobject.get("creationDate"));
                author3.setText((String)jsonobject.get("author"));
                type3.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+2)) );
            }
            };
                title3.addMouseListener(mouseListener);
        jsonobject = (JSONObject)jsonArray.get(page*4+3);
        try {
                URL url = new URL((String)jsonobject.get("piclink"));
                BufferedImage originalImage = ImageIO.read(url);
                
                // Resize image to fit JLabel
                int labelWidth = 122; // Width of the JLabel
                int labelHeight = 80; // Height of the JLabel
                Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
                
                ImageIcon icon = new ImageIcon(resizedImage);
                image4.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
                title4.setText((String)jsonobject.get("title"));
                subtitle4.setText((String)jsonobject.get("creationDate"));
                author4.setText((String)jsonobject.get("author"));
                type4.setText((String)jsonobject.get("type"));
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+3)) );
            }
            };
                title4.addMouseListener(mouseListener);
    
    }//GEN-LAST:event_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author1;
    private javax.swing.JLabel author2;
    private javax.swing.JLabel author3;
    private javax.swing.JLabel author4;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel currentpage;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javausertable.RoundedPanel news1;
    private javausertable.RoundedPanel news2;
    private javausertable.RoundedPanel news3;
    private javausertable.RoundedPanel news4;
    private javax.swing.JButton nextbutton;
    private javax.swing.JButton search;
    private javax.swing.JLabel subtitle1;
    private javax.swing.JLabel subtitle2;
    private javax.swing.JLabel subtitle3;
    private javax.swing.JLabel subtitle4;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    private javax.swing.JLabel type4;
    // End of variables declaration//GEN-END:variables
}
