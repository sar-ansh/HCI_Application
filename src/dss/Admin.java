package dss;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manage_courses = new javax.swing.JDialog();
        jp_manage_courses_main = new javax.swing.JPanel();
        jp_manage_courses_menu = new javax.swing.JPanel();
        lmc_manage_courses_image = new javax.swing.JLabel();
        jp_manage_courses = new javax.swing.JPanel();
        bmc_add_new_course = new javax.swing.JButton();
        lmc_course_name = new javax.swing.JLabel();
        bmc_delete_course = new javax.swing.JButton();
        bec_edit_course = new javax.swing.JButton();
        jspmc_list_of_courses = new javax.swing.JScrollPane();
        jtmc_list_of_courses = new javax.swing.JTable();
        tfmc_course_name = new javax.swing.JTextField();
        jp_manage_courses_header = new javax.swing.JPanel();
        lmc_title = new javax.swing.JLabel();
        lmc_logo = new javax.swing.JLabel();
        bmc_quit = new javax.swing.JButton();
        bmc_minimize = new javax.swing.JButton();
        bmc_back = new javax.swing.JButton();
        bmc_logout = new javax.swing.JButton();
        manage_faculties = new javax.swing.JDialog();
        jp_manage_faculties_main = new javax.swing.JPanel();
        jp_manage_faculties_menu = new javax.swing.JPanel();
        lmf_manage_faculties_image = new javax.swing.JLabel();
        jp_manage_faculties = new javax.swing.JPanel();
        jspmf_list_of_faculties = new javax.swing.JScrollPane();
        jtmf_list_of_faculties = new javax.swing.JTable();
        lmf_faculty_name = new javax.swing.JLabel();
        tfmf_faculty_name = new javax.swing.JTextField();
        bmf_add_new_faculty = new javax.swing.JButton();
        bmf_remove_faculty = new javax.swing.JButton();
        jp_manage_faculties_header = new javax.swing.JPanel();
        lmf_title = new javax.swing.JLabel();
        lmf_logo = new javax.swing.JLabel();
        bmf_quit = new javax.swing.JButton();
        bmf_minimize = new javax.swing.JButton();
        bmf_back = new javax.swing.JButton();
        bmf_logout = new javax.swing.JButton();
        manage_expertise = new javax.swing.JDialog();
        jp_manage_expertise_main = new javax.swing.JPanel();
        jp_manage_expertise_menu = new javax.swing.JPanel();
        jp_manage_expertise = new javax.swing.JPanel();
        lme_manage_expertise_image = new javax.swing.JLabel();
        jspme_list_of_expertise = new javax.swing.JScrollPane();
        jtme_list_of_expertise = new javax.swing.JTable();
        lme_expertise_name = new javax.swing.JLabel();
        tfme_expertise_name = new javax.swing.JTextField();
        bme_add_new_expertise = new javax.swing.JButton();
        bme_delete_expertise = new javax.swing.JButton();
        jp_manage_expertise_header = new javax.swing.JPanel();
        lme_title = new javax.swing.JLabel();
        lme_logo = new javax.swing.JLabel();
        bme_quit = new javax.swing.JButton();
        bme_minimize = new javax.swing.JButton();
        bme_back = new javax.swing.JButton();
        bme_logout = new javax.swing.JButton();
        set_time = new javax.swing.JDialog();
        jp_set_time_main = new javax.swing.JPanel();
        jp_set_time_menu = new javax.swing.JPanel();
        lst_set_time_image = new javax.swing.JLabel();
        lst_date = new javax.swing.JLabel();
        sst_date_dd = new javax.swing.JSpinner();
        lst_date_dd = new javax.swing.JLabel();
        sst_month_mm = new javax.swing.JSpinner();
        lst_month_mm = new javax.swing.JLabel();
        sst_date_yyyy = new javax.swing.JSpinner();
        lst_date_yyyy = new javax.swing.JLabel();
        lst_from = new javax.swing.JLabel();
        sst_from_hh = new javax.swing.JSpinner();
        lst_from_hh = new javax.swing.JLabel();
        sst_from_mm = new javax.swing.JSpinner();
        lst_from_mm = new javax.swing.JLabel();
        lst_to = new javax.swing.JLabel();
        sst_to_hh = new javax.swing.JSpinner();
        lst_to_hh = new javax.swing.JLabel();
        sst_to_mm = new javax.swing.JSpinner();
        lst_to_mm = new javax.swing.JLabel();
        bst_set_time_window = new javax.swing.JButton();
        jp_set_time_header = new javax.swing.JPanel();
        lst_title = new javax.swing.JLabel();
        lst_logo = new javax.swing.JLabel();
        bst_quit = new javax.swing.JButton();
        bst_minimize = new javax.swing.JButton();
        bst_back = new javax.swing.JButton();
        bst_logout = new javax.swing.JButton();
        print_report = new javax.swing.JDialog();
        jp_print_report_main = new javax.swing.JPanel();
        jp_print_report_menu = new javax.swing.JPanel();
        lpr_print_report_image = new javax.swing.JLabel();
        bpr_print_reports = new javax.swing.JButton();
        lpr_select_report = new javax.swing.JLabel();
        cbpr_reports = new javax.swing.JComboBox();
        jp_print_report_header = new javax.swing.JPanel();
        lpr_title = new javax.swing.JLabel();
        lpr_logo = new javax.swing.JLabel();
        bpr_quit = new javax.swing.JButton();
        bpr_minimize = new javax.swing.JButton();
        bpr_back = new javax.swing.JButton();
        bpr_logout = new javax.swing.JButton();
        view_courses = new javax.swing.JDialog();
        jp_view_courses_main = new javax.swing.JPanel();
        jp_view_courses_menu = new javax.swing.JPanel();
        lva_view_courses_image1 = new javax.swing.JLabel();
        jspvc_courses_dept = new javax.swing.JScrollPane();
        jtvc_courses_dept = new javax.swing.JTable();
        lvc_courses_dept = new javax.swing.JLabel();
        lvc_courses_sem = new javax.swing.JLabel();
        jspvc_courses_sem = new javax.swing.JScrollPane();
        jtvc_courses_sem = new javax.swing.JTable();
        jspvc_courses_proposed = new javax.swing.JScrollPane();
        jtvc_courses_proposed = new javax.swing.JTable();
        lvc_courses_proposed = new javax.swing.JLabel();
        jp_view_courses_header = new javax.swing.JPanel();
        lvc_title = new javax.swing.JLabel();
        lvc_logo = new javax.swing.JLabel();
        bvc_quit = new javax.swing.JButton();
        bvc_minimize = new javax.swing.JButton();
        bvc_back = new javax.swing.JButton();
        bvc_logout = new javax.swing.JButton();
        view_faculties = new javax.swing.JDialog();
        jp_view_faculties_main = new javax.swing.JPanel();
        jp_view_faculties_menu = new javax.swing.JPanel();
        jp_view_faculties = new javax.swing.JPanel();
        jspvf_view_faculties = new javax.swing.JScrollPane();
        jtmf_list_of_faculties1 = new javax.swing.JTable();
        lvf_view_faculties_image = new javax.swing.JLabel();
        jp_view_faculties_header = new javax.swing.JPanel();
        lvf_title = new javax.swing.JLabel();
        lvf_logo = new javax.swing.JLabel();
        bvf_quit = new javax.swing.JButton();
        bvf_minimize = new javax.swing.JButton();
        bvf_back = new javax.swing.JButton();
        bvf_logout = new javax.swing.JButton();
        view_expertise = new javax.swing.JDialog();
        jp_view_expertise_main = new javax.swing.JPanel();
        jp_view_expertise_menu = new javax.swing.JPanel();
        lve_view_expertise_image = new javax.swing.JLabel();
        jspve_view_expertise = new javax.swing.JScrollPane();
        jtve_view_expertise = new javax.swing.JTable();
        jp_view_expertise_header = new javax.swing.JPanel();
        lve_title = new javax.swing.JLabel();
        lve_logo = new javax.swing.JLabel();
        bve_quit = new javax.swing.JButton();
        bve_minimize = new javax.swing.JButton();
        bve_back = new javax.swing.JButton();
        bve_logout = new javax.swing.JButton();
        view_assignments = new javax.swing.JDialog();
        jp_view_assignments_main = new javax.swing.JPanel();
        jp_view_assignments_menu = new javax.swing.JPanel();
        lva_view_assignments_image = new javax.swing.JLabel();
        lva_latest_assignment = new javax.swing.JLabel();
        jspva_latest_assignment = new javax.swing.JScrollPane();
        jtva_latest_assignment = new javax.swing.JTable();
        lva_year = new javax.swing.JLabel();
        cbva_year = new javax.swing.JComboBox();
        bva_view_assignment = new javax.swing.JButton();
        lva_previous_assignment = new javax.swing.JLabel();
        jspva_previous_assignment = new javax.swing.JScrollPane();
        jtva_previous_assignment = new javax.swing.JTable();
        jp_view_assignments_header = new javax.swing.JPanel();
        lva_title = new javax.swing.JLabel();
        lva_logo = new javax.swing.JLabel();
        bva_quit = new javax.swing.JButton();
        bva_minimize = new javax.swing.JButton();
        bva_back = new javax.swing.JButton();
        bva_logout = new javax.swing.JButton();
        edit_course = new javax.swing.JDialog();
        jp_edit_course_main = new javax.swing.JPanel();
        jp_edit_course_header = new javax.swing.JPanel();
        lec_title = new javax.swing.JLabel();
        lec_logo = new javax.swing.JLabel();
        bec_quit = new javax.swing.JButton();
        bec_minimize = new javax.swing.JButton();
        jp_edit_course_menu = new javax.swing.JPanel();
        lec_course_name = new javax.swing.JLabel();
        tfec_course_name = new javax.swing.JTextField();
        lec_course_id = new javax.swing.JLabel();
        tfec_course_id = new javax.swing.JTextField();
        lec_units = new javax.swing.JLabel();
        sec_units = new javax.swing.JSpinner();
        lec_expertise = new javax.swing.JLabel();
        cbec_expertise = new javax.swing.JComboBox();
        lec_another_expertise = new javax.swing.JLabel();
        lec_description = new javax.swing.JLabel();
        jspec_description = new javax.swing.JScrollPane();
        taec_description = new javax.swing.JTextArea();
        lec_lab_hours = new javax.swing.JLabel();
        tfec_lab_hours = new javax.swing.JTextField();
        bec_save = new javax.swing.JButton();
        bec_cancel = new javax.swing.JButton();
        bec_back = new javax.swing.JButton();
        bec_logout = new javax.swing.JButton();
        jp_admin_main = new javax.swing.JPanel();
        jp_admin_header = new javax.swing.JPanel();
        la_logo = new javax.swing.JLabel();
        la_title = new javax.swing.JLabel();
        ba_quit = new javax.swing.JButton();
        ba_minimize = new javax.swing.JButton();
        jp_admin_menu = new javax.swing.JPanel();
        ba_manage_faculties = new javax.swing.JButton();
        la_manage_faculties = new javax.swing.JLabel();
        ba_manage_expertise = new javax.swing.JButton();
        la_manage_expertise = new javax.swing.JLabel();
        ba_manage_courses = new javax.swing.JButton();
        la_manage_courses = new javax.swing.JLabel();
        ba_manage_time_window = new javax.swing.JButton();
        la_manage_time_window = new javax.swing.JLabel();
        ba_print_reports = new javax.swing.JButton();
        la_print_reports = new javax.swing.JLabel();
        bh_view_faculties = new javax.swing.JButton();
        lh_view_faculties = new javax.swing.JLabel();
        bh_view_expertise = new javax.swing.JButton();
        lh_view_expertise = new javax.swing.JLabel();
        bh_view_courses = new javax.swing.JButton();
        lh_view_courses = new javax.swing.JLabel();
        ba_view_assignments = new javax.swing.JButton();
        la_view_assignments = new javax.swing.JLabel();
        ba_logout = new javax.swing.JButton();

        manage_courses.setLocation(new java.awt.Point(400, 250));
        manage_courses.setMinimumSize(new java.awt.Dimension(757, 436));
        manage_courses.setUndecorated(true);

        jp_manage_courses_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_courses_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_manage_courses_main.setMinimumSize(new java.awt.Dimension(757, 436));

        jp_manage_courses_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_courses_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Courses", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_manage_courses_menu.setForeground(new java.awt.Color(255, 255, 255));

        lmc_manage_courses_image.setBackground(new java.awt.Color(148, 196, 255));
        lmc_manage_courses_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_course.png"))); // NOI18N

        jp_manage_courses.setBackground(new java.awt.Color(255, 255, 255));

        bmc_add_new_course.setBackground(new java.awt.Color(255, 255, 255));
        bmc_add_new_course.setForeground(new java.awt.Color(0, 104, 232));
        bmc_add_new_course.setText("Add New Course");
        bmc_add_new_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmc_add_new_courseActionPerformed(evt);
            }
        });

        lmc_course_name.setForeground(new java.awt.Color(0, 104, 232));
        lmc_course_name.setText("Course Name");

        bmc_delete_course.setBackground(new java.awt.Color(255, 255, 255));
        bmc_delete_course.setForeground(new java.awt.Color(0, 104, 232));
        bmc_delete_course.setText("Delete Course");
        bmc_delete_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmc_delete_courseActionPerformed(evt);
            }
        });

        bec_edit_course.setBackground(new java.awt.Color(255, 255, 255));
        bec_edit_course.setForeground(new java.awt.Color(0, 104, 232));
        bec_edit_course.setText("Edit Course");
        bec_edit_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bec_edit_courseActionPerformed(evt);
            }
        });

        jtmc_list_of_courses.setAutoCreateRowSorter(true);
        jtmc_list_of_courses.setForeground(new java.awt.Color(0, 104, 232));
        jtmc_list_of_courses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"C Programming"},
                {"Object Oriented Programming"},
                {"Data Structures and Algorithms"},
                {"Database Management System"},
                {"Operating Systems"},
                {"Computer Graphics"},
                {"Software Engineering"},
                {"Machine Learning"},
                {"Networks"},
                {"Cryptography"},
                {"Data Mining"},
                {"Human Computer Interaction"}
            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtmc_list_of_courses.setCellSelectionEnabled(true);
        jtmc_list_of_courses.setFillsViewportHeight(true);
        jtmc_list_of_courses.setFocusCycleRoot(true);
        jtmc_list_of_courses.setGridColor(new java.awt.Color(255, 255, 255));
        jtmc_list_of_courses.setName(""); // NOI18N
        jtmc_list_of_courses.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtmc_list_of_courses.setSelectionForeground(new java.awt.Color(0, 104, 232));
        jspmc_list_of_courses.setViewportView(jtmc_list_of_courses);
        jtmc_list_of_courses.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        tfmc_course_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmc_course_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_manage_coursesLayout = new javax.swing.GroupLayout(jp_manage_courses);
        jp_manage_courses.setLayout(jp_manage_coursesLayout);
        jp_manage_coursesLayout.setHorizontalGroup(
            jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_coursesLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jspmc_list_of_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_manage_coursesLayout.createSequentialGroup()
                        .addGroup(jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bmc_delete_course, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(bec_edit_course, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(bmc_add_new_course, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_manage_coursesLayout.createSequentialGroup()
                        .addComponent(lmc_course_name, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfmc_course_name, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jp_manage_coursesLayout.setVerticalGroup(
            jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_coursesLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jp_manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lmc_course_name)
                    .addComponent(tfmc_course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bmc_add_new_course)
                .addGap(14, 14, 14)
                .addComponent(bec_edit_course)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bmc_delete_course)
                .addGap(44, 44, 44))
            .addComponent(jspmc_list_of_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jp_manage_courses_menuLayout = new javax.swing.GroupLayout(jp_manage_courses_menu);
        jp_manage_courses_menu.setLayout(jp_manage_courses_menuLayout);
        jp_manage_courses_menuLayout.setHorizontalGroup(
            jp_manage_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_courses_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lmc_manage_courses_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_manage_courses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jp_manage_courses_menuLayout.setVerticalGroup(
            jp_manage_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_courses_menuLayout.createSequentialGroup()
                .addGroup(jp_manage_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lmc_manage_courses_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_manage_courses_menuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jp_manage_courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        DefaultListModel from = new DefaultListModel();
        DefaultListModel copy = new DefaultListModel();
        JList dragFrom;

        jp_manage_courses_header.setBackground(new java.awt.Color(0, 104, 232));

        lmc_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lmc_title.setForeground(new java.awt.Color(255, 255, 255));
        lmc_title.setText("Application");

        lmc_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bmc_quit.setBackground(new java.awt.Color(255, 255, 255));
        bmc_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bmc_quit.setBorder(null);
        bmc_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmc_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmc_quitActionPerformed(evt);
            }
        });

        bmc_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bmc_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bmc_minimize.setBorder(null);
        bmc_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_courses_headerLayout = new javax.swing.GroupLayout(jp_manage_courses_header);
        jp_manage_courses_header.setLayout(jp_manage_courses_headerLayout);
        jp_manage_courses_headerLayout.setHorizontalGroup(
            jp_manage_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_courses_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lmc_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lmc_logo)
                .addGap(26, 26, 26)
                .addComponent(bmc_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bmc_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_manage_courses_headerLayout.setVerticalGroup(
            jp_manage_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_courses_headerLayout.createSequentialGroup()
                .addComponent(lmc_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_manage_courses_headerLayout.createSequentialGroup()
                .addGroup(jp_manage_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_manage_courses_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lmc_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bmc_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmc_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bmc_back.setBackground(new java.awt.Color(255, 255, 255));
        bmc_back.setForeground(new java.awt.Color(0, 104, 232));
        bmc_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bmc_back.setText("Back");
        bmc_back.setBorder(null);
        bmc_back.setBorderPainted(false);
        bmc_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmc_backActionPerformed(evt);
            }
        });

        bmc_logout.setBackground(new java.awt.Color(255, 255, 255));
        bmc_logout.setForeground(new java.awt.Color(0, 104, 232));
        bmc_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bmc_logout.setText("Logout");
        bmc_logout.setBorder(null);
        bmc_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_courses_mainLayout = new javax.swing.GroupLayout(jp_manage_courses_main);
        jp_manage_courses_main.setLayout(jp_manage_courses_mainLayout);
        jp_manage_courses_mainLayout.setHorizontalGroup(
            jp_manage_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_courses_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_manage_courses_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_manage_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_manage_courses_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_manage_courses_mainLayout.createSequentialGroup()
                        .addComponent(bmc_back)
                        .addGap(608, 608, 608)
                        .addComponent(bmc_logout)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jp_manage_courses_mainLayout.setVerticalGroup(
            jp_manage_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_courses_mainLayout.createSequentialGroup()
                .addComponent(jp_manage_courses_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_manage_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmc_back)
                    .addComponent(bmc_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_manage_courses_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout manage_coursesLayout = new javax.swing.GroupLayout(manage_courses.getContentPane());
        manage_courses.getContentPane().setLayout(manage_coursesLayout);
        manage_coursesLayout.setHorizontalGroup(
            manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manage_coursesLayout.createSequentialGroup()
                .addComponent(jp_manage_courses_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        manage_coursesLayout.setVerticalGroup(
            manage_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_courses_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        manage_faculties.setLocation(new java.awt.Point(400, 250));
        manage_faculties.setMinimumSize(new java.awt.Dimension(757, 436));
        manage_faculties.setUndecorated(true);

        jp_manage_faculties_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_faculties_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_manage_faculties_main.setMinimumSize(new java.awt.Dimension(709, 436));
        jp_manage_faculties_main.setPreferredSize(new java.awt.Dimension(757, 436));

        jp_manage_faculties_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_faculties_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Faculties", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_manage_faculties_menu.setForeground(new java.awt.Color(255, 255, 255));

        lmf_manage_faculties_image.setBackground(new java.awt.Color(148, 196, 255));
        lmf_manage_faculties_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_faculty.png"))); // NOI18N

        jp_manage_faculties.setBackground(new java.awt.Color(255, 255, 255));

        jtmf_list_of_faculties.setAutoCreateRowSorter(true);
        jtmf_list_of_faculties.setForeground(new java.awt.Color(0, 104, 232));
        jtmf_list_of_faculties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Dr. ABC"},
                {"Prof. DEF"},
                {"Prof. MNO"},
                {"Prof. STU"},
                {"Dr. XYZ"}
            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtmf_list_of_faculties.setCellSelectionEnabled(true);
        jtmf_list_of_faculties.setFillsViewportHeight(true);
        jtmf_list_of_faculties.setFocusCycleRoot(true);
        jtmf_list_of_faculties.setGridColor(new java.awt.Color(255, 255, 255));
        jtmf_list_of_faculties.setName(""); // NOI18N
        jtmf_list_of_faculties.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtmf_list_of_faculties.setSelectionForeground(new java.awt.Color(0, 104, 232));
        jspmf_list_of_faculties.setViewportView(jtmf_list_of_faculties);
        jtmf_list_of_faculties.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lmf_faculty_name.setForeground(new java.awt.Color(0, 104, 232));
        lmf_faculty_name.setText("Name of the Faculty");

        tfmf_faculty_name.setForeground(new java.awt.Color(0, 104, 232));

        bmf_add_new_faculty.setBackground(new java.awt.Color(255, 255, 255));
        bmf_add_new_faculty.setForeground(new java.awt.Color(0, 104, 232));
        bmf_add_new_faculty.setText("Add New Faculty");
        bmf_add_new_faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmf_add_new_facultyActionPerformed(evt);
            }
        });

        bmf_remove_faculty.setBackground(new java.awt.Color(255, 255, 255));
        bmf_remove_faculty.setForeground(new java.awt.Color(0, 104, 232));
        bmf_remove_faculty.setText("Remove Faculty");
        bmf_remove_faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmf_remove_facultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_manage_facultiesLayout = new javax.swing.GroupLayout(jp_manage_faculties);
        jp_manage_faculties.setLayout(jp_manage_facultiesLayout);
        jp_manage_facultiesLayout.setHorizontalGroup(
            jp_manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_facultiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspmf_list_of_faculties, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_manage_facultiesLayout.createSequentialGroup()
                        .addComponent(lmf_faculty_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfmf_faculty_name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bmf_add_new_faculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bmf_remove_faculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_manage_facultiesLayout.setVerticalGroup(
            jp_manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_facultiesLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jp_manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfmf_faculty_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lmf_faculty_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bmf_add_new_faculty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bmf_remove_faculty)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_manage_facultiesLayout.createSequentialGroup()
                .addComponent(jspmf_list_of_faculties, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_manage_faculties_menuLayout = new javax.swing.GroupLayout(jp_manage_faculties_menu);
        jp_manage_faculties_menu.setLayout(jp_manage_faculties_menuLayout);
        jp_manage_faculties_menuLayout.setHorizontalGroup(
            jp_manage_faculties_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_faculties_menuLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lmf_manage_faculties_image)
                .addGap(73, 73, 73)
                .addComponent(jp_manage_faculties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_manage_faculties_menuLayout.setVerticalGroup(
            jp_manage_faculties_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_faculties, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_manage_faculties_menuLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lmf_manage_faculties_image, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_manage_faculties_header.setBackground(new java.awt.Color(0, 104, 232));

        lmf_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lmf_title.setForeground(new java.awt.Color(255, 255, 255));
        lmf_title.setText("Application");

        lmf_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bmf_quit.setBackground(new java.awt.Color(255, 255, 255));
        bmf_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bmf_quit.setBorder(null);
        bmf_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmf_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmf_quitActionPerformed(evt);
            }
        });

        bmf_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bmf_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bmf_minimize.setBorder(null);
        bmf_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_faculties_headerLayout = new javax.swing.GroupLayout(jp_manage_faculties_header);
        jp_manage_faculties_header.setLayout(jp_manage_faculties_headerLayout);
        jp_manage_faculties_headerLayout.setHorizontalGroup(
            jp_manage_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_faculties_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lmf_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lmf_logo)
                .addGap(26, 26, 26)
                .addComponent(bmf_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bmf_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_manage_faculties_headerLayout.setVerticalGroup(
            jp_manage_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_faculties_headerLayout.createSequentialGroup()
                .addComponent(lmf_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_manage_faculties_headerLayout.createSequentialGroup()
                .addGroup(jp_manage_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_manage_faculties_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lmf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bmf_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmf_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bmf_back.setBackground(new java.awt.Color(255, 255, 255));
        bmf_back.setForeground(new java.awt.Color(0, 104, 232));
        bmf_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bmf_back.setText("Back");
        bmf_back.setBorder(null);
        bmf_back.setBorderPainted(false);
        bmf_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmf_backActionPerformed(evt);
            }
        });

        bmf_logout.setBackground(new java.awt.Color(255, 255, 255));
        bmf_logout.setForeground(new java.awt.Color(0, 104, 232));
        bmf_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bmf_logout.setText("Logout");
        bmf_logout.setBorder(null);
        bmf_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_faculties_mainLayout = new javax.swing.GroupLayout(jp_manage_faculties_main);
        jp_manage_faculties_main.setLayout(jp_manage_faculties_mainLayout);
        jp_manage_faculties_mainLayout.setHorizontalGroup(
            jp_manage_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_faculties_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_manage_faculties_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_manage_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jp_manage_faculties_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_manage_faculties_mainLayout.createSequentialGroup()
                        .addComponent(bmf_back)
                        .addGap(615, 615, 615)
                        .addComponent(bmf_logout)))
                .addGap(10, 10, Short.MAX_VALUE))
        );
        jp_manage_faculties_mainLayout.setVerticalGroup(
            jp_manage_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_faculties_mainLayout.createSequentialGroup()
                .addComponent(jp_manage_faculties_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_manage_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bmf_back)
                    .addComponent(bmf_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_manage_faculties_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout manage_facultiesLayout = new javax.swing.GroupLayout(manage_faculties.getContentPane());
        manage_faculties.getContentPane().setLayout(manage_facultiesLayout);
        manage_facultiesLayout.setHorizontalGroup(
            manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_faculties_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manage_facultiesLayout.setVerticalGroup(
            manage_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_faculties_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        manage_expertise.setLocation(new java.awt.Point(400, 250));
        manage_expertise.setMinimumSize(new java.awt.Dimension(757, 436));
        manage_expertise.setUndecorated(true);

        jp_manage_expertise_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_expertise_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_manage_expertise_main.setMinimumSize(new java.awt.Dimension(709, 436));

        jp_manage_expertise_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_manage_expertise_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Expertise", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_manage_expertise_menu.setForeground(new java.awt.Color(255, 255, 255));

        jp_manage_expertise.setBackground(new java.awt.Color(255, 255, 255));

        lme_manage_expertise_image.setBackground(new java.awt.Color(148, 196, 255));
        lme_manage_expertise_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_expertise.png"))); // NOI18N

        jtme_list_of_expertise.setAutoCreateRowSorter(true);
        jtme_list_of_expertise.setForeground(new java.awt.Color(0, 104, 232));
        jtme_list_of_expertise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Expertise 1"},
                {"Expertise 2"},
                {"Expertise 3"},
                {"Expertise 4"},
                {"Expertise 5"},
                {"Expertise 6"},
                {"Expertise 7"},
                {"Expertise 8"},
                {"Expertise 9"},
                {null}
            },
            new String [] {
                ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtme_list_of_expertise.setCellSelectionEnabled(true);
        jtme_list_of_expertise.setFillsViewportHeight(true);
        jtme_list_of_expertise.setFocusCycleRoot(true);
        jtme_list_of_expertise.setGridColor(new java.awt.Color(255, 255, 255));
        jtme_list_of_expertise.setName(""); // NOI18N
        jtme_list_of_expertise.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtme_list_of_expertise.setSelectionForeground(new java.awt.Color(0, 104, 232));
        jspme_list_of_expertise.setViewportView(jtme_list_of_expertise);
        jtme_list_of_expertise.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lme_expertise_name.setForeground(new java.awt.Color(0, 104, 232));
        lme_expertise_name.setText("Area of Expertise");

        bme_add_new_expertise.setBackground(new java.awt.Color(255, 255, 255));
        bme_add_new_expertise.setForeground(new java.awt.Color(0, 104, 232));
        bme_add_new_expertise.setText("Add New Area of Expertise");
        bme_add_new_expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bme_add_new_expertiseActionPerformed(evt);
            }
        });

        bme_delete_expertise.setBackground(new java.awt.Color(255, 255, 255));
        bme_delete_expertise.setForeground(new java.awt.Color(0, 104, 232));
        bme_delete_expertise.setText("Delete Area of Expertise");
        bme_delete_expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bme_delete_expertiseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_manage_expertiseLayout = new javax.swing.GroupLayout(jp_manage_expertise);
        jp_manage_expertise.setLayout(jp_manage_expertiseLayout);
        jp_manage_expertiseLayout.setHorizontalGroup(
            jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertiseLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lme_manage_expertise_image)
                .addGap(81, 81, 81)
                .addComponent(jspme_list_of_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bme_delete_expertise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bme_add_new_expertise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_manage_expertiseLayout.createSequentialGroup()
                            .addComponent(lme_expertise_name)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfme_expertise_name, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jp_manage_expertiseLayout.setVerticalGroup(
            jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertiseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspme_list_of_expertise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jp_manage_expertiseLayout.createSequentialGroup()
                        .addGroup(jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_manage_expertiseLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(lme_manage_expertise_image, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_manage_expertiseLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jp_manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfme_expertise_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lme_expertise_name))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bme_add_new_expertise)
                                .addGap(18, 18, 18)
                                .addComponent(bme_delete_expertise)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jp_manage_expertise_menuLayout = new javax.swing.GroupLayout(jp_manage_expertise_menu);
        jp_manage_expertise_menu.setLayout(jp_manage_expertise_menuLayout);
        jp_manage_expertise_menuLayout.setHorizontalGroup(
            jp_manage_expertise_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_manage_expertise_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_manage_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(553, 553, 553))
        );
        jp_manage_expertise_menuLayout.setVerticalGroup(
            jp_manage_expertise_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_manage_expertise_menuLayout.createSequentialGroup()
                .addComponent(jp_manage_expertise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_manage_expertise_header.setBackground(new java.awt.Color(0, 104, 232));

        lme_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lme_title.setForeground(new java.awt.Color(255, 255, 255));
        lme_title.setText("Application");

        lme_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bme_quit.setBackground(new java.awt.Color(255, 255, 255));
        bme_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bme_quit.setBorder(null);
        bme_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bme_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bme_quitActionPerformed(evt);
            }
        });

        bme_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bme_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bme_minimize.setBorder(null);
        bme_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_expertise_headerLayout = new javax.swing.GroupLayout(jp_manage_expertise_header);
        jp_manage_expertise_header.setLayout(jp_manage_expertise_headerLayout);
        jp_manage_expertise_headerLayout.setHorizontalGroup(
            jp_manage_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertise_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lme_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lme_logo)
                .addGap(26, 26, 26)
                .addComponent(bme_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bme_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_manage_expertise_headerLayout.setVerticalGroup(
            jp_manage_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertise_headerLayout.createSequentialGroup()
                .addComponent(lme_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_manage_expertise_headerLayout.createSequentialGroup()
                .addGroup(jp_manage_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_manage_expertise_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lme_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bme_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bme_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bme_back.setBackground(new java.awt.Color(255, 255, 255));
        bme_back.setForeground(new java.awt.Color(0, 104, 232));
        bme_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bme_back.setText("Back");
        bme_back.setBorder(null);
        bme_back.setBorderPainted(false);
        bme_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bme_backActionPerformed(evt);
            }
        });

        bme_logout.setBackground(new java.awt.Color(255, 255, 255));
        bme_logout.setForeground(new java.awt.Color(0, 104, 232));
        bme_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bme_logout.setText("Logout");
        bme_logout.setBorder(null);
        bme_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_manage_expertise_mainLayout = new javax.swing.GroupLayout(jp_manage_expertise_main);
        jp_manage_expertise_main.setLayout(jp_manage_expertise_mainLayout);
        jp_manage_expertise_mainLayout.setHorizontalGroup(
            jp_manage_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertise_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_manage_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_manage_expertise_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_manage_expertise_mainLayout.createSequentialGroup()
                        .addComponent(bme_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 613, Short.MAX_VALUE)
                        .addComponent(bme_logout)))
                .addContainerGap())
            .addComponent(jp_manage_expertise_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_manage_expertise_mainLayout.setVerticalGroup(
            jp_manage_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_manage_expertise_mainLayout.createSequentialGroup()
                .addComponent(jp_manage_expertise_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_manage_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bme_back)
                    .addComponent(bme_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_manage_expertise_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout manage_expertiseLayout = new javax.swing.GroupLayout(manage_expertise.getContentPane());
        manage_expertise.getContentPane().setLayout(manage_expertiseLayout);
        manage_expertiseLayout.setHorizontalGroup(
            manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_expertise_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        manage_expertiseLayout.setVerticalGroup(
            manage_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_manage_expertise_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        set_time.setLocation(new java.awt.Point(400, 250));
        set_time.setMinimumSize(new java.awt.Dimension(757, 436));
        set_time.setModal(true);
        set_time.setUndecorated(true);

        jp_set_time_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_set_time_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_set_time_main.setMinimumSize(new java.awt.Dimension(757, 436));

        jp_set_time_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_set_time_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Time Window", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_set_time_menu.setForeground(new java.awt.Color(255, 255, 255));

        lst_set_time_image.setBackground(new java.awt.Color(148, 196, 255));
        lst_set_time_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time.png"))); // NOI18N

        lst_date.setBackground(new java.awt.Color(255, 255, 255));
        lst_date.setForeground(new java.awt.Color(0, 104, 232));
        lst_date.setText("Date");

        lst_date_dd.setBackground(new java.awt.Color(255, 255, 255));
        lst_date_dd.setForeground(new java.awt.Color(0, 104, 232));
        lst_date_dd.setText("dd");

        lst_month_mm.setBackground(new java.awt.Color(255, 255, 255));
        lst_month_mm.setForeground(new java.awt.Color(0, 104, 232));
        lst_month_mm.setText("mm");

        lst_date_yyyy.setBackground(new java.awt.Color(255, 255, 255));
        lst_date_yyyy.setForeground(new java.awt.Color(0, 104, 232));
        lst_date_yyyy.setText("yyyy");

        lst_from.setBackground(new java.awt.Color(255, 255, 255));
        lst_from.setForeground(new java.awt.Color(0, 104, 232));
        lst_from.setText("From");

        lst_from_hh.setBackground(new java.awt.Color(255, 255, 255));
        lst_from_hh.setForeground(new java.awt.Color(0, 104, 232));
        lst_from_hh.setText("hh");

        lst_from_mm.setBackground(new java.awt.Color(255, 255, 255));
        lst_from_mm.setForeground(new java.awt.Color(0, 104, 232));
        lst_from_mm.setText("mm");

        lst_to.setBackground(new java.awt.Color(255, 255, 255));
        lst_to.setForeground(new java.awt.Color(0, 104, 232));
        lst_to.setText("To");

        lst_to_hh.setBackground(new java.awt.Color(255, 255, 255));
        lst_to_hh.setForeground(new java.awt.Color(0, 104, 232));
        lst_to_hh.setText("hh");

        lst_to_mm.setBackground(new java.awt.Color(255, 255, 255));
        lst_to_mm.setForeground(new java.awt.Color(0, 104, 232));
        lst_to_mm.setText("mm");

        bst_set_time_window.setBackground(new java.awt.Color(255, 255, 255));
        bst_set_time_window.setForeground(new java.awt.Color(0, 104, 232));
        bst_set_time_window.setText("Set Time Window");

        javax.swing.GroupLayout jp_set_time_menuLayout = new javax.swing.GroupLayout(jp_set_time_menu);
        jp_set_time_menu.setLayout(jp_set_time_menuLayout);
        jp_set_time_menuLayout.setHorizontalGroup(
            jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lst_set_time_image, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                        .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lst_date)
                            .addComponent(lst_from)
                            .addComponent(lst_to))
                        .addGap(22, 22, 22)
                        .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                                        .addComponent(sst_to_hh, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lst_to_hh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sst_to_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                                        .addComponent(sst_from_hh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lst_from_hh)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sst_from_mm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lst_to_mm)
                                    .addComponent(lst_from_mm))
                                .addContainerGap(228, Short.MAX_VALUE))
                            .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                                .addComponent(sst_date_dd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lst_date_dd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sst_month_mm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lst_month_mm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sst_date_yyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lst_date_yyyy)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(bst_set_time_window, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jp_set_time_menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sst_from_hh, sst_from_mm, sst_to_hh, sst_to_mm});

        jp_set_time_menuLayout.setVerticalGroup(
            jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_set_time_menuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lst_date)
                    .addComponent(sst_date_dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sst_month_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sst_date_yyyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lst_date_dd)
                    .addComponent(lst_month_mm)
                    .addComponent(lst_date_yyyy))
                .addGap(18, 18, 18)
                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lst_from)
                    .addComponent(sst_from_hh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sst_from_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lst_from_hh)
                    .addComponent(lst_from_mm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_set_time_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lst_to)
                    .addComponent(sst_to_hh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sst_to_mm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lst_to_hh)
                    .addComponent(lst_to_mm))
                .addGap(28, 28, 28)
                .addComponent(bst_set_time_window)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_set_time_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lst_set_time_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_set_time_header.setBackground(new java.awt.Color(0, 104, 232));

        lst_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lst_title.setForeground(new java.awt.Color(255, 255, 255));
        lst_title.setText("Application");

        lst_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bst_quit.setBackground(new java.awt.Color(255, 255, 255));
        bst_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bst_quit.setBorder(null);
        bst_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bst_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bst_quitActionPerformed(evt);
            }
        });

        bst_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bst_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bst_minimize.setBorder(null);
        bst_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_set_time_headerLayout = new javax.swing.GroupLayout(jp_set_time_header);
        jp_set_time_header.setLayout(jp_set_time_headerLayout);
        jp_set_time_headerLayout.setHorizontalGroup(
            jp_set_time_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_set_time_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lst_title, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lst_logo)
                .addGap(26, 26, 26)
                .addComponent(bst_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bst_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_set_time_headerLayout.setVerticalGroup(
            jp_set_time_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_set_time_headerLayout.createSequentialGroup()
                .addComponent(lst_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_set_time_headerLayout.createSequentialGroup()
                .addGroup(jp_set_time_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_set_time_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lst_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bst_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bst_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bst_back.setBackground(new java.awt.Color(255, 255, 255));
        bst_back.setForeground(new java.awt.Color(0, 104, 232));
        bst_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bst_back.setText("Back");
        bst_back.setBorder(null);
        bst_back.setBorderPainted(false);
        bst_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bst_backActionPerformed(evt);
            }
        });

        bst_logout.setBackground(new java.awt.Color(255, 255, 255));
        bst_logout.setForeground(new java.awt.Color(0, 104, 232));
        bst_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bst_logout.setText("Logout");
        bst_logout.setBorder(null);
        bst_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bst_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bst_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_set_time_mainLayout = new javax.swing.GroupLayout(jp_set_time_main);
        jp_set_time_main.setLayout(jp_set_time_mainLayout);
        jp_set_time_mainLayout.setHorizontalGroup(
            jp_set_time_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_set_time_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_set_time_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_set_time_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_set_time_mainLayout.createSequentialGroup()
                        .addComponent(bst_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bst_logout))
                    .addComponent(jp_set_time_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_set_time_mainLayout.setVerticalGroup(
            jp_set_time_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_set_time_mainLayout.createSequentialGroup()
                .addComponent(jp_set_time_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jp_set_time_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_set_time_mainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bst_back))
                    .addGroup(jp_set_time_mainLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(bst_logout)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_set_time_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout set_timeLayout = new javax.swing.GroupLayout(set_time.getContentPane());
        set_time.getContentPane().setLayout(set_timeLayout);
        set_timeLayout.setHorizontalGroup(
            set_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_set_time_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        set_timeLayout.setVerticalGroup(
            set_timeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_set_time_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        print_report.setLocation(new java.awt.Point(400, 250));
        print_report.setMinimumSize(new java.awt.Dimension(757, 436));
        print_report.setModal(true);
        print_report.setUndecorated(true);

        jp_print_report_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_print_report_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_print_report_main.setMinimumSize(new java.awt.Dimension(757, 436));

        jp_print_report_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_print_report_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Print Reports", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_print_report_menu.setForeground(new java.awt.Color(255, 255, 255));

        lpr_print_report_image.setBackground(new java.awt.Color(148, 196, 255));
        lpr_print_report_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N

        bpr_print_reports.setBackground(new java.awt.Color(255, 255, 255));
        bpr_print_reports.setForeground(new java.awt.Color(0, 104, 232));
        bpr_print_reports.setText("Print Reports");

        lpr_select_report.setBackground(new java.awt.Color(255, 255, 255));
        lpr_select_report.setForeground(new java.awt.Color(0, 104, 232));
        lpr_select_report.setText("Select Report ");

        cbpr_reports.setBackground(new java.awt.Color(255, 255, 255));
        cbpr_reports.setForeground(new java.awt.Color(0, 104, 232));
        cbpr_reports.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jp_print_report_menuLayout = new javax.swing.GroupLayout(jp_print_report_menu);
        jp_print_report_menu.setLayout(jp_print_report_menuLayout);
        jp_print_report_menuLayout.setHorizontalGroup(
            jp_print_report_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_print_report_menuLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lpr_print_report_image)
                .addGap(164, 164, 164)
                .addGroup(jp_print_report_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_print_report_menuLayout.createSequentialGroup()
                        .addComponent(lpr_select_report)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbpr_reports, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bpr_print_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jp_print_report_menuLayout.setVerticalGroup(
            jp_print_report_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_print_report_menuLayout.createSequentialGroup()
                .addGroup(jp_print_report_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_print_report_menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jp_print_report_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lpr_select_report)
                            .addComponent(cbpr_reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_print_report_menuLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lpr_print_report_image, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bpr_print_reports)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jp_print_report_header.setBackground(new java.awt.Color(0, 104, 232));

        lpr_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lpr_title.setForeground(new java.awt.Color(255, 255, 255));
        lpr_title.setText("Application");

        lpr_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bpr_quit.setBackground(new java.awt.Color(255, 255, 255));
        bpr_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bpr_quit.setBorder(null);
        bpr_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bpr_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpr_quitActionPerformed(evt);
            }
        });

        bpr_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bpr_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bpr_minimize.setBorder(null);
        bpr_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_print_report_headerLayout = new javax.swing.GroupLayout(jp_print_report_header);
        jp_print_report_header.setLayout(jp_print_report_headerLayout);
        jp_print_report_headerLayout.setHorizontalGroup(
            jp_print_report_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_print_report_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lpr_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lpr_logo)
                .addGap(26, 26, 26)
                .addComponent(bpr_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bpr_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_print_report_headerLayout.setVerticalGroup(
            jp_print_report_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_print_report_headerLayout.createSequentialGroup()
                .addComponent(lpr_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_print_report_headerLayout.createSequentialGroup()
                .addGroup(jp_print_report_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_print_report_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lpr_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bpr_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bpr_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bpr_back.setBackground(new java.awt.Color(255, 255, 255));
        bpr_back.setForeground(new java.awt.Color(0, 104, 232));
        bpr_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bpr_back.setText("Back");
        bpr_back.setBorder(null);
        bpr_back.setBorderPainted(false);
        bpr_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpr_backActionPerformed(evt);
            }
        });

        bpr_logout.setBackground(new java.awt.Color(255, 255, 255));
        bpr_logout.setForeground(new java.awt.Color(0, 104, 232));
        bpr_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bpr_logout.setText("Logout");
        bpr_logout.setBorder(null);
        bpr_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_print_report_mainLayout = new javax.swing.GroupLayout(jp_print_report_main);
        jp_print_report_main.setLayout(jp_print_report_mainLayout);
        jp_print_report_mainLayout.setHorizontalGroup(
            jp_print_report_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_print_report_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_print_report_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_print_report_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_print_report_mainLayout.createSequentialGroup()
                        .addComponent(bpr_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bpr_logout))
                    .addComponent(jp_print_report_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_print_report_mainLayout.setVerticalGroup(
            jp_print_report_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_print_report_mainLayout.createSequentialGroup()
                .addComponent(jp_print_report_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_print_report_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpr_back)
                    .addComponent(bpr_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_print_report_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout print_reportLayout = new javax.swing.GroupLayout(print_report.getContentPane());
        print_report.getContentPane().setLayout(print_reportLayout);
        print_reportLayout.setHorizontalGroup(
            print_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_print_report_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        print_reportLayout.setVerticalGroup(
            print_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_print_report_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view_courses.setLocation(new java.awt.Point(400, 250));
        view_courses.setMinimumSize(new java.awt.Dimension(757, 436));
        view_courses.setUndecorated(true);

        jp_view_courses_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_courses_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_view_courses_main.setMinimumSize(new java.awt.Dimension(757, 436));

        jp_view_courses_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_courses_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Courses", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_view_courses_menu.setForeground(new java.awt.Color(255, 255, 255));

        lva_view_courses_image1.setBackground(new java.awt.Color(148, 196, 255));
        lva_view_courses_image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_course.png"))); // NOI18N

        jtvc_courses_dept.setForeground(new java.awt.Color(0, 104, 232));
        jtvc_courses_dept.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"C Programming"},
                {"Object Oriented Programming"},
                {"Networks"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Course Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtvc_courses_dept.getTableHeader().setReorderingAllowed(false);
        jspvc_courses_dept.setViewportView(jtvc_courses_dept);

        lvc_courses_dept.setBackground(new java.awt.Color(255, 255, 255));
        lvc_courses_dept.setForeground(new java.awt.Color(0, 104, 232));
        lvc_courses_dept.setText("Courses offered by Department");

        lvc_courses_sem.setBackground(new java.awt.Color(255, 255, 255));
        lvc_courses_sem.setForeground(new java.awt.Color(0, 104, 232));
        lvc_courses_sem.setText("Courses offered this sem");

        jtvc_courses_sem.setForeground(new java.awt.Color(0, 104, 232));
        jtvc_courses_sem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"C Programming"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Course Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtvc_courses_sem.getTableHeader().setReorderingAllowed(false);
        jspvc_courses_sem.setViewportView(jtvc_courses_sem);

        jtvc_courses_proposed.setForeground(new java.awt.Color(0, 104, 232));
        jtvc_courses_proposed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Multimedia Computing"},
                {"Software Engineering"},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Course Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtvc_courses_proposed.getTableHeader().setReorderingAllowed(false);
        jspvc_courses_proposed.setViewportView(jtvc_courses_proposed);

        lvc_courses_proposed.setBackground(new java.awt.Color(255, 255, 255));
        lvc_courses_proposed.setForeground(new java.awt.Color(0, 104, 232));
        lvc_courses_proposed.setText("Proposed Courses");

        javax.swing.GroupLayout jp_view_courses_menuLayout = new javax.swing.GroupLayout(jp_view_courses_menu);
        jp_view_courses_menu.setLayout(jp_view_courses_menuLayout);
        jp_view_courses_menuLayout.setHorizontalGroup(
            jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_courses_menuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lva_view_courses_image1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvc_courses_dept)
                    .addComponent(jspvc_courses_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvc_courses_sem)
                    .addComponent(jspvc_courses_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_courses_menuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lvc_courses_proposed)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_view_courses_menuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jspvc_courses_proposed, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        jp_view_courses_menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jspvc_courses_dept, jspvc_courses_proposed, jspvc_courses_sem});

        jp_view_courses_menuLayout.setVerticalGroup(
            jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_courses_menuLayout.createSequentialGroup()
                .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvc_courses_dept, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvc_courses_sem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvc_courses_proposed, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_courses_menuLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lva_view_courses_image1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_view_courses_menuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_view_courses_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jspvc_courses_dept, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspvc_courses_sem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jspvc_courses_proposed, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jp_view_courses_menuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jspvc_courses_dept, jspvc_courses_proposed, jspvc_courses_sem});

        jp_view_courses_header.setBackground(new java.awt.Color(0, 104, 232));

        lvc_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lvc_title.setForeground(new java.awt.Color(255, 255, 255));
        lvc_title.setText("Application");

        lvc_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bvc_quit.setBackground(new java.awt.Color(255, 255, 255));
        bvc_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bvc_quit.setBorder(null);
        bvc_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bvc_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvc_quitActionPerformed(evt);
            }
        });

        bvc_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bvc_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bvc_minimize.setBorder(null);
        bvc_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_courses_headerLayout = new javax.swing.GroupLayout(jp_view_courses_header);
        jp_view_courses_header.setLayout(jp_view_courses_headerLayout);
        jp_view_courses_headerLayout.setHorizontalGroup(
            jp_view_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_courses_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvc_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lvc_logo)
                .addGap(50, 50, 50)
                .addComponent(bvc_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bvc_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_view_courses_headerLayout.setVerticalGroup(
            jp_view_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_courses_headerLayout.createSequentialGroup()
                .addComponent(lvc_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_view_courses_headerLayout.createSequentialGroup()
                .addGroup(jp_view_courses_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_courses_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lvc_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bvc_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bvc_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bvc_back.setBackground(new java.awt.Color(255, 255, 255));
        bvc_back.setForeground(new java.awt.Color(0, 104, 232));
        bvc_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bvc_back.setText("Back");
        bvc_back.setBorder(null);
        bvc_back.setBorderPainted(false);
        bvc_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvc_backActionPerformed(evt);
            }
        });

        bvc_logout.setBackground(new java.awt.Color(255, 255, 255));
        bvc_logout.setForeground(new java.awt.Color(0, 104, 232));
        bvc_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bvc_logout.setText("Logout");
        bvc_logout.setBorder(null);
        bvc_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_courses_mainLayout = new javax.swing.GroupLayout(jp_view_courses_main);
        jp_view_courses_main.setLayout(jp_view_courses_mainLayout);
        jp_view_courses_mainLayout.setHorizontalGroup(
            jp_view_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_courses_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_view_courses_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_view_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_view_courses_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_view_courses_mainLayout.createSequentialGroup()
                        .addComponent(bvc_back)
                        .addGap(606, 606, 606)
                        .addComponent(bvc_logout)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jp_view_courses_mainLayout.setVerticalGroup(
            jp_view_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_courses_mainLayout.createSequentialGroup()
                .addComponent(jp_view_courses_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_view_courses_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bvc_back)
                    .addComponent(bvc_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_view_courses_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout view_coursesLayout = new javax.swing.GroupLayout(view_courses.getContentPane());
        view_courses.getContentPane().setLayout(view_coursesLayout);
        view_coursesLayout.setHorizontalGroup(
            view_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_courses_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view_coursesLayout.setVerticalGroup(
            view_coursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_courses_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view_faculties.setLocation(new java.awt.Point(400, 250));
        view_faculties.setMinimumSize(new java.awt.Dimension(757, 436));
        view_faculties.setUndecorated(true);

        jp_view_faculties_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_faculties_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_view_faculties_main.setMinimumSize(new java.awt.Dimension(709, 436));
        jp_view_faculties_main.setPreferredSize(new java.awt.Dimension(757, 436));

        jp_view_faculties_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_faculties_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Faculties", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_view_faculties_menu.setForeground(new java.awt.Color(255, 255, 255));

        jp_view_faculties.setBackground(new java.awt.Color(255, 255, 255));

        jtmf_list_of_faculties1.setAutoCreateRowSorter(true);
        jtmf_list_of_faculties1.setForeground(new java.awt.Color(0, 104, 232));
        jtmf_list_of_faculties1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Dr. ABC", "Expertise 1, Expertise 2", null, "13"},
                { new Integer(2), "Prof. DEF", "Expertise 3", null, "5"},
                { new Integer(3), "Prof. MNO", "Expertise 3", null, "1"},
                { new Integer(4), "Prof. STU", "Expertise 5, Expertise 7, Expertise 9", null, "6"},
                { new Integer(5), "Dr. XYZ", "Expertise 4", null, "9"}
            },
            new String [] {
                "S No.", "Name", "Areas of Expertise", "Courses Taken", "Years of Experience"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtmf_list_of_faculties1.setCellSelectionEnabled(true);
        jtmf_list_of_faculties1.setFillsViewportHeight(true);
        jtmf_list_of_faculties1.setFocusCycleRoot(true);
        jtmf_list_of_faculties1.setGridColor(new java.awt.Color(255, 255, 255));
        jtmf_list_of_faculties1.setName(""); // NOI18N
        jtmf_list_of_faculties1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtmf_list_of_faculties1.setSelectionForeground(new java.awt.Color(0, 104, 232));
        jspvf_view_faculties.setViewportView(jtmf_list_of_faculties1);

        lvf_view_faculties_image.setBackground(new java.awt.Color(148, 196, 255));
        lvf_view_faculties_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_faculty.png"))); // NOI18N

        javax.swing.GroupLayout jp_view_facultiesLayout = new javax.swing.GroupLayout(jp_view_faculties);
        jp_view_faculties.setLayout(jp_view_facultiesLayout);
        jp_view_facultiesLayout.setHorizontalGroup(
            jp_view_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_facultiesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvf_view_faculties_image)
                .addGap(27, 27, 27)
                .addComponent(jspvf_view_faculties, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        jp_view_facultiesLayout.setVerticalGroup(
            jp_view_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_facultiesLayout.createSequentialGroup()
                .addComponent(jspvf_view_faculties, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jp_view_facultiesLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lvf_view_faculties_image, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp_view_faculties_menuLayout = new javax.swing.GroupLayout(jp_view_faculties_menu);
        jp_view_faculties_menu.setLayout(jp_view_faculties_menuLayout);
        jp_view_faculties_menuLayout.setHorizontalGroup(
            jp_view_faculties_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_faculties_menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jp_view_faculties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(512, 512, 512))
        );
        jp_view_faculties_menuLayout.setVerticalGroup(
            jp_view_faculties_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_faculties, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jp_view_faculties_header.setBackground(new java.awt.Color(0, 104, 232));

        lvf_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lvf_title.setForeground(new java.awt.Color(255, 255, 255));
        lvf_title.setText("Application");

        lvf_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bvf_quit.setBackground(new java.awt.Color(255, 255, 255));
        bvf_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bvf_quit.setBorder(null);
        bvf_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bvf_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvf_quitActionPerformed(evt);
            }
        });

        bvf_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bvf_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bvf_minimize.setBorder(null);
        bvf_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_faculties_headerLayout = new javax.swing.GroupLayout(jp_view_faculties_header);
        jp_view_faculties_header.setLayout(jp_view_faculties_headerLayout);
        jp_view_faculties_headerLayout.setHorizontalGroup(
            jp_view_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_faculties_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lvf_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lvf_logo)
                .addGap(32, 32, 32)
                .addComponent(bvf_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bvf_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jp_view_faculties_headerLayout.setVerticalGroup(
            jp_view_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_faculties_headerLayout.createSequentialGroup()
                .addComponent(lvf_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_view_faculties_headerLayout.createSequentialGroup()
                .addGroup(jp_view_faculties_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_faculties_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lvf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bvf_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bvf_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bvf_back.setBackground(new java.awt.Color(255, 255, 255));
        bvf_back.setForeground(new java.awt.Color(0, 104, 232));
        bvf_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bvf_back.setText("Back");
        bvf_back.setBorder(null);
        bvf_back.setBorderPainted(false);
        bvf_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bvf_backActionPerformed(evt);
            }
        });

        bvf_logout.setBackground(new java.awt.Color(255, 255, 255));
        bvf_logout.setForeground(new java.awt.Color(0, 104, 232));
        bvf_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bvf_logout.setText("Logout");
        bvf_logout.setBorder(null);
        bvf_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_faculties_mainLayout = new javax.swing.GroupLayout(jp_view_faculties_main);
        jp_view_faculties_main.setLayout(jp_view_faculties_mainLayout);
        jp_view_faculties_mainLayout.setHorizontalGroup(
            jp_view_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_faculties_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_view_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_faculties_mainLayout.createSequentialGroup()
                        .addComponent(jp_view_faculties_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jp_view_faculties_mainLayout.createSequentialGroup()
                        .addComponent(bvf_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bvf_logout)))
                .addContainerGap())
            .addComponent(jp_view_faculties_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp_view_faculties_mainLayout.setVerticalGroup(
            jp_view_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_faculties_mainLayout.createSequentialGroup()
                .addComponent(jp_view_faculties_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_view_faculties_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bvf_back)
                    .addComponent(bvf_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_view_faculties_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout view_facultiesLayout = new javax.swing.GroupLayout(view_faculties.getContentPane());
        view_faculties.getContentPane().setLayout(view_facultiesLayout);
        view_facultiesLayout.setHorizontalGroup(
            view_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_faculties_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view_facultiesLayout.setVerticalGroup(
            view_facultiesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_faculties_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view_expertise.setLocation(new java.awt.Point(400, 250));
        view_expertise.setMinimumSize(new java.awt.Dimension(757, 436));
        view_expertise.setUndecorated(true);

        jp_view_expertise_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_expertise_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_view_expertise_main.setMinimumSize(new java.awt.Dimension(709, 436));

        jp_view_expertise_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_expertise_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View Expertise", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_view_expertise_menu.setForeground(new java.awt.Color(255, 255, 255));

        lve_view_expertise_image.setBackground(new java.awt.Color(148, 196, 255));
        lve_view_expertise_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_expertise.png"))); // NOI18N

        jtve_view_expertise.setAutoCreateRowSorter(true);
        jtve_view_expertise.setForeground(new java.awt.Color(0, 104, 232));
        jtve_view_expertise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "Expertise 1", "C Programming", "Prof. XYZ"},
                { new Integer(2), "Expertise 2", "Networks", "Prof. ABC"},
                { new Integer(3), "Expertise 3", "Operating Systems", "Prof. MNO"}
            },
            new String [] {
                "S No.", "Area of Expertise", "Courses that need Exepertise", "Facultes with Expertise"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtve_view_expertise.setCellSelectionEnabled(true);
        jtve_view_expertise.setFillsViewportHeight(true);
        jtve_view_expertise.setFocusCycleRoot(true);
        jtve_view_expertise.setGridColor(new java.awt.Color(255, 255, 255));
        jtve_view_expertise.setName(""); // NOI18N
        jtve_view_expertise.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jtve_view_expertise.setSelectionForeground(new java.awt.Color(0, 104, 232));
        jspve_view_expertise.setViewportView(jtve_view_expertise);

        javax.swing.GroupLayout jp_view_expertise_menuLayout = new javax.swing.GroupLayout(jp_view_expertise_menu);
        jp_view_expertise_menu.setLayout(jp_view_expertise_menuLayout);
        jp_view_expertise_menuLayout.setHorizontalGroup(
            jp_view_expertise_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_view_expertise_menuLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lve_view_expertise_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jspve_view_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_view_expertise_menuLayout.setVerticalGroup(
            jp_view_expertise_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_expertise_menuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lve_view_expertise_image, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(jp_view_expertise_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspve_view_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_view_expertise_header.setBackground(new java.awt.Color(0, 104, 232));

        lve_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lve_title.setForeground(new java.awt.Color(255, 255, 255));
        lve_title.setText("Application");

        lve_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bve_quit.setBackground(new java.awt.Color(255, 255, 255));
        bve_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bve_quit.setBorder(null);
        bve_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bve_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bve_quitActionPerformed(evt);
            }
        });

        bve_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bve_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bve_minimize.setBorder(null);
        bve_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_expertise_headerLayout = new javax.swing.GroupLayout(jp_view_expertise_header);
        jp_view_expertise_header.setLayout(jp_view_expertise_headerLayout);
        jp_view_expertise_headerLayout.setHorizontalGroup(
            jp_view_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_expertise_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lve_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lve_logo)
                .addGap(26, 26, 26)
                .addComponent(bve_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bve_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jp_view_expertise_headerLayout.setVerticalGroup(
            jp_view_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_expertise_headerLayout.createSequentialGroup()
                .addComponent(lve_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_view_expertise_headerLayout.createSequentialGroup()
                .addGroup(jp_view_expertise_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_expertise_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lve_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bve_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bve_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bve_back.setBackground(new java.awt.Color(255, 255, 255));
        bve_back.setForeground(new java.awt.Color(0, 104, 232));
        bve_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bve_back.setText("Back");
        bve_back.setBorder(null);
        bve_back.setBorderPainted(false);
        bve_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bve_backActionPerformed(evt);
            }
        });

        bve_logout.setBackground(new java.awt.Color(255, 255, 255));
        bve_logout.setForeground(new java.awt.Color(0, 104, 232));
        bve_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bve_logout.setText("Logout");
        bve_logout.setBorder(null);
        bve_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_expertise_mainLayout = new javax.swing.GroupLayout(jp_view_expertise_main);
        jp_view_expertise_main.setLayout(jp_view_expertise_mainLayout);
        jp_view_expertise_mainLayout.setHorizontalGroup(
            jp_view_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_expertise_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_view_expertise_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_view_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_view_expertise_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_view_expertise_mainLayout.createSequentialGroup()
                        .addComponent(bve_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bve_logout)))
                .addContainerGap())
        );
        jp_view_expertise_mainLayout.setVerticalGroup(
            jp_view_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_expertise_mainLayout.createSequentialGroup()
                .addComponent(jp_view_expertise_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_view_expertise_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bve_back)
                    .addComponent(bve_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_view_expertise_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout view_expertiseLayout = new javax.swing.GroupLayout(view_expertise.getContentPane());
        view_expertise.getContentPane().setLayout(view_expertiseLayout);
        view_expertiseLayout.setHorizontalGroup(
            view_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_expertise_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view_expertiseLayout.setVerticalGroup(
            view_expertiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_expertise_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        view_assignments.setLocation(new java.awt.Point(400, 250));
        view_assignments.setMinimumSize(new java.awt.Dimension(757, 436));
        view_assignments.setUndecorated(true);

        jp_view_assignments_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_assignments_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_view_assignments_main.setMinimumSize(new java.awt.Dimension(757, 436));

        jp_view_assignments_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_view_assignments_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assignments", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_view_assignments_menu.setForeground(new java.awt.Color(255, 255, 255));

        lva_view_assignments_image.setBackground(new java.awt.Color(148, 196, 255));
        lva_view_assignments_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous_assignments.png"))); // NOI18N

        lva_latest_assignment.setBackground(new java.awt.Color(255, 255, 255));
        lva_latest_assignment.setForeground(new java.awt.Color(0, 104, 232));
        lva_latest_assignment.setText("Latest Assignment");

        jtva_latest_assignment.setForeground(new java.awt.Color(0, 104, 232));
        jtva_latest_assignment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"C Programming", "Prof. XYZ"},
                {"Networks", "Prof. ABC"},
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
                "Course Name", "Faculty Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtva_latest_assignment.getTableHeader().setReorderingAllowed(false);
        jspva_latest_assignment.setViewportView(jtva_latest_assignment);
        if (jtva_latest_assignment.getColumnModel().getColumnCount() > 0) {
            jtva_latest_assignment.getColumnModel().getColumn(0).setResizable(false);
        }

        lva_year.setBackground(new java.awt.Color(255, 255, 255));
        lva_year.setForeground(new java.awt.Color(0, 104, 232));
        lva_year.setText("Year");

        cbva_year.setBackground(new java.awt.Color(255, 255, 255));
        cbva_year.setForeground(new java.awt.Color(0, 104, 232));
        cbva_year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bva_view_assignment.setBackground(new java.awt.Color(255, 255, 255));
        bva_view_assignment.setForeground(new java.awt.Color(0, 104, 232));
        bva_view_assignment.setText("View Assignment");
        bva_view_assignment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bva_view_assignmentActionPerformed(evt);
            }
        });

        lva_previous_assignment.setBackground(new java.awt.Color(255, 255, 255));
        lva_previous_assignment.setForeground(new java.awt.Color(0, 104, 232));
        lva_previous_assignment.setText("Previous Assignment");

        jtva_previous_assignment.setForeground(new java.awt.Color(0, 104, 232));
        jtva_previous_assignment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Networks", "Prof XYZ"},
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
                "Course Name", "Faculty Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtva_previous_assignment.getTableHeader().setReorderingAllowed(false);
        jspva_previous_assignment.setViewportView(jtva_previous_assignment);
        if (jtva_previous_assignment.getColumnModel().getColumnCount() > 0) {
            jtva_previous_assignment.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jp_view_assignments_menuLayout = new javax.swing.GroupLayout(jp_view_assignments_menu);
        jp_view_assignments_menu.setLayout(jp_view_assignments_menuLayout);
        jp_view_assignments_menuLayout.setHorizontalGroup(
            jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lva_view_assignments_image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspva_latest_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                        .addComponent(lva_year, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbva_year, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bva_view_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspva_previous_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_view_assignments_menuLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lva_latest_assignment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lva_previous_assignment)
                .addGap(75, 75, 75))
        );
        jp_view_assignments_menuLayout.setVerticalGroup(
            jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lva_view_assignments_image, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                        .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lva_previous_assignment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lva_latest_assignment, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lva_year)
                                    .addComponent(cbva_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(bva_view_assignment))
                            .addGroup(jp_view_assignments_menuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp_view_assignments_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jspva_previous_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jspva_latest_assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_view_assignments_menuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jspva_latest_assignment, jspva_previous_assignment});

        jp_view_assignments_header.setBackground(new java.awt.Color(0, 104, 232));

        lva_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lva_title.setForeground(new java.awt.Color(255, 255, 255));
        lva_title.setText("Application");

        lva_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bva_quit.setBackground(new java.awt.Color(255, 255, 255));
        bva_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bva_quit.setBorder(null);
        bva_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bva_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bva_quitActionPerformed(evt);
            }
        });

        bva_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bva_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bva_minimize.setBorder(null);
        bva_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_assignments_headerLayout = new javax.swing.GroupLayout(jp_view_assignments_header);
        jp_view_assignments_header.setLayout(jp_view_assignments_headerLayout);
        jp_view_assignments_headerLayout.setHorizontalGroup(
            jp_view_assignments_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_assignments_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lva_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lva_logo)
                .addGap(50, 50, 50)
                .addComponent(bva_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bva_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_view_assignments_headerLayout.setVerticalGroup(
            jp_view_assignments_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_assignments_headerLayout.createSequentialGroup()
                .addComponent(lva_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_view_assignments_headerLayout.createSequentialGroup()
                .addGroup(jp_view_assignments_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_view_assignments_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lva_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bva_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bva_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bva_back.setBackground(new java.awt.Color(255, 255, 255));
        bva_back.setForeground(new java.awt.Color(0, 104, 232));
        bva_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bva_back.setText("Back");
        bva_back.setBorder(null);
        bva_back.setBorderPainted(false);
        bva_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bva_backActionPerformed(evt);
            }
        });

        bva_logout.setBackground(new java.awt.Color(255, 255, 255));
        bva_logout.setForeground(new java.awt.Color(0, 104, 232));
        bva_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bva_logout.setText("Logout");
        bva_logout.setBorder(null);
        bva_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_view_assignments_mainLayout = new javax.swing.GroupLayout(jp_view_assignments_main);
        jp_view_assignments_main.setLayout(jp_view_assignments_mainLayout);
        jp_view_assignments_mainLayout.setHorizontalGroup(
            jp_view_assignments_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_assignments_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_view_assignments_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_view_assignments_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_view_assignments_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_view_assignments_mainLayout.createSequentialGroup()
                        .addComponent(bva_back)
                        .addGap(606, 606, 606)
                        .addComponent(bva_logout)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jp_view_assignments_mainLayout.setVerticalGroup(
            jp_view_assignments_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_view_assignments_mainLayout.createSequentialGroup()
                .addComponent(jp_view_assignments_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_view_assignments_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bva_back)
                    .addComponent(bva_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_view_assignments_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout view_assignmentsLayout = new javax.swing.GroupLayout(view_assignments.getContentPane());
        view_assignments.getContentPane().setLayout(view_assignmentsLayout);
        view_assignmentsLayout.setHorizontalGroup(
            view_assignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_assignments_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        view_assignmentsLayout.setVerticalGroup(
            view_assignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_view_assignments_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        edit_course.setLocation(new java.awt.Point(400, 250));
        edit_course.setMinimumSize(new java.awt.Dimension(757, 436));
        edit_course.setUndecorated(true);

        jp_edit_course_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_edit_course_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_edit_course_main.setMinimumSize(new java.awt.Dimension(757, 436));
        jp_edit_course_main.setPreferredSize(new java.awt.Dimension(757, 436));

        jp_edit_course_header.setBackground(new java.awt.Color(0, 104, 232));

        lec_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        lec_title.setForeground(new java.awt.Color(255, 255, 255));
        lec_title.setText("Application");

        lec_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        bec_quit.setBackground(new java.awt.Color(255, 255, 255));
        bec_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        bec_quit.setBorder(null);
        bec_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bec_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bec_quitActionPerformed(evt);
            }
        });

        bec_minimize.setBackground(new java.awt.Color(255, 255, 255));
        bec_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        bec_minimize.setBorder(null);
        bec_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_edit_course_headerLayout = new javax.swing.GroupLayout(jp_edit_course_header);
        jp_edit_course_header.setLayout(jp_edit_course_headerLayout);
        jp_edit_course_headerLayout.setHorizontalGroup(
            jp_edit_course_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_edit_course_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lec_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39)
                .addComponent(lec_logo)
                .addGap(50, 50, 50)
                .addComponent(bec_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bec_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_edit_course_headerLayout.setVerticalGroup(
            jp_edit_course_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_edit_course_headerLayout.createSequentialGroup()
                .addComponent(lec_logo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jp_edit_course_headerLayout.createSequentialGroup()
                .addGroup(jp_edit_course_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_edit_course_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lec_title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bec_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bec_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_edit_course_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_edit_course_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edit Course", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N
        jp_edit_course_menu.setForeground(new java.awt.Color(255, 255, 255));

        lec_course_name.setBackground(new java.awt.Color(255, 255, 255));
        lec_course_name.setForeground(new java.awt.Color(0, 104, 232));
        lec_course_name.setText("Course Name");

        tfec_course_name.setForeground(new java.awt.Color(0, 104, 232));

        lec_course_id.setBackground(new java.awt.Color(255, 255, 255));
        lec_course_id.setForeground(new java.awt.Color(0, 104, 232));
        lec_course_id.setText("Course ID");

        tfec_course_id.setForeground(new java.awt.Color(0, 104, 232));

        lec_units.setBackground(new java.awt.Color(255, 255, 255));
        lec_units.setForeground(new java.awt.Color(0, 104, 232));
        lec_units.setText("No. of Units");

        lec_expertise.setBackground(new java.awt.Color(255, 255, 255));
        lec_expertise.setForeground(new java.awt.Color(0, 104, 232));
        lec_expertise.setText("Area of Expertise needed");

        cbec_expertise.setBackground(new java.awt.Color(255, 255, 255));
        cbec_expertise.setForeground(new java.awt.Color(0, 104, 232));
        cbec_expertise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lec_another_expertise.setBackground(new java.awt.Color(255, 255, 255));
        lec_another_expertise.setForeground(new java.awt.Color(0, 104, 232));
        lec_another_expertise.setText("Add another Area of Expertise");

        lec_description.setBackground(new java.awt.Color(255, 255, 255));
        lec_description.setForeground(new java.awt.Color(0, 104, 232));
        lec_description.setText("Description");

        taec_description.setColumns(20);
        taec_description.setForeground(new java.awt.Color(0, 104, 232));
        taec_description.setRows(5);
        jspec_description.setViewportView(taec_description);

        lec_lab_hours.setBackground(new java.awt.Color(255, 255, 255));
        lec_lab_hours.setForeground(new java.awt.Color(0, 104, 232));
        lec_lab_hours.setText("Lab Hours");

        tfec_lab_hours.setForeground(new java.awt.Color(0, 104, 232));

        bec_save.setBackground(new java.awt.Color(255, 255, 255));
        bec_save.setForeground(new java.awt.Color(0, 104, 232));
        bec_save.setText("Save");
        bec_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bec_saveActionPerformed(evt);
            }
        });

        bec_cancel.setBackground(new java.awt.Color(255, 255, 255));
        bec_cancel.setForeground(new java.awt.Color(0, 104, 232));
        bec_cancel.setText("Cancel");
        bec_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bec_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_edit_course_menuLayout = new javax.swing.GroupLayout(jp_edit_course_menu);
        jp_edit_course_menu.setLayout(jp_edit_course_menuLayout);
        jp_edit_course_menuLayout.setHorizontalGroup(
            jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                        .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lec_expertise)
                            .addComponent(lec_lab_hours))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                .addComponent(cbec_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lec_another_expertise)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bec_save, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bec_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                        .addComponent(tfec_lab_hours, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())))
                    .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                        .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lec_course_name)
                                    .addComponent(lec_course_id)
                                    .addComponent(lec_units))
                                .addGap(83, 83, 83)
                                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sec_units, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfec_course_id, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(tfec_course_name)))
                            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                                .addComponent(lec_description)
                                .addGap(96, 96, 96)
                                .addComponent(jspec_description, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jp_edit_course_menuLayout.setVerticalGroup(
            jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_edit_course_menuLayout.createSequentialGroup()
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec_course_name)
                    .addComponent(tfec_course_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec_course_id)
                    .addComponent(tfec_course_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec_units)
                    .addComponent(sec_units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lec_another_expertise, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lec_expertise)
                        .addComponent(cbec_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jspec_description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lec_description, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lec_lab_hours)
                    .addComponent(tfec_lab_hours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_edit_course_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bec_save)
                    .addComponent(bec_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bec_back.setBackground(new java.awt.Color(255, 255, 255));
        bec_back.setForeground(new java.awt.Color(0, 104, 232));
        bec_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        bec_back.setText("Back");
        bec_back.setBorder(null);
        bec_back.setBorderPainted(false);
        bec_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bec_backActionPerformed(evt);
            }
        });

        bec_logout.setBackground(new java.awt.Color(255, 255, 255));
        bec_logout.setForeground(new java.awt.Color(0, 104, 232));
        bec_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        bec_logout.setText("Logout");
        bec_logout.setBorder(null);
        bec_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_edit_course_mainLayout = new javax.swing.GroupLayout(jp_edit_course_main);
        jp_edit_course_main.setLayout(jp_edit_course_mainLayout);
        jp_edit_course_mainLayout.setHorizontalGroup(
            jp_edit_course_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_edit_course_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_edit_course_mainLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jp_edit_course_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jp_edit_course_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_edit_course_mainLayout.createSequentialGroup()
                        .addComponent(bec_back)
                        .addGap(608, 608, 608)
                        .addComponent(bec_logout)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jp_edit_course_mainLayout.setVerticalGroup(
            jp_edit_course_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_edit_course_mainLayout.createSequentialGroup()
                .addComponent(jp_edit_course_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_edit_course_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bec_back)
                    .addComponent(bec_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_edit_course_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout edit_courseLayout = new javax.swing.GroupLayout(edit_course.getContentPane());
        edit_course.getContentPane().setLayout(edit_courseLayout);
        edit_courseLayout.setHorizontalGroup(
            edit_courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, edit_courseLayout.createSequentialGroup()
                .addComponent(jp_edit_course_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        edit_courseLayout.setVerticalGroup(
            edit_courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_edit_course_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 250));
        setMinimumSize(new java.awt.Dimension(757, 436));
        setUndecorated(true);

        jp_admin_main.setBackground(new java.awt.Color(255, 255, 255));
        jp_admin_main.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 104, 232), 2, true));
        jp_admin_main.setMinimumSize(new java.awt.Dimension(757, 436));
        jp_admin_main.setPreferredSize(new java.awt.Dimension(757, 436));

        jp_admin_header.setBackground(new java.awt.Color(0, 104, 232));

        la_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        la_title.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        la_title.setForeground(new java.awt.Color(255, 255, 255));
        la_title.setText("Welcome to Application!");

        ba_quit.setBackground(new java.awt.Color(255, 255, 255));
        ba_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        ba_quit.setBorder(null);
        ba_quit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_quitActionPerformed(evt);
            }
        });

        ba_minimize.setBackground(new java.awt.Color(255, 255, 255));
        ba_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minimize.png"))); // NOI18N
        ba_minimize.setBorder(null);
        ba_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jp_admin_headerLayout = new javax.swing.GroupLayout(jp_admin_header);
        jp_admin_header.setLayout(jp_admin_headerLayout);
        jp_admin_headerLayout.setHorizontalGroup(
            jp_admin_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_admin_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(la_title)
                .addGap(149, 149, 149)
                .addComponent(la_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(ba_minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ba_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_admin_headerLayout.setVerticalGroup(
            jp_admin_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_admin_headerLayout.createSequentialGroup()
                .addGroup(jp_admin_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(la_logo)
                    .addGroup(jp_admin_headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(la_title, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ba_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ba_minimize))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jp_admin_menu.setBackground(new java.awt.Color(255, 255, 255));
        jp_admin_menu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Menu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 104, 232))); // NOI18N

        ba_manage_faculties.setBackground(new java.awt.Color(255, 255, 255));
        ba_manage_faculties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_faculty.png"))); // NOI18N
        ba_manage_faculties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_manage_faculties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_manage_facultiesActionPerformed(evt);
            }
        });

        la_manage_faculties.setForeground(new java.awt.Color(0, 104, 232));
        la_manage_faculties.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_manage_faculties.setText("Manage Faculties");

        ba_manage_expertise.setBackground(new java.awt.Color(255, 255, 255));
        ba_manage_expertise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_expertise.png"))); // NOI18N
        ba_manage_expertise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_manage_expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_manage_expertiseActionPerformed(evt);
            }
        });

        la_manage_expertise.setForeground(new java.awt.Color(0, 104, 232));
        la_manage_expertise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_manage_expertise.setText("Manage Expertise");

        ba_manage_courses.setBackground(new java.awt.Color(255, 255, 255));
        ba_manage_courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/manage_course.png"))); // NOI18N
        ba_manage_courses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_manage_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_manage_coursesActionPerformed(evt);
            }
        });

        la_manage_courses.setForeground(new java.awt.Color(0, 104, 232));
        la_manage_courses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_manage_courses.setText("Manage Courses");

        ba_manage_time_window.setBackground(new java.awt.Color(255, 255, 255));
        ba_manage_time_window.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time.png"))); // NOI18N
        ba_manage_time_window.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_manage_time_window.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_manage_time_windowActionPerformed(evt);
            }
        });

        la_manage_time_window.setForeground(new java.awt.Color(0, 104, 232));
        la_manage_time_window.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_manage_time_window.setText("Set Time Window");

        ba_print_reports.setBackground(new java.awt.Color(255, 255, 255));
        ba_print_reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N
        ba_print_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_print_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_print_reportsActionPerformed(evt);
            }
        });

        la_print_reports.setForeground(new java.awt.Color(0, 104, 232));
        la_print_reports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_print_reports.setText("Print Reports");

        bh_view_faculties.setBackground(new java.awt.Color(255, 255, 255));
        bh_view_faculties.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_faculty.png"))); // NOI18N
        bh_view_faculties.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bh_view_faculties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bh_view_facultiesActionPerformed(evt);
            }
        });

        lh_view_faculties.setForeground(new java.awt.Color(0, 104, 232));
        lh_view_faculties.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lh_view_faculties.setText("View Faculties");

        bh_view_expertise.setBackground(new java.awt.Color(255, 255, 255));
        bh_view_expertise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_expertise.png"))); // NOI18N
        bh_view_expertise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bh_view_expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bh_view_expertiseActionPerformed(evt);
            }
        });

        lh_view_expertise.setForeground(new java.awt.Color(0, 104, 232));
        lh_view_expertise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lh_view_expertise.setText("View Expertise");

        bh_view_courses.setBackground(new java.awt.Color(255, 255, 255));
        bh_view_courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view_course.png"))); // NOI18N
        bh_view_courses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bh_view_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bh_view_coursesActionPerformed(evt);
            }
        });

        lh_view_courses.setForeground(new java.awt.Color(0, 104, 232));
        lh_view_courses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lh_view_courses.setText("View Courses");

        ba_view_assignments.setBackground(new java.awt.Color(255, 255, 255));
        ba_view_assignments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous_assignments.png"))); // NOI18N
        ba_view_assignments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_view_assignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_view_assignmentsActionPerformed(evt);
            }
        });

        la_view_assignments.setForeground(new java.awt.Color(0, 104, 232));
        la_view_assignments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        la_view_assignments.setText("View Assignments");

        javax.swing.GroupLayout jp_admin_menuLayout = new javax.swing.GroupLayout(jp_admin_menu);
        jp_admin_menu.setLayout(jp_admin_menuLayout);
        jp_admin_menuLayout.setHorizontalGroup(
            jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_admin_menuLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ba_manage_courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(la_manage_courses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(la_manage_faculties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ba_manage_faculties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ba_manage_expertise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(la_manage_expertise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ba_manage_time_window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(la_manage_time_window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ba_print_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(la_print_reports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jp_admin_menuLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bh_view_courses)
                            .addComponent(lh_view_courses, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lh_view_faculties, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(bh_view_faculties)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bh_view_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lh_view_expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                                .addComponent(la_view_assignments, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ba_view_assignments)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );

        jp_admin_menuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ba_manage_courses, ba_manage_expertise, ba_manage_faculties, ba_manage_time_window, ba_print_reports, ba_view_assignments, bh_view_courses, bh_view_expertise, bh_view_faculties});

        jp_admin_menuLayout.setVerticalGroup(
            jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_admin_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ba_manage_expertise, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ba_manage_courses, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ba_manage_faculties, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ba_manage_time_window, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ba_print_reports))
                .addGap(18, 18, 18)
                .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(la_manage_courses)
                        .addComponent(la_manage_expertise)
                        .addComponent(la_manage_faculties))
                    .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(la_print_reports)
                        .addComponent(la_manage_time_window)))
                .addGap(28, 28, 28)
                .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bh_view_faculties)
                    .addComponent(bh_view_expertise)
                    .addComponent(bh_view_courses)
                    .addComponent(ba_view_assignments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(la_view_assignments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jp_admin_menuLayout.createSequentialGroup()
                        .addGroup(jp_admin_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lh_view_courses)
                            .addComponent(lh_view_faculties)
                            .addComponent(lh_view_expertise))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jp_admin_menuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ba_manage_courses, ba_manage_expertise, ba_manage_faculties, ba_manage_time_window, ba_print_reports, ba_view_assignments});

        ba_logout.setBackground(new java.awt.Color(255, 255, 255));
        ba_logout.setForeground(new java.awt.Color(0, 104, 232));
        ba_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        ba_logout.setText("Logout");
        ba_logout.setBorder(null);
        ba_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ba_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ba_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_admin_mainLayout = new javax.swing.GroupLayout(jp_admin_main);
        jp_admin_main.setLayout(jp_admin_mainLayout);
        jp_admin_mainLayout.setHorizontalGroup(
            jp_admin_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_admin_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jp_admin_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_admin_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_admin_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_admin_mainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ba_logout)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jp_admin_mainLayout.setVerticalGroup(
            jp_admin_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_admin_mainLayout.createSequentialGroup()
                .addComponent(jp_admin_header, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ba_logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jp_admin_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_admin_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_admin_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ba_manage_time_windowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_manage_time_windowActionPerformed
        set_time.setVisible(true);
    }//GEN-LAST:event_ba_manage_time_windowActionPerformed

    private void bst_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bst_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bst_quitActionPerformed

    private void bst_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bst_backActionPerformed
        set_time.dispose();
    }//GEN-LAST:event_bst_backActionPerformed

    private void ba_print_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_print_reportsActionPerformed
        print_report.setVisible(true);
    }//GEN-LAST:event_ba_print_reportsActionPerformed

    private void bpr_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpr_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bpr_quitActionPerformed

    private void bpr_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpr_backActionPerformed
        print_report.dispose();
    }//GEN-LAST:event_bpr_backActionPerformed

    private void bmf_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmf_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bmf_quitActionPerformed

    private void bmf_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmf_backActionPerformed
        manage_faculties.dispose();
    }//GEN-LAST:event_bmf_backActionPerformed

    private void bst_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bst_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bst_logoutActionPerformed

    private void bme_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bme_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bme_quitActionPerformed

    private void bme_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bme_backActionPerformed
        manage_expertise.dispose();
    }//GEN-LAST:event_bme_backActionPerformed

    private void bmc_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmc_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bmc_quitActionPerformed

    private void bmc_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmc_backActionPerformed
        manage_courses.dispose();
    }//GEN-LAST:event_bmc_backActionPerformed

    private void ba_manage_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_manage_coursesActionPerformed
        manage_courses.setVisible(true);
    }//GEN-LAST:event_ba_manage_coursesActionPerformed

    private void ba_manage_facultiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_manage_facultiesActionPerformed
        manage_faculties.setVisible(true);
    }//GEN-LAST:event_ba_manage_facultiesActionPerformed

    private void bec_edit_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bec_edit_courseActionPerformed
        edit_course.setVisible(true);
    }//GEN-LAST:event_bec_edit_courseActionPerformed

    private void bec_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bec_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bec_quitActionPerformed

    private void bec_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bec_backActionPerformed
        edit_course.dispose();
    }//GEN-LAST:event_bec_backActionPerformed

    private void ba_manage_expertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_manage_expertiseActionPerformed
        manage_expertise.setVisible(true);
    }//GEN-LAST:event_ba_manage_expertiseActionPerformed

    private void bmf_add_new_facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmf_add_new_facultyActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmf_list_of_faculties.getModel();
        model.addRow(new Object[]{tfmf_faculty_name.getText()});
    }//GEN-LAST:event_bmf_add_new_facultyActionPerformed

    private void bmf_remove_facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmf_remove_facultyActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmf_list_of_faculties.getModel();
        if (jtmf_list_of_faculties.getSelectedRow() != -1) {
            model.removeRow(jtmf_list_of_faculties.getSelectedRow());
        } 
    }//GEN-LAST:event_bmf_remove_facultyActionPerformed

    private void bme_add_new_expertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bme_add_new_expertiseActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtme_list_of_expertise.getModel();
        model.addRow(new Object[]{tfme_expertise_name.getText()});
    }//GEN-LAST:event_bme_add_new_expertiseActionPerformed

    private void bme_delete_expertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bme_delete_expertiseActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtme_list_of_expertise.getModel();
        if (jtme_list_of_expertise.getSelectedRow() != -1) {
            model.removeRow(jtme_list_of_expertise.getSelectedRow());
        } 
    }//GEN-LAST:event_bme_delete_expertiseActionPerformed

    private void bva_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bva_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bva_quitActionPerformed

    private void bva_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bva_backActionPerformed
        view_assignments.dispose();
    }//GEN-LAST:event_bva_backActionPerformed

    private void bva_view_assignmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bva_view_assignmentActionPerformed

    }//GEN-LAST:event_bva_view_assignmentActionPerformed

    private void bmc_delete_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmc_delete_courseActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmc_list_of_courses.getModel();
        if (jtmc_list_of_courses.getSelectedRow() != -1) {
            model.removeRow(jtmc_list_of_courses.getSelectedRow());
        } 
    }//GEN-LAST:event_bmc_delete_courseActionPerformed

    private void bmc_add_new_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmc_add_new_courseActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtmc_list_of_courses.getModel();
        model.addRow(new Object[]{tfmc_course_name.getText()});
    }//GEN-LAST:event_bmc_add_new_courseActionPerformed

    private void tfmc_course_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmc_course_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmc_course_nameActionPerformed

    private void bec_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bec_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bec_saveActionPerformed

    private void ba_view_assignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_view_assignmentsActionPerformed
        view_assignments.setVisible(true);
    }//GEN-LAST:event_ba_view_assignmentsActionPerformed

    private void bh_view_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bh_view_coursesActionPerformed
        view_courses.setVisible(true);
    }//GEN-LAST:event_bh_view_coursesActionPerformed

    private void bh_view_facultiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bh_view_facultiesActionPerformed
        view_faculties.setVisible(true);
    }//GEN-LAST:event_bh_view_facultiesActionPerformed

    private void bh_view_expertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bh_view_expertiseActionPerformed
        view_expertise.setVisible(true);
    }//GEN-LAST:event_bh_view_expertiseActionPerformed

    private void bvc_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvc_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bvc_quitActionPerformed

    private void bvc_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvc_backActionPerformed
        view_courses.dispose();
    }//GEN-LAST:event_bvc_backActionPerformed

    private void bve_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bve_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bve_quitActionPerformed

    private void bve_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bve_backActionPerformed
        view_expertise.dispose();
    }//GEN-LAST:event_bve_backActionPerformed

    private void bvf_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvf_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bvf_quitActionPerformed

    private void bvf_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bvf_backActionPerformed
        view_faculties.dispose();
    }//GEN-LAST:event_bvf_backActionPerformed

    private void ba_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ba_logoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_ba_logoutActionPerformed

    private void bec_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bec_cancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bec_cancelActionPerformed
    
    private void ba_quitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        System.exit(0);
    }
    
    public static void adminMenu() {
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ba_logout;
    private javax.swing.JButton ba_manage_courses;
    private javax.swing.JButton ba_manage_expertise;
    private javax.swing.JButton ba_manage_faculties;
    private javax.swing.JButton ba_manage_time_window;
    private javax.swing.JButton ba_minimize;
    private javax.swing.JButton ba_print_reports;
    private javax.swing.JButton ba_quit;
    private javax.swing.JButton ba_view_assignments;
    private javax.swing.JButton bec_back;
    private javax.swing.JButton bec_cancel;
    private javax.swing.JButton bec_edit_course;
    private javax.swing.JButton bec_logout;
    private javax.swing.JButton bec_minimize;
    private javax.swing.JButton bec_quit;
    private javax.swing.JButton bec_save;
    private javax.swing.JButton bh_view_courses;
    private javax.swing.JButton bh_view_expertise;
    private javax.swing.JButton bh_view_faculties;
    private javax.swing.JButton bmc_add_new_course;
    private javax.swing.JButton bmc_back;
    private javax.swing.JButton bmc_delete_course;
    private javax.swing.JButton bmc_logout;
    private javax.swing.JButton bmc_minimize;
    private javax.swing.JButton bmc_quit;
    private javax.swing.JButton bme_add_new_expertise;
    private javax.swing.JButton bme_back;
    private javax.swing.JButton bme_delete_expertise;
    private javax.swing.JButton bme_logout;
    private javax.swing.JButton bme_minimize;
    private javax.swing.JButton bme_quit;
    private javax.swing.JButton bmf_add_new_faculty;
    private javax.swing.JButton bmf_back;
    private javax.swing.JButton bmf_logout;
    private javax.swing.JButton bmf_minimize;
    private javax.swing.JButton bmf_quit;
    private javax.swing.JButton bmf_remove_faculty;
    private javax.swing.JButton bpr_back;
    private javax.swing.JButton bpr_logout;
    private javax.swing.JButton bpr_minimize;
    private javax.swing.JButton bpr_print_reports;
    private javax.swing.JButton bpr_quit;
    private javax.swing.JButton bst_back;
    private javax.swing.JButton bst_logout;
    private javax.swing.JButton bst_minimize;
    private javax.swing.JButton bst_quit;
    private javax.swing.JButton bst_set_time_window;
    private javax.swing.JButton bva_back;
    private javax.swing.JButton bva_logout;
    private javax.swing.JButton bva_minimize;
    private javax.swing.JButton bva_quit;
    private javax.swing.JButton bva_view_assignment;
    private javax.swing.JButton bvc_back;
    private javax.swing.JButton bvc_logout;
    private javax.swing.JButton bvc_minimize;
    private javax.swing.JButton bvc_quit;
    private javax.swing.JButton bve_back;
    private javax.swing.JButton bve_logout;
    private javax.swing.JButton bve_minimize;
    private javax.swing.JButton bve_quit;
    private javax.swing.JButton bvf_back;
    private javax.swing.JButton bvf_logout;
    private javax.swing.JButton bvf_minimize;
    private javax.swing.JButton bvf_quit;
    private javax.swing.JComboBox cbec_expertise;
    private javax.swing.JComboBox cbpr_reports;
    private javax.swing.JComboBox cbva_year;
    private javax.swing.JDialog edit_course;
    private javax.swing.JPanel jp_admin_header;
    private javax.swing.JPanel jp_admin_main;
    private javax.swing.JPanel jp_admin_menu;
    private javax.swing.JPanel jp_edit_course_header;
    private javax.swing.JPanel jp_edit_course_main;
    private javax.swing.JPanel jp_edit_course_menu;
    private javax.swing.JPanel jp_manage_courses;
    private javax.swing.JPanel jp_manage_courses_header;
    private javax.swing.JPanel jp_manage_courses_main;
    private javax.swing.JPanel jp_manage_courses_menu;
    private javax.swing.JPanel jp_manage_expertise;
    private javax.swing.JPanel jp_manage_expertise_header;
    private javax.swing.JPanel jp_manage_expertise_main;
    private javax.swing.JPanel jp_manage_expertise_menu;
    private javax.swing.JPanel jp_manage_faculties;
    private javax.swing.JPanel jp_manage_faculties_header;
    private javax.swing.JPanel jp_manage_faculties_main;
    private javax.swing.JPanel jp_manage_faculties_menu;
    private javax.swing.JPanel jp_print_report_header;
    private javax.swing.JPanel jp_print_report_main;
    private javax.swing.JPanel jp_print_report_menu;
    private javax.swing.JPanel jp_set_time_header;
    private javax.swing.JPanel jp_set_time_main;
    private javax.swing.JPanel jp_set_time_menu;
    private javax.swing.JPanel jp_view_assignments_header;
    private javax.swing.JPanel jp_view_assignments_main;
    private javax.swing.JPanel jp_view_assignments_menu;
    private javax.swing.JPanel jp_view_courses_header;
    private javax.swing.JPanel jp_view_courses_main;
    private javax.swing.JPanel jp_view_courses_menu;
    private javax.swing.JPanel jp_view_expertise_header;
    private javax.swing.JPanel jp_view_expertise_main;
    private javax.swing.JPanel jp_view_expertise_menu;
    private javax.swing.JPanel jp_view_faculties;
    private javax.swing.JPanel jp_view_faculties_header;
    private javax.swing.JPanel jp_view_faculties_main;
    private javax.swing.JPanel jp_view_faculties_menu;
    private javax.swing.JScrollPane jspec_description;
    private javax.swing.JScrollPane jspmc_list_of_courses;
    private javax.swing.JScrollPane jspme_list_of_expertise;
    private javax.swing.JScrollPane jspmf_list_of_faculties;
    private javax.swing.JScrollPane jspva_latest_assignment;
    private javax.swing.JScrollPane jspva_previous_assignment;
    private javax.swing.JScrollPane jspvc_courses_dept;
    private javax.swing.JScrollPane jspvc_courses_proposed;
    private javax.swing.JScrollPane jspvc_courses_sem;
    private javax.swing.JScrollPane jspve_view_expertise;
    private javax.swing.JScrollPane jspvf_view_faculties;
    private javax.swing.JTable jtmc_list_of_courses;
    private javax.swing.JTable jtme_list_of_expertise;
    private javax.swing.JTable jtmf_list_of_faculties;
    private javax.swing.JTable jtmf_list_of_faculties1;
    private javax.swing.JTable jtva_latest_assignment;
    private javax.swing.JTable jtva_previous_assignment;
    private javax.swing.JTable jtvc_courses_dept;
    private javax.swing.JTable jtvc_courses_proposed;
    private javax.swing.JTable jtvc_courses_sem;
    private javax.swing.JTable jtve_view_expertise;
    private javax.swing.JLabel la_logo;
    private javax.swing.JLabel la_manage_courses;
    private javax.swing.JLabel la_manage_expertise;
    private javax.swing.JLabel la_manage_faculties;
    private javax.swing.JLabel la_manage_time_window;
    private javax.swing.JLabel la_print_reports;
    private javax.swing.JLabel la_title;
    private javax.swing.JLabel la_view_assignments;
    private javax.swing.JLabel lec_another_expertise;
    private javax.swing.JLabel lec_course_id;
    private javax.swing.JLabel lec_course_name;
    private javax.swing.JLabel lec_description;
    private javax.swing.JLabel lec_expertise;
    private javax.swing.JLabel lec_lab_hours;
    private javax.swing.JLabel lec_logo;
    private javax.swing.JLabel lec_title;
    private javax.swing.JLabel lec_units;
    private javax.swing.JLabel lh_view_courses;
    private javax.swing.JLabel lh_view_expertise;
    private javax.swing.JLabel lh_view_faculties;
    private javax.swing.JLabel lmc_course_name;
    private javax.swing.JLabel lmc_logo;
    private javax.swing.JLabel lmc_manage_courses_image;
    private javax.swing.JLabel lmc_title;
    private javax.swing.JLabel lme_expertise_name;
    private javax.swing.JLabel lme_logo;
    private javax.swing.JLabel lme_manage_expertise_image;
    private javax.swing.JLabel lme_title;
    private javax.swing.JLabel lmf_faculty_name;
    private javax.swing.JLabel lmf_logo;
    private javax.swing.JLabel lmf_manage_faculties_image;
    private javax.swing.JLabel lmf_title;
    private javax.swing.JLabel lpr_logo;
    private javax.swing.JLabel lpr_print_report_image;
    private javax.swing.JLabel lpr_select_report;
    private javax.swing.JLabel lpr_title;
    private javax.swing.JLabel lst_date;
    private javax.swing.JLabel lst_date_dd;
    private javax.swing.JLabel lst_date_yyyy;
    private javax.swing.JLabel lst_from;
    private javax.swing.JLabel lst_from_hh;
    private javax.swing.JLabel lst_from_mm;
    private javax.swing.JLabel lst_logo;
    private javax.swing.JLabel lst_month_mm;
    private javax.swing.JLabel lst_set_time_image;
    private javax.swing.JLabel lst_title;
    private javax.swing.JLabel lst_to;
    private javax.swing.JLabel lst_to_hh;
    private javax.swing.JLabel lst_to_mm;
    private javax.swing.JLabel lva_latest_assignment;
    private javax.swing.JLabel lva_logo;
    private javax.swing.JLabel lva_previous_assignment;
    private javax.swing.JLabel lva_title;
    private javax.swing.JLabel lva_view_assignments_image;
    private javax.swing.JLabel lva_view_courses_image1;
    private javax.swing.JLabel lva_year;
    private javax.swing.JLabel lvc_courses_dept;
    private javax.swing.JLabel lvc_courses_proposed;
    private javax.swing.JLabel lvc_courses_sem;
    private javax.swing.JLabel lvc_logo;
    private javax.swing.JLabel lvc_title;
    private javax.swing.JLabel lve_logo;
    private javax.swing.JLabel lve_title;
    private javax.swing.JLabel lve_view_expertise_image;
    private javax.swing.JLabel lvf_logo;
    private javax.swing.JLabel lvf_title;
    private javax.swing.JLabel lvf_view_faculties_image;
    private javax.swing.JDialog manage_courses;
    private javax.swing.JDialog manage_expertise;
    private javax.swing.JDialog manage_faculties;
    private javax.swing.JDialog print_report;
    private javax.swing.JSpinner sec_units;
    private javax.swing.JDialog set_time;
    private javax.swing.JSpinner sst_date_dd;
    private javax.swing.JSpinner sst_date_yyyy;
    private javax.swing.JSpinner sst_from_hh;
    private javax.swing.JSpinner sst_from_mm;
    private javax.swing.JSpinner sst_month_mm;
    private javax.swing.JSpinner sst_to_hh;
    private javax.swing.JSpinner sst_to_mm;
    private javax.swing.JTextArea taec_description;
    private javax.swing.JTextField tfec_course_id;
    private javax.swing.JTextField tfec_course_name;
    private javax.swing.JTextField tfec_lab_hours;
    private javax.swing.JTextField tfmc_course_name;
    private javax.swing.JTextField tfme_expertise_name;
    private javax.swing.JTextField tfmf_faculty_name;
    private javax.swing.JDialog view_assignments;
    private javax.swing.JDialog view_courses;
    private javax.swing.JDialog view_expertise;
    private javax.swing.JDialog view_faculties;
    // End of variables declaration//GEN-END:variables
}
