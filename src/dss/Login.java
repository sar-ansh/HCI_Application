package dss;

import com.mysql.jdbc.PreparedStatement;
import static dss.Admin.adminMenu;
import static dss.Faculty.facultyMenu;
import static dss.HOD.hodMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    int type;
    int xMouse, yMouse;
    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dl_register = new javax.swing.JDialog();
        jp_register_main = new javax.swing.JPanel();
        jp_register_menu = new javax.swing.JPanel();
        lr_register_image = new javax.swing.JLabel();
        lr_username = new javax.swing.JLabel();
        tfr_username = new javax.swing.JTextField();
        lr_password = new javax.swing.JLabel();
        tfr_password = new javax.swing.JPasswordField();
        lr_account_type = new javax.swing.JLabel();
        cbr_account_type = new javax.swing.JComboBox();
        br_register = new javax.swing.JButton();
        jp_register_header = new javax.swing.JPanel();
        lr_title = new javax.swing.JLabel();
        lr_logo = new javax.swing.JLabel();
        br_quit = new javax.swing.JButton();
        br_minimize = new javax.swing.JButton();
        br_back = new javax.swing.JButton();
        change_language = new javax.swing.JDialog();
        jp_change_language_main = new javax.swing.JPanel();
        jp_change_language_menu = new javax.swing.JPanel();
        l_image = new javax.swing.JLabel();
        l_select_language = new javax.swing.JLabel();
        cb_select_language = new javax.swing.JComboBox();
        b_change_language = new javax.swing.JButton();
        jp_change_language_header = new javax.swing.JPanel();
        lcl_title = new javax.swing.JLabel();
        lcl_logo = new javax.swing.JLabel();
        bcl_quit = new javax.swing.JButton();
        bcl_minimize = new javax.swing.JButton();
        bcl_back = new javax.swing.JButton();
        jp_login_main = new javax.swing.JPanel();
        jp_login_menu = new javax.swing.JPanel();
        ll_lock_image = new javax.swing.JLabel();
        ll_username = new javax.swing.JLabel();
        tfl_username = new javax.swing.JTextField();
        ll_password = new javax.swing.JLabel();
        tfl_password = new javax.swing.JPasswordField();
        bl_login = new javax.swing.JButton();
        jp_login_header = new javax.swing.JPanel();
        ll_title = new javax.swing.JLabel();
        ll_logo = new javax.swing.JLabel();
        bl_quit = new javax.swing.JButton();
        bl_minimize = new javax.swing.JButton();
        bl_change_language = new javax.swing.JButton();
        ll_separator1 = new javax.swing.JLabel();
        bl_register = new javax.swing.JButton();

        dl_register.setLocation(new java.awt.Point(400, 250));
        dl_register.setMinimumSize(new java.awt.Dimension(460, 314));
        dl_register.setUndecorated(true);

        jp_register_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_register_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_register_main.setMinimumSize(new java.awt.Dimension(460, 350));
        jp_register_main.setPreferredSize(new java.awt.Dimension(550, 288));

        jp_register_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_register_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_register_menu.setForeground(new java.awt.Color(255, 255, 255));

        lr_register_image.setBackground(new java.awt.Color(148, 196, 255));
        lr_register_image.setIcon(new javax.swing.ImageIcon("D:\\Java\\HCI\\images\\register.png")); // NOI18N

        lr_username.setForeground(new java.awt.Color(0, 104, 232));
        lr_username.setText("Username");

        lr_password.setForeground(new java.awt.Color(0, 104, 232));
        lr_password.setText("Password");

        tfr_password.setToolTipText("Enter a password");

        lr_account_type.setBackground(new java.awt.Color(255, 255, 255));
        lr_account_type.setForeground(new java.awt.Color(0, 104, 232));
        lr_account_type.setText("Account Type");

        cbr_account_type.setBackground(new java.awt.Color(255, 255, 255));
        cbr_account_type.setForeground(new java.awt.Color(0, 104, 232));
        cbr_account_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HOD", "Faculty" }));

        br_register.setBackground(new java.awt.Color(255, 255, 255));
        br_register.setForeground(new java.awt.Color(0, 104, 232));
        br_register.setText("Register");

        javax.swing.GroupLayout jp_register_menuLayout = new javax.swing.GroupLayout(jp_register_menu);
        jp_register_menu.setLayout(jp_register_menuLayout);
        jp_register_menuLayout.setHorizontalGroup(
            jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_register_menuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lr_register_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_register_menuLayout.createSequentialGroup()
                        .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lr_username, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lr_account_type)
                            .addComponent(lr_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfr_password)
                                .addComponent(cbr_account_type, 0, 164, Short.MAX_VALUE))
                            .addComponent(tfr_username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(br_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jp_register_menuLayout.setVerticalGroup(
            jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_register_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_register_menuLayout.createSequentialGroup()
                        .addComponent(lr_register_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jp_register_menuLayout.createSequentialGroup()
                        .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lr_username)
                            .addComponent(tfr_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lr_password)
                            .addComponent(tfr_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_register_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbr_account_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lr_account_type))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(br_register)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jp_register_header.setBackground(new java.awt.Color(0, 104, 232));

        lr_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lr_title.setForeground(new java.awt.Color(255, 255, 255));
        lr_title.setText("Welcome!");

        lr_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        br_quit.setBackground(new java.awt.Color(255, 255, 255));
        br_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        br_quit.setBorder(null);
        br_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        br_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_quitActionPerformed(evt);
            }
        });
        br_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_quitActionPerformed(evt);
            }
        });

        br_minimize.setBackground(new java.awt.Color(255, 255, 255));
        br_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        br_minimize.setBorder(null);
        br_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_register_headerLayout = new javax.swing.GroupLayout(jp_register_header);
        jp_register_header.setLayout(jp_register_headerLayout);
        jp_register_headerLayout.setHorizontalGroup(
            jp_register_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_register_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lr_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lr_logo)
                .addGap(26, 26, 26)
                .addComponent(br_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(br_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_register_headerLayout.setVerticalGroup(
            jp_register_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_register_headerLayout.createSequentialGroup()
                .addComponent(lr_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_register_headerLayout.createSequentialGroup()
                .addGroup(jp_register_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_register_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lr_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(br_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(br_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        br_back.setBackground(new java.awt.Color(255, 255, 255));
        br_back.setForeground(new java.awt.Color(0, 104, 232));
        br_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        br_back.setText("Back");
        br_back.setBorder(null);
        br_back.setBorderPainted(false);
        br_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_register_mainLayout = new javax.swing.GroupLayout(jp_register_main);
        jp_register_main.setLayout(jp_register_mainLayout);
        jp_register_mainLayout.setHorizontalGroup(
            jp_register_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_register_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_register_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_register_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_register_mainLayout.createSequentialGroup()
                        .addComponent(jp_register_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jp_register_mainLayout.createSequentialGroup()
                        .addComponent(br_back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp_register_mainLayout.setVerticalGroup(
            jp_register_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_register_mainLayout.createSequentialGroup()
                .addComponent(jp_register_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(br_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_register_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dl_registerLayout = new javax.swing.GroupLayout(dl_register.getContentPane());
        dl_register.getContentPane().setLayout(dl_registerLayout);
        dl_registerLayout.setHorizontalGroup(
            dl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_register_main, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        dl_registerLayout.setVerticalGroup(
            dl_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_register_main, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        change_language.setLocation(new java.awt.Point(400, 250));
        change_language.setMinimumSize(new java.awt.Dimension(460, 314));
        change_language.setModal(true);
        change_language.setUndecorated(true);

        jp_change_language_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_change_language_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_change_language_main.setMinimumSize(new java.awt.Dimension(460, 350));
        jp_change_language_main.setPreferredSize(new java.awt.Dimension(550, 288));

        jp_change_language_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_change_language_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Language Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_change_language_menu.setForeground(new java.awt.Color(255, 255, 255));

        l_image.setBackground(new java.awt.Color(148, 196, 255));
        l_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/globe.png"))); // NOI18N

        l_select_language.setBackground(new java.awt.Color(255, 255, 255));
        l_select_language.setForeground(new java.awt.Color(0, 104, 232));
        l_select_language.setText("Select Language");

        cb_select_language.setBackground(new java.awt.Color(255, 255, 255));
        cb_select_language.setForeground(new java.awt.Color(0, 104, 232));
        cb_select_language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English", "Spanish" }));

        b_change_language.setBackground(new java.awt.Color(255, 255, 255));
        b_change_language.setForeground(new java.awt.Color(0, 104, 232));
        b_change_language.setText("Change Language");

        javax.swing.GroupLayout jp_change_language_menuLayout = new javax.swing.GroupLayout(jp_change_language_menu);
        jp_change_language_menu.setLayout(jp_change_language_menuLayout);
        jp_change_language_menuLayout.setHorizontalGroup(
            jp_change_language_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_change_language_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jp_change_language_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_change_language_menuLayout.createSequentialGroup()
                        .addComponent(l_select_language)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_select_language, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_change_language, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_change_language_menuLayout.setVerticalGroup(
            jp_change_language_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_change_language_menuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jp_change_language_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_select_language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_select_language))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_change_language)
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(l_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_change_language_header.setBackground(new java.awt.Color(0, 104, 232));

        lcl_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lcl_title.setForeground(new java.awt.Color(255, 255, 255));
        lcl_title.setText("Welcome!");

        lcl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bcl_quit.setBackground(new java.awt.Color(255, 255, 255));
        bcl_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bcl_quit.setBorder(null);
        bcl_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bcl_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcl_quitActionPerformed(evt);
            }
        });
        bcl_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcl_quitActionPerformed(evt);
            }
        });

        bcl_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bcl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bcl_minimize.setBorder(null);
        bcl_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_change_language_headerLayout = new javax.swing.GroupLayout(jp_change_language_header);
        jp_change_language_header.setLayout(jp_change_language_headerLayout);
        jp_change_language_headerLayout.setHorizontalGroup(
            jp_change_language_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_change_language_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lcl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lcl_logo)
                .addGap(26, 26, 26)
                .addComponent(bcl_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcl_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_change_language_headerLayout.setVerticalGroup(
            jp_change_language_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_change_language_headerLayout.createSequentialGroup()
                .addComponent(lcl_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_change_language_headerLayout.createSequentialGroup()
                .addGroup(jp_change_language_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_change_language_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lcl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bcl_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcl_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bcl_back.setBackground(new java.awt.Color(255, 255, 255));
        bcl_back.setForeground(new java.awt.Color(0, 104, 232));
        bcl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bcl_back.setText("Back");
        bcl_back.setBorder(null);
        bcl_back.setBorderPainted(false);
        bcl_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcl_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_change_language_mainLayout = new javax.swing.GroupLayout(jp_change_language_main);
        jp_change_language_main.setLayout(jp_change_language_mainLayout);
        jp_change_language_mainLayout.setHorizontalGroup(
            jp_change_language_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_change_language_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_change_language_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_change_language_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_change_language_mainLayout.createSequentialGroup()
                        .addComponent(jp_change_language_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(jp_change_language_mainLayout.createSequentialGroup()
                        .addComponent(bcl_back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jp_change_language_mainLayout.setVerticalGroup(
            jp_change_language_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_change_language_mainLayout.createSequentialGroup()
                .addComponent(jp_change_language_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcl_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_change_language_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout change_languageLayout = new javax.swing.GroupLayout(change_language.getContentPane());
        change_language.getContentPane().setLayout(change_languageLayout);
        change_languageLayout.setHorizontalGroup(
            change_languageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_change_language_main, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        change_languageLayout.setVerticalGroup(
            change_languageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_change_language_main, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 250));
        setUndecorated(true);

        jp_login_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_login_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_login_main.setMinimumSize(new java.awt.Dimension(460, 314));

        jp_login_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_login_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_login_menu.setForeground(new java.awt.Color(255, 255, 255));

        ll_lock_image.setBackground(new java.awt.Color(148, 196, 255));
        ll_lock_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N

        ll_username.setForeground(new java.awt.Color(0, 104, 232));
        ll_username.setText("Username");

        ll_password.setForeground(new java.awt.Color(0, 104, 232));
        ll_password.setText("Password");

        tfl_password.setToolTipText("Enter a password");

        bl_login.setBackground(new java.awt.Color(255, 255, 255));
        bl_login.setForeground(new java.awt.Color(0, 104, 232));
        bl_login.setText("Login");
        bl_login.setToolTipText("Click to Login");
        bl_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bl_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_login_menuLayout = new javax.swing.GroupLayout(jp_login_menu);
        jp_login_menu.setLayout(jp_login_menuLayout);
        jp_login_menuLayout.setHorizontalGroup(
            jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_login_menuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ll_lock_image, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_login_menuLayout.createSequentialGroup()
                        .addComponent(ll_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_login_menuLayout.createSequentialGroup()
                        .addComponent(ll_username)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bl_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        jp_login_menuLayout.setVerticalGroup(
            jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_login_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ll_lock_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_login_menuLayout.createSequentialGroup()
                        .addGroup(jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ll_username)
                            .addComponent(tfl_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_login_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ll_password)
                            .addComponent(tfl_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bl_login)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        jp_login_header.setBackground(new java.awt.Color(0, 104, 232));

        ll_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        ll_title.setForeground(new java.awt.Color(255, 255, 255));
        ll_title.setText("Application");

        ll_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bl_quit.setBackground(new java.awt.Color(255, 255, 255));
        bl_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bl_quit.setBorder(null);
        bl_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bl_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl_quitActionPerformed(evt);
            }
        });

        bl_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bl_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bl_minimize.setBorder(null);
        bl_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_login_headerLayout = new javax.swing.GroupLayout(jp_login_header);
        jp_login_header.setLayout(jp_login_headerLayout);
        jp_login_headerLayout.setHorizontalGroup(
            jp_login_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_login_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ll_title, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(ll_logo)
                .addGap(26, 26, 26)
                .addComponent(bl_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bl_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_login_headerLayout.setVerticalGroup(
            jp_login_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_login_headerLayout.createSequentialGroup()
                .addComponent(ll_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_login_headerLayout.createSequentialGroup()
                .addGroup(jp_login_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_login_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ll_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bl_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bl_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bl_change_language.setBackground(new java.awt.Color(255, 255, 255));
        bl_change_language.setForeground(new java.awt.Color(0, 104, 232));
        bl_change_language.setIcon(new javax.swing.ImageIcon(getClass().getResource("/language.png"))); // NOI18N
        bl_change_language.setText("Change Language");
        bl_change_language.setBorder(null);
        bl_change_language.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bl_change_language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl_change_languageActionPerformed(evt);
            }
        });

        ll_separator1.setBackground(new java.awt.Color(255, 255, 255));
        ll_separator1.setForeground(new java.awt.Color(0, 104, 232));
        ll_separator1.setText("|");

        bl_register.setBackground(new java.awt.Color(255, 255, 255));
        bl_register.setForeground(new java.awt.Color(0, 104, 232));
        bl_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_profile.png"))); // NOI18N
        bl_register.setText("Register");
        bl_register.setBorder(null);
        bl_register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bl_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bl_registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_login_mainLayout = new javax.swing.GroupLayout(jp_login_main);
        jp_login_main.setLayout(jp_login_mainLayout);
        jp_login_mainLayout.setHorizontalGroup(
            jp_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_login_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_login_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bl_change_language)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ll_separator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bl_register))
                    .addComponent(jp_login_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_login_mainLayout.setVerticalGroup(
            jp_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_login_mainLayout.createSequentialGroup()
                .addComponent(jp_login_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_login_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bl_change_language)
                    .addComponent(bl_register)
                    .addComponent(ll_separator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_login_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_login_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bl_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bl_loginActionPerformed
        if(tfl_username.getText().length()==0)  // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else if(tfl_password.getPassword().length==0)  // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else{
            String user = tfl_username.getText();   // Collecting the input
            char[] pass = tfl_password.getPassword(); // Collecting the input
            String pwd = String.copyValueOf(pass);  // converting from array to string
            boolean bool = validate_login(user,pwd,0);
            if (bool == false)
                    bool = validate_login(user,pwd,1);
            if (bool == false)
                bool = validate_login(user,pwd,2);
            if (bool == false)
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
        }        
    }//GEN-LAST:event_bl_loginActionPerformed

    private void bl_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bl_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bl_quitActionPerformed

    private void br_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_br_quitActionPerformed

    private void bl_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bl_registerActionPerformed
        dl_register.setVisible(true);
    }//GEN-LAST:event_bl_registerActionPerformed

    private void bl_change_languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bl_change_languageActionPerformed
        change_language.setVisible(true);
    }//GEN-LAST:event_bl_change_languageActionPerformed

    private void bcl_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcl_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bcl_quitActionPerformed

    private void bcl_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcl_backActionPerformed
        change_language.dispose();
    }//GEN-LAST:event_bcl_backActionPerformed

    private void br_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_backActionPerformed
        dl_register.dispose();
    }//GEN-LAST:event_br_backActionPerformed
    
    private boolean validate_login(String username,String password, int type) {
        try{           
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hci_dss?" + "user=root&password=skgrishi");     
            if(type == 0){
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement("Select * from login_admin where username=? and password=?");
                pst.setString(1, username); 
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){           
                    //this.dispose();
                    adminMenu();
                }                  
                else
                    return false;
            }
            else if(type == 1){
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement("Select * from login_hod where username=? and password=?");
                pst.setString(1, username); 
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){           
                    //this.dispose();
                    hodMenu();
                }    
                else
                    return false;
            }
            else{
                PreparedStatement pst = (PreparedStatement) conn.prepareStatement("Select * from login_faculty where username=? and password=?");
                pst.setString(1, username); 
                pst.setString(2, password);
                ResultSet rs = pst.executeQuery();
                if(rs.next()){           
                    //this.dispose();
                    facultyMenu();
                }                   
                else
                    return false;
            }                                  
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }       
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_change_language;
    private javax.swing.JButton bcl_back;
    private javax.swing.JButton bcl_minimize;
    private javax.swing.JButton bcl_quit;
    private javax.swing.JButton bl_change_language;
    private javax.swing.JButton bl_login;
    private javax.swing.JButton bl_minimize;
    private javax.swing.JButton bl_quit;
    private javax.swing.JButton bl_register;
    private javax.swing.JButton br_back;
    private javax.swing.JButton br_minimize;
    private javax.swing.JButton br_quit;
    private javax.swing.JButton br_register;
    private javax.swing.JComboBox cb_select_language;
    private javax.swing.JComboBox cbr_account_type;
    private javax.swing.JDialog change_language;
    private javax.swing.JDialog dl_register;
    private javax.swing.JPanel jp_change_language_header;
    private javax.swing.JPanel jp_change_language_main;
    private javax.swing.JPanel jp_change_language_menu;
    private javax.swing.JPanel jp_login_header;
    private javax.swing.JPanel jp_login_main;
    private javax.swing.JPanel jp_login_menu;
    private javax.swing.JPanel jp_register_header;
    private javax.swing.JPanel jp_register_main;
    private javax.swing.JPanel jp_register_menu;
    private javax.swing.JLabel l_image;
    private javax.swing.JLabel l_select_language;
    private javax.swing.JLabel lcl_logo;
    private javax.swing.JLabel lcl_title;
    private javax.swing.JLabel ll_lock_image;
    private javax.swing.JLabel ll_logo;
    private javax.swing.JLabel ll_password;
    private javax.swing.JLabel ll_separator1;
    private javax.swing.JLabel ll_title;
    private javax.swing.JLabel ll_username;
    private javax.swing.JLabel lr_account_type;
    private javax.swing.JLabel lr_logo;
    private javax.swing.JLabel lr_password;
    private javax.swing.JLabel lr_register_image;
    private javax.swing.JLabel lr_title;
    private javax.swing.JLabel lr_username;
    private javax.swing.JPasswordField tfl_password;
    private javax.swing.JTextField tfl_username;
    private javax.swing.JPasswordField tfr_password;
    private javax.swing.JTextField tfr_username;
    // End of variables declaration//GEN-END:variables
}
