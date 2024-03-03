/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.io.File;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author chuch
 */
public class MenuArr extends javax.swing.JFrame
{

    /**
     * Creates new form MenuArr
     */
    private GenericsKB_Array arr;
    
    public MenuArr()
    {
        initComponents();
    }
    public MenuArr(String fileName)
    {
        initComponents();
        arr = new GenericsKB_Array(fileName);
        //Disables the editing of the table by the user
        pnlHome.setVisible(true);
        pnlSearch.setVisible(false);
        pnlAdd.setVisible(false);
        pnlLoad.setVisible(false);

        tblHome.setModel(arr.populateTable(tblHome));
        TableColumnModel columnModel = tblHome.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(450);
        columnModel.getColumn(2).setPreferredWidth(50);
        tblHome.setDefaultEditor(Object.class, null);
        tblHome.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        pnlSidebar = new javax.swing.JPanel();
        pnlHomeArr = new javax.swing.JPanel();
        lblHomeArr = new javax.swing.JLabel();
        pnlSearchArr = new javax.swing.JPanel();
        lblSearchArr = new javax.swing.JLabel();
        pnlAddTerm = new javax.swing.JPanel();
        lblAddArr = new javax.swing.JLabel();
        pnlLoadKnowledgeArr = new javax.swing.JPanel();
        lblLoadArr = new javax.swing.JLabel();
        pnlHome = new javax.swing.JPanel();
        scpHome = new javax.swing.JScrollPane();
        tblHome = new javax.swing.JTable();
        lblHome = new javax.swing.JLabel();
        ChangeDataStructure = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        lblEnterSentence = new javax.swing.JLabel();
        txtEnterSentence = new javax.swing.JTextField();
        lblTermSearch = new javax.swing.JLabel();
        lblIntructions = new javax.swing.JLabel();
        lblSearchTerms = new javax.swing.JLabel();
        txtEnterTerm = new javax.swing.JTextField();
        lblErrorSearchTerm = new javax.swing.JLabel();
        btnSearchTerm = new javax.swing.JButton();
        scpTermSearch = new javax.swing.JScrollPane();
        txaSearchTerm = new javax.swing.JTextArea();
        lblBackground1 = new javax.swing.JLabel();
        pnlAdd = new javax.swing.JPanel();
        lblAddScore = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblAddterm = new javax.swing.JLabel();
        lblAddTerm = new javax.swing.JLabel();
        txtAddTerm = new javax.swing.JTextField();
        lblAddSentence = new javax.swing.JLabel();
        txtAddSentence = new javax.swing.JTextField();
        lblErrorAdd = new javax.swing.JLabel();
        lblIntructions1 = new javax.swing.JLabel();
        txtAddScore = new javax.swing.JTextField();
        lblBackground2 = new javax.swing.JLabel();
        pnlLoad = new javax.swing.JPanel();
        lblLoad = new javax.swing.JLabel();
        lblIntructions2 = new javax.swing.JLabel();
        lblErrorLoad = new javax.swing.JLabel();
        lblLoadFile = new javax.swing.JLabel();
        txtLoad = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        lblBackground3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSidebar.setBackground(new java.awt.Color(153, 169, 215));

        pnlHomeArr.setBackground(new java.awt.Color(182, 202, 231));
        pnlHomeArr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlHomeArrMouseClicked(evt);
            }
        });
        pnlHomeArr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHomeArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblHomeArr.setText("Home");
        pnlHomeArr.add(lblHomeArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 27));

        pnlSearchArr.setBackground(new java.awt.Color(182, 202, 231));
        pnlSearchArr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlSearchArrMouseClicked(evt);
            }
        });
        pnlSearchArr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSearchArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSearchArr.setText("Search Term");
        pnlSearchArr.add(lblSearchArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 27));

        pnlAddTerm.setBackground(new java.awt.Color(182, 202, 231));
        pnlAddTerm.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlAddTermMouseClicked(evt);
            }
        });
        pnlAddTerm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAddArr.setText("Add/ Update Term");
        pnlAddTerm.add(lblAddArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 27));

        pnlLoadKnowledgeArr.setBackground(new java.awt.Color(182, 202, 231));
        pnlLoadKnowledgeArr.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                pnlLoadKnowledgeArrMouseClicked(evt);
            }
        });
        pnlLoadKnowledgeArr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoadArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLoadArr.setText("Load knowledge");
        pnlLoadKnowledgeArr.add(lblLoadArr, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 27));

        javax.swing.GroupLayout pnlSidebarLayout = new javax.swing.GroupLayout(pnlSidebar);
        pnlSidebar.setLayout(pnlSidebarLayout);
        pnlSidebarLayout.setHorizontalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHomeArr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlSearchArr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAddTerm, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(pnlLoadKnowledgeArr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlSidebarLayout.setVerticalGroup(
            pnlSidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSidebarLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(pnlHomeArr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(pnlSearchArr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pnlAddTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pnlLoadKnowledgeArr, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        getContentPane().add(pnlSidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 510));

        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblHome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Terms", "Sentence", "Confidence Score"
            }
        ));
        scpHome.setViewportView(tblHome);

        pnlHome.add(scpHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 340));

        lblHome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Welcome");
        pnlHome.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 50));

        ChangeDataStructure.setText("Change Data Structure");
        ChangeDataStructure.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ChangeDataStructureActionPerformed(evt);
            }
        });
        pnlHome.add(ChangeDataStructure, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 450, 180, -1));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/lib/Background image.jpg"))); // NOI18N
        lblBackground.setName(""); // NOI18N
        pnlHome.add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(pnlHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 510));

        pnlSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterSentence.setText("Enter Sentence:");
        pnlSearch.add(lblEnterSentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 20));

        txtEnterSentence.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEnterSentenceActionPerformed(evt);
            }
        });
        pnlSearch.add(txtEnterSentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 450, -1));

        lblTermSearch.setText("Enter Term:");
        pnlSearch.add(lblTermSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 20));

        lblIntructions.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIntructions.setForeground(new java.awt.Color(255, 0, 0));
        lblIntructions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntructions.setText("Enter only text if searching for term statement. Enter both term and sentence if searching for confidence score");
        pnlSearch.add(lblIntructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 20));

        lblSearchTerms.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSearchTerms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSearchTerms.setText("Search By Term");
        pnlSearch.add(lblSearchTerms, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 380, 50));

        txtEnterTerm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtEnterTermActionPerformed(evt);
            }
        });
        pnlSearch.add(txtEnterTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 450, -1));

        lblErrorSearchTerm.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblErrorSearchTerm.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorSearchTerm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlSearch.add(lblErrorSearchTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 800, 20));

        btnSearchTerm.setText("Search");
        btnSearchTerm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchTermActionPerformed(evt);
            }
        });
        pnlSearch.add(btnSearchTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        txaSearchTerm.setColumns(20);
        txaSearchTerm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txaSearchTerm.setRows(5);
        scpTermSearch.setViewportView(txaSearchTerm);

        pnlSearch.add(scpTermSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 670, 160));

        lblBackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/lib/Background image.jpg"))); // NOI18N
        lblBackground1.setName(""); // NOI18N
        pnlSearch.add(lblBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(pnlSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 510));

        pnlAdd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddScore.setText("Enter Confidence Score:");
        pnlAdd.add(lblAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 140, 20));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlAdd.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        lblAddterm.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblAddterm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddterm.setText("Add/Update Term");
        pnlAdd.add(lblAddterm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 380, 50));

        lblAddTerm.setText("Enter Term:");
        pnlAdd.add(lblAddTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 20));

        txtAddTerm.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtAddTermActionPerformed(evt);
            }
        });
        pnlAdd.add(txtAddTerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 450, -1));

        lblAddSentence.setText("Enter Sentence:");
        pnlAdd.add(lblAddSentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 90, 20));

        txtAddSentence.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtAddSentenceActionPerformed(evt);
            }
        });
        pnlAdd.add(txtAddSentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 450, -1));

        lblErrorAdd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblErrorAdd.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlAdd.add(lblErrorAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 800, 20));

        lblIntructions1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIntructions1.setForeground(new java.awt.Color(255, 0, 0));
        lblIntructions1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntructions1.setText("Enter the term,sentence and cofidence score to add new term or update existing term.");
        pnlAdd.add(lblIntructions1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 20));

        txtAddScore.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtAddScoreActionPerformed(evt);
            }
        });
        pnlAdd.add(txtAddScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 450, -1));

        lblBackground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/lib/Background image.jpg"))); // NOI18N
        lblBackground2.setName(""); // NOI18N
        pnlAdd.add(lblBackground2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(pnlAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 510));

        pnlLoad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLoad.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoad.setText("Load Knowledge Base From File");
        pnlLoad.add(lblLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 50));

        lblIntructions2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIntructions2.setForeground(new java.awt.Color(255, 0, 0));
        lblIntructions2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntructions2.setText("Load a new knowledge base by enteting the name of the file with knowledge base. ");
        pnlLoad.add(lblIntructions2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 20));

        lblErrorLoad.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblErrorLoad.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorLoad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlLoad.add(lblErrorLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 800, 20));

        lblLoadFile.setText("Enter File Name:");
        pnlLoad.add(lblLoadFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 90, 20));
        pnlLoad.add(txtLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 310, -1));

        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnLoadActionPerformed(evt);
            }
        });
        pnlLoad.add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        lblBackground3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/lib/Background image.jpg"))); // NOI18N
        lblBackground3.setName(""); // NOI18N
        pnlLoad.add(lblBackground3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        getContentPane().add(pnlLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 800, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlHomeArrMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlHomeArrMouseClicked
    {//GEN-HEADEREND:event_pnlHomeArrMouseClicked
        pnlHome.setVisible(true);
        pnlSearch.setVisible(false);
        pnlAdd.setVisible(false);
        pnlLoad.setVisible(false);
        
        tblHome.setModel(arr.populateTable(tblHome));
        TableColumnModel columnModel = tblHome.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(60);
        columnModel.getColumn(1).setPreferredWidth(450);
        columnModel.getColumn(2).setPreferredWidth(50);
        tblHome.setDefaultEditor(Object.class, null);
        tblHome.getTableHeader().setReorderingAllowed(false);
    }//GEN-LAST:event_pnlHomeArrMouseClicked

    private void txtEnterTermActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEnterTermActionPerformed
    {//GEN-HEADEREND:event_txtEnterTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterTermActionPerformed

    private void btnSearchTermActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSearchTermActionPerformed
    {//GEN-HEADEREND:event_btnSearchTermActionPerformed
        // TODO add your handling code here:
        txaSearchTerm.setText("");
        if (txtEnterTerm.getText().isBlank())
        {
            lblErrorSearchTerm.setText("Please Enter a term to search");
        }
        else if (!txtEnterTerm.getText().isBlank() && txtEnterSentence.getText().isBlank())
        {
            lblErrorSearchTerm.setText("");
            String term = txtEnterTerm.getText();
            String output = arr.display(term);
            txaSearchTerm.setText(output);
        }
        else
        {
            lblErrorSearchTerm.setText("");
            String term = txtEnterTerm.getText();
            String sentence = txtEnterSentence.getText();
            String output = arr.display(term, sentence);
            txaSearchTerm.setText(output);
        }
        txtEnterTerm.setText("");
        txtEnterSentence.setText("");
    }//GEN-LAST:event_btnSearchTermActionPerformed

    private void pnlSearchArrMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlSearchArrMouseClicked
    {//GEN-HEADEREND:event_pnlSearchArrMouseClicked
        pnlHome.setVisible(false);
        pnlSearch.setVisible(true);
        pnlAdd.setVisible(false);
        pnlLoad.setVisible(false);
    }//GEN-LAST:event_pnlSearchArrMouseClicked

    private void txtEnterSentenceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtEnterSentenceActionPerformed
    {//GEN-HEADEREND:event_txtEnterSentenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterSentenceActionPerformed

    private void txtAddTermActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtAddTermActionPerformed
    {//GEN-HEADEREND:event_txtAddTermActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddTermActionPerformed

    private void txtAddSentenceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtAddSentenceActionPerformed
    {//GEN-HEADEREND:event_txtAddSentenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddSentenceActionPerformed

    private void txtAddScoreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtAddScoreActionPerformed
    {//GEN-HEADEREND:event_txtAddScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddScoreActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        lblErrorSearchTerm.setText("");
        if (txtAddTerm.getText().isBlank())
        {
            lblErrorAdd.setText("Please Enter a term to add");
        }
        else if (txtAddSentence.getText().isBlank())
        {
            lblErrorAdd.setText("Please Enter the sentence to add");
        }
        else if (txtAddScore.getText().isBlank())
        {
            lblErrorAdd.setText("Please Enter a score to add");
        }
        else
        {
            String term = txtAddTerm.getText();
            String sentence = txtAddSentence.getText();
            Double score = Double.parseDouble(txtAddScore.getText());
            
            lblErrorAdd.setText(arr.userAdd(term, sentence, score));
            txtAddTerm.setText("");
            txtAddScore.setText("");
            txtAddSentence.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void pnlAddTermMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlAddTermMouseClicked
    {//GEN-HEADEREND:event_pnlAddTermMouseClicked
        // TODO add your handling code here:
        pnlHome.setVisible(false);
        pnlSearch.setVisible(false);
        pnlAdd.setVisible(true);
        pnlLoad.setVisible(false);
    }//GEN-LAST:event_pnlAddTermMouseClicked

    private void pnlLoadKnowledgeArrMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlLoadKnowledgeArrMouseClicked
    {//GEN-HEADEREND:event_pnlLoadKnowledgeArrMouseClicked
        // TODO add your handling code here:
        pnlHome.setVisible(false);
        pnlSearch.setVisible(false);
        pnlAdd.setVisible(false);
        pnlLoad.setVisible(true);
    }//GEN-LAST:event_pnlLoadKnowledgeArrMouseClicked

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnLoadActionPerformed
    {//GEN-HEADEREND:event_btnLoadActionPerformed
        lblErrorLoad.setText("");
        if (txtLoad.getText().isBlank())
        {
            lblErrorLoad.setText("Please Enter a text file");
        }
        else
        {
           File f = new File(txtLoad.getText());
           if(f.exists())
           {
               arr.readFile(txtLoad.getText());
               lblErrorLoad.setText("Loaded Succesfully");
           }
           else
           {
               lblErrorLoad.setText("File not found. Please reenter file name");
           }
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void ChangeDataStructureActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ChangeDataStructureActionPerformed
    {//GEN-HEADEREND:event_ChangeDataStructureActionPerformed
        // TODO add your handling code here:
        new MainMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_ChangeDataStructureActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MenuArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MenuArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MenuArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MenuArr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MenuArr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeDataStructure;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearchTerm;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddArr;
    private javax.swing.JLabel lblAddScore;
    private javax.swing.JLabel lblAddSentence;
    private javax.swing.JLabel lblAddTerm;
    private javax.swing.JLabel lblAddterm;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBackground1;
    private javax.swing.JLabel lblBackground2;
    private javax.swing.JLabel lblBackground3;
    private javax.swing.JLabel lblEnterSentence;
    private javax.swing.JLabel lblErrorAdd;
    private javax.swing.JLabel lblErrorLoad;
    private javax.swing.JLabel lblErrorSearchTerm;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHomeArr;
    private javax.swing.JLabel lblIntructions;
    private javax.swing.JLabel lblIntructions1;
    private javax.swing.JLabel lblIntructions2;
    private javax.swing.JLabel lblLoad;
    private javax.swing.JLabel lblLoadArr;
    private javax.swing.JLabel lblLoadFile;
    private javax.swing.JLabel lblSearchArr;
    private javax.swing.JLabel lblSearchTerms;
    private javax.swing.JLabel lblTermSearch;
    private javax.swing.JPanel pnlAdd;
    private javax.swing.JPanel pnlAddTerm;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlHomeArr;
    private javax.swing.JPanel pnlLoad;
    private javax.swing.JPanel pnlLoadKnowledgeArr;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSearchArr;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JScrollPane scpHome;
    private javax.swing.JScrollPane scpTermSearch;
    private javax.swing.JTable tblHome;
    private javax.swing.JTextArea txaSearchTerm;
    private javax.swing.JTextField txtAddScore;
    private javax.swing.JTextField txtAddSentence;
    private javax.swing.JTextField txtAddTerm;
    private javax.swing.JTextField txtEnterSentence;
    private javax.swing.JTextField txtEnterTerm;
    private javax.swing.JTextField txtLoad;
    // End of variables declaration//GEN-END:variables
}
