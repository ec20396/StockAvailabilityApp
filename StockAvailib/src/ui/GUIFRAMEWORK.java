package ui;

import java.awt.CardLayout;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.Iphone;
import services.iphoneTransactions;

public class GUIFRAMEWORK extends javax.swing.JFrame {
    
    private iphoneTransactions productTransactionsServiceImpl = new iphoneTransactions();
    
    public GUIFRAMEWORK()  {
        initComponents();
        
        init();
        
        showDashboard();
    }

    void init(){
        
        setExtendedState(MAXIMIZED_BOTH);
        
        setIcon();
        
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                populateListWithProducts();
            }
        });
        t1.start();
        
        setupSaveUpdate(false);
        
        setupFooter();
    }
    
    void setIcon(){
        setIconImage(new ImageIcon(getClass().getResource("/icons/dashboard_50px.png")).getImage());
    }
    
    void populateListWithProducts(){
        DefaultListModel model = new DefaultListModel();
        model.clear();
        productTransactionsServiceImpl.getProducts().forEach(product -> {
            model.addElement(product.getName().toUpperCase());
        });
        productsJList.setModel(model);
    }
    
    void setupSaveUpdate(boolean b){
        nameTF.setVisible(b);
        qtTF.setVisible(b);
        spTF.setVisible(b);
        ppTF.setVisible(b);
        closeLbl.setVisible(b);
        actionLbl.setVisible(b);
        saveLbl.setVisible(b);
    }
    
    void setupFooter(){
        int copyrightSymbolCodePoint = 169 ;
        String copyright = Character.toString( copyrightSymbolCodePoint ) ;
        footer.setText(copyright+footer.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        NorthPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        headerLbl = new javax.swing.JLabel();
        WestPnl = new javax.swing.JPanel();
        productsSclPnl = new javax.swing.JScrollPane();
        productsJList = new javax.swing.JList<>();
        CenterPnl = new javax.swing.JPanel();
        DashboardCard = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        totalQtysSold = new javax.swing.JLabel();
        salesLbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        profitSales = new javax.swing.JLabel();
        totalTransSales = new javax.swing.JLabel();
        totalProductsSold = new javax.swing.JLabel();
        totalSalePrice = new javax.swing.JLabel();
        totalPurchasePrice = new javax.swing.JLabel();
        salesLbl1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        totalTransPurcahses = new javax.swing.JLabel();
        totalProductsPurchased = new javax.swing.JLabel();
        totalSalePricePurchases = new javax.swing.JLabel();
        totalPurchasePricePurchases = new javax.swing.JLabel();
        profitPurchases = new javax.swing.JLabel();
        salesLbl2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        totalProductsStk = new javax.swing.JLabel();
        totalProductsSaleValue = new javax.swing.JLabel();
        totalProductsPurchaseValue = new javax.swing.JLabel();
        totalProfitableAmount = new javax.swing.JLabel();
        totalQuantity = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalQtysPurch = new javax.swing.JLabel();
        ProductsCard = new javax.swing.JPanel();
        pnLbl1 = new javax.swing.JLabel();
        pnLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnLbl2 = new javax.swing.JLabel();
        pnLbl3 = new javax.swing.JLabel();
        spLbl = new javax.swing.JLabel();
        ppLbl = new javax.swing.JLabel();
        qtLbl = new javax.swing.JLabel();
        purchaseLbl = new javax.swing.JLabel();
        sellLbl = new javax.swing.JLabel();
        addLbl = new javax.swing.JLabel();
        saveLbl = new javax.swing.JLabel();
        updateLbl = new javax.swing.JLabel();
        deleteLbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        closeLbl = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        spTF = new javax.swing.JTextField();
        ppTF = new javax.swing.JTextField();
        qtTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        actionLbl = new javax.swing.JLabel();
        EastPnl = new javax.swing.JPanel();
        SouthPnl = new javax.swing.JPanel();
        footer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mini Project");

        NorthPnl.setBackground(new java.awt.Color(0, 102, 51));
        NorthPnl.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iphone");
        jLabel3.setPreferredSize(new java.awt.Dimension(250, 25));
        NorthPnl.add(jLabel3, java.awt.BorderLayout.WEST);

        headerLbl.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        headerLbl.setForeground(new java.awt.Color(51, 255, 51));
        headerLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLbl.setText("Dashboard");
        NorthPnl.add(headerLbl, java.awt.BorderLayout.CENTER);

        getContentPane().add(NorthPnl, java.awt.BorderLayout.NORTH);

        WestPnl.setBackground(new java.awt.Color(236, 235, 234));
        WestPnl.setPreferredSize(new java.awt.Dimension(250, 659));
        WestPnl.setLayout(new java.awt.GridBagLayout());

        productsSclPnl.setBorder(javax.swing.BorderFactory.createEmptyBorder(30, 0, 0, 0));
        productsSclPnl.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        productsSclPnl.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        productsSclPnl.setOpaque(false);
        productsSclPnl.getViewport().setOpaque(false);

        productsJList.setBackground(new java.awt.Color(236, 235, 234));
        productsJList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productsJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productsJList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productsJList.setSelectionBackground(new java.awt.Color(0, 102, 51));
        productsJList.setSelectionForeground(new java.awt.Color(102, 255, 102));
        productsJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                productsJListValueChanged(evt);
            }
        });
        productsSclPnl.setViewportView(productsJList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        WestPnl.add(productsSclPnl, gridBagConstraints);

        getContentPane().add(WestPnl, java.awt.BorderLayout.WEST);

        CenterPnl.setBackground(new java.awt.Color(246, 245, 245));
        CenterPnl.setLayout(new java.awt.CardLayout());

        DashboardCard.setOpaque(false);
        DashboardCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Total Quantities Sold: ");
        DashboardCard.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        totalQtysSold.setText("0");
        DashboardCard.add(totalQtysSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, 20));

        salesLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salesLbl.setForeground(new java.awt.Color(0, 102, 0));
        salesLbl.setText(" SALES Iphone");
        salesLbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(0, 102, 0)));
        DashboardCard.add(salesLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 350, 30));

        jLabel6.setText("Profit:");
        DashboardCard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setText("Total Transactions: ");
        DashboardCard.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel8.setText("Total Products Sold: ");
        DashboardCard.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel9.setText("Total Sale Price:");
        DashboardCard.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel10.setText("Total Purchase Price:");
        DashboardCard.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        profitSales.setText("0");
        DashboardCard.add(profitSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 60, 20));

        totalTransSales.setText("0");
        DashboardCard.add(totalTransSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 60, 20));

        totalProductsSold.setText("0");
        DashboardCard.add(totalProductsSold, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 60, 20));

        totalSalePrice.setText("0");
        DashboardCard.add(totalSalePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 60, 20));

        totalPurchasePrice.setText("0");
        DashboardCard.add(totalPurchasePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 60, 20));

        salesLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salesLbl1.setForeground(new java.awt.Color(0, 102, 0));
        salesLbl1.setText("Purchase Iphone");
        salesLbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(0, 102, 0)));
        DashboardCard.add(salesLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 350, 30));

        jLabel16.setText("Total Transactions: ");
        DashboardCard.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel17.setText("Total Products Purcahsed: ");
        DashboardCard.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel18.setText("Total Sale Price:");
        DashboardCard.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel19.setText("Total Purchase Price:");
        DashboardCard.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel20.setText("Profit:");
        DashboardCard.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        totalTransPurcahses.setText("0");
        DashboardCard.add(totalTransPurcahses, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 60, 20));

        totalProductsPurchased.setText("0");
        DashboardCard.add(totalProductsPurchased, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 60, 20));

        totalSalePricePurchases.setText("0");
        DashboardCard.add(totalSalePricePurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 60, 20));

        totalPurchasePricePurchases.setText("0");
        DashboardCard.add(totalPurchasePricePurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 60, 20));

        profitPurchases.setText("0");
        DashboardCard.add(profitPurchases, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 60, 20));

        salesLbl2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salesLbl2.setForeground(new java.awt.Color(0, 102, 0));
        salesLbl2.setText("Available Iphone ");
        salesLbl2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(0, 102, 0)));
        DashboardCard.add(salesLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 350, 30));

        jLabel26.setText("Total Products: ");
        DashboardCard.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel27.setText("Total Products Sale Value: ");
        DashboardCard.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel28.setText("Total Products Purchase Value:");
        DashboardCard.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel29.setText("Total Profitable Amount:");
        DashboardCard.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jLabel30.setText("Total Quantity:");
        DashboardCard.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        totalProductsStk.setText("0");
        DashboardCard.add(totalProductsStk, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 20));

        totalProductsSaleValue.setText("0");
        totalProductsSaleValue.setToolTipText("");
        DashboardCard.add(totalProductsSaleValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 60, 20));

        totalProductsPurchaseValue.setText("0");
        DashboardCard.add(totalProductsPurchaseValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, 20));

        totalProfitableAmount.setText("0");
        DashboardCard.add(totalProfitableAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 60, 20));

        totalQuantity.setText("0");
        DashboardCard.add(totalQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 60, 20));

        jLabel12.setText("Total Quantities Purchased: ");
        DashboardCard.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        totalQtysPurch.setText("0");
        DashboardCard.add(totalQtysPurch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 60, 20));

        CenterPnl.add(DashboardCard, "DashboardCard");

        ProductsCard.setOpaque(false);
        ProductsCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLbl1.setForeground(new java.awt.Color(0, 102, 0));
        pnLbl1.setText("PURCHASE PRICE");
        pnLbl1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 102, 0)));
        ProductsCard.add(pnLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 30));

        pnLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pnLbl.setForeground(new java.awt.Color(0, 102, 0));
        pnLbl.setText("PRODUCT NAME");
        pnLbl.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 0, new java.awt.Color(0, 102, 0)));
        ProductsCard.add(pnLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/back_15px.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        ProductsCard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pnLbl2.setForeground(new java.awt.Color(0, 102, 0));
        pnLbl2.setText("QUANTITY");
        pnLbl2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 102, 0)));
        ProductsCard.add(pnLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 30));

        pnLbl3.setForeground(new java.awt.Color(0, 102, 0));
        pnLbl3.setText("SELLING PRICE");
        pnLbl3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, new java.awt.Color(0, 102, 0)));
        ProductsCard.add(pnLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));
        ProductsCard.add(spLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 140, 30));
        ProductsCard.add(ppLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 140, 30));
        ProductsCard.add(qtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 30));

        purchaseLbl.setBackground(new java.awt.Color(255, 51, 0));
        purchaseLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        purchaseLbl.setForeground(new java.awt.Color(255, 255, 255));
        purchaseLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseLbl.setText("PURCHASE");
        purchaseLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purchaseLbl.setOpaque(true);
        purchaseLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseLblMouseClicked(evt);
            }
        });
        ProductsCard.add(purchaseLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 120, 30));

        sellLbl.setBackground(new java.awt.Color(0, 153, 153));
        sellLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellLbl.setForeground(new java.awt.Color(255, 255, 255));
        sellLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellLbl.setText("SELL");
        sellLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellLbl.setOpaque(true);
        sellLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellLblMouseClicked(evt);
            }
        });
        ProductsCard.add(sellLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 120, 30));

        addLbl.setBackground(new java.awt.Color(0, 102, 255));
        addLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addLbl.setForeground(new java.awt.Color(255, 255, 255));
        addLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addLbl.setText("ADD");
        addLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addLbl.setOpaque(true);
        addLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLblMouseClicked(evt);
            }
        });
        ProductsCard.add(addLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 120, 30));

        saveLbl.setBackground(new java.awt.Color(0, 102, 51));
        saveLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saveLbl.setForeground(new java.awt.Color(255, 255, 255));
        saveLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveLbl.setText("SAVE");
        saveLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveLbl.setOpaque(true);
        saveLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLblMouseClicked(evt);
            }
        });
        ProductsCard.add(saveLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 370, 30));

        updateLbl.setBackground(new java.awt.Color(102, 204, 0));
        updateLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateLbl.setForeground(new java.awt.Color(255, 255, 255));
        updateLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateLbl.setText("EDIT");
        updateLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateLbl.setOpaque(true);
        updateLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLblMouseClicked(evt);
            }
        });
        ProductsCard.add(updateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 30));

        deleteLbl.setBackground(new java.awt.Color(153, 0, 0));
        deleteLbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteLbl.setForeground(new java.awt.Color(255, 255, 255));
        deleteLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteLbl.setText("DELETE");
        deleteLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteLbl.setOpaque(true);
        deleteLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLblMouseClicked(evt);
            }
        });
        ProductsCard.add(deleteLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 120, 30));

        jLabel2.setForeground(new java.awt.Color(200, 200, 200));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_plus_math_10px.png"))); // NOI18N
        jLabel2.setText("new product");
        ProductsCard.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        closeLbl.setForeground(new java.awt.Color(200, 200, 200));
        closeLbl.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        closeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_close_window_15px.png"))); // NOI18N
        closeLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLblMouseClicked(evt);
            }
        });
        ProductsCard.add(closeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, 20));

        nameTF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        ProductsCard.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 370, 30));

        spTF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        ProductsCard.add(spTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 370, 30));

        ppTF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        ProductsCard.add(ppTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 370, 30));

        qtTF.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        ProductsCard.add(qtTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 370, 30));

        jLabel5.setForeground(new java.awt.Color(200, 200, 200));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Edit_10px.png"))); // NOI18N
        jLabel5.setText("edit");
        ProductsCard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel4.setForeground(new java.awt.Color(200, 200, 200));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_wrench_10px.png"))); // NOI18N
        jLabel4.setText("operations");
        ProductsCard.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        actionLbl.setForeground(new java.awt.Color(200, 200, 200));
        actionLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Lightning_Bolt_10px.png"))); // NOI18N
        actionLbl.setText("actions");
        ProductsCard.add(actionLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        CenterPnl.add(ProductsCard, "ProductsCard");

        getContentPane().add(CenterPnl, java.awt.BorderLayout.CENTER);

        EastPnl.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EastPnlLayout = new javax.swing.GroupLayout(EastPnl);
        EastPnl.setLayout(EastPnlLayout);
        EastPnlLayout.setHorizontalGroup(
            EastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EastPnlLayout.setVerticalGroup(
            EastPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        getContentPane().add(EastPnl, java.awt.BorderLayout.EAST);

        SouthPnl.setBackground(java.awt.SystemColor.controlDkShadow);
        SouthPnl.setBorder(javax.swing.BorderFactory.createEmptyBorder(2, 2, 2, 2));
        SouthPnl.setPreferredSize(new java.awt.Dimension(1126, 20));
        SouthPnl.setLayout(new java.awt.GridBagLayout());

        footer.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        footer.setForeground(new java.awt.Color(204, 204, 204));
        footer.setText(" Mini Project");
        SouthPnl.add(footer, new java.awt.GridBagConstraints());

        getContentPane().add(SouthPnl, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productsJListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_productsJListValueChanged
    {//GEN-HEADEREND:event_productsJListValueChanged
        try {
            showProductDetails();
        }
        catch (Exception e) {
            showDashboard();
        }
    }//GEN-LAST:event_productsJListValueChanged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel1MouseClicked
    {//GEN-HEADEREND:event_jLabel1MouseClicked
        showDashboard();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void updateLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_updateLblMouseClicked
    {//GEN-HEADEREND:event_updateLblMouseClicked
        setupSaveUpdate(true);
        showProductDetails();
    }//GEN-LAST:event_updateLblMouseClicked

    private void deleteLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_deleteLblMouseClicked
    {//GEN-HEADEREND:event_deleteLblMouseClicked
       int c = JOptionPane.showConfirmDialog(getParent(), "Are you sure you want to delete this product?", "Confirmation", JOptionPane.YES_NO_OPTION);
       if(c == JOptionPane.YES_OPTION){
//           ((iphoneTransactions)productTransactionsServiceImpl.getProducts().get(productsJList.getSelectedIndex())).deleteProduct();
           List<Iphone> products = productTransactionsServiceImpl.getProducts();
           Iphone p = products.get(productsJList.getSelectedIndex());
           productTransactionsServiceImpl = new iphoneTransactions(p.getId(), p.getName(), p.getQuantity(), p.getSellPrice(), p.getPurchasePrice());
           productTransactionsServiceImpl.setProducts(products);
           productTransactionsServiceImpl.deleteProduct(p.getId());
           populateListWithProducts();
           JOptionPane.showMessageDialog(getParent(), "Product has been deleted!", "Success", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_deleteLblMouseClicked

    private void sellLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_sellLblMouseClicked
    {//GEN-HEADEREND:event_sellLblMouseClicked
        
        Iphone product = productTransactionsServiceImpl.getProducts().get(productsJList.getSelectedIndex());
        setupSaveUpdate(true);
        setProductDetails(product.getName(), product.getQuantity()+"", product.getSellPrice()+"", product.getPurchasePrice()+"", 2);
    }//GEN-LAST:event_sellLblMouseClicked

    private void purchaseLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_purchaseLblMouseClicked
    {//GEN-HEADEREND:event_purchaseLblMouseClicked
                
        Iphone product = productTransactionsServiceImpl.getProducts().get(productsJList.getSelectedIndex());
        setupSaveUpdate(true);
        setProductDetails(product.getName(), product.getQuantity()+"", product.getSellPrice()+"", product.getPurchasePrice()+"", 3);
    }//GEN-LAST:event_purchaseLblMouseClicked

    private void saveLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_saveLblMouseClicked
    {//GEN-HEADEREND:event_saveLblMouseClicked
        switch(saveLbl.getText()){
            case "SAVE":
                save();
                break;
            case "UPDATE":
                update();
                break;
            case "SELL":
                sell();
                break;
            case "PURCHASE":
                purchase();
                break;
        }
    }//GEN-LAST:event_saveLblMouseClicked

    private void save(){
                List<Iphone> products = productTransactionsServiceImpl.getProducts();
                
                int qt = 1;
                double sp = 0,pp = 0;
                String name =  nameTF.getText();
                try {
                    qt = Integer.parseInt(qtTF.getText());
                    sp = Double.parseDouble(spTF.getText());
                    pp = Double.parseDouble(ppTF.getText());
                    
                    if(pp< 1 || qt < 1 || sp < 1){
                        throw new Exception();
                    }
                    
                    if(name.isEmpty() || name.isBlank()){
                        throw new Exception();
                    }
                    
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(getParent(), "Please add valid values", "FAILED", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                productTransactionsServiceImpl = new iphoneTransactions( randomId(),name,qt,sp, pp);
                productTransactionsServiceImpl.setProducts(products);
                productTransactionsServiceImpl.addProduct(productTransactionsServiceImpl);
                populateListWithProducts();
                JOptionPane.showMessageDialog(getParent(), "Product has been added!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private int randomId(){ 
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }
    
    private void update(){
        List<Iphone> products = productTransactionsServiceImpl.getProducts();

        int qt = 1;
        double sp = 0,pp = 0;
        String name =  nameTF.getText();
        try {
            qt = Integer.parseInt(qtTF.getText());
            sp = Double.parseDouble(spTF.getText());
            pp = Double.parseDouble(ppTF.getText());

            if(pp< 1 || qt < 1 || sp < 1){
                throw new Exception();
            }

            if(name.isEmpty() || name.isBlank()){
                throw new Exception();
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(getParent(), "Please add valid values", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Iphone p = products.get(productsJList.getSelectedIndex());
        productTransactionsServiceImpl = new iphoneTransactions( p.getId(),name,qt,sp, pp);
        productTransactionsServiceImpl.setProducts(products);
        productTransactionsServiceImpl.updateProduct(productTransactionsServiceImpl);
        populateListWithProducts();
        JOptionPane.showMessageDialog(getParent(), "Product has been updated!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
     private void sell(){
         
        List<Iphone> products = productTransactionsServiceImpl.getProducts();
        
        int qt = 1;
        double sp = 0,pp = 0;
        String name =  nameTF.getText();
        try {
            qt = Integer.parseInt(qtTF.getText());
            sp = Double.parseDouble(spTF.getText());
            pp = Double.parseDouble(ppTF.getText());

            if(pp< 1 || qt < 1 || sp < 1){
                throw new Exception();
            }

            if(name.isEmpty() || name.isBlank()){
                throw new Exception();
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(getParent(), "Please add valid values", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Iphone p = products.get(productsJList.getSelectedIndex());
        productTransactionsServiceImpl = new iphoneTransactions(p.getId(), p.getName(), p.getQuantity(), p.getSellPrice(), p.getPurchasePrice());
        productTransactionsServiceImpl.setProducts(products);
        productTransactionsServiceImpl.sellProduct(productTransactionsServiceImpl,qt,sp);
        populateListWithProducts();
        JOptionPane.showMessageDialog(getParent(), "Product sold!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
     private void purchase(){
         
        List<Iphone> products = productTransactionsServiceImpl.getProducts();
        
        int qt = 1;
        double sp = 0,pp = 0;
        String name =  nameTF.getText();
        try {
            qt = Integer.parseInt(qtTF.getText());
            sp = Double.parseDouble(spTF.getText());
            pp = Double.parseDouble(ppTF.getText());

            if(pp< 1 || qt < 1 || sp < 1){
                throw new Exception();
            }

            if(name.isEmpty() || name.isBlank()){
                throw new Exception();
            }

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(getParent(), "Please add valid values", "FAILED", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Iphone p = products.get(productsJList.getSelectedIndex());
        productTransactionsServiceImpl = new iphoneTransactions(p.getId(), p.getName(), p.getQuantity(), p.getSellPrice(), p.getPurchasePrice());
        productTransactionsServiceImpl.setProducts(products);
        productTransactionsServiceImpl.purchaseProduct(productTransactionsServiceImpl,qt,pp);
        populateListWithProducts();
        JOptionPane.showMessageDialog(getParent(), "Product purchased!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }    
    
    private void addLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_addLblMouseClicked
    {//GEN-HEADEREND:event_addLblMouseClicked
        setupSaveUpdate(true);
        setProductDetails("", "1", "0", "0", 0);
    }//GEN-LAST:event_addLblMouseClicked

    private void closeLblMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_closeLblMouseClicked
    {//GEN-HEADEREND:event_closeLblMouseClicked
        setupSaveUpdate(false);
    }//GEN-LAST:event_closeLblMouseClicked
 
    void showDashboard() {
        resetProductDetails();
        headerLbl.setText("D A S H B O A R D");
        ((CardLayout)CenterPnl.getLayout()).show(CenterPnl, "DashboardCard");
        
        Thread t = new Thread(new Runnable()
        {
            @Override
            public void run() {
                showDashboardDetails();
            }
        });
        t.start();
    }
    
    void showDashboardDetails() {
        final iphoneTransactions r = new iphoneTransactions("reports");
        
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                salesReports(r);
            }
        });
        t1.start();
        
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                purchaseReports(r);
            }
        });
        t2.start();
        Thread t3 = new Thread(new Runnable()
        {
            @Override
            public void run() {
                productsReports(r);
            }
        });
        t3.start();
        
    }
    
    void salesReports(iphoneTransactions r){
        //sales
        totalTransSales.setText(r.getSales().size()+"");
        
        Set<Integer> prs = new HashSet<>();
        int tQs = 0;
        double tSP = 0, tPP = 0;
        for (Iphone p :r.getSales()) {
            prs.add(p.getId());
            tQs += p.getQuantity();
            tSP += p.getQuantity() * p.getSellPrice();
            tPP += p.getQuantity() * p.getPurchasePrice();
        }
        
        totalProductsSold.setText(prs.size()+"");
        totalQtysSold.setText(tQs+"");
        totalSalePrice.setText(tSP+"");
        totalPurchasePrice.setText(tPP+"");
        profitSales.setText((tSP - tPP)+"");
    }
    
    void purchaseReports(iphoneTransactions r){
        //purchases
        totalTransPurcahses.setText(r.getPurcahses().size()+"");
        
        Set<Integer> prs = new HashSet<>();
        int tQp = 0;
        double tSPP = 0, tPPP = 0;
        for (Iphone p :r.getPurcahses()) {
            prs.add(p.getId());
            tQp += p.getQuantity();
            tSPP += p.getQuantity() * p.getSellPrice();
            tPPP += p.getQuantity() * p.getPurchasePrice();
        }
        
        totalProductsPurchased.setText(prs.size()+"");
        totalQtysPurch.setText(tQp+"");
        totalSalePricePurchases.setText(tSPP+"");
        totalPurchasePricePurchases.setText(tPPP+"");
        profitPurchases.setText((tSPP - tPPP)+"");
    }
    void productsReports(iphoneTransactions r){
        //purchases
        totalProductsStk.setText(r.getProducts().size()+"");
        
        int tQp = 0;
        double tSPP = 0, tPPP = 0;
        
        for (Iphone p : r.getProducts()) {
            tQp += p.getQuantity();
            tSPP += p.getQuantity() * p.getSellPrice();
            tPPP += p.getQuantity() * p.getPurchasePrice();
        }
        
        totalProductsSaleValue.setText(tSPP+"");
        totalProductsPurchaseValue.setText(tPPP+"");
        totalQuantity.setText(tQp+"");
        totalProfitableAmount.setText((tSPP - tPPP)+"");
    }
    
    void showProductDetails() {
         
        headerLbl.setText("P R O D U C T");
        ((CardLayout)CenterPnl.getLayout()).show(CenterPnl, "ProductsCard");
        Iphone product = productTransactionsServiceImpl.getProducts().get(productsJList.getSelectedIndex());
        
        setProductDetails(product.getName(), product.getQuantity()+"", product.getSellPrice()+"", product.getPurchasePrice()+"", 1);
    }
    
    void resetProductDetails() {
        productsJList.clearSelection();
        setProductDetails("", "", "", "", 0);
    }
    
    void setProductDetails(String name, String qt, String sPrice, String pPrice, int op) {
        
        nameTF.setEnabled(true);
        qtTF.setEnabled(true);
        spTF.setEnabled(true);
        ppTF.setEnabled(true);
        
        if(op != 0){
            pnLbl.setText(name);
            qtLbl.setText(qt);
            spLbl.setText(sPrice);
            ppLbl.setText(pPrice);
        }
        
        nameTF.setText(name);
        qtTF.setText(qt);
        spTF.setText(sPrice);
        ppTF.setText(pPrice);
        
        switch(op){
            case 0: 
             saveLbl.setText("SAVE");
            break;
            case 1: 
             saveLbl.setText("UPDATE");
            break;
            case 2: 
             nameTF.setEnabled(false);
             ppTF.setEnabled(false);
             qtTF.setText(1+"");
             saveLbl.setText("SELL");
            break;
            case 3: 
                nameTF.setEnabled(false);
                spTF.setEnabled(false);
                qtTF.setText(1+"");
                saveLbl.setText("PURCHASE");
            break;
            
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName()))  {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIFRAMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIFRAMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIFRAMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIFRAMEWORK.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIFRAMEWORK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CenterPnl;
    private javax.swing.JPanel DashboardCard;
    private javax.swing.JPanel EastPnl;
    private javax.swing.JPanel NorthPnl;
    private javax.swing.JPanel ProductsCard;
    private javax.swing.JPanel SouthPnl;
    private javax.swing.JPanel WestPnl;
    private javax.swing.JLabel actionLbl;
    private javax.swing.JLabel addLbl;
    private javax.swing.JLabel closeLbl;
    private javax.swing.JLabel deleteLbl;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel headerLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel pnLbl;
    private javax.swing.JLabel pnLbl1;
    private javax.swing.JLabel pnLbl2;
    private javax.swing.JLabel pnLbl3;
    private javax.swing.JLabel ppLbl;
    private javax.swing.JTextField ppTF;
    private javax.swing.JList<String> productsJList;
    private javax.swing.JScrollPane productsSclPnl;
    private javax.swing.JLabel profitPurchases;
    private javax.swing.JLabel profitSales;
    private javax.swing.JLabel purchaseLbl;
    private javax.swing.JLabel qtLbl;
    private javax.swing.JTextField qtTF;
    private javax.swing.JLabel salesLbl;
    private javax.swing.JLabel salesLbl1;
    private javax.swing.JLabel salesLbl2;
    private javax.swing.JLabel saveLbl;
    private javax.swing.JLabel sellLbl;
    private javax.swing.JLabel spLbl;
    private javax.swing.JTextField spTF;
    private javax.swing.JLabel totalProductsPurchaseValue;
    private javax.swing.JLabel totalProductsPurchased;
    private javax.swing.JLabel totalProductsSaleValue;
    private javax.swing.JLabel totalProductsSold;
    private javax.swing.JLabel totalProductsStk;
    private javax.swing.JLabel totalProfitableAmount;
    private javax.swing.JLabel totalPurchasePrice;
    private javax.swing.JLabel totalPurchasePricePurchases;
    private javax.swing.JLabel totalQtysPurch;
    private javax.swing.JLabel totalQtysSold;
    private javax.swing.JLabel totalQuantity;
    private javax.swing.JLabel totalSalePrice;
    private javax.swing.JLabel totalSalePricePurchases;
    private javax.swing.JLabel totalTransPurcahses;
    private javax.swing.JLabel totalTransSales;
    private javax.swing.JLabel updateLbl;
    // End of variables declaration//GEN-END:variables
}
