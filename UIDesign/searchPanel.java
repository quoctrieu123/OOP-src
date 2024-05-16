/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javausertable;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicButtonUI;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author User
 */
public class searchPanel extends javax.swing.JPanel {
    String pic;
    /**
     * Creates new form searchPanel
     */
    MouseListener mouseListener;
    private int page;
    private int pages_num;
    private JSONObject jsonobject;
    private int numberofpage;
    private JSONArray jsonArray;
    public searchPanel() {
        initComponents();
        this.news2.setVisible(false);
        this.news1.setVisible(false);
        this.news3.setVisible(false);
        this.news4.setVisible(false);
        this.page=0;
        
        search.setUI(new BasicButtonUI());
        search.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                search.setBackground(new Color(153,153,153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                search.setBackground(new Color(30,40,44));
            }
    });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        searchbar = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        categorycombobox = new javax.swing.JComboBox<>();
        next = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pageimage = new javax.swing.JLabel();
        currentpage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
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
        setPreferredSize(new java.awt.Dimension(766, 476));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(30, 40, 44));
        jPanel1.setPreferredSize(new java.awt.Dimension(573, 50));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20));

        back.setBackground(new java.awt.Color(30, 40, 44));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Back To.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);

        searchbar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        searchbar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchbar.setAutoscrolls(false);
        searchbar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchbar.setPreferredSize(new java.awt.Dimension(300, 22));
        searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbarActionPerformed(evt);
            }
        });
        jPanel1.add(searchbar);

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Search.png"))); // NOI18N
        search.setBorder(null);
        search.setPreferredSize(new java.awt.Dimension(40, 20));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);

        categorycombobox.setBackground(new java.awt.Color(30, 40, 44));
        categorycombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        categorycombobox.setForeground(new java.awt.Color(255, 255, 255));
        categorycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Blog", "Article", "News" }));
        categorycombobox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categorycombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorycomboboxActionPerformed(evt);
            }
        });
        jPanel1.add(categorycombobox);

        next.setBackground(new java.awt.Color(30, 40, 44));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Next page.png"))); // NOI18N
        next.setBorder(null);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next);

        jPanel3.setBackground(new java.awt.Color(30, 40, 44));

        pageimage.setBackground(new java.awt.Color(30, 40, 44));
        pageimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javausertable/icon/Overview_2.png"))); // NOI18N

        currentpage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        currentpage.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pageimage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(currentpage)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pageimage))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentpage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(30, 40, 44));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(30, 40, 44));
        jPanel4.setPreferredSize(new java.awt.Dimension(25, 285));
        jPanel4.setLayout(new java.awt.BorderLayout());
        jPanel4.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.LINE_START);

        jPanel7.setBackground(new java.awt.Color(30, 40, 44));
        jPanel7.setPreferredSize(new java.awt.Dimension(25, 285));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7, java.awt.BorderLayout.LINE_END);

        jPanel6.setBackground(new java.awt.Color(30, 40, 44));
        jPanel6.setLayout(new java.awt.GridLayout(4, 0, 0, 5));

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
        type1.setText("jLabel2");
        news1.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel6.add(news1);

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
        type2.setText("jLabel2");
        news2.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel6.add(news2);

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
        type3.setText("jLabel2");
        news3.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel6.add(news3);

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
        type4.setText("jLabel2");
        news4.add(type4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel6.add(news4);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public void showform(Component comp)
    {
        this.removeAll();
        this.add(comp);
        this.repaint();
        this.revalidate();
    }
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        this.page =0;
        String input=searchbar.getText();
        senatatoserver a= new senatatoserver();
        jsonArray = a.printserver(input,(String)categorycombobox.getSelectedItem());
        this.pages_num = jsonArray.size();
        if (pages_num==0)
        {
            currentpage.setText("No result found");
            return;
        }
        this.numberofpage = (int) Math.ceil((float)pages_num/4.0);
        this.currentpage.setText("Page "+ String.valueOf(this.page+1)+ " out of "+ this.numberofpage);
        this.news1.setVisible(false);
        this.news2.setVisible(false);
        this.news3.setVisible(false);
        this.news4.setVisible(false);
        if (pages_num >4)
        {
            this.news1.setVisible(true);
            this.news2.setVisible(true);
            this.news3.setVisible(true);
            this.news4.setVisible(true);
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
    
        }
        if (pages_num==3)
        {
            this.news1.setVisible(true);
            this.news2.setVisible(true);
            this.news3.setVisible(true);
            
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
                this.news1.setVisible(true);
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
                
            };title2.addMouseListener(mouseListener);
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
                
            };title3.addMouseListener(mouseListener);
        }
        if(pages_num==2)
        {
            this.news1.setVisible(true);
            this.news2.setVisible(true);
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
                
            };title1.addMouseListener(mouseListener);
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
                
            };title2.addMouseListener(mouseListener);
        }
     if(pages_num==1)
     {
         this.news1.setVisible(true);
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
                
            };title1.addMouseListener(mouseListener);
     }

    }//GEN-LAST:event_searchActionPerformed

    private void categorycomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorycomboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorycomboboxActionPerformed

    private void searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbarActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (this.page >= this.numberofpage-1)
        {
            return;
        }
        else if (this.page == this.numberofpage-2)
        {
            page+=1;
            int a = this.pages_num% 4;
            this.currentpage.setText("Page "+ String.valueOf(this.page+1)+ " out of "+ this.numberofpage);
            if (a==0)
            {
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
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+1)) );
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
                type2.setText((String)jsonobject.get("type"));
                author2.setText((String)jsonobject.get("author"));
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
                type3.setText((String)jsonobject.get("type"));
                author3.setText((String)jsonobject.get("author"));
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
            }
            if(a==1)
            {
                this.news2.setVisible(false);
                this.news3.setVisible(false);
                this.news4.setVisible(false);
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
            }
            if (a==2)
            {
                this.news3.setVisible(false);
                this.news4.setVisible(false);
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
            }
            if(a==3)
            {
                this.news4.setVisible(false);
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
            }
        }
        else
        {
            this.news1.setVisible(true);
            this.news2.setVisible(true);
            this.news3.setVisible(true);
            this.news4.setVisible(true);
            this.page+=1;
            this.currentpage.setText("Page "+ String.valueOf(this.page+1)+ " out of "+ this.numberofpage);
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
                type3.setText((String)jsonobject.get("type"));
                author3.setText((String)jsonobject.get("author"));
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
        }
    }//GEN-LAST:event_nextActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
 if (this.page ==0)
        {
            return;
        }
        else
        {
            this.page-=1;
            this.news1.setVisible(true);
            this.news2.setVisible(true);
            this.news3.setVisible(true);
            this.news4.setVisible(true);
            this.currentpage.setText("Page "+ String.valueOf(this.page+1)+ " out of "+ this.numberofpage);
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
                type2.setText((String)jsonobject.get("type"));
                subtitle2.setText((String)jsonobject.get("creationDate"));
                author2.setText((String)jsonobject.get("author"));
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
                type3.setText((String)jsonobject.get("type"));
                author3.setText((String)jsonobject.get("author"));
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
                mouseListener = new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
               showform(new ViewNews((JSONObject) jsonArray.get(page*4+3)) );
            }
            };
                title4.addMouseListener(mouseListener);
        }    
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author1;
    private javax.swing.JLabel author2;
    private javax.swing.JLabel author3;
    private javax.swing.JLabel author4;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> categorycombobox;
    private javax.swing.JLabel currentpage;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javausertable.RoundedPanel news1;
    private javausertable.RoundedPanel news2;
    private javausertable.RoundedPanel news3;
    private javausertable.RoundedPanel news4;
    private javax.swing.JButton next;
    private javax.swing.JLabel pageimage;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchbar;
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
