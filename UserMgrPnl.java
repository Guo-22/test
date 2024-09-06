package gui;

import bean.User;
import javax.swing.JOptionPane;
import service.UserService;
import util.FrmUtil;
import util.StringUtil;

/**
 * 用户管理主界面.
 *
 * @author
 */
public class UserMgrPnl extends javax.swing.JPanel {

    private User user_login;
    private UserService userService;

    /**
     * Creates new form UserMgrPnl
     */
    public UserMgrPnl(User user) {
        this.user_login = user;
        userService = new UserService();
        initComponents();

        resetFrmOfUp();
        resetFrmOfDown();
        //根据用户角色 控制 界面访问权限
        if (!user_login.getType().equals(FrmUtil.MANAGER_USER)) {
            pnlUserUpdate.setVisible(false);
        }
    }

    /**
     * 重置界面上部组件.
     */
    public void resetFrmOfUp() {

        txtOldPassword.setText("");
        txtNewPassword.setText("");
        txtNewPassword2.setText("");
    }

    /**
     * 重置界面下部组件.
     */
    public void resetFrmOfDown() {
        txtUserId.setText("");
        txtUserName.setText("");
        cmbType.setSelectedItem("读者");
    }

    /**
     * 用户编号文本框回车或丢失焦点后的执行的操作.
     *
     * 查询用户是否存在，如果存在显示用户姓名<br>
     */
    public void opAfterEnterOrLost() {
        String strUserId = txtUserId.getText().trim();
        if (!StringUtil.hasLength(strUserId)) {;
            return;
        }
        User user = userService.queryUserById(strUserId);
        if (user != null) {
            txtUserName.setText(user.getName());
            String item = user.getType().equals(FrmUtil.OPRATOR_USER) ? "操作员" : "读者";
            cmbType.setSelectedItem(item);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlModPassword = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        txtNewPassword2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnModPassword = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pnlUserUpdate = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox();
        btnUserAdd = new javax.swing.JButton();
        btnUserDel = new javax.swing.JButton();
        btnResetPassword = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        pnlModPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("修改密码"));

        jLabel1.setText("请输入原密码：");

        jLabel2.setText("请输入新密码：");

        jLabel3.setText("请再次输入密码：");

        btnModPassword.setText("修  改");
        btnModPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModPasswordActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/修改.png"))); // NOI18N

        javax.swing.GroupLayout pnlModPasswordLayout = new javax.swing.GroupLayout(pnlModPassword);
        pnlModPassword.setLayout(pnlModPasswordLayout);
        pnlModPasswordLayout.setHorizontalGroup(
            pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModPasswordLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNewPassword2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(txtNewPassword)
                    .addComponent(txtOldPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(113, 113, 113))
            .addGroup(pnlModPasswordLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnModPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlModPasswordLayout.setVerticalGroup(
            pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModPasswordLayout.createSequentialGroup()
                        .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModPasswordLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlModPasswordLayout.createSequentialGroup()
                                .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(pnlModPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnModPassword)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pnlUserUpdate.setBorder(javax.swing.BorderFactory.createTitledBorder("更新用户信息"));

        jLabel4.setText("用户编号：");

        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        txtUserId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserIdFocusLost(evt);
            }
        });

        jLabel5.setText("用 户 名：");

        jLabel6.setText("用户角色：");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "操作员", "读者" }));

        btnUserAdd.setText("添加用户");
        btnUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAddActionPerformed(evt);
            }
        });

        btnUserDel.setText("删除用户");
        btnUserDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDelActionPerformed(evt);
            }
        });

        btnResetPassword.setText("重置密码");
        btnResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/设置.png"))); // NOI18N

        javax.swing.GroupLayout pnlUserUpdateLayout = new javax.swing.GroupLayout(pnlUserUpdate);
        pnlUserUpdate.setLayout(pnlUserUpdateLayout);
        pnlUserUpdateLayout.setHorizontalGroup(
            pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                        .addComponent(btnUserAdd)
                        .addGap(48, 48, 48)
                        .addComponent(btnUserDel)
                        .addGap(42, 42, 42)
                        .addComponent(btnResetPassword)
                        .addContainerGap(441, Short.MAX_VALUE))
                    .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                        .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                                .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(53, 53, 53)
                                .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtUserName)))
                            .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(203, 203, 203)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))))
        );
        pnlUserUpdateLayout.setVerticalGroup(
            pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                        .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(pnlUserUpdateLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlUserUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUserAdd)
                    .addComponent(btnUserDel)
                    .addComponent(btnResetPassword))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlModPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlUserUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlModPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlUserUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModPasswordActionPerformed
        // 修改密码
        String passNew = txtNewPassword.getText().trim();
        String passNew2 = txtNewPassword2.getText().trim();
        if (!passNew.equals(passNew2)) {
            JOptionPane.showMessageDialog(this, "两次输入的密码不一致，请重新输入！");
            txtNewPassword.requestFocus();
            return;
        }
        String passOld = txtOldPassword.getText().trim();
        if (!passOld.equals(user_login.getPassword())) {
            JOptionPane.showMessageDialog(this, "原密码不正确，请重新输入！");
            resetFrmOfUp();//重置界面上半部分
            txtOldPassword.requestFocus();
            return;
        }
        user_login.setPassword(passNew);
        if (!userService.modUserPassword(user_login)) {
            JOptionPane.showMessageDialog(this, "修改密码失败，请联系管理员！");
            
        } else {
            JOptionPane.showMessageDialog(this, "密码修改成功！");
            resetFrmOfUp();
        }
    }//GEN-LAST:event_btnModPasswordActionPerformed

    private void btnUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAddActionPerformed
        // 添加用户 用户编号不能重复
        String strUserId = txtUserId.getText().trim();
        if (!StringUtil.hasLength(strUserId)) {
            JOptionPane.showMessageDialog(this, "用户编号不能为空！");
            txtUserId.requestFocus();
            return;
        }
        if (userService.queryUserById(strUserId) != null) {
            JOptionPane.showMessageDialog(this, "用户已经存在，请重新输入！");
            txtUserId.requestFocus();
            return;
        }

        String strUserName = txtUserName.getText().trim();
        if (!StringUtil.hasLength(strUserName)) {
            JOptionPane.showMessageDialog(this, "用户姓名不能为空！");
            txtUserName.requestFocus();
            return;
        }
        String strUserType = ((String) cmbType.getSelectedItem()).trim();
        if (strUserType.equals("操作员")) {
            strUserType = FrmUtil.OPRATOR_USER;
        } else {
            strUserType = FrmUtil.READER_USER;
        }
        if (userService.addUser(new User(strUserId, strUserName, null, strUserType))) {
            JOptionPane.showMessageDialog(this, "用户添加成功！");
            resetFrmOfDown();
        } else {
            JOptionPane.showMessageDialog(this, "用户添加失败，请联系管理员！");
        }

    }//GEN-LAST:event_btnUserAddActionPerformed

    private void btnUserDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDelActionPerformed
        // 删除用户
        String strUserId = txtUserId.getText().trim();
        if (!StringUtil.hasLength(strUserId)) {
            JOptionPane.showMessageDialog(this, "用户编号不能为空！");
            txtUserId.requestFocus();
            return;
        }
        String strUserName = txtUserName.getText().trim();
        if (!StringUtil.hasLength(strUserName)) {
            JOptionPane.showMessageDialog(this, "用户姓名不能为空！");
            txtUserName.requestFocus();
            return;
        }

        User user = userService.queryUserById(strUserId);
        if (!user.getName().equals(strUserName)) {
            JOptionPane.showMessageDialog(this, "用户姓名不正确，无法删除！");
            txtUserId.requestFocus();
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "确认删除？") == JOptionPane.OK_OPTION) {
            if (userService.delUser(user)) {
                JOptionPane.showMessageDialog(this, "删除成功！");
                resetFrmOfDown();
            } else {
                JOptionPane.showMessageDialog(this, "删除失败，请联系管理员！");
            }
        }
    }//GEN-LAST:event_btnUserDelActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        // 重置密码
        String strUserId = txtUserId.getText().trim();
        if (!StringUtil.hasLength(strUserId)) {
            JOptionPane.showMessageDialog(this, "用户编号不能为空！");
            txtUserId.requestFocus();
            return;
        }
        String strUserName = txtUserName.getText().trim();
        if (!StringUtil.hasLength(strUserName)) {
            JOptionPane.showMessageDialog(this, "用户姓名不能为空！");
            txtUserName.requestFocus();
            return;
        }

        User user = userService.queryUserById(strUserId);
        if (!user.getName().equals(strUserName)) {
            JOptionPane.showMessageDialog(this, "用户姓名不正确，无法重置！");
            txtUserId.requestFocus();
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "确认重置？") == JOptionPane.OK_OPTION) {

            if (userService.resetUserPass(user)) {
                JOptionPane.showMessageDialog(this, "重置成功！");
                resetFrmOfDown();
            } else {
                JOptionPane.showMessageDialog(this, "重置失败，请联系管理员！");
            }
        }
    }//GEN-LAST:event_btnResetPasswordActionPerformed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // 动作事件
        opAfterEnterOrLost();
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void txtUserIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserIdFocusLost
        // 丢失焦点
        opAfterEnterOrLost();
    }//GEN-LAST:event_txtUserIdFocusLost
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModPassword;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnUserDel;
    private javax.swing.JComboBox cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlModPassword;
    private javax.swing.JPanel pnlUserUpdate;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JPasswordField txtNewPassword2;
    private javax.swing.JPasswordField txtOldPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
