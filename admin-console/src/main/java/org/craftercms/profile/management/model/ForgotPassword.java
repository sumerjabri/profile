package org.craftercms.profile.management.model;

public class ForgotPassword {

    private String username;

    private String tenantName;

    private String changePasswordUrl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getChangePasswordUrl() {
        return changePasswordUrl;
    }

    public void setChangePasswordUrl(String changePasswordUrl) {
        this.changePasswordUrl = changePasswordUrl;
    }

}
