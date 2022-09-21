
package vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;


public class frmMaquina extends javax.swing.JFrame {

    InternalFrameSolicitudes internalSolicitudes;
    InternalFrameProgramacionMant progMant;
    InternalFrameAlquiler alquiler;
    InternalFrameCotizaciones cotizaciones;
    InternalFrameVentas ventas;
    InternalFrameServicios servicios;
    InternalFrameFacturas facturas;
    InternalFramePersonalMant personalMant;
    InternalFramePersonalPro personalPro;
    InternalFrameGestionProveedores proveedores;
    InternalFrameGestionMaquinas maquinas;

    
    
    
    public frmMaquina() {
        
//       this.setContentPane(new ImagenFondo());  ---> Intento fallido de insertar imagen de fondo 

        internalSolicitudes = new InternalFrameSolicitudes();
        add(internalSolicitudes);
        progMant = new InternalFrameProgramacionMant();
        add(progMant);
        alquiler = new InternalFrameAlquiler();
        add(alquiler);
        cotizaciones = new InternalFrameCotizaciones();
        add(cotizaciones);
        ventas = new InternalFrameVentas();
        add(ventas);
        servicios = new InternalFrameServicios();
        add(servicios);
        facturas = new InternalFrameFacturas();
        add(facturas);
        personalMant = new InternalFramePersonalMant();
        add(personalMant);
        personalPro = new InternalFramePersonalPro();
        add(personalPro);
        proveedores = new InternalFrameGestionProveedores();
        add(proveedores);
        maquinas = new InternalFrameGestionMaquinas();
        add(maquinas);
        initComponents();
        setLocationRelativeTo(null);

        
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelProveedores = new javax.swing.JPanel();
        btnMostrarAlquiler = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        btnMostrarServicios = new javax.swing.JButton();
        btnMostrarVentas = new javax.swing.JButton();
        btnMostrarCotizaciones = new javax.swing.JButton();
        btnMostrarFacturas = new javax.swing.JButton();
        PanelProduccion = new javax.swing.JPanel();
        btnMostrarPersonalProduccion = new javax.swing.JButton();
        btnBuscarSolicitudes = new javax.swing.JButton();
        PanelMantenimiento = new javax.swing.JPanel();
        btnBuscarMaquinas = new javax.swing.JButton();
        btnMostrarMantenimientos = new javax.swing.JButton();
        btnMostrarPersonalMant = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaquinas = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMantenimiento = new javax.swing.JMenu();
        MenuItemProgMant = new javax.swing.JMenuItem();
        MenuItemPersonalMant = new javax.swing.JMenuItem();
        MenuItemGestionMaquinas = new javax.swing.JMenuItem();
        MenuProduccion = new javax.swing.JMenu();
        MenuItemSolicitudes = new javax.swing.JMenuItem();
        MenuItemPersonalPro = new javax.swing.JMenuItem();
        MenuProveedores = new javax.swing.JMenu();
        MenuItemAlquiler = new javax.swing.JMenuItem();
        MenuItemCotizaciones = new javax.swing.JMenuItem();
        MenuItemVentas = new javax.swing.JMenuItem();
        MenuItemServicios = new javax.swing.JMenuItem();
        MenuItemFacturas = new javax.swing.JMenuItem();
        MenuItemGestionProveedores = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setBackground(new java.awt.Color(0, 255, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 51, 204), new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ÍNDICE DE BÚSQUEDA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        PanelProveedores.setBackground(new java.awt.Color(153, 0, 51));
        PanelProveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 51), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 255, 0)));

        btnMostrarAlquiler.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarAlquiler.setText("Alquiler");
        btnMostrarAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlquilerActionPerformed(evt);
            }
        });

        btnBuscarProveedor.setBackground(new java.awt.Color(255, 102, 0));
        btnBuscarProveedor.setText(" Proveedores");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });

        btnMostrarServicios.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarServicios.setText("Servicios");
        btnMostrarServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarServiciosActionPerformed(evt);
            }
        });

        btnMostrarVentas.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarVentas.setText("Ventas");
        btnMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentasActionPerformed(evt);
            }
        });

        btnMostrarCotizaciones.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarCotizaciones.setText("Cotizaciones");
        btnMostrarCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCotizacionesActionPerformed(evt);
            }
        });

        btnMostrarFacturas.setBackground(new java.awt.Color(255, 102, 0));
        btnMostrarFacturas.setText("Facturas");
        btnMostrarFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProveedoresLayout = new javax.swing.GroupLayout(PanelProveedores);
        PanelProveedores.setLayout(PanelProveedoresLayout);
        PanelProveedoresLayout.setHorizontalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrarServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMostrarFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMostrarCotizaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addComponent(btnBuscarProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelProveedoresLayout.setVerticalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProveedor)
                    .addComponent(btnMostrarVentas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarAlquiler)
                    .addComponent(btnMostrarCotizaciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarServicios)
                    .addComponent(btnMostrarFacturas))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        PanelProduccion.setBackground(new java.awt.Color(0, 102, 102));
        PanelProduccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(153, 255, 153), new java.awt.Color(255, 255, 102)));

        btnMostrarPersonalProduccion.setBackground(new java.awt.Color(102, 153, 0));
        btnMostrarPersonalProduccion.setText("Personal Producción");
        btnMostrarPersonalProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonalProduccionActionPerformed(evt);
            }
        });

        btnBuscarSolicitudes.setBackground(new java.awt.Color(102, 153, 0));
        btnBuscarSolicitudes.setText(" Solicitudes");
        btnBuscarSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarSolicitudesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelProduccionLayout = new javax.swing.GroupLayout(PanelProduccion);
        PanelProduccion.setLayout(PanelProduccionLayout);
        PanelProduccionLayout.setHorizontalGroup(
            PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProduccionLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarSolicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarPersonalProduccion))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        PanelProduccionLayout.setVerticalGroup(
            PanelProduccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProduccionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnMostrarPersonalProduccion)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarSolicitudes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMantenimiento.setBackground(new java.awt.Color(0, 102, 255));
        PanelMantenimiento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(153, 255, 255)));

        btnBuscarMaquinas.setBackground(new java.awt.Color(0, 153, 204));
        btnBuscarMaquinas.setText(" Máquinas");
        btnBuscarMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMaquinasActionPerformed(evt);
            }
        });

        btnMostrarMantenimientos.setBackground(new java.awt.Color(0, 153, 204));
        btnMostrarMantenimientos.setText("Mantenimientos");
        btnMostrarMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMantenimientosActionPerformed(evt);
            }
        });

        btnMostrarPersonalMant.setBackground(new java.awt.Color(0, 153, 204));
        btnMostrarPersonalMant.setText("Personal  Mantenimiento");
        btnMostrarPersonalMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPersonalMantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMantenimientoLayout = new javax.swing.GroupLayout(PanelMantenimiento);
        PanelMantenimiento.setLayout(PanelMantenimientoLayout);
        PanelMantenimientoLayout.setHorizontalGroup(
            PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMantenimientoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrarPersonalMant)
                    .addComponent(btnMostrarMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMaquinas, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        PanelMantenimientoLayout.setVerticalGroup(
            PanelMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMantenimientoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBuscarMaquinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarMantenimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarPersonalMant)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaMaquinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tablaMaquinas);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ffff.jpg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153), null));
        jLabel3.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);

        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(51, 51, 51), null, new java.awt.Color(204, 204, 204)));

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelProduccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(PanelMantenimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(PanelProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PanelMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PanelProduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        MenuMantenimiento.setText("Mantenimiento");
        MenuMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMantenimientoActionPerformed(evt);
            }
        });

        MenuItemProgMant.setText("Programación de Mantenimientos");
        MenuItemProgMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemProgMantActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemProgMant);

        MenuItemPersonalMant.setText("Gestión de Personal");
        MenuItemPersonalMant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPersonalMantActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemPersonalMant);

        MenuItemGestionMaquinas.setText("Gestión de Máquinas");
        MenuItemGestionMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionMaquinasActionPerformed(evt);
            }
        });
        MenuMantenimiento.add(MenuItemGestionMaquinas);

        jMenuBar1.add(MenuMantenimiento);

        MenuProduccion.setText("Produccion");
        MenuProduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProduccionActionPerformed(evt);
            }
        });

        MenuItemSolicitudes.setText("Solicitudes");
        MenuItemSolicitudes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSolicitudesActionPerformed(evt);
            }
        });
        MenuProduccion.add(MenuItemSolicitudes);

        MenuItemPersonalPro.setText("Gestión de Personal");
        MenuItemPersonalPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPersonalProActionPerformed(evt);
            }
        });
        MenuProduccion.add(MenuItemPersonalPro);

        jMenuBar1.add(MenuProduccion);

        MenuProveedores.setText("Proveedores");
        MenuProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedoresActionPerformed(evt);
            }
        });

        MenuItemAlquiler.setText("Alquiler");
        MenuItemAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAlquilerActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemAlquiler);

        MenuItemCotizaciones.setText("Cotizaciones");
        MenuItemCotizaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCotizacionesActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemCotizaciones);

        MenuItemVentas.setText("Ventas");
        MenuItemVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemVentasActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemVentas);

        MenuItemServicios.setText("Servicios");
        MenuItemServicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServiciosActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemServicios);

        MenuItemFacturas.setText("Facturas");
        MenuItemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFacturasActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemFacturas);

        MenuItemGestionProveedores.setText("Gestión de Proveedores");
        MenuItemGestionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemGestionProveedoresActionPerformed(evt);
            }
        });
        MenuProveedores.add(MenuItemGestionProveedores);

        jMenuBar1.add(MenuProveedores);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
     public void mostrarMaquinas(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Color");
        tmaquina.addColumn("");
        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[5];
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
//                datos[5]= rs.getString(5); 
//                datos[6]= rs.getString(6);
             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " " + "Error");
        }
        
        
        
    }
    
    
    public void mostrarSolicitudes(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Area");
        tmaquina.addColumn("Falla");
        tmaquina.addColumn("");

        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[6];
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  

//                datos[5]= rs.getString(5); 
//                datos[6]= rs.getString(6);
             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    public void mostrarProveedor(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Proveedor");
        tmaquina.addColumn("Nombre");
        tmaquina.addColumn("Ciudad");
        tmaquina.addColumn("Telefono");
        tmaquina.addColumn("Correo");
        tmaquina.addColumn("Direccion");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[9];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    // --> Estos son los indices del arreglo, su numero debe ser menor al inicializado en el arreglo datos, = datos=                                                 9, ciclo while = 7, cuando el numero de indices del ciclo while supere a los impuestos al inicio del arreglo,                                                    se presentara un error
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    
    public void mostrarMantenimientos(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Maquina");
        tmaquina.addColumn("Maquina");
        tmaquina.addColumn("Fecha Inicio");
        tmaquina.addColumn("Fecha fin");
        tmaquina.addColumn("Ejecuta");
        tmaquina.addColumn("Mantenimiento");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[9];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    public void mostrarPersonalMant(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Empleado");
        tmaquina.addColumn("Nombres");
        tmaquina.addColumn("Apellidos");
        tmaquina.addColumn("Cargo");
        tmaquina.addColumn("Género");
//        tmaquina.addColumn("Mantenimiento");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//              datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    
    public void mostrarPersonalProd(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Empleado");
        tmaquina.addColumn("Nombres");
        tmaquina.addColumn("Apellidos");
        tmaquina.addColumn("Cargo");
        tmaquina.addColumn("Género");
//        tmaquina.addColumn("Mantenimiento");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//              datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    public void mostrarCotizaciones(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo Cotización");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha Cotización");
        tmaquina.addColumn("Valor");
//        tmaquina.addColumn("Mantenimiento");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//              datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    public void mostrarAlquiler(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Codigo");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Fecha Alquiler");
        tmaquina.addColumn("Fecha Devolución");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[9];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    }
    
    
    public void mostrarVentas(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Venta");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
//        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    } 
    
    
    public void mostrarServicios(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Servicio");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
//        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    } 
    
    
    public void mostrarFacturas(String tabla){
        String sql =("SELECT * FROM " +tabla);
        Statement st;
        Conexion con = new Conexion();
        Connection Conexion = con.getConexion();
        System.out.println(sql);
        DefaultTableModel tmaquina = new DefaultTableModel ();
        
        
        
        
        tmaquina.addColumn("");
        tmaquina.addColumn("ID");
        tmaquina.addColumn("Código Factura");
        tmaquina.addColumn("Concepto");
        tmaquina.addColumn("Proveedor");
        tmaquina.addColumn("Fecha");
        tmaquina.addColumn("Valor");
//        tmaquina.addColumn("Valor");
        tmaquina.addColumn("");
        


        


        
        tablaMaquinas.setModel(tmaquina);
        
        String[]datos= new String[8];    // Inicio del arreglo Datos
        
        
        try {
            st = Conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[1]= rs.getString(1);    
                datos[2]= rs.getString(2);
                datos[3]= rs.getString(3);
                datos[4]= rs.getString(4);  
                datos[5]= rs.getString(5);  
                datos[6]= rs.getString(6);  
//                datos[7]= rs.getString(7);     
//              datos[8]= rs.getString(8);                 
//              datos[5]= rs.getString(5); 
//              datos[6]= rs.getString(6);
//             
                
                
                tmaquina.addRow(datos);
                

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Error");
        }
        
        
        
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void MenuItemProgMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemProgMantActionPerformed
     progMant.setVisible(true);
        

    }//GEN-LAST:event_MenuItemProgMantActionPerformed

    
    
    private void MenuMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuMantenimientoActionPerformed

    private void MenuProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProduccionActionPerformed

    private void MenuProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuProveedoresActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void MenuItemSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSolicitudesActionPerformed
   internalSolicitudes.setVisible(true);   
   


    }//GEN-LAST:event_MenuItemSolicitudesActionPerformed

    private void MenuItemCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCotizacionesActionPerformed
       
    cotizaciones.setVisible(true);

    }//GEN-LAST:event_MenuItemCotizacionesActionPerformed

    private void MenuItemVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemVentasActionPerformed
      
    ventas.setVisible(true);

    }//GEN-LAST:event_MenuItemVentasActionPerformed

    private void MenuItemAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAlquilerActionPerformed
      alquiler.setVisible(true);
        

    }//GEN-LAST:event_MenuItemAlquilerActionPerformed

    private void MenuItemServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServiciosActionPerformed
      servicios.setVisible(true);
        
    }//GEN-LAST:event_MenuItemServiciosActionPerformed

    private void MenuItemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFacturasActionPerformed
    facturas.setVisible(true);
        
    }//GEN-LAST:event_MenuItemFacturasActionPerformed

    private void MenuItemPersonalMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPersonalMantActionPerformed
    personalMant.setVisible(true);
        
    }//GEN-LAST:event_MenuItemPersonalMantActionPerformed

    private void MenuItemPersonalProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPersonalProActionPerformed
    personalPro.setVisible(true);
        
    }//GEN-LAST:event_MenuItemPersonalProActionPerformed

    private void MenuItemGestionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionProveedoresActionPerformed
   proveedores.setVisible(true);
    }//GEN-LAST:event_MenuItemGestionProveedoresActionPerformed

    private void MenuItemGestionMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemGestionMaquinasActionPerformed
      
    maquinas.setVisible(true);


    }//GEN-LAST:event_MenuItemGestionMaquinasActionPerformed

    private void btnBuscarMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMaquinasActionPerformed
     
        mostrarMaquinas("maquinas");



    }//GEN-LAST:event_btnBuscarMaquinasActionPerformed

    private void btnBuscarSolicitudesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarSolicitudesActionPerformed
       mostrarSolicitudes("solicitudes");
        
    }//GEN-LAST:event_btnBuscarSolicitudesActionPerformed

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
       
        mostrarProveedor("gestion_proveedores");

    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void btnMostrarMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMantenimientosActionPerformed


     mostrarMantenimientos("pro_mant");


    }//GEN-LAST:event_btnMostrarMantenimientosActionPerformed

    private void btnMostrarPersonalMantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonalMantActionPerformed

  mostrarPersonalMant("personal_mant");

    }//GEN-LAST:event_btnMostrarPersonalMantActionPerformed

    private void btnMostrarPersonalProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPersonalProduccionActionPerformed

    mostrarPersonalProd("personal_pro");

    }//GEN-LAST:event_btnMostrarPersonalProduccionActionPerformed

    private void btnMostrarCotizacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCotizacionesActionPerformed
      mostrarCotizaciones("cotizaciones");


    }//GEN-LAST:event_btnMostrarCotizacionesActionPerformed

    private void btnMostrarAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlquilerActionPerformed
    mostrarAlquiler("alquiler");


    }//GEN-LAST:event_btnMostrarAlquilerActionPerformed

    private void btnMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentasActionPerformed
     mostrarVentas("ventas");
    }//GEN-LAST:event_btnMostrarVentasActionPerformed

    private void btnMostrarServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarServiciosActionPerformed
     mostrarServicios("servicios");

    }//GEN-LAST:event_btnMostrarServiciosActionPerformed

    private void btnMostrarFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarFacturasActionPerformed
    mostrarFacturas("facturas");

    }//GEN-LAST:event_btnMostrarFacturasActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem MenuItemAlquiler;
    public javax.swing.JMenuItem MenuItemCotizaciones;
    public javax.swing.JMenuItem MenuItemFacturas;
    public javax.swing.JMenuItem MenuItemGestionMaquinas;
    public javax.swing.JMenuItem MenuItemGestionProveedores;
    public javax.swing.JMenuItem MenuItemPersonalMant;
    public javax.swing.JMenuItem MenuItemPersonalPro;
    public javax.swing.JMenuItem MenuItemProgMant;
    public javax.swing.JMenuItem MenuItemServicios;
    public javax.swing.JMenuItem MenuItemSolicitudes;
    public javax.swing.JMenuItem MenuItemVentas;
    public javax.swing.JMenu MenuMantenimiento;
    public javax.swing.JMenu MenuProduccion;
    public javax.swing.JMenu MenuProveedores;
    private javax.swing.JPanel PanelMantenimiento;
    private javax.swing.JPanel PanelProduccion;
    private javax.swing.JPanel PanelProveedores;
    private javax.swing.JButton btnBuscarMaquinas;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnBuscarSolicitudes;
    private javax.swing.JButton btnMostrarAlquiler;
    private javax.swing.JButton btnMostrarCotizaciones;
    private javax.swing.JButton btnMostrarFacturas;
    private javax.swing.JButton btnMostrarMantenimientos;
    private javax.swing.JButton btnMostrarPersonalMant;
    private javax.swing.JButton btnMostrarPersonalProduccion;
    private javax.swing.JButton btnMostrarServicios;
    private javax.swing.JButton btnMostrarVentas;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaMaquinas;
    // End of variables declaration//GEN-END:variables


//    public class ImagenFondo extends JPanel{   // ----> Intento fallido de insertar imagen de fondo
//        @Override
//        public void paint(Graphics g){
//            ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/tools.jpg"));
//            g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
//            setOpaque(false);
//            super.paint(g);
//        }
//    }


}
