package ps;

/**
 *
 * @author iuri_
 */

import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produtos;
import model.dao.ProdutosDAO;


public class TelaVendas extends javax.swing.JInternalFrame {


    public TelaVendas() {
        initComponents();
       
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
        jTVendas.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    
    public void readJTable() {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
        ProdutosDAO pdao = new ProdutosDAO();
        modelo.setNumRows(0);

        for (Produtos p : pdao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPreco(),
                p.getTipo(),
                p.getQntd_produto()
            });

        }

    }  
     
    public void readJTableParaNome(String NomePesquisa) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTVendas.getModel();
        ProdutosDAO pdao = new ProdutosDAO();
        modelo.setNumRows(0);

        for (Produtos p : pdao.readParaNome(NomePesquisa)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getPreco(),
                p.getTipo(),
                p.getQntd_produto()
            });

        }

    }
    
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    
//    public void readJTableCarrinho() {
//        
//        DefaultTableModel modelo = (DefaultTableModel) jTCarrinho.getModel();
//        ProdutosDAO pdao = new ProdutosDAO();
//        modelo.setNumRows(0);
//
//        for (Produtos p : pdao.read()) {
//            modelo.addRow(new Object[]{
//                p.getId(),
//                p.getNome(),
//                p.getPreco(),
//                p.getTipo(),
//                p.getQntd_produto()
//            });
//
//        }
//
//    }  
    
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    //--------------------------------------------------------------------------------------------------------------
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPesquisaVendas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTVendas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Desconto:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        setClosable(true);
        setTitle("Vendas");
        setPreferredSize(new java.awt.Dimension(842, 494));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pesquisar...:");

        jPesquisaVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPesquisaVendasActionPerformed(evt);
            }
        });
        jPesquisaVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPesquisaVendasKeyReleased(evt);
            }
        });

        jTVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "PREÇO", "TIPO", "ESTOQUE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTVendas);
        if (jTVendas.getColumnModel().getColumnCount() > 0) {
            jTVendas.getColumnModel().getColumn(0).setMinWidth(40);
            jTVendas.getColumnModel().getColumn(0).setMaxWidth(40);
            jTVendas.getColumnModel().getColumn(2).setMinWidth(80);
            jTVendas.getColumnModel().getColumn(2).setMaxWidth(80);
            jTVendas.getColumnModel().getColumn(3).setMinWidth(100);
            jTVendas.getColumnModel().getColumn(3).setMaxWidth(100);
            jTVendas.getColumnModel().getColumn(4).setMinWidth(100);
            jTVendas.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "QTND VENDIDA", "PREÇO", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTCarrinhoMouseClicked(evt);
            }
        });
        jTCarrinho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTCarrinhoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTCarrinho);
        if (jTCarrinho.getColumnModel().getColumnCount() > 0) {
            jTCarrinho.getColumnModel().getColumn(0).setMinWidth(40);
            jTCarrinho.getColumnModel().getColumn(0).setMaxWidth(40);
            jTCarrinho.getColumnModel().getColumn(2).setMinWidth(110);
            jTCarrinho.getColumnModel().getColumn(2).setMaxWidth(110);
            jTCarrinho.getColumnModel().getColumn(3).setMinWidth(100);
            jTCarrinho.getColumnModel().getColumn(3).setMaxWidth(100);
            jTCarrinho.getColumnModel().getColumn(4).setMinWidth(80);
            jTCarrinho.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("SubTotal:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No Carrinho:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Desconto:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pago:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Troco:");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Total:");

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jPesquisaVendas)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPesquisaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPesquisaVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPesquisaVendasActionPerformed
        //Campo de pesquisa sobre produtos, irá ocorrer uma conexão com o Banco de Dados.
        

    }//GEN-LAST:event_jPesquisaVendasActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jPesquisaVendasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPesquisaVendasKeyReleased
       
       readJTableParaNome(jPesquisaVendas.getText());
       
    }//GEN-LAST:event_jPesquisaVendasKeyReleased

    private void jTVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTVendasMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
        String id, nome, qtnd_vendida,preco,total;
        float total2 = 0;
        int i = 0;
        
        if (jTVendas.getSelectedRow() != -1){
            id = jTVendas.getValueAt(jTVendas.getSelectedRow(), 0).toString();
            nome = jTVendas.getValueAt(jTVendas.getSelectedRow(), 1).toString();
//            qtnd_vendida = jTVendas.getValueAt(jTVendas.getSelectedRow(), 2).toString();
            preco = jTVendas.getValueAt(jTVendas.getSelectedRow(), 2).toString();
           // total2 = Integer.parseInt(jquant_vendida.toString())*Integer.parseInt(jTVendas.getValueAt(jTVendas.getSelectedRow(), 3).toString());
//            total = jTVendas.getValueAt(jTVendas.getSelectedRow(), 4).toString();
            
//           modelo2.addRow(new String[]{id, nome, qtnd_vendida, preco, total});
//        }
                
        
//        if (jTVendas.getSelectedRow() != -1){
//            id = jTVendas.getValueAt(jTVendas.getSelectedRow(), 0).toString();
//            nome = jTVendas.getValueAt(jTVendas.getSelectedRow(), 1).toString();
              qtnd_vendida = "";
//            preco = jTVendas.getValueAt(jTVendas.getSelectedRow(), 3).toString();
//            total2 = Integer.parseInt(jquant_vendida.getText())*Integer.parseInt(jTVendas.getValueAt(jTVendas.getSelectedRow(), 3).getText());
 //           total2 = Integer.parseInt(qtnd_vendida);
//            total = ""+total2;
            modelo2.addRow(new String[]{id, nome, qtnd_vendida, preco});
           
        }
        
        
        
        
        
    }//GEN-LAST:event_jTVendasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTCarrinhoMouseClicked
       
//        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
//        String qtnd_vendida,preco,total;
//        String qtnd;
//        float qtnd2;
//        float total2;
//        
//        if (jTCarrinho.getSelectedRow() != -1){
//            
//            //qtnd = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 2).toString();
//           // preco = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 3).toString();
//            //qtnd2 = Float.parseFloat(qtnd);
//           // total2 = Float.parseFloat(preco)*qtnd2;
//            total = "fhg";
//            
//            
//        modelo2.setValueAt(new String[]{total},jTCarrinho.getSelectedRow(),4);
//        }
    }//GEN-LAST:event_jTCarrinhoMouseClicked

    private void jTCarrinhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCarrinhoKeyReleased
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) jTCarrinho.getModel();
        String qtnd_vendida,preco,total;
        String qtnd;
        float qtnd2;
        float total2;
        
        if (jTCarrinho.getSelectedRow() != -1){
            
           qtnd = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 2).toString();
           preco = jTCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 3).toString();
           qtnd2 = Float.parseFloat(qtnd);
           total2 = Float.parseFloat(preco)*qtnd2;
           total = ""+total2;
           
           modelo2.setValueAt(total, jTCarrinho.getSelectedRow(), 4);
            //modelo2.setValueAt(new String[]{total},jTCarrinho.getSelectedRow(),4);
        }
        
        
        
    }//GEN-LAST:event_jTCarrinhoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPesquisaVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTCarrinho;
    private javax.swing.JTable jTVendas;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
